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



	public class Prog1{
		public static void main(String args[]) {
			List<Float>obj1 = new ArrayList<>();
			obj1.add(1f);
			obj1.add(2f);
			obj1.add(3f);
			obj1.add(4f);
			Data D= new Data();
			D.printListData(obj1);
		}
		
	}

