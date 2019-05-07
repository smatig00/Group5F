package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that represents rides.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Rides {

	/**
	 * A Logger is started.
	 * 
	 */
	static final Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * Counter identifier for rides.
	 * 
	 */
	private int counter;
	
	/**
	 * Ride type array identifier. Array where rides are saved.
	 * 
	 */
	private Ride[] rides;
	
	/**
	 * Method of the class. Add ride, checks the state of the array that stores them and checks if it is full, empty or if there has been an error when adding them.
	 * 
	 * @param ride
	 * 			Identifier of the ride.
	 * @return if it has been added correctly.
	 * @throws BlablakidException
	 * 			Exception of the class
	 * 
	 */
	public boolean addRide(Ride ride) {
		log.entry();
		
		boolean ok = false;
		
		if(this.isFull()) {
			log.error("Kid error: No more room left.");
			throw new BlablakidException("Kid error: No more room left.");
		
		}else if(this.checkRide(ride.get() != -1)) {
			log.error("Add ride error: Ride " + ride.get() + " already in the aplication.");
			throw new BlablakidException("Add ride error: Ride " + ride.getName() + " already in the aplication.");
		
		}else if(ride.get().isEmpty()) {
			log.error("Add ride error: Ride's name is empty.");
			throw new BlablakidException("Add ride error: Ride's name is empty.");
		
		}else {
			rides[this.counter] = ride;
			ok = true;
			this.counter++;
		
		}
		log.exit();
		return ok;
	}
	
	/**
	 * Method of the class. Remove a ride from the array of rides.
	 * 
	 * @param ride
	 * 			Identifier of the rides.
	 * @throws Blablakidexception
	 * 			Exception of the class.
	 * 
	 */
	public void removeRide(Ride ride) {
		int pos = this.checkRide(ride.get());
		if(pos == -1) {
			throw new BlablakidException("Error, this activity it is not in the aplication.");
			
		}else {
			rides[pos] = null;
			move(rides);
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
	 * Method of the class. Checks if the array that stores the rides is full.
	 * 
	 * @return if the array is full returns true and if it's not returns false.
	 * 
	 */
	public boolean isFull() {
		if(counter == rides.length) return true;
		else return false;
	}
	
	/**
	 * Method of the class. Returns the length of the array that stores the rides.
	 * 
	 * @return length of the array.
	 * 
	 */
	public int length() {
		return this.counter;
	}
	
	/**
	 * Method of the class. Checks if the ride is repeated.
	 * 
	 * @param ride
	 * 			Identifier of the ride.
	 * @return the position.
	 * 
	 */
	public int checkRide(String ride) {
		int position = 0;
		//position = binarySearch(new Ride(ride, 0));
		return position;
	}
	
	/**
	 * Method of the class. Returns, after a comparison, the position where the first free hole is located, within the array of rides.
	 * 
	 * @param ride
	 * 			Identifier of the ride.
	 * @return the value that will be passed to the method.
	 * 
	 */
	public int binarySearch(Ride ride) {
		int value = -1;
		for(int i = 0; i < counter; i++) {
			if(ride.get().compareTo(rides[i].get()) == 0) {
				value = i;
				i = counter;
			}
		}
		return value;
	}
	
	/**
	 * Method of the class. Moves a position ride, and places it where there is a free space.
	 * 
	 * @param rides
	 * 			Identifier of the rides array.
	 * 
	 */
	public void move(Ride[] rides) {
		for (int i = 0; i < counter; i++) {
			if(rides[i] == null && i != rides.length - 1) {
				rides[i] = rides[(i+1)];
				rides[(i+1)] = null;
			}
		}
	}
	
	/**
	 * Method of the class. Prints the content of the rides array.
	 * 
	 * @return the content of the rides array.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.counter; i++) {
			output.append(rides[i].toString() + "\n");
		}
		return output.toString();
	}

}
