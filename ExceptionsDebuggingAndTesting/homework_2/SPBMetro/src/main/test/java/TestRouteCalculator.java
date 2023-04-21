import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.*;

public class TestRouteCalculator extends TestCase {
    List<Station> route;
    StationIndex stationIndex = new StationIndex();
    TreeSet<Station> stations = new TreeSet<>();
    Map<Station, TreeSet<Station>> connections = new TreeMap<>();

    @Override
    protected void setUp() {

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");
        Station station1 = new Station("Петровская", line1);
        Station station2 = new Station("Садовая", line1);
        Station station3 = new Station("Бредовая", line2);
        Station station4 = new Station("Столовая", line2);
        Station station5 = new Station("Академическая", line3);
        Station station6 = new Station("Политехническая", line3);

        stations.add(station1);
        stations.add(station2);
        stations.add(station3);
        stations.add(station4);
        stations.add(station5);
        stations.add(station6);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        stations.forEach(stationIndex::addStation);

        stationIndex.addConnection(List.of(station2));
        stationIndex.addConnection(List.of(station3));
        stationIndex.addConnection(List.of(station4));
        stationIndex.addConnection(List.of(station5));

        route = List.of(station2, station3, station4, station5);
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 9.5;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
