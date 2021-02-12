import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jane", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Jane", cabinCrewMember.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(4, cabinCrewMember.getRankFromEnum());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Welcome on board this flight", cabinCrewMember.relayMessage());
    }
}
