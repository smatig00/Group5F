package es.unileon.prg1.blablakid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.unileon.prg1.blablakid.BlablakidException;

/**
 * Class dedicated to the user's text interface
 * 
 * @author Team 5F
 * @version 1.0
 */

public class TextUI {
	
	/**
	 * A logger is created for the Menu class.
	 * 
	 */
	private static final Logger log = LogManager.getLogger(TextUI.class);
	
	/**
	 * Identifier of the blablakid.
	 * 
	 */
	//private Blablakid blablakid;
	
	/**
	 * 	
	 * @param blablakid
	 */
	/*public TextUI(Blablakid blablakid) {
		this.blablakid = blablakid;
		
	}*/
	
	/**
	 * 
	 * @param blablakid
	 */
	public static void start(Blablakid blablakid) {
		log.entry();
		int option;
		
		do {
			log.info("Printing the menu and waiting for user's choice");
			//imprimir el menu
			System.out.println("---------\n");
			System.out.println("Blablakid\n");
			System.out.println("---------\n");
			System.out.println("Select an option:\n");
			System.out.println("1 - Add kid.\n");
			System.out.println("2 - Remove kid.\n");
			System.out.println("3 - Add parent.\n");
			System.out.println("4 - Remove parent.\n");
			System.out.println("5 - Add activity.\n");
			System.out.println("6 - Remove activity.\n");
			System.out.println("7 - Add ride.\n");
			System.out.println("8 - Remove ride.\n");
			System.out.println("9 - Show summary.\n");
			System.out.println("10 - Check status.\n");
			System.out.println("0 - Exit.\n");
			
			option = Teclado.readInteger();
			
			log.info("User has choosen the option: " + option);
		
			try {
				switch(option) {
				// Add kid
				case 1:
					System.out.println("Name of the kid to add.\n");
					String kidName = Teclado.readString(); 
					Kid kid = new Kid(kidName);
					blablakid.add(kid);
					break;
					log.info("The kid's name has been entered." + kidName);
					
				// Remove kid
				case 2:
					System.out.println("Name of the kid to remove.\n");
					String removeKidName = Teclado.readString();
					blablakid.removeKid(removeKidName);
					break;
					log.info("The kid's name has been entered." + removeKidName);
					
				// Add parent
				case 3:					
					System.out.println("Name of the parent to add.\n");
					String parentName = Teclado.readString();
					log.info("The kid's name has been entered." + parentName);
					
					System.out.println("How many kids does " + parentName + " have?\n");
					int numKids = Teclado.readInteger();
					log.info("The number of kids the parent has has been introduced.");
					
					System.out.println("How many rides can " + parentName + " make per day?\n");
					int numRides = Teclado.readInteger();
					log.info("The number of rides the parent has has been introduced.");
				
					System.out.println("Who is " + parentName + "'s kid number 01?\n");
					//????
					log.info("??????");
					Parent parent = new Parent(parentName,/* Kids kids*/);
					blablakid.add(parent);
					break;

				// Remove parent
				case 4:					
					System.out.println("Name of the parent to remove.\n");
					String removeParentName = Teclado.readString();
					blablakid.removeParent(removeParentName);
					log.info("The kid's name has been entered." + removeParentName);
					break;
					
				// Add activity
				case 5:
					System.out.println("Name of the activity:\n");
					String activityName = Teclado.readString();
					log.info("The kid's name has been entered." + activityName);
					
					System.out.println("Where does the activity " + activityName + " takes place?\n");
					String place = Teclado.readString();
					log.info("The activity place has been introduced." + place);
					
					System.out.println("Day of the week for the activity:\n");
					System.out.println("Insert the number of the day of the week:\n0 - Monday / 1 - Tuesday / 2 - Wednesday / 3 - Thursday / 4 - Friday\n");
					int dayActivity = Teclado.readInteger();
					log.info("The day of the week has been introduced." + day);
					
					System.out.println("Name of the kid taking the activity\n");
					String nameKid = Teclado.readString();
					log.info("The name of the kid taking the activity has been introduced.\n" + nameKid);
					
					System.out.println("When does the activity start?\n");
					System.out.println("Insert hour:\n");
					int hourActivityStart = Teclado.readInteger();
					System.out.println("Insert minute:\n");
					int minActivityStart = Teclado.readInteger();
					log.info("The start hour of the activity has been introduced.\n");
					
					System.out.println("When does the activity end?\n");
					System.out.println("Insert hour:\n");
					int hourActivityEnd = Teclado.readInteger();
					System.out.println("Insert minute:\n");
					int minActivityEnd = Teclado.readInteger();
					log.info("The finish hour of the activity has been introduced.");
					
					Activity activity = new Activity(activityName, place, /*?????*/);
					blablakid.add(activity);
					break;
					
				// Remove activity
				case 6:
					System.out.println("Name of the kid taking the activity to remove.\n");
					String removeNameKid = Teclado.readString();
					log.info("The name of the kid to remove has been introduced." + removeNameKid);
					
					System.out.println("Name of the activity to remove.\n");
					String removeActivityName = Teclado.readString();
					log.info("The kid's name has been entered." + removeActivityName);
					
					blablakid.removeActivity(removeActivityName, dayActivity);
					break;
					
				// Add ride
				case 7:
					System.out.println("Name of the parent in charge of the ride.\n");
					String parentRideName = Teclado.readString();
					log.info("The parent's name in charge of the ride has been entered." + parentRideName);
					
					System.out.println("Name of the activity of the ride.\n");
					String activityRideName = Teclado.readString();
					log.info("The name of the activity of the ride has been introduced." + activityRideName);
					
					System.out.println("Name of the kid taking the activity.\n");
					String kidRideName = Teclado.readString();
					log.info("The name of the kid taking the activity has been introduced." + kidRideName);
					
					System.out.println("Where does the ride start?\n");
					String startPlace = Teclado.readString();
					log.info("The place where the ride starts has been introduced." + startPlace);
					
					System.out.println("Where does the ride end?\n");
					String endPlace = Teclado.readString();
					log.info("The place where the ride ends has been introduced." + endPlace);
					
					System.out.println("When does the ride start?");
					System.out.println("Insert hour:\n");
					int hourRideStart = Teclado.readInteger();
					System.out.println("Insert minute:\n");
					int minRideStart = Teclado.readInteger();
					log.info("The start hour of the ride has been introduced.\n");
					
					System.out.println("When does the ride end?");
					System.out.println("Insert hour:\n");
					int hourRideEnd = Teclado.readInteger();
					System.out.println("Insert minute:\n");
					int minRideEnd = Teclado.readInteger();
					log.info("The finish hour of the ride has been introduced.\n");
					
					System.out.println("Day of the week for the ride.\n");
					System.out.println("Insert the number of the day of the week:\n0 - Monday / 1 - Tuesday / 2 - Wednesday / 3 - Thursday / 4 - Friday\n");
					int dayRide = Teclado.readInteger();
					log.info("The day of the week for the ride has been introduced.");
					
					Ride ride = new Ride(/*????*/);
					blablakid.add(ride);
					break;
					
				// Remove ride
				case 8:						
					System.out.println("Name of the parent in charge of the ride.\n");
					String removeParentRideName = Teclado.readString();
					log.info("The parent's name in charge of the ride has been entered." + removeParentRideName);
					
					System.out.println("Day of the week for the ride.\n");
					System.out.println("Insert the number of the day of the week:\n0 - Monday / 1 - Tuesday / 2 - Wednesday / 3 - Thursday / 4 - Friday\n");
					int dayRide8 = Teclado.readInteger();
					log.info("The day of the week for the ride has been introduced.");
					
					System.out.println("Where does the ride start?");
					String startPlaceRide = Teclado.readString();
					log.info("The place where the ride starts has been introduced." + PlaceStartRide);
					
					System.out.println("Where does the ride end?");
					String endPlaceRide = Teclado.readString();
					log.info("The place where the ride ends has been introduced." + PlaceEndRide);
					
					blablakid.removeRide(startPlaceRide);
					break;
					
				// Show summary
				case 9:
					blablakid.showSummary();
					break;
					
				// CheckStatus
				case 10:
					blablakid.checkStatus();
					break;
					
				// Exit
				case 0:
					
					System.out.println("Goodbye.\n");
					break;
					
				}
			} catch (BlablakidException e) {
				System.err.println(e.getMessage());
				log.error(e.getMessage());
			}
		
		}while(option != 0);
		
		log.exit();
	}
}
