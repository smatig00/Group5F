package es.unileon.prg1.blablakid;


public class Day {
	
	private WeekDays day;
	private Rides rides;

	public Day(WeekDays day, int maxRides) {
		this.day = day;
		this.rides = new Rides(maxRides);
	
	}

	public int numRidesLength() {
		return this.rides.getSize();
	
	} 


	public boolean addRides(Rides rides) {
		if(rides==null) {
			return false;
		
		}
		else {
			
			this.rides = rides;
			return true;
		}
	}

	public static WeekDays getName(int numDay) {

		switch (numDay) { 

		case 0:
			return (WeekDays.MONDAY); 

		case 1:
			return (WeekDays.TUESDAY); 

		case 2:
			return (WeekDays.WEDNESDAY); 

		case 3:
			return (WeekDays.THURSDAY); 

		case 4:
			return (WeekDays.FRIDAY); 

		}
		return null;
	}
	

}
