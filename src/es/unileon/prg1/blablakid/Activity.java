package es.unileon.prg1.blablakid;

/**
 * Class that represents the activity interface.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Activity {

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
}
