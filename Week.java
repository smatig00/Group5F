package es.unileon.prg1.blablakid;

/**
 * Class that represents the week interface.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Week {

	private Day[] days;
	private int next;
	
	public Week(int maxRides) {
		this.days = new Day[5];
		this.next = 0;
		//TODO crear los dias de la semana
		for(int i = 0; i < 5; i++) {
			days[i] = days[1];

		}
	}
	
	/*public boolean add(Day day) throws BlablakidException{
		//log.entry();
		
		if(search(day.getDay()) == true){
			//log.error("Add Day error: Kid " + day.getDay() + " already in the aplication.");
			throw new BlablakidException("Add day error: Kid " + day.getDay() + " already in the aplication.");
			//return false;
		}
		else if(this.next == days.length){
			//log.error("Add day error: The list is full");
			throw new BlablakidException("Add day error: The list is full");
			//return false;
		}
		else{
			this.days[this.next++] = day;
			return true;
		}
		//log.exit();
	}
	
	public boolean search(Week day){
		boolean ok = false;
		int counter = 0;
		while(counter < days.length){
			if(isSame(this.days[counter].getDay(), day)){
				ok = true;
				break;
			}else{
				ok = false;
			}
		}
		
		return ok;
	}
	
	public boolean isSame(Week day, Week newDay){
		if(day.equals(newDay)){
			return true;
		}else{
			return false;
		}
	}
	
	public void removeDay(String name) throws BlablakidException {
		int pos = this.checkDay(name);
		if(pos == -1) {
			throw new BlablakidException("Error, this day it is not in the aplication.");
			
		}else {
			days[pos] = null;
			move();
			this.next--;
		}
	}

	
	private void move() {
		for(int i = 0; i < days.length-1; i++) {
			if(days[i] == null) {
				days[i] = days[i+1];
				days[i+1] = null;
			}
		}
	}
	
	public int checkDay(String name) {
		for(int i = 0; i < days.length; i++) {
			if(days[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.next; i++) {
			output.append(days[i].toString() + "\n");
		}
		return output.toString();
	}*/
	
	
	//metodo añadir dia
	//remove dia
	//buscar si ya esta el dia
	//ordenar el array al eliminar un ride para tal dia
	//toString
}
