package com.junit5;

public class Counter {
	int count=0;
	public int increment() {
		return ++count;
	}
	public int decrement() {
		return --count;
	}
	public int getCount() {
		return count;
	}

}
