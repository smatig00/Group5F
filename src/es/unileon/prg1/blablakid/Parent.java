package es.unileon.prg1.blablakid;

/**
 * Class that represents the parent.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Parent {

	/**
	 * Identifier to the name associated to the parent.
	 * 
	 */
	private String name;
	
	private Kids kids;
	
	private Week Week;
	
	/**
	 * Builder of the class. Creates a parent with name and a value.
	 * 
	 * @param name
	 * 			  Identifier to the name associated to the parent.
	 * @param valor
	 *            Identifier to the value associated to the parent.
	 */
	public Parent(String name, Kids kids) {
		this.name = name;
		this.kids = kids;
	}
	
	/**
	 * Builder of the class. Copy of the builder of the class Parent.
	 * 
	 * @param another
	 * 			Identifier of parent for the builder of the class copy.
	 *
	 */
	public Parent(Parent another) {
		this.name = another.getName();
		this.kids = another.getKids();
		
	}
	
	/**
	 * Method of the class. Returns the parent's name.
	 * 
	 * @return parent's name.
	 * 
	 */
	public String getName() {
		return this.name;
		
	}
	
	/**
	 * Method of the class. Returns the kids of the parent.
	 * 
	 * @return kids of the parent.
	 */
	public Kids getKids() {
		return this.kids;
		
	}
	
	/**
	 * Method of the class. Prints what the returns indicates.
	 * 
	 * @return what the returns indicates.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		output = output.append(name + " ");
		output = output.append(kids);
		return output.toString();
		
	}

}
