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



	public class Prog4{
		public static void main(String args[]) {
			List<Long>obj1 = new ArrayList<>();
			obj1.add(1345l);
			obj1.add(232l);
			obj1.add(333l);
			obj1.add(41l);
			Data D= new Data();
			D.printListData(obj1);
		}
		
	}
