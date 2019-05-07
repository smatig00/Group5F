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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
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
