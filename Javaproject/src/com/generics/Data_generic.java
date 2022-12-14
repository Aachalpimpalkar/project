package com.generics;

public class Data_generic<T> {
	
	private T obj;
	public Data_generic(T obj) {
		this.obj= obj;
	}
	
	public T getobj() {
		return obj;
	}
	public String toString() {
		return "Data_generic[obj=" +obj + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	public class Prog1{
		
	

	public static void main(String[] args) {
		Data_generic<Integer>obj_generic = new Data_generic<Integer>(10);
		Integer out = obj_generic.getobj();
		System.out.println(out);

	}

	
	
	}

}
