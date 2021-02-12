import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737, PlaneType.BOEING737, PlaneType.BOEING737);
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC12345");
        flight = new Flight("FR756", "MAD", "BHX", "06:25", plane, pilot);
        passenger = new Passenger("Bob", 1);
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("MAD", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("BHX", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("06:25", flight.getDepartureTime());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(190, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.countPassengerList());
    }
}
