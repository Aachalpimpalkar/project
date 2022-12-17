package com.api;

import java.util.Arrays;
import java.util.List;

public class Prog6 {

	public static void main(String[] args) {
		List<Integer> values=  Arrays.asList(1,2,3,4,5,6);
		values.forEach(i->doubleit(i)); //call by value, call by reference, call by method
			
	}

	private static void doubleit(int i) {
		System.out.println(i*2);;
		
	}

}
