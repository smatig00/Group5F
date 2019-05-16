package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that represents activities.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Activities {

	/**
	 * A Logger is started.
	 * 
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * Counter identifier for activities.
	 * 
	 */
	private int next;
	
	/**
	 * Activity type array identifier. Array where activities are saved.
	 * 
	 */
	private Activity[] activities;
	
	private final int MAX_ACTIVITIES = 3;
	
	/**
	 * Builder of the class.
	 * 
	 */
	public Activities() {
		this.activities = new Activity[MAX_ACTIVITIES];
		this.next = 0;
	}
	
	/**
	 * Method of the class. Add an activity to the list and checks the state of the array that stores them and checks if it is full, or if there has been an error when adding them.
	 * 
	 * @param activity
	 * 			Identifier of the activity
	 * @return if it has been added correctly
	 * @throws BlablakidException
	 * 			Exception of the class
	 * 
	 */
	public boolean addActivity(Activity activity) throws BlablakidException {
		//log.entry();
		
		if(search(activity.getName()) == true) {
			//log.error("Add activity error: Activity " + activity.getName() + " already in the aplication.");
			throw new BlablakidException("Add activity error: Activity " + activity.getName() + " already in the aplication.");
		}
		else if(this.next == activities.length) {
			//log.error("Add activity error: The list is full");
			throw new BlablakidException("Add activity error: The list is full");
		
		}
		else {
			this.activities[this.next++] = activity;
			return true;		
		}
		//log.exit();
	}
	
	/**
	 * Method of the class. Search an activity by its name.
	 * @param name
	 * @return boolean
	 */
	public boolean search(String name){
		boolean ok = false;
		int counter = 0;
		while(counter < activities.length){
			if(isSame(this.activities[counter].getName(), name)){
				ok = true;
				break;
			}else{
				ok = false;
			}
		}
		
		return ok;
	}
	
	/**
	 * Method of the class. Compare two activities to know if are the same.
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
	 * Method of the class. Remove an activity from the array of activities.
	 * 
	 * @param activity
	 * 			Identifier of the activity.
	 * @throws Blablakidexception
	 * 			Exception of the class.
	 * 
	 */
	public void removeActivity(Activity activity) throws BlablakidException {
		int pos = this.checkActivity(activity.getName());
		if(pos == -1) {
			throw new BlablakidException("Error, this activity it is not in the aplication.");
			
		}else {
			activities[pos] = null;
			move();
			this.next--;
		}
	}
	
	/**
	 * Method of the class. Moves a position activity, and places it where there is a free space.
	 * 
	 */
	private void move() {
		for(int i = 0; i < activities.length-1; i++) {
			if(activities[i] == null) {
				activities[i] = activities[i+1];
				activities[i+1] = null;
			}
		}
	}
	
	/**
	 * Method of the class. Checks if the activity is repeated.
	 * 
	 * @param name
	 * @return the position.
	 * 
	 */
	public int checkActivity(String name) {
		for(int i = 0; i < activities.length; i++) {
			if(activities[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	/**
	 * Method of the class. Prints the content of the activities array.
	 * 
	 * @return the content of the activities array.
	 * 
	 */
	/*public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.next; i++) {
			output.append(activities[i].toString() + "\n");
		}
		return output.toString();
	}*/

}
