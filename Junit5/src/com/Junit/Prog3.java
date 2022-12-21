package com.Junit;

public class Prog3 {
	@ParameterizedTest
	@valueSource(chars= {'a', 'b', 'c','d'})
	void withValueSource(char number) {
		assert NotNull(number);
	}

}
