package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Parent;
import org.junit.Before;
import org.junit.Test;

public class ParentTest {
	Parent Pedro;
	
	@Before
	public void setUp() throws BlablakidException {
		Pedro = new Parent("Pedro", new Kids(3));
		
	}
	
	@Test 
	public void testParent() throws BlablakidException {
		Parent Ana = new Parent("Ana", new Kids(3));
		assertEquals("Ana", Ana.getName());
		
	}
	
	@Test
	public void testGetName() throws BlablakidException {
		assertEquals("Pedro", Pedro.getName());
		
	}
	
	@Test
	public void testGetKids() throws BlablakidException {
		assertEquals(3, Pedro.getKids());
		
	}
	
	@Test
	public void testToString() throws BlablakidException {
		assertEquals("Pedro 3", Pedro.toString());
		
	}

}
