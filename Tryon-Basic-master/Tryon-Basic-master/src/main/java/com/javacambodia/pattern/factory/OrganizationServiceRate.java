package com.javacambodia.pattern.factory;

public class OrganizationServiceRate implements IConsultantService {

	@Override
	public int getRate() {
		return 150;
	}

	@Override
	public double calculatePrice(int hours) {
		return hours * this.getRate();
	}

}
