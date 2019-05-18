package es.unileon.prg1.blablakid;

public class Blablakid {
	
	private Kids kids;
	private Parents parents;
	private Activities activities;

	public Blablakid(int num) {
		this.kids = new Kids(num);
		this.parents = new Parents(num*2);
		this.activities = new Activities(num*3);
	}
	

	public void add(Kid kid) throws BlablakidException {
		kids.add(kid);
		
	}

	public void removeKid(String name) throws BlablakidException {
		kids.removeKid(name);	
		
	}
	
	public void add(Parent parent)throws BlablakidException {
		parents.add(parent);
		
	}
	
	public void removeParent(String name) throws BlablakidException {
		parents.removeParent(name);
		
	}


	public void add(Activity activity) throws BlablakidException {
		activities.add(activity);
		
	}
	
	public void removeActivity(String name, int day) throws BlablakidException {
		activities.removeActivity(name, day);
		
	}
	
	public void add(Ride ride) throws BlablakidException {
		rides.add(ride);
		
	}
	
	public void removeRide(String startPlace) throws BlablakidException {
		rides.removeRide(startPlace);
		
	}
	
	public void showSummary() throws BlablakidException {
		/*La opción de mostrar el resumen muestra por pantalla la información del estado de la aplicación
		en todo momento y que coincide con lo que estamos mostrando cada vez que mostramos el
		menú principal.*/
		
	}
	
	public void checkStatus() throws BlablakidException {
		//Esta opción deberá mostrar información sobre los trayectos que faltan por cubrir.
		
	}
	
	//showSummary llama al string de parents y de kids y muestra todo
	//checkstatus compruba las actividades que no tienen rides
}
