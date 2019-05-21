package es.unileon.prg1.blablakid;

import static org.junit.Assert.*;
import es.unileon.prg1.blablakid.BlablakidException;
import es.unileon.prg1.blablakid.Time;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {
	
	Time time;
	
	@Before
	public void setUp() throws BlablakidException{
		time = new Time(10, 30);
		
	}
	
	@Test
	public void testToString() throws BlablakidException{
		assertEquals("10:30", time.toString());
	}

	

}
