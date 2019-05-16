package es.unileon.prg1.blablakid;

/**
 * Class that represents the activity.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Activity {
	
	/**
	 * Identifier to the name associated to the activity.
	 * 
	 */
	private String name;
	
	/**
	 * Identifier to the place associated to the activity.
	 * 
	 */
	private String place;
	private Week day;
	private Time start;
	private Time end;
	private Ride before;
	private Ride after;
	
	/**
	 * Builder of the class. Creates an activity with name and place.
	 * 
	 * @param name
	 * 			  Identifier to the name associated to the activity.
	 * @param place
	 *            Identifier to the place associated to the activity.
	 */
	public Activity(String name, String place, Week day, Time start, Time end, Ride before, Ride after) {
		this.name = name;
		this.place = place;
		this.day = day;
		this.start = start;
		this.end = end;
		this.before = before;
		this.after = after;
	}
	
	/**
	 * Builder of the class. Copy of the builder of the class Activity.
	 * 
	 * @param another
	 * 			Identifier of activity for the builder of the class copy.
	 *
	 */
	public Activity(Activity another) {
		this.name = another.getName();
		this.place = another.getPlace();
		this.day = another.getDay();
		this.start = another.getStart();
		this.end = another.getEnd();
		this.before = another.getBefore();
		this.after = another.getAfter();
	}
	
	/**
	 * Method of the class. Returns the activity' name.
	 * 
	 * @return activity' name.
	 * 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Method of the class. Returns the activity' place.
	 * 
	 * @return activity's place.
	 * 
	 */
	public String getPlace() {
		return this.place;
	}
	
	/**
	 * Method of the class. Saves a new activity' place.
	 * @param place
	 * 			Identifier of the new activity' place.
	 */
	public void setPlace(String newPlace) {
		this.place = newPlace;
	}
	
	public Week getDay() {
		return this.day;
	}
	
	/*public void setDay(Week newDay) {
		this.day = newDay;
	}*/
	
	public Time getStart() {
		return this.start; 
	}
	
	/*public void setStart(Time newStart) {
		this.start = newStart;
	}*/
	
	public Time getEnd() {
		return this.end;
	}
	
	/*public void setEnd(Time newEnd) {
		this.end = newEnd;
	}*/
	
	public Ride getBefore() {
		return this.before;
	}
	
	/*public void setBefore(Ride newBefore) {
		this.before = newBefore;
	}*/
	
	public Ride getAfter() {
		return this.after;
	}
	
	/*public void setAfter(Ride newAfter) {
		this.after = newAfter;
	}*/
	/**
	 * Method of the class. Prints what the returns indicates.
	 * 
	 * @return what the returns indicates.
	 * 
	 */
	public String toString() {
		String buffer = "";
		buffer = buffer + name;
		buffer = buffer + place;
		buffer = buffer + day;
		buffer = buffer + start;
		buffer = buffer + end;
		buffer = buffer + before;
		buffer = buffer + after;
		return buffer;
	}
	
}
