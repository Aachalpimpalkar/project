package com.lamdaexpressions;

import java.util.function.IntPredicate;

public class Program4 {

	public static void main(String[] args) {
		IntPredicate obj = new IntPredicate() 
		{
			public boolean test(int age) {
				if(age!=18) {
					return true;
				}
				else {
					return false;
				}
			}
		};
		System.out.println(obj.test(18));
		
	}}


