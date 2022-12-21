package com.Junit;

public class Prog4 {
	@ParameterizedTest
	@valueSource(shorts= {1,2,3,4,5})
	void withValueSource(short number) {
		assert NotNull(number);
	}


}
