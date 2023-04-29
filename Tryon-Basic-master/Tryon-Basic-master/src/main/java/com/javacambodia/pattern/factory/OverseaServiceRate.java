package com.javacambodia.pattern.factory;

public class OverseaServiceRate implements IConsultantService {

	@Override
	public int getRate() {
		return 300;
	}

	@Override
	public double calculatePrice(int hours) {
		double flightTicket = 1000d;
		double accommodation = 425.86d;
		double food = 300d;
		double totalRatePrice = hours * this.getRate();
		return flightTicket + accommodation + food + totalRatePrice;
	}

}
