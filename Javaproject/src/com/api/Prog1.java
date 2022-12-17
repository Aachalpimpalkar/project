package com.api;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Prog1 {

	public static void main(String[] args) {
		List<Integer> values=  Arrays.asList(1,2,3,4,5,6);
				values.add(1);
				values.add(2);
				values.add(3);
				values.add(4);
				System.out.println(values);
				
				
				for(Integer It : values) {            //to iterate
					System.out.println(It);
				}
					
				
				
		    Iterator <Integer> i = values.iterator(); 
		   while(i.hasNext()) {
		    		System.out.println(i.next());
		    	}
		    	
//		   for(int j=0; j<6; j++) {
//		    	System.out.println(values.get(j));
//				
//		   }
//		   values.forEach(j->System.out.println(j));
//				
}
}