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
	
	/**
	 * Identifier to the name associated to the parent.
	 */
	private double value;
	
	/**
	 * Builder of the class. Creates a parent with name and a value.
	 * 
	 * @param name
	 * 			  Identifier to the name associated to the parent.
	 * @param valor
	 *            Identifier to the value associated to the parent.
	 */
	public Parent(String name, double value) {
		this.name = name;
		this.value = value;
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
		this.value = another.getValue();
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
	 * Method of the class. Returns the parent's value.
	 * 
	 * @return parent's value.
	 * 
	 */
	public double getValue() {
		return this.value;
	}
	
	/**
	 * Method of the class. Saves a new parent's value.
	 * @param value
	 * 			Identifier of the new parent's value.
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**
	 * Method of the class. Prints what the returns indicates.
	 * 
	 * @return what the returns indicates.
	 * 
	 */
	public String toString() {
		return this.name + " : " + this.value;
	}

}