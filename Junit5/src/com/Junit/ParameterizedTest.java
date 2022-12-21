package com.Junit;
import static org.junit.Assert.assertNotNull;
public class ParameterizedTest {
	@ParameterizedTest
	@valueSource(floats= {1f,2f,3f,4f,5f})
	void withValueSource(float number) {
		assert NotNull(number);
	}

}
