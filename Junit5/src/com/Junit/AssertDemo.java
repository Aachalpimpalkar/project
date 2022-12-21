package com.Junit;
import org.junit.Jupiter.api.Disabled;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssertDemo {
	@Disabled
	@Test
	public void simple() {
		int result=2;
		int expected=3;
		assertEquals(result,expected);
		
	}
	
	@Test
	public void simple1() {
		int result=2;
		int expected=3;
		assertEquals(result,expected);
		
	}
	
	@Test
	public void simple2() {
		int result=2;
		int expected=3;
		assertEquals(result,expected);
		
	}

	

}
