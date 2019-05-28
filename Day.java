package es.unileon.prg1.blablakid;

public class Day {

	private Week day;
	private Rides rides;
	private int maxRides;
	
	public Day(Week day, int maxRides) {
		this.day = day;
		this.maxRides = maxRides;
	}
	
	public Week getDay() {
		return this.day;
		
	}
	
	public int getNum() {
		return 0;
	}
	
	public int getMaxRidesParent() {
		return 0;
	}
	
	public boolean add(Ride ride) {
		return false;
	}
	
	public void removeRide(String startPlace) {
		
	}
	
	public Ride getRide() {
		return null;
	}
	
	public String toString() {
		return null;
	}
	
	
}
