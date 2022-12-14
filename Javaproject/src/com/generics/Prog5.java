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










public class Prog5 {

	public static void main(String[] args) {
		
		Data_generic<Char>obj_generic = new Data_generic<Char>('A');
		Char out = obj_generic.getobj();
		System.out.println(out);
	}

}
