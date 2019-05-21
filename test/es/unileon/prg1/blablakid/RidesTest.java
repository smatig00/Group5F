package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Rides;
import org.junit.Before;
import org.junit.Test;


public class RidesTest {

	Rides rides;
	
	@Before
	public void setUp() throws BlablakidException{
		rides = new Rides(4);
		rides.add(new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque"));
	
	}
	
	@Test
	public void testAddOk() throws BlablakidException{
		rides.add(new Ride(new Time(12, 30), new Time(14, 30), "Palomera", "Universidad"));
	
	}
	
	@Test(expected = BlablakidException.class)
	public void testAddRepeated() throws BlablakidException{
		rides.add(new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque"));
	
	}
	
	@Test(expected = BlablakidException.class)
	public void testAddListFull() throws BlablakidException{
		rides = new Rides(0);
		rides.add(new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque"));
		
	}
	
	@Test
	public void testSearchOk() throws BlablakidException{
		assertTrue(new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque").equals(rides.search("Casa")));
	
	}
	
	@Test
	public void testSearchFail() throws BlablakidException{
		assertEquals(null, rides.search("Colegio"));
		
	}
	
	@Test
	public void testIsSameTrue() throws BlablakidException{
		assertEquals(true, rides.isSame("Casa", "Casa"));
		
	}
	
	@Test
	public void testIsSameFalse() throws BlablakidException{
		assertEquals(false, rides.isSame("Casa", "Palomera"));
		
	}
	
	@Test
	public void testRemoveRideOk() throws BlablakidException{
		rides.removeRide("Casa");
	
	}
	
	@Test
	public void testRemoveRideNoExists() throws BlablakidException{
		rides.removeRide("Colegio");
		
	}
}
