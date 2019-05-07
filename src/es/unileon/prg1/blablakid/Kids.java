package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Class that represents the kids.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */

public class Kids {

	private int next;
	private Kid[] kids;
	
	public Kids(){
		this.next = 0;
		this.kids = new Kid[50];		

	}
	
	/**
	 * Method of the class. Add a kid to the list.
	 * 
	 * @param kid
	 */
	public void addKid(Kid kid){
		if(buscar(kid.getName()) == true){
			System.out.println("Error, el niño ya esta en la lista");
		}else if(this.next == null){
			System.out.println("Error, la lista esta completa");
		}else{
			this.kids[this.next++] = kid;
		}
	}
	
	/**
	 * Method of the class. Search a kid by its name.
	 * @param name
	 * @return boolean
	 */
	public boolean buscar(String name){
		boolean valido = false;
		int contador = 0;
		while(contador < this.siguiente){
			if(this.kids[contador].getName().isSame(name)){
				valido = true;
				break;
			}else{
				valido = false;
			}
		}
		
		return valido;
	}
	
	
	/**
	 * Method of the class. Compare two kids to know if are the same.
	 * @param name
	 * @return boolean
	 */
	public boolean isSame(String name){
		if(this.getName == name){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Method of the class. Remove a kid to the list.
	 * 
	 * @param kid
	 *
	 */
	public void removeKid(Kid kid) {
		int pos = this.checkKid(kid.getName());
		if(pos == -1) {
			throw new BlablakidException("Error, this kid it is not in the aplication.");
			
		}else {
			kids[pos] = null;
			move(kids);
			counter--;
		}
	}
	
	
	

}
