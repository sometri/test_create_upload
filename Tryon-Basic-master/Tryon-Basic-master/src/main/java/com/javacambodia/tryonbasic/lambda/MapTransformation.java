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
public class MapTransformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Map Transforming -> forEach");
		int calc = 2;
		List<Integer> numbers = Arrays.asList(1,2,3,4,10,9,11,23,90);
		numbers.stream()
			.map(value -> value * calc)
			.forEach(System.out::println);
	}

}
