package sdet27.GenericUtility;

import java.util.Date;
import java.util.Random;

/**
 * This method will generate a random number within 1000 range
 * @author Dk
 *
 */

public class JavaUtility {
	public int randomNumber() {
		Random ran = new Random();
		int randomNum = ran.nextInt(1000);
		return randomNum;	
	}
	/**
	 * This method will return System time and Date
	 */
	public String getSystemDateAndTime() {
		Date date = new Date();
		String systemDateAndTime = date.toString();
		return systemDateAndTime;
	}
}


