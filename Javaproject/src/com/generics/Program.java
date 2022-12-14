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
	


}



public class Program {

	public static void main(String[] args) {
		Data_generic<Integer>obj_generic = new Data_generic<Integer>(11);
		Data_generic<String>obj_generic1 = new Data_generic<String>("Aachal");
		Data_generic<Double>obj_generic2 = new Data_generic<Double>(333.44);
		Data_generic<Float>obj_generic3 = new Data_generic<Float>(22.4f);
		Data_generic<Char>obj_generic4= new Data_generic<Char>('A');
		System.out.println(obj_generic);

	}

}
