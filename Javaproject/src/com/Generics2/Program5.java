package com.Generics2;

class Data_generic<K extends Integer, V extends String >{
	private K key;
	private V value;
	public Data_generic(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data_generic [key=" + key + ", value=" + value + ", getKey()=" + getKey() + "]";
	}
	public <E extends Integer, N extends Integer>void display(E element,N number){
		System.out.println("Element: " +element+" " +"Number:" +number);
	}
}

public class Program5{

	public static void main(String[] args) {
    Data_generic<Integer,String> obj_generic = new Data_generic<Integer,String>(57, "Aachal");
    System.out.println("key:" +obj_generic.getKey()+" " +"value:" +obj_generic.getValue());
    obj_generic.display(3, 54);

	}
}
