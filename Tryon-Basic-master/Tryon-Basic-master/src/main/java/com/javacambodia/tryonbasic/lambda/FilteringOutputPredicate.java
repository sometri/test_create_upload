/**
 * 
 */
package com.javacambodia.tryonbasic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author pongs
 *
 */
public class FilteringOutputPredicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Prediction --> filtering output --> forEach");
		List<String> names = Arrays.asList("Sophal", "Mesa", "Kalyan", "Nita", "Leakhena", 
				"Netra", "Nuch", "Neaktha", "Socheat");
		
		// create a predicated function
		final Function<String, Predicate<String>> startWithLetter = letter -> name -> name.startsWith(letter);
		
		names.stream()
			.filter(startWithLetter.apply("N"))
			.forEach(System.out::println);
	}

}
