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
	private int counter;
	
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
			System.out.println("Error, el ninio ya esta en la lista");
		}else if(isFull()){
			System.out.println("Error, la lista esta completa");
		}else{
			this.kids[this.next++] = kid;
		}
	}
	
	public boolean isFull(){
		
		return true;
	}
	
	/**
	 * Method of the class. Search a kid by its name.
	 * @param name
	 * @return boolean
	 */
	public boolean buscar(String name){
		boolean valido = false;
		int contador = 0;
		while(contador < this.next){
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
	 * Method of the class. Remove a kid to the list.
	 * 
	 * @param kid
	 * @throws BlablakidException 
	 *
	 */
	public void removeKid(Kid kid) throws BlablakidException {
		int pos = this.checkKid(kid.getName());
		if(pos == -1) {
			throw new BlablakidException("Error, this kid it is not in the aplication.");
			
		}else {
			kids[pos] = null;
			move(kids);
			counter--;
		}
	}
	
	public int checkKid(String kid) {
		int position = 0;
		position = binarySearch(new Kid(kid));
		return position;
	}
	
	/*public int binarySearch(Kid kid) {
		int value = -1;
		for(int i = 0; i < counter; i++) {
			if(kid.getName().compareTo(kids[i].getName()) == 0) {
				value = i;
				i = counter;
			}
		}
		return value;
	}*/
	
	public void move(Kid[] kids) {
		for (int i = 0; i < counter; i++) {
			if(kids[i] == null && i != kids.length - 1) {
				kids[i] = kids[(i+1)];
				kids[(i+1)] = null;
			}
		}
	}
	
	
	

}
