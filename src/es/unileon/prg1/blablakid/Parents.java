package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that represents parents.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Parents {
	
	/**
	 * A Logger is started.
	 * 
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * 
	 */
	private int next;
	
	/**
	 * Parent type array identifier. Array where parents are saved.
	 * 
	 */
	private Parent[] parents;
	
	/**
	 * Builder of the class.
	 * 
	 * @param maxParents
	 * 			Maximum parents identifier.
	 * 
	 */
	Parents(int maxParents){
		this.parents = new Parent[maxParents];
		this.next = 0;
	}
	
	/**
	 * Method of the class. Add a parent to the list and checks the state of the array that stores them and checks if it is full or if there has been an error when adding them.
	 * 
	 * @param parent
	 * 			Identifier of the parent
	 * @return if it has been added correctly
	 * @throws BlablakidException
	 * 			Exception of the class
	 * 
	 */
	
	public boolean add(Parent parent) throws BlablakidException {
		//log.entry();
		
		if(search(parent.getName()) == true){
			//log.error("Add parent error: Parent " + parent.getName() + " already in the aplication.");
			throw new BlablakidException("Add Parent error: Parent " + parent.getName() + " already in the aplication.");
		}
		else if(this.next == parents.length){
			//log.error("Add parent error: The list is full");
			throw new BlablakidException("Add parent error: The list is full");
		}
		else{
			this.parents[this.next++] = parent;
			return true;
		}
		//log.exit();
	}
	
	/**
	 * Method of the class. Search a parent by its name.
	 * @param name
	 * @return boolean
	 */
	public boolean search(String name){
		boolean ok = false;
		int counter = 0;
		while(counter < parents.length){
			if(isSame(this.parents[counter].getName(), name)){
				ok = true;
				break;
			}else{
				ok = false;
			}
		}
		
		return ok;
	}
	
	/**
	 * Method of the class. Compare two parents to know if are the same.
	 * @param name
	 * @param newName
	 * @return boolean
	 */
	public boolean isSame(String name, String newName){
		if(name.equals(newName)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Method of the class. Remove a parent from the array of parents.
	 * 
	 * @param parent
	 * 			Identifier of the parents
	 * @throws BlablakidException 
	 * 			Exception of the class
	 *
	 */
	public void removeParent(String name) throws BlablakidException {
		int pos = this.checkParent(name);
		if(pos == -1) {
			throw new BlablakidException("Error, this parent it is not in the aplication.");
			
		}else {
			parents[pos] = null;
			move();
			this.next--;
		}
	}
	
	/**
	 * Method of the class. Moves a position parent, and places it where there is a free space.
	 * 
	 */
	private void move() {
		for(int i = 0; i < parents.length-1; i++) {
			if(parents[i] == null) {
				parents[i] = parents[i+1];
				parents[i+1] = null;
			}
		}
	}
	
	/**
	 * Method of the class. Checks if the parent is repeated.
	 * 
	 * @param name
	 * @return the position.
	 * 
	 */
	public int checkParent(String name) {
		for(int i = 0; i < parents.length; i++) {
			if(parents[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int getSize() {
		return parents.length;
		
	}	
	
	/**
	 * Method of the class. Prints the content of the parents array.
	 * 
	 * @return the content of the parents array.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.next; i++) {
			output.append(parents[i].toString() + "\n");
		}
		return output.toString();
	}
	
}
