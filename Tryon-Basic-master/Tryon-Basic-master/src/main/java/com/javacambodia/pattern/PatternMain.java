/**
 * 
 */
package com.javacambodia.pattern;

import com.javacambodia.pattern.factory.ConsultantServiceFactory;
import com.javacambodia.pattern.factory.IConsultantService;
import com.javacambodia.pattern.factory.ServiceType;

/**
 * @author pongs
 *
 */
public class PatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleHello.getInstance().sayHell0();
		
		System.out.println("Display My Number 1 : " + SingleHello.getInstance().getMyNumber());
		
		SingleHello.getInstance().increaseMyNumber();

		MyDoer doer = new MyDoer();
		doer.doSth();
		
		System.out.println("Display My Number 2 : " + SingleHello.getInstance().getMyNumber());
		
		
		System.out.println("Factory Pattern");
		ConsultantServiceFactory factory = new ConsultantServiceFactory();
		
		IConsultantService myService = factory.createServiceRate(ServiceType.COMMERCIAL);
		System.out.println("My service price is " + myService.calculatePrice(20));
		
		myService = factory.createServiceRate(ServiceType.INDIVIDUAL);
		System.out.println("My service price is " + myService.calculatePrice(20));
		
		
		myService = factory.createServiceRate(ServiceType.OVERSEA);
		System.out.println("My service price at Singapore for 3 days is " + myService.calculatePrice(16));
	}

}
