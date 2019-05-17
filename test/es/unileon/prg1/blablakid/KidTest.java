package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Kid;
import org.junit.Before;
import org.junit.Test;

public class KidTest {
	Kid Pablo;
	
	@Before
		public void setUp()throws BlablakidException{
		Pablo = new Kid("Pablo");
	}
	
	@Test
	public void testKid() throws BlablakidException{
		Kid Rosa = new Kid(new Kid("Rosa"));
		assertEquals("Rosa", Rosa.getName());
	}
	
	@Test
	public void testGetName() throws BlablakidException{
		assertEquals("Pablo", Pablo.getName());
	}
	
	@Test
	public void testToString() throws BlablakidException{
		assertEquals("Pablo", Pablo.toString());
	}

}
