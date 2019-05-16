package es.unileon.prg1.blablakid;

/**
 * Class that represents the ride.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Ride {
	
	private String name;
	private Parent parentName;
	private Kid kidName;
	private Time startRide;
	private Time endRide;
	private String endPlace;
	private String startPlace;
	
	
	public Ride(String name, Parent parentName, Kid kidName, Time startRide, Time endRide, String startPlace, String endPlace) {
		
		this.name = name;
		this.parentName = parentName;
		this.kidName = kidName;
		this.startRide = startRide;
		this.endRide = endRide;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setParentName(Parent newParentName) {
		this.parentName = newParentName;
	}
	
	public Parent getParentName() {
		return parentName;
	}

	public void setKidName(Kid newKidName) {
		this.kidName = newKidName;
	}
	
	public Kid getKidName() {
		return kidName;
	}
	
	public void setStartRide(Time newStartRide) {
		
		this.startRide = newStartRide;
	}
	
	public Time getStartRide() {
		
		return startRide;
	}
	
	public void setEndRide (Time newEndRide) {
		
		this.endRide = newEndRide;
	}
	
	public Time getEndRide() {
		
		return endRide;
	}
	
	public void setStartPlace(String newStartPlace) {
		
		this.startPlace = newStartPlace;
	}
	
	public String getStartPlace() {
		
		return  startPlace;
	}
	
	public void setEndPlace(String newEndPlace) {
		
		this.endPlace = newEndPlace;
	}
	
	public String getEndPlace() {
		
		return endPlace;
	}
	
	public String toString() {
		String buffer = "";
		buffer = buffer + name;
		buffer = buffer + " " + parentName;
		buffer = buffer + " " + kidName;
		buffer = buffer + " " + startRide.toString();
		buffer = buffer + " " + endRide.toString();
		buffer = buffer + " " + startPlace;
		buffer = buffer + " " + endPlace;
		return buffer;
	}

}
