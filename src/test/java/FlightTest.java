import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;

    @Before
    public void before(){
        flight = new Flight("FR756", "MAD", "BHX", "06:25", new Plane(PlaneType.BOEING737, PlaneType.BOEING737, PlaneType.BOEING737), new Pilot("Chris", Rank.CAPTAIN, "ABC12345"));
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }
}
