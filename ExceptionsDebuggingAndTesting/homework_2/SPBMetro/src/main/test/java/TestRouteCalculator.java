import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.List;

public class TestRouteCalculator extends TestCase {
    List<Station> route;

    @Override
    protected void setUp() {
        Line line1 = new Line(1, "First");
        Line line2 = new Line(2, "Second");

        route = List.of(new Station("Петровская", line1),
                new Station("Садовая", line1),
                new Station("Бредовая", line2),
                new Station("Столовая", line2));

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
