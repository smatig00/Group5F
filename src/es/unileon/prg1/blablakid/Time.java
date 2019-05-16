package es.unileon.prg1.blablakid;

/**
 * Class that represents the time interface.
 * 
 * @author Team 5F.
 * @version 1.0
 * 
 *
 */

public class Time {

	private int hora;
	private int minuto;
	
	public Time(int hora, int minuto){
		this.hora = hora;
		this.minuto = minuto;
	}

	public String toString() {
		String buffer = String.valueOf(hora) + ":" + String.valueOf(minuto);
		return buffer;
	}
}
