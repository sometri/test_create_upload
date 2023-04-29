/**
 * 
 */
package com.javacambodia.pattern;

/**
 * @author pongs
 *
 */
public class SingleHello {
	private static SingleHello singleHello = null;
	private int myNumber = 0;
	
	private SingleHello() {
		
	}
	
	public static SingleHello getInstance() {
		if (singleHello == null) {
			singleHello = new SingleHello();
		}
		
		return singleHello;
	}
	
	public void sayHell0() {
		System.out.println("Hello, this is from Singleton");
	}
	
	public int getMyNumber() {
		return this.myNumber;
	}
	
	public void increaseMyNumber() {
		this.myNumber++;
	}
}
