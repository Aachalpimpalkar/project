package com.collections;

import java.util.ArrayDeque;
import java.util.Stack;

public class Prog4 {

	public static void main(String[] args) {
		Stack<String> name=new Stack <>(); //LIFO
        name.push("Ritik");
        name.push("tom");
        name.push("jerry");
        name.push("lata");
        name.push("rakhi");
        System.out.println(name);
        
        name.push("Amruta");
        System.out.println(name);
       
        
        
        name.pop();
        System.out.println(name);
        

	}

}
