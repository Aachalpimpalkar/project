package com.collections;

import java.util.ArrayList;

public class Prog1 {

	public static void main(String[] args) {
		ArrayList <String> name=new ArrayList <String>();
        name.add("Ruchira");
        name.add("Apurva");
        name.add("Akshay");
        name.add("Sneha");
        name.add("Rohit");
        System.out.println(name);
        
        name.add("Amruta");
        System.out.println(name);
        
        
        name.add(1, "Amruta");
        System.out.println(name);
        
        
        name.remove(1);
        System.out.println(name);
        
        name.set(0,"Ankita");
        System.out.println(name);
        
        
        System.out.println(name.get(4));
        
        name.clear();
        System.out.println(name);
	}

}
