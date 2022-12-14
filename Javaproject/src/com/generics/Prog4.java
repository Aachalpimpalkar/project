package com.generics;


	
		public class Data_generic2<T> {
			
			private T obj;
			public Data_generic2(T obj) {
				this.obj= obj;
			}
			
			public T getobj() {
				return obj;
			}
			public String toString() {
				return "Data_generic[obj=" +obj + "]";
			}
			
	}



	
	public class Prog4 {

		public static void main(String[] args) {
			Data_generic<Short>obj_generic = new Data_generic<Short>(23);
			Short out = obj_generic.getobj();
			System.out.println(out);
			
		}
		
	}