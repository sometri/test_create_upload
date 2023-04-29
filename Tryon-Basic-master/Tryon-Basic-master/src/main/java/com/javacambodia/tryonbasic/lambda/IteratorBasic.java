package com.javacambodia.tryonbasic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IteratorBasic {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,10,9,11,23,90);
		
		System.out.println("Normal Loop");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("Using forEach");
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer value) {
				System.out.println(value);
			}	
		});
	}
}
