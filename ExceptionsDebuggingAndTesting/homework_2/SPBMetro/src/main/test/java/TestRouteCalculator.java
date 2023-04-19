import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.List;

public class TestRouteCalculator extends TestCase {
    List<Station> route;
    StationIndex stationIndex = new StationIndex();

    @Override
    protected void setUp() {
        //Пример из видео
        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        route = List.of(new Station("Петровская", line1),
                new Station("Садовая", line1),
                new Station("Бредовая", line2),
                new Station("Столовая", line2));

        // Создание схемы метро
        stationIndex.addStation(new Station("Петровская", line1));
        stationIndex.addStation(new Station("Садовая", line1));
        stationIndex.addStation(new Station("Бредовая", line2));
        stationIndex.addStation(new Station("Столовая", line2));
        stationIndex.addStation(new Station("Академическая", line3));
        stationIndex.addStation(new Station("Политехническая", line3));
        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
