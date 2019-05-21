package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Kids;
import org.junit.Before;
import org.junit.Test;

public class KidsTest {
	
	Kids kids;
	
	@Before
	public void setUp() throws BlablakidException {
		kids = new Kids(3);
		kids.add(new Kid("Pablo"));
		
	}
	
	@Test
	public void testAddOk() throws BlablakidException {
		kids.add(new Kid("Marta"));
		
	}
	
	@Test (expected = BlablakidException.class)
	public void testAddRepeated() throws BlablakidException {
		kids.add(new Kid("Pablo"));
		
	}
	
	@Test (expected = BlablakidException.class)
	public void testAddListFull() throws BlablakidException {
		kids = new Kids(0);
		kids.add(new Kid("Marcos"));
		
	}
	
	@Test 
	public void testSearchOk() throws BlablakidException {
		assertTrue(new Kid("Pablo").equals(kids.search("Pablo")));
		
	}
	
	@Test 
	public void testSearchFail() throws BlablakidException {
		assertEquals(null, kids.search("Rosa"));
		
	}
	
	@Test
	public void testIsSameTrue() throws BlablakidException {
		assertEquals(true, kids.isSame("Pablo", "Pablo"));
		
	}
	
	@Test
	public void testIsSameFalse() throws BlablakidException {
		assertEquals(false, kids.isSame("Pablo", "Marta"));
		
	}
	
	@Test
	public void testRemoveKidOk() throws BlablakidException {
		kids.add(new Kid("Juan"));
		kids.removeKid("Pablo");
		
	}
	
	@Test
	public void testRemoveKidNoExists() throws BlablakidException {
		kids.removeKid("Rosa");
		
	}	

}
