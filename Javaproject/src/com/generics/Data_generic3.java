package com.generics;
public class Data_generic3<T> {
	
	private T obj;
	public Data_generic3(T obj) {
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
		Data_generic<Double>obj_generic = new Data_generic<Double>(111.234);
		Double out = obj_generic.getobj();
		System.out.println(out);

		
	}

}
