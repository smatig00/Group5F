package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Ride;
import org.junit.Before;
import org.junit.Test;

public class RideTest {
	
	Ride ride;
	
	@Before
	public void setUp() throws BlablakidException {
		ride = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		
	}
	
	@Test
	public void testSetStartRide() throws BlablakidException{
		ride.setStartRide(new Time(11, 30));
	
	}
	
	@Test
	public void testGetStartRide() throws BlablakidException {
		Ride ride2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		assertEquals("12:30", ride2.getStartRide().toString());
	
	}
	
	@Test
	public void testSetEndRide() throws BlablakidException{
		ride.setEndRide(new Time(13,30));
		
	}
	
	@Test
	public void testGetEndRide() throws BlablakidException{
		Ride ride2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		assertEquals("14:30", ride2.getEndRide().toString());
		
	}
	
	@Test
	public void testSetStartPlace() throws BlablakidException{
		ride.setStartPlace("Palomera");
		
	}
	
	@Test
	public void testGetStartPlace() throws BlablakidException{
		Ride ride2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		assertEquals("Palomera", ride2.getStartPlace());	
	
	}
	
	@Test
	public void testSetEndPlace() throws BlablakidException{
		ride.setEndPlace("Colegio");
		
	}
	
	@Test
	public void testGetEndPlace() throws BlablakidException{
		Ride ride2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		assertEquals("Universidad", ride2.getEndPlace());	
	
	}
	
	@Test
	public void testToString() throws BlablakidException{
		Ride ride2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		assertEquals("12:30 14:30 Palomera Universidad", ride2.toString());
	}
	

}
