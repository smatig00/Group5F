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
	private WeekDays day;
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
	public Activity(String name, String place /*, ...*/) {
		this.name = name;
		this.place = place;
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
	public void setPlace(String place) {
		this.place = place;
	}
	
	/**
	 * Method of the class. Prints what the returns indicates.
	 * 
	 * @return what the returns indicates.
	 * 
	 */
	public String toString() {
		return this.name + " : " + this.place;
	}
	
	
/*
	private String act;
	private String lugar;
	private int day;
	private String kid;
	private int hour;
	private int minute;
	private int endHour;
	private int endMin;
	
	public Activity() {
		
		act= "desconocido";
		lugar= "desconocido";
		day=0;
		kid="desconocido";
		hour=0;
		minute=0;
		endHour=0;
		endMin=0;
		
	}
	
	public void setAct(String act) {
		
		this.act=act;
	}
	
	public String  getAct() {
		
		return act;
	}
	
	public void setLugar(String lugar) {
		
		this.lugar=lugar;
	}
	
	public String getLugar() {
		
		return lugar;		
	}
	
	public void getDay(int day) {
		
		this.day=day;
	}
	
	public int getDay() {
		
		return day;		
	}
	
	public void setKid(String kid) {
		
		this.kid=kid;
	}
	
	public String getKid() {
		
		return kid;
	}
	
	public void setHour(int hour) {
		
		this.endHour=hour;
	}
	
	public int getHour() {
		
		return hour;
	}
	
	public void setMinute(int minute) {
		
		this.minute=minute;
	}
	
	public int getMinute() {
		
		return minute;
	}
	
	public void setEndHour(int endHour) {
		
		this.endHour=endHour;
	}
	
	public int getEndhour() {
		
		return endHour;
	}
	
	public void setendMin(int endMin) {
		
		this.endMin=endMin;
	}
	
	public int getendMin() {
		
		return endMin;
	}
*/
}
