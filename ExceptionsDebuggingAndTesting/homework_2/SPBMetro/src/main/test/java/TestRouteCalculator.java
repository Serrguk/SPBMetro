import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.*;

public class TestRouteCalculator extends TestCase {
    List<Station> route;
    StationIndex stationIndex = new StationIndex();
    TreeSet<Station> stations = new TreeSet<>();

    ArrayList<Station> connect1 = new ArrayList<>();
    ArrayList<Station> connect2 = new ArrayList<>();

    Line line1 = new Line(1, "Первая");
    Line line2 = new Line(2, "Вторая");
    Line line3 = new Line(3, "Третья");
    Station station1 = new Station("Петровская", line1);
    Station station2 = new Station("Садовая", line1);
    Station station3 = new Station("Бредовая", line2);
    Station station4 = new Station("Столовая", line2);
    Station station5 = new Station("Академическая", line3);
    Station station6 = new Station("Политехническая", line3);
    Station station7 = new Station("Кубическая", line3);
    @Override
    protected void setUp() {

        line1.addStation(station1);
        line1.addStation(station2);
        line2.addStation(station3);
        line2.addStation(station4);
        line3.addStation(station5);
        line3.addStation(station6);
        line3.addStation(station7);

        stations.add(station1);
        stations.add(station2);
        stations.add(station3);
        stations.add(station4);
        stations.add(station5);
        stations.add(station6);
        stations.add(station7);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        stations.forEach(stationIndex::addStation);

        connect1.add(station2);
        connect1.add(station3);
        connect2.add(station4);
        connect2.add(station5);

        stationIndex.addConnection(connect1);
        stationIndex.addConnection(connect2);

        route = List.of(station2, station3, station4, station5);
    }
    RouteCalculator calculator = new RouteCalculator(stationIndex);

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 9.5;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {
        Station from = stationIndex.getStation("Академическая", 3);
        Station to = stationIndex.getStation("Кубическая", 3);
        List<Station> actual = calculator.getShortestRoute(from, to);
        List<Station> expected = Arrays.asList(station5, station6, station7);
        assertEquals(expected, actual);
    }

    public void testGetRouteWithOneConnection() {
        Station from = stationIndex.getStation("Петровская", 1);
        Station to = stationIndex.getStation("Столовая", 2);
        List<Station> actual = calculator.getShortestRoute(from, to);
        List<Station> expected = Arrays.asList(station1, station2, station3, station4);
        assertEquals(expected, actual);
    }

    public void testGetRouteViaConnectedLine() {
        Station from = stationIndex.getStation("Столовая", 2);
        Station to = stationIndex.getStation("Кубическая", 3);
        List<Station> actual = calculator.getShortestRoute(from, to);
        List<Station> expected = Arrays.asList(station4, station5, station6, station7);
        assertEquals(expected, actual);
    }

    public void testGetRouteWithTwoConnections() {
        Station from = stationIndex.getStation("Петровская", 1);
        Station to = stationIndex.getStation("Кубическая", 3);
        List<Station> actual = calculator.getShortestRoute(from, to);
        List<Station> expected = Arrays.asList(station1, station2, station3, station4, station5, station6, station7);
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
