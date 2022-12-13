package com.collections;


import java.util.LinkedList;

public class Prog2 {

	public static void main(String[] args) {
		LinkedList <String> name=new LinkedList <String>();
        name.add("Ritik");
        name.add("tom");
        name.add("jerry");
        name.add("lata");
        name.add("rakhi");
        System.out.println(name);
        
        name.addFirst("Amruta");
        System.out.println(name);
       
        name.addLast("Ankit");
        System.out.println(name);
        
        name.add(1, "Amruta");
        System.out.println(name);
        
        
        name.remove(1);
        System.out.println(name);
        
        name.removeFirst();
        System.out.println(name);
        
        name.removeLast();
        System.out.println(name);
        
        name.set(2,"Ronak");
        System.out.println(name);
        
        
        System.out.println(name.getFirst());
        
        name.clear();
        System.out.println(name);
	}

	}


