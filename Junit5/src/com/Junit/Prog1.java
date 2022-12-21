package com.Junit;

public class Prog1 {
	@ParameterizedTest
	@valueSource(ints= {1,2,3,4,5})
	void withValueSource(int number) {
		assert NotNull(number);
	}

}



