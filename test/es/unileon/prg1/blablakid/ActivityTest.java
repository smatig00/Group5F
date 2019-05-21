package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Activity;
import org.junit.Before;
import org.junit.Test;

public class ActivityTest {
	
	Activity baloncesto;
	
	@Before
	public void setUp() throws BlablakidException {
		Week day = new Week(3);
		Time start = new Time(10, 30);
		Time end = new Time(12, 30);
		Ride before = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		baloncesto = new Activity("Baloncesto", "Palomera", day, start, end, before, after);
		
	}
	
	@Test
	public void testActivity() throws BlablakidException {
		Week day2 = new Week(2);
		Time start2 = new Time(11, 30);
		Time end2 = new Time(13, 30);
		Ride before2 = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		Activity tenis = new Activity(new Activity("Tenis", "Parque", day2, start2, end2, before2, after2));
		assertEquals("Tenis", tenis.getName());
	}
	
	@Test
	public void testGetName() throws BlablakidException {
		assertEquals("Baloncesto", baloncesto.getName());
		
	}
	
	@Test
	public void testGetPlace() throws BlablakidException {
		assertEquals("Palomera", baloncesto.getPlace());
		
	}
	
	@Test
	public void testSetPlace() throws BlablakidException{
		baloncesto.setPlace("Universidad");
		
	}
	
	@Test
	public void testGetDay() throws BlablakidException{
		assertEquals(3, baloncesto.getDay());
		
	}
	
	@Test
	public void testGetStart() throws BlablakidException{
		assertEquals("10:30", baloncesto.getStart().toString());
		
	}
	
	@Test
	public void testGetEnd() throws BlablakidException{
		assertEquals("12:30", baloncesto.getEnd().toString());
		
	}
	
	@Test
	public void testGetBefore() throws BlablakidException{
		assertEquals("10:30 12:30 Casa Parque", baloncesto.getBefore().toString());
	
	}
	
	@Test
	public void testGetAftet() throws BlablakidException{
		assertEquals("12:30 14:30 Palomera Universidad", baloncesto.getAfter().toString());
	
	}
	
	@Test
	public void testToString() throws BlablakidException{
		Week day2 = new Week(2);
		Time start2 = new Time(11, 30);
		Time end2 = new Time(13, 30);
		Ride before2 = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		Activity tenis = new Activity(new Activity("Tenis", "Parque", day2, start2, end2, before2, after2));
		assertEquals("Tenis Parque 2 11:30 13:30 10:30 12:30 Casa Parque 12:30 14:30 Palomera Universidad", tenis.toString());
	}
	

}
