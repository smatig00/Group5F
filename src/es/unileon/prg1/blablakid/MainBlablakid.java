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

	/**
	 * A logger is created for the Menu class.
	 * 
	 */
	private final static Logger log = LogManager.getLogger(MainBlablakid.class);
	
	/**
	 * 
	 * @param args String array with the data of the aplication.

	 * @throws BlablakidException if the data it is not correct.
	 */
	public static void main(String args[]) {
		
		log.info("Entering to BlablaKid aplication");
		
		int num;
		if(args.length != 1) {
			
			System.out.println("Few arguments");
			
		}else {
			
			try {
				
				num = Integer.parseInt(args[0]);
				log.info("Correct data entered");
				
			}catch(NumberFormatException e) {
				System.err.println(e.getMessage() + "\nWrong syntax of the program.\n");
				log.fatal("Exiting of the execution of the aplication");
			}
			Blablakid blablakid = new Blablakid(num);
			TextUI textUI = new TextUI(blablakid);
			textUI.start();
		}
	}

}
