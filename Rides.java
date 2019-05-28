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
	 * 
	 * 
	 */
	private int next;
	
	/**
	 * Ride type array identifier. Array where rides are saved.
	 * 
	 */
	private Ride[] rides;
	
	/**
	 * Builder of the class.
	 * 
	 */
	public Rides(int maxRides) {
		this.rides = new Ride[maxRides];
		this.next = 0;
	}
	
	/**
	 * Method of the class. Add a ride to the list and checks the state of the array that stores them and checks if it is full, or if there has been an error when adding them.
	 * 
	 * @param ride
	 * 			Identifier of the ride
	 * @return if it has been added correctly
	 * @throws BlablakidException
	 * 			Exception of the class
	 * 
	 */
	public boolean add(Ride ride) throws BlablakidException {
		//log.entry();
		
		if(search(ride.getStartPlace()) == true) {
			//log.error("Add ride error: Ride " + ride.getName() + " already in the aplication.");
			throw new BlablakidException("Add ride error: Ride " + ride.getStartPlace() + " already in the aplication.");
			//return false;
		}
		else if(this.next == rides.length) {
			//log.error("Add ride error: The list is full");
			throw new BlablakidException("Add ride error: The list is full");
			//return false;
		}
		else {
			this.rides[this.next++] = ride;
			return true;
		}
		//log.exit();
	}

	/**
	 * Method of the class. Search a ride by its name.
	 * @param name
	 * @return boolean
	 */
	public boolean search(String startPlace) {
		boolean ok = false;
		int counter = 0;
		while(counter < rides.length) {
			if(isSame(this.rides[counter].getStartPlace(), startPlace)) {
				ok = true;
				break;
			}else {
				ok = false;
			}
		}
		return ok;
	}
	
	/**
	 * Method of the class. Compare two rides to know if are the same.
	 * @param name
	 * @param newName
	 * @return boolean
	 */
	public boolean isSame(String name, String newName) {
		if(name.equals(newName)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Method of the class. Remove a ride from the array of rides.
	 * 
	 * @param ride
	 * 			Identifier of the rides
	 * @throws Blablakidexception
	 * 			Exception of the class
	 * 
	 */
	public void removeRide(String startPlace) throws BlablakidException {
		int pos = this.checkRide(startPlace);
		if(pos == -1) {
			throw new BlablakidException("Error, this ride it is not in the aplication.");
			
		}else {
			rides[pos] = null;
			move();
			this.next--;
		}
	}
	
	/**
	 * Method of the class. Moves a position ride, and places it where there is a free space.
	 * 
	 */
	public void move() {
		for(int i = 0; i < rides.length; i++) {
			if(rides[i] == null) {
				rides[i] = rides[i+1];
				rides[i+1] = null;
			}
		}
	}
	
	/**
	 * Method of the class. Checks if the ride is repeated.
	 * 
	 * @param name
	 * @return the position.
	 * 
	 */
	public int checkRide(String startPlace) {
		for(int i = 0; i < rides.length; i++) {
			if(rides[i].getStartPlace().equals(startPlace)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSize() {
		return rides.length;
	}
	
	/**
	 * Method of the class. Prints the content of the rides array.
	 * 
	 * @return the content of the rides array.
	 * 
	 */
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.next; i++) {
			output.append(rides[i].toString() + "\n");
		}
		return output.toString();
	}
	
	/*-----------------------------------------------------
	 * otra forma de hacerlo que tambien deberia funcionar
	 *-----------------------------------------------------*/
	
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
	/*public boolean addRide(Ride ride) throws BlablakidException {
		log.entry();
		
		boolean ok = false;
		
		if(this.isFull()) {
			log.error("Kid error: No more room left.");
			throw new BlablakidException("Ride error: No more room left.");
		
		}else if(this.checkRide(ride) != -1) {
			log.error("Add ride error: Ride " + ride.getName() + " already in the aplication.");
			throw new BlablakidException("Add ride error: Ride " + ride.getName() + " already in the aplication.");
		
		}else {
			rides[this.next] = ride;
			ok = true;
			this.next++;
		
		}
		log.exit();
		return ok;
	}*/
	
	/**
	 * Method of the class. Checks if the ride is repeated.
	 * 
	 * @param ride
	 * 			Identifier of the ride.
	 * @return the position.
	 * 
	 */
	/*private int checkRide(Ride ride) {
		for(int i = 0; i < rides.length; i++) {
			if(rides[i].toString().equals(ride.toString())) {
				return i;
			}
		}
		return -1;
	}*/

	/**
	 * Method of the class. Remove a ride from the array of rides.
	 * 
	 * @param ride
	 * 			Identifier of the rides.
	 * @throws Blablakidexception
	 * 			Exception of the class.
	 * 
	 */
	/*public void removeRide(Ride ride) throws BlablakidException {
		int pos = checkRide(ride);
		if(pos == -1) {
			throw new BlablakidException("Error, this activity it is not in the aplication.");
			
		}else {
			rides[pos] = null;
			move(rides);
			next--;
		}
	}*/
	
	/**
	 * Method of the class. Restarts the counter.
	 * 
	 */
	/*public void restart() {
		this.next = 0;
	}*/
	
	/**
	 * Method of the class. Checks if the array that stores the rides is full.
	 * 
	 * @return if the array is full returns true and if it's not returns false.
	 * 
	 */
	/*public boolean isFull() {
		if(next == rides.length) return true;
		else return false;
	}*/
	
	/**
	 * Method of the class. Returns the length of the array that stores the rides.
	 * 
	 * @return length of the array.
	 * 
	 */
	/*public int length() {
		return this.next;
	}*/
	
	/**
	 * Method of the class. Returns, after a comparison, the position where the first free hole is located, within the array of rides.
	 * 
	 * @param ride
	 * 			Identifier of the ride.
	 * @return the value that will be passed to the method.
	 * 
	 */
	/*public int binarySearch(Ride ride) {
		int value = -1;
		for(int i = 0; i < next; i++) {
			if(ride.toString().equals(rides[i].toString()) == true) {
				value = i;
				i = next;
			}
		}
		return value;
	}*/
	
	/**
	 * Method of the class. Moves a position ride, and places it where there is a free space.
	 * 
	 * @param rides
	 * 			Identifier of the rides array.
	 * 
	 */
	/*public void move(Ride[] rides) {
		for (int i = 0; i < next; i++) {
			if(rides[i] == null && i != rides.length - 1) {
				rides[i] = rides[(i+1)];
				rides[(i+1)] = null;
			}
		}
	}*/
	
	/**
	 * Method of the class. Prints the content of the rides array.
	 * 
	 * @return the content of the rides array.
	 * 
	 */
	/*public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.next; i++) {
			output.append(rides[i].toString() + "\n");
		}
		return output.toString();
	}*/

}
