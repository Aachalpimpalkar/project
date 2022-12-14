package com.Generics1;

import java.util.ArrayList;
import java.util.List;


	class Data
	{
		public <E> void printListData(List<obj1>) {
			for(E :obj1) {
				System.out.println(i);
			}
			
		}
		
		
		public<E> void printArrayData() {
			
		}
	}



	public class Prog5{
		public static void main(String args[]) {
			List<Short>obj1 = new ArrayList<>();
			obj1.add(1);
			obj1.add(2);
			obj1.add(3);
			obj1.add(4);
			Data D= new Data();
			D.printListData(obj1);
		}
		
	}
