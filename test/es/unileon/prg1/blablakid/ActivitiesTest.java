package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Activities;
import org.junit.Before;
import org.junit.Test;

public class ActivitiesTest {

	Activities activities;
	Activity baloncesto;
	
	@Before
	public void setUp() throws BlablakidException{
		activities = new Activities(4);
		Week day = new Week(3);
		Time start = new Time(10, 30);
		Time end = new Time(12, 30);
		Ride before = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		baloncesto = new Activity("Baloncesto", "Palomera", day, start, end, before, after);
		activities.add(baloncesto);
		
	}
	
	@Test
	public void testAddOk() throws BlablakidException{
		Week day2 = new Week(2);
		Time start2 = new Time(11, 30);
		Time end2 = new Time(13, 30);
		Ride before2 = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after2 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		Activity tenis = new Activity(new Activity("Tenis", "Parque", day2, start2, end2, before2, after2));
		activities.add(tenis);
		
	}
	
	@Test(expected = BlablakidException.class)
	public void testAddRepeated() throws BlablakidException{
		activities.add(baloncesto);
		
	}
	
	@Test(expected = BlablakidException.class)
	public void testAddListFull() throws BlablakidException{
		activities = new Activities(0);
		Week day3 = new Week(2);
		Time start3 = new Time(11, 30);
		Time end3 = new Time(13, 30);
		Ride before3 = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after3 = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		Activity golf = new Activity(new Activity("Golf", "Campo", day3, start3, end3, before3, after3));
		activities.add(golf);
		
	}
	
	@Test
	public void testSearchOk() throws BlablakidException{
		Week day = new Week(3);
		Time start = new Time(10, 30);
		Time end = new Time(12, 30);
		Ride before = new Ride(new Time(10, 30), new Time(12, 30), "Casa", "Parque");
		Ride after = new Ride(new Time(12,30), new Time(14,30), "Palomera", "Universidad");
		assertTrue(new Activity("Baloncesto", "Palomera", day, start, end, before, after).equals(activities.search("Baloncesto")));
	
	}
	
	@Test
	public void testSearchFail() throws BlablakidException{
		assertEquals(null, activities.search("Futbol"));
	
	}
	
	@Test
	public void testIsSameTrue() throws BlablakidException{
		assertEquals(true, activities.isSame("Baloncesto", "Baloncesto"));
		
	}
	
	@Test
	public void testIsSameFalse() throws BlablakidException{
		assertEquals(false, activities.isSame("Baloncesto", "Tenis"));
		
	}
	
	@Test
	public void testRemoveActivityOk() throws BlablakidException{
		activities.removeActivity("Tenis", 2);
		
	}
	
	@Test
	public void testRemoveActivityNoExists() throws BlablakidException{
		activities.removeActivity("Futbol", 1);
		
	}
}
