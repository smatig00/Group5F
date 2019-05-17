package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that represents the kids.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Kids {
	
	/**
	 * A Logger is started.
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * 
	 */
	private int next;
	/**
	 * Kid type array identifier. Array where kids are saved.
	 * 
	 */
	private Kid[] kids;
	
	
	/**
	 * Builder of the class.
	 * 
	 */
	public Kids(int size){
		this.kids = new Kid[size];
		this.next = 0;		

	}
	
	/**
	 * Method of the class. Add a kid to the list and checks the state of the array that stores them and checks if it is full, or if there has been an error when adding them.
	 * 
	 * @param kid
	 * 			Identifier of the kid
	 * @return if it has been added correctly
	 * @throws BlablakidException 
	 * 			Exception of the class
	 */
	public boolean addKid(Kid kid) throws BlablakidException{
		//log.entry();
		
		if(search(kid.getName()) == true){
			//log.error("Add kid error: Kid " + kid.getName() + " already in the aplication.");
			throw new BlablakidException("Add kid error: Kid " + kid.getName() + " already in the aplication.");
			//System.out.println("Error, el ninio ya esta en la lista");
			//return false;
		}
		else if(this.next == kids.length){
			//log.error("Add kid error: The list is full");
			throw new BlablakidException("Add kid error: The list is full");
			//System.out.println("Error, la lista esta completa");
			//return false;
		}
		else{
			this.kids[this.next++] = kid;
			return true;
		}
		//log.exit();
	}
	
	/**
	 * Method of the class. Search a kid by its name.
	 * @param name
	 * @return boolean
	 */
	public boolean search(String name){
		boolean ok = false;
		int counter = 0;
		while(counter < kids.length){
			if(isSame(this.kids[counter].getName(), name)){
				ok = true;
				break;
			}else{
				ok = false;
			}
		}
		
		return ok;
	}
	
	
	/**
	 * Method of the class. Compare two kids to know if are the same.
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
	 * Method of the class. Remove a kid from the array of kids.
	 * 
	 * @param kid
	 * 			Identifier of the kids
	 * @throws BlablakidException 
	 * 			Exception of the class
	 *
	 */
	public void removeKid(Kid kid) throws BlablakidException {
		int pos = this.checkKid(kid.getName());
		if(pos == -1) {
			throw new BlablakidException("Error, this kid it is not in the aplication.");
			
		}else {
			kids[pos] = null;
			move();
			this.next--;
		}
	}
	
	/**
	 * Method of the class. Moves a position kid, and places it where there is a free space.
	 * 
	 */
	private void move() {
		for(int i = 0; i < kids.length-1; i++) {
			if(kids[i] == null) {
				kids[i] = kids[i+1];
				kids[i+1] = null;
			}
		}
		
	}

	/**
	 * Method of the class. Checks if the kid is repeated.
	 * 
	 * @param name
	 * @return the position.
	 * 
	 */
	public int checkKid(String name) {
		for(int i = 0; i < kids.length; i++) {
			if(kids[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	

}
