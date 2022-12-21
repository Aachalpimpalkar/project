package com.junit5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class GreetingTest {
	@Test
	public void testGreet() {
		GreetingTest greeting= new GreetingTest();
		assertEquals("unexpected results", "Welcome to java", greeting.greet());
	}

}
