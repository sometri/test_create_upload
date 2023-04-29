package com.javacambodia.pattern.factory;

public class CommercialServiceRate implements IConsultantService {

	@Override
	public int getRate() {
		return 200;
	}

	@Override
	public double calculatePrice(int hours) {
		return hours * this.getRate();
	}

}
