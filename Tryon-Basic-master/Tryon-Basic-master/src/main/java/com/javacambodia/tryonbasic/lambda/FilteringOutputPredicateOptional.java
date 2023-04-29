/**
 * 
 */
package com.javacambodia.tryonbasic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author pongs
 *
 */
public class FilteringOutputPredicateOptional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Prediction --> filtering with optional --> forEach");
		List<String> names = Arrays.asList("Sophal", "Mesa", "Kalyan", "Nita", "Leakhena", 
				"Netra", "Nuch", "Neaktha", "Socheat");
		
		// create a predicated function
		final Function<String, Predicate<String>> startWithLetter = letter -> name -> name.startsWith(letter);
		String toFind = "S";
		Optional<String> findS = names.stream()
			.filter(startWithLetter.apply(toFind))
			.findFirst();
		System.out.println("Result of " + toFind + " is " + findS.orElse("Not found"));
	}

}
