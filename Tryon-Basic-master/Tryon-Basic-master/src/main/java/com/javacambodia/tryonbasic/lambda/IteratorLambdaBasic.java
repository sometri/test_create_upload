package com.javacambodia.tryonbasic.lambda;

import java.util.Arrays;
import java.util.List;

public class IteratorLambdaBasic {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,10,9,11,23,90);
		System.out.println("Using Lambda Expression with forEach");
		System.out.println(" >>> Base");
		// 
		numbers.forEach((final Integer value) -> System.out.println(value));
		// type inference
		System.out.println(" >>> Type inference");
		numbers.forEach(value -> System.out.println(value));
		// method reference
		System.out.println(" >>> Method reference");
		numbers.forEach(System.out::println);
	}

}
