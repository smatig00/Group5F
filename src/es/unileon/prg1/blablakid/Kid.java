package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that represents the kid.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Kid {
	
	/**
	 * A Logger is started.
	 * 
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * Identifier of the name associated to the kid.
	 * 
	 */
	private String name;
	
	/**
	 * Builder of the class. Creates a kid with name.
	 * 
	 * @param name
	 *			Identifier to the name associated to the parent.
	 *
	 */
	public Kid(String name){	
		this.name = name;
		
	}
	
	/**
	 * Builder of the class. Copy of the builder of the class Kid.
	 * 
	 * @param another
	 * 			Identifier of kid for the builder of the class copy.
	 *
	 */
	public Kid(Kid another) {
		this.name = another.getName();
		
	}
	
	/**
	 * Method of the class. Returns the kid's name.
	 * 
	 * @return kid's name.
	 * 
	 */
	public String getName() {	
		return this.name;
		
	}
	
	//llamar a las funciones addParent, addactivity...
	
	
	
	/**
	 * Method of the class. Prints what the returns indicates.
	 * 
	 * @return what the return indicates.
	 * 
	 */
	public String toString() {
		return this.name;
	}
	
	
}