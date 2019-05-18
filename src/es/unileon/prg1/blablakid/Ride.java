package es.unileon.prg1.blablakid;

/**
 * Class that represents the ride.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Ride {
	
	private Time startRide;
	private Time endRide;
	private String endPlace;
	private String startPlace;
	
	
	public Ride(Time startRide, Time endRide, String startPlace, String endPlace) {
		
		this.startRide = startRide;
		this.endRide = endRide;
		this.startPlace = startPlace;
		this.endPlace = endPlace;
		
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
		StringBuilder output = new StringBuilder();
		output = output.append(startRide.toString() + " ");
		output = output.append(endRide.toString() + " ");
		output = output.append(startPlace + " ");
		output = output.append(endPlace);
		return output.toString();
	}

}
