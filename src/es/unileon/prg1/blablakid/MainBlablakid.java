package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.*;

import javax.swing.plaf.TextUI;

import java.io.*;	

/**
 * Principal App's class.
 * 
 * @author Team 5F.
 * @version 1.0
 *
 */
public class MainBlablakid {

	private final static Logger log = LogManager.getLogger(MainBlablakid.class);
	
	public static void main(String args[]) {
		
		int num;
		if(args.length != 1) {
			
			System.out.println("Few arguments");
			
		}else {
			
			try {
				
				num = Integer.parseInt(args[0]);
				
			}catch(NumberFormatException e) {
				
				System.out.println("");
				
			}
			MainBlablakid blablakid = new MainBlablakid(num);
			TextUI textUI = new TextUI(blablakid);
			textUI.start();
		}
	}

	
	/*public static void main(String args[]) throws IOException {
	
	int elegir=0;
	List <kid> listaKids = new ArrayList<kid> ();
	Dialogo opcion = new Dialogo();
    Dialogo mensaje = new Dialogo();
    
    while (elegir != 0) {
    
    	elegir=opcion.obtenerOpcionMainBlablakid();
    	
    	if (elegir == 1) {
    		
    		kid tmpKid = new kid();
           
            tmpKid.SetNombre(opcion.obtenerNomKid());
            listaKids.add(tmpKid);
            
    	}
    }
	
}*/
}