package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Parents;
import org.junit.Before;
import org.junit.Test;

public class ParentsTest {

	Parents parents;
	
	@Before
	public void setUp() throws BlablakidException{
		parents = new Parents(3);
		parents.add(new Parent("Monica", new Kids(3)));
	
	}
	
	@Test
	public void testAddOk() throws BlablakidException{
		parents.add(new Parent("Lucas", new Kids(4)));
		
	}
	
	@Test(expected = BlablakidException.class)
	public void testAddRepeated() throws BlablakidException{
		parents.add(new Parent("Monica", new Kids(3)));
	
	}
	
	@Test(expected = BlablakidException.class)
	public void testAddListFull() throws BlablakidException{
		parents = new Parents(0);
		parents.add(new Parent("Laura", new Kids(2)));
		
	}
	
	@Test
	public void testSearchOk() throws BlablakidException{
		assertTrue(new Parent("Monica", new Kids(3)).equals(parents.search("Monica")));
	
	}
	
	@Test
	public void testSearchFail() throws BlablakidException{
		assertEquals(null, parents.search("Monica"));
		
	}
	
	@Test
	public void testIsSameTrue() throws BlablakidException{
		assertEquals(true, parents.isSame("Monica", "Monica"));
		
	}
	
	@Test
	public void testIsSameFalse() throws BlablakidException{
		assertEquals(false, parents.isSame("Monica", "Lucas"));
		
	}
	
	@Test
	public void testRemoveParentOk() throws BlablakidException{
		parents.add(new Parent("Juan", new Kids(5)));
		parents.removeParent("Monica");
	
	}
	
	@Test
	public void testRemoveParentNoExists() throws BlablakidException{
		parents.removeParent("Ana");
		
	}

}
