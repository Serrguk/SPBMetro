import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(findPlanesLeavingInTheNextTwoHours(airport));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        Date now = new Date();
        Date twoHoursLater = new Date(now.getTime() + (2 * 60 * 60 * 1000));

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE
                        && flight.getDate().after(now)
                        && flight.getDate().before(twoHoursLater))
                .toList();
    }

}