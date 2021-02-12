import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, PlaneType.BOEING747, PlaneType.BOEING747);
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
        assertEquals(660, plane.getCapacityFromEnum());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(440, plane.getTotalWeightFromEnum());
    }
}
