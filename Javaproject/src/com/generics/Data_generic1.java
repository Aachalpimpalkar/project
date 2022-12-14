package com.generics;



public class Data_generic1<T> {
	
	private T obj;
	public Data_generic1(T obj) {
		this.obj= obj;
	}
	
	public T getobj() {
		return obj;
	}
	public String toString() {
		return "Data_generic[obj=" +obj + "]";
	}
	
	


}


















public class Prog2 {

	public static void main(String[] args) {
		Data_generic<String>obj_generic = new Data_generic<String>("lokesh");
		String out = obj_generic.getobj();
		System.out.println(out);

	}

}
