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
	private int counter;
	
	/**
	 * Activity type array identifier. Array where activities are saved.
	 * 
	 */
	private Activity[] activities;
	
	/**
	 * Method of the class. Add activity, checks the state of the array that stores them and checks if it is full, empty or if there has been an error when adding them.
	 * 
	 * @param activity
	 * 			Identifier of the activity.
	 * @return if it has been added correctly.
	 * @throws BlablakidException
	 * 			Exception of the class
	 * 
	 */
	public boolean addActivity(Activity activity) throws BlablakidException {
		log.entry();
		
		boolean ok = false;
		
		if(this.isFull()) {
			log.error("Kid error: No more room left.");
			throw new BlablakidException("Kid error: No more room left.");
		
		}else if(this.checkActivity(activity.getName() != -1)) {
			log.error("Add activity error: Activity " + activity.getName() + " already in the aplication.");
			throw new BlablakidException("Add activity error: Activity " + activity.getName() + " already in the aplication.");
		
		}else if(activity.getName().isEmpty()) {
			log.error("Add activity error: Activity' name is empty.");
			throw new BlablakidException("Add activity error: Activity' name is empty.");
		
		}else {
			activities[this.counter] = activity;
			ok = true;
			this.counter++;
		
		}
		log.exit();
		return ok;
	}
	
	/**
	 * Method of the class. Remove an activity from the array of activities.
	 * 
	 * @param activity
	 * 			Identifier of the activity.
	 * @throws BlablakidException 
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
			move(activities);
			counter--;
		}
	}
	
	/**
	 * Method of the class. Restarts the counter.
	 * 
	 */
	public void restart() {
		this.counter = 0;
	}
	
	/**
	 * Method of the class. Checks if the array that stores the activities is full.
	 * 
	 * @return if the array is full returns true and if it's not returns false.
	 * 
	 */
	public boolean isFull() {
		if(counter == activities.length) return true;
		else return false;
	}
	
	/**
	 * Method of the class. Returns the length of the array that stores the activities.
	 * 
	 * @return length of the array.
	 * 
	 */
	public int length() {
		return this.counter;
	}
	
	/**
	 * Method of the class. Checks if the activity is repeated.
	 * 
	 * @param activity
	 * 			Identifier of the activity.
	 * @return the position.
	 *  
	 */
	public int checkActivity(String activity) {
		int position = 0;
		//position = binarySearch(new Activity(activity, 0));
		return position;
	}
	
	/**
	 * Method of the class. Returns, after a comparison, the position where the first free hole is located, within the array of activities.
	 * 
	 * @param activity
	 * 			Identifier of the activity.
	 * @return the value that will be passed to the method.
	 * 
	 */
	public int binarySearch(Activity activity) {
		int value = -1;
		for(int i = 0; i < counter; i++) {
			if(activity.getName().compareTo(activities[i].getName()) == 0) {
				value = i;
				i = counter;
			}
		}
		return value;
	}
	
	/**
	 * Method of the class. Moves a position activity, and places it where there is a free space.
	 * 
	 * @param activities
	 * 			Identifier of the activities array.
	 * 
	 */
	public void move(Activity[] activities) {
		for (int i = 0; i < counter; i++) {
			if(activities[i] == null && i != activities.length - 1) {
				activities[i] = activities[(i+1)];
				activities[(i+1)] = null;
			}
		}
	}
	
	/**
	 * Method of the class. Prints the content of the activities array.
	 * 
	 * @return the content of the activities array.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.counter; i++) {
			output.append(activities[i].toString() + "\n");
		}
		return output.toString();
	}

}
