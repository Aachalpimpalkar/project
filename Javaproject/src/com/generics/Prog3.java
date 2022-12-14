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




public class Prog3 {

	public static void main(String[] args) {
		Data_generic<Float>obj_generic = new Data_generic<Float>(13.4f);
		Float out = obj_generic.getobj();
		System.out.println(out);

		
	}

}
