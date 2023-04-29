/**
 * 
 */
package com.javacambodia.tryonbasic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author pongs
 *
 */
public class TryLog4JMain {
	private static final Logger logger = LogManager.getLogger(TryLog4JMain.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.trace("Entering Application");
		logger.info("Hello Log4J2, 2020");
		
		logger.error("Something is wrong with this code", new Exception("Invalid!"));
	}

}
