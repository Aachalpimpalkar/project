package com.collections;

import java.util.Stack;

public class Prog5 {

	public static void main(String[] args) {
		Stack<Integer> a =new Stack <>(); //LIFO
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        
        a.add(60);
        System.out.println(a);
       
        
        
       a.remove(2);
        System.out.println(a);
        
	}

}
