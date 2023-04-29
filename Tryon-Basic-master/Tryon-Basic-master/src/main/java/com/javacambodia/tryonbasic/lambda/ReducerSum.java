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
public class ReducerSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sum reducer result");
		List<Integer> numbers = Arrays.asList(1,2,3,4,10,9,11,23,90);
		
		// 1 + 4 + 9 + 16 + 100 + 81 + 121 + 529 + 8100 = 8961
		long sum = numbers.stream().map(value -> value * value).reduce(0, (a, b) -> a + b);
		
		System.out.println("sum = " + sum);		
		
		// Also can do
		long sum2 = numbers.stream().mapToInt(value -> value * value).sum();
		System.out.println("sum2 = " + sum2);
	}

}
