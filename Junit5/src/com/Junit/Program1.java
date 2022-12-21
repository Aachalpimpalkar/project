package com.Junit;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

class HelloWorldTest implements TestLifecycleLogger {
	
@Test
@RepeatedTest(20)
public void test() {
	System.out.println("First test case");
}
}