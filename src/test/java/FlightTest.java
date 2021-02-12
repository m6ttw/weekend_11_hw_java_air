import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737, PlaneType.BOEING737, PlaneType.BOEING737);
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC12345");
        flight = new Flight("FR756", "MAD", "BHX", "06:25", plane, pilot);
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
}
