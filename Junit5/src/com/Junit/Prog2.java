package com.Junit;

public class Prog2 {
	@ParameterizedTest
	@valueSource(booleans= {1.1, 2.6, 3.7, 4.4, 5.7})
	void withValueSource(boolean number) {
		assert NotNull(number);
	}

}
