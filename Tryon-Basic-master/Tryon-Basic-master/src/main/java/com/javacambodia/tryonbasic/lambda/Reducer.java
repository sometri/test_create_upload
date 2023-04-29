/**
 * 
 */
package com.javacambodia.tryonbasic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author pongs
 *
 */
public class Reducer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Reducers result:");
		List<String> names = Arrays.asList("Sophal", "Mesa", "Kalyan", "Nita", "Leakhena", 
				"Netra", "Nuch", "Neaktha", "Socheat");
		
		Optional<String> shortestName = names.stream().reduce((name1, name2) -> 
				name1.length() <= name2.length() ? name1 : name2);
		
		if (shortestName.isPresent()) {
			System.out.println(shortestName.get());
		} else {
			System.out.println("Impossible!");
		}
	}

}
