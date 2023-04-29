/**
 * 
 */
package com.javacambodia.tryonbasic.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author pongs
 *
 */
public class FilteringOutputOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Filtering output -> forEach");
		List<Integer> numbers = Arrays.asList(1,2,3,4,10,9,11,23,90);
		numbers.stream()
			.filter(value -> value % 2 == 0)
			.forEach(System.out::println);
	}

}
