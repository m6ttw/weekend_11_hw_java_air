import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Plane plane;
    Pilot pilot;
    Flight flight;
    Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, PlaneType.BOEING747, PlaneType.BOEING747);
        flightManager = new FlightManager(PlaneType.BOEING747, PlaneType.BOEING747, PlaneType.BOEING747);
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC12345");
        flight = new Flight("FR756", "MAD", "BHX", "06:25", plane, pilot);
        passenger = new Passenger("Bob", 1);
    }
    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(PlaneType.BOEING747, plane.getCapacity());
    }
    @Test
    public void canGetTotalWeight(){
        assertEquals(PlaneType.BOEING747, plane.getTotalWeight());
    }

    @Test
    public void planeHasType(){
        assertEquals("Boeing 747", plane.getPlaneTypeFromEnum());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(600, plane.getCapacityFromEnum());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(1200, plane.getTotalWeightFromEnum(), 0.00);
    }

    @Test
    public void canCalculateBagWeightPerPassenger(){
        assertEquals(1.0, flightManager.getBagWeightPerPassenger(), 0.00);
    }

    @Test
    public void canCalculateBaggageWeightBooked(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(3.0, flightManager.calculateBaggageWeightBooked(flight), 0.0);
    }

    @Test
    public void canCheckHowMuchWeightRemains(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals( 596.0, flightManager.howMuchWeightRemains(flight), 0.0);
    }
}
