package es.unileon.prg1.blablakid;

/**
 * Class that represents the kid.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Kid {
	
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
	
	
	/**
	 * Method of the class. Prints what the returns indicates.
	 * 
	 * @return what the return indicates.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		output = output.append(name);
		return output.toString();
		
	}
	
	
}
