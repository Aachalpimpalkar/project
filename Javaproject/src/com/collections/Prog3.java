package com.collections;



import java.util.ArrayDeque;


public class Prog3 {

	public static void main(String[] args) {
		ArrayDeque<String> name=new ArrayDeque <>(); //FIFO
        name.add("Ritik");
        name.add("tom");
        name.add("jerry");
        name.add("lata");
        name.add("rakhi");
        System.out.println(name);
        
        name.add("Amruta");
        System.out.println(name);
       
        
        
        name.remove();
        System.out.println(name);
        

	}

}
