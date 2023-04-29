package com.javacambodia.pattern.factory;

public class ConsultantServiceFactory {
	public IConsultantService createServiceRate(ServiceType type) {
		if (type == ServiceType.INDIVIDUAL) {
			return new IndividualServiceRate();
		} else if (type == ServiceType.COMMERCIAL) {
			return new CommercialServiceRate();
		} else if (type == ServiceType.ORGANIZATION) {
			return new OrganizationServiceRate();
		} else if (type == ServiceType.OVERSEA) {
			return new OverseaServiceRate();
		}
		return null;
	}
}
