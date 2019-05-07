package es.unileon.prg1.blablakid;

/**
 * Class that represents the ride.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Ride {
	
	private String Sride;
	private String endRide;
	
	public Ride() {
		
		Sride="desconocido";
		endRide="desconocido";
		
	}
	
	public void setSride(String Sride) {
		
		this.Sride=Sride;
	}
	
	public String getSride() {
		
		return Sride;
	}
	
	public void setEndRide (String endRide) {
		
		this.endRide=endRide;
	}
	
	public String getEndRide() {
		
		return endRide;
	}

}
