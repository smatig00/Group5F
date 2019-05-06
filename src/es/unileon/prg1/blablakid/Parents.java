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
	 * Se inicia un Logger
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * Counter identifier for parents.
	 * 
	 */
	private int counter;
	
	/**
	 * Parent type array identifier. Array where parents are saved.
	 * 
	 */
	private Parent[] parents;
	
	/**
	 * Builder of the class. Create a parent with name and a value.
	 * 
	 * @param maxParents
	 * 			Maximum parents identifier.
	 * 
	 */
	Parents(int maxParents){
		this.parents = new Parent[maxParents];
		this.counter = 0;
	}
	
	/**
	 * Method of the class. Add parents, checks the state of the array that stores them and checks if it is full, empty or if there has been an error when adding them.
	 * 
	 * @param parent
	 * 			Identifier of the parent.
	 * @return if it has been added correctly.
	 * @throws BlablakidException
	 * 			Exception of the class
	 * 
	 */
	
	public boolean addParent(Parent parent) throws BlablakidException {
		log.entry();
		
		boolean ok = false;
		
		if(this.isFull()) {
			log.error("Parents error: No more room left.");
			throw new BlablakidException("Parents error: No more room left.");
		
		}else if(this.checkParent(parent.getName() != -1)) {
			log.error("Add parent error: Parent " + parent.getName() + " already in the aplication.");
			throw new BlablakidException("Add parent error: Parent " + parent.getName() + " already in the aplication.");
		
		}else if(parent.getName().isEmpty()) {
			log.error("Add parent error: Parent's name is empty.");
			throw new BlablakidException("Add parent error: Parent's name is empty.");
		
		}else {
			parents[this.counter] = parent;
			ok = true;
			this.counter++;
		}
		log.exit();
		return ok;
	}
	
	/**
	 * Method of the class. Restarts the counter
	 * 
	 */
	public void restart() {
		this.counter = 0;
	}
	
	/**
	 * Method of the class. Checks if the array that stores the parents is full.
	 * 
	 * @return if the array is full returns true and if it's not returns false.
	 * 
	 */
	public boolean isFull() {
		if(counter == parents.length) return true;
		else return false;
	}
	
	/**
	 * Method of the class. Returns the length of the array that stores the parents.
	 * 
	 * @return length of the array.
	 * 
	 */
	public int length() {
		return this.counter;
	}
	
	/**
	 * Method of the class. Checks if the parent  is repeated.
	 * 
	 * @param parent
	 * 			Identifier of the parent.
	 * @return the position.
	 * 
	 */
	public int checkParent(String parent) {
		int position = binarySearch(new Parent(parent, 0));
		return position;
	}
	
	/**
	 * Method of the class. Returns, after a comparison, the position where the first free hole is located, within the array of parents.
	 * 
	 * @param parent
	 * 			Identifier of the parent.
	 * @return the value that will be passed to the method.
	 * 
	 */
	public int binarySearch(Parent parent) {
		int value = -1;
		for(int i = 0; i < counter; i++) {
			if(parent.getName().compareTo(parents[i].getName()) == 0) {
				value = i;
				i = counter;
			}
		}
		return value;
	}
	
	/**
	 * Method of the class. Returns the parent.
	 * 
	 * @param i
	 * 			Parameter that serves to return.
	 * @return	the parent who is in the position i of the parents' array.
	 * 
	 */
	public Parent getParent(int i) {
		return parents[i];
	}
	
	/**
	 * Method of the class. Returns the parent's name.
	 * 
	 * @param name
	 * 			Identifier of the parent's name.
	 * @return the parent's name.
	 * 
	 */
	public Parent getParent(String name) {
		return parents[checkParent(name)];
	}
	
	/**
	 * Method of the class. Remove a parent from the array of parents.
	 * 
	 * @param parent
	 * 			Identifier of the parent's name.
	 * @throws Blablakidexception
	 * 			Exception of the class.
	 * 
	 */
	public void remove(Parent parent) throws BlablakidException {
		int pos = this.checkParent(parent.getName());
		if(pos == -1) {
			throw new BlablakidException("Error, this parent it is not in the aplication.");
			
		}else {
			parents[pos] = null;
			move(parents);
			counter--;
		}
	}
	
	/**
	 * Method of the class. Moves a position parent, and places it where there is a free space.
	 * 
	 * @param parents
	 * 			Identifier of the parents array.
	 * 
	 */
	public void move(Parent[] parents) {
		for (int i = 0; i < counter; i++) {
			if(parents[i] == null && i != parents.length - 1) {
				parents[i] = parents[(i+1)];
				parents[(i+1)] = null;
			}
		}
	}
	
	/**
	 * Method of the class. Prints the content of the parents array.
	 * 
	 * @return the content of the parents array.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.counter; i++) {
			output.append(parents[i].toString() + "\n");
		}
		return output.toString();
	}
}
