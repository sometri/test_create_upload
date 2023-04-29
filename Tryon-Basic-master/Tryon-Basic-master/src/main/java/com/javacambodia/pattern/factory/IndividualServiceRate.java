/**
 * 
 */
package com.javacambodia.pattern.factory;

/**
 * @author pongs
 *
 */
public class IndividualServiceRate implements IConsultantService {

	@Override
	public int getRate() {
		return 50;
	}

	@Override
	public double calculatePrice(int hours) {
		return hours * this.getRate();
	}

}
