package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Prog10 {

	public static void main(String[] args) {
		List<Integer> values=  Arrays.asList(1,2,3,4,5,6);
		System.out.println(values
				.stream()
				.filter(i->i%5==0)
				.reduce(0, (c,e)->c+e));
		
		Predicate<Integer>p = new Predicate<Integer>() {

			
			public boolean test(Integer i) {
				
				return i%5==0;
			}
			
		};
		System.out.println(values.stream().filter(i->i%5==0).reduce(0, (c,e)->c+e));
		
		

	}

}
