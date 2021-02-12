import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC12345");
    }

    @Test
    public void hasName(){
        assertEquals("Chris", pilot.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(1, pilot.getValueFromEnum());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("ABC12345", pilot.getPilotLicenceNumber());
    }
}
