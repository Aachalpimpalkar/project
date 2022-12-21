package com.Junit;

public class Prog5 {
	@ParameterizedTest
	@valueSource(longs= {1l,2l,3l,4l,5l})
	void withValueSource(long number) {
		assert NotNull(number);
	}

}
