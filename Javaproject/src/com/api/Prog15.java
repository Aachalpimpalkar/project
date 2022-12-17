package com.api;

import java.util.Arrays;
import java.util.List;

public class Prog15 {

	public static void main(String[] args) {
		List<Integer> values=  Arrays.asList(12,20,35,46,55,68);
		int result=0;
		for(int i : values) {
			if(i%5==0) {
				result= i*2;
				break;
				
			}
		}
		System.out.println(result);
		
		System.out.println(values
				.stream()
				.filter(i->i%5==0)
				.map(i->i*2)
				.findFirst()
				.orElse(0));
	
	}
		public static boolean isDivisible(int i) {
			System.out.println("in Dvs" +i);
			return i%5==0;
		}
		public static int mapDouble(int i) {
			System.out.println("in mapDouble" +i);
			return i*2;
		}

	}


