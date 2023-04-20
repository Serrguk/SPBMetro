import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.*;

public class TestRouteCalculator extends TestCase {
    List<Station> route;
    StationIndex stationIndex = new StationIndex();
    TreeSet<Station> stations;
    Map<Station, TreeSet<Station>> connections = new TreeMap<>();

    @Override
    protected void setUp() {

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        stations.add(new Station("Петровская", line1));
        stations.add(new Station("Садовая", line1));
        stations.add(new Station("Бредовая", line2));
        stations.add(new Station("Столовая", line2));
        stations.add(new Station("Академическая", line3));
        stations.add(new Station("Политехническая", line3));

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        stations.forEach(stationIndex::addStation);
        route = List.of();


    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 7.0;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
