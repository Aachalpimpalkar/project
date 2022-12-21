package com.Junit;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

public class AnnotationDemo {
	@DisplayName("numeral")
	@ParameterizedTest(name="\"{0}\"should be{1cr }")
	@CsvSource({"one,1","two,2","five,5"})
	void withNiceName(String woed,int number) {}

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void withAllEnumValues(TimeUnit unit) {
		//executed once for each time unit
	}
	@ParameterizedTest
	@EnumSource(
			values=TimeUnit.class,
	names= {"NANOSECONDS", "MICROSECONDS"})
	void WithSomeEnumvalues(TimeUnit unit) {
		//executed once for each time unit.NANOSECONDS
		//executed once for each time unit.MICROSECONDS
	}
	@ParameterizedTest
	@MethodSource("createWordsWithLength")
	void withMethodSource(String word,int length) {}
	private static Stream<Arguments>createWordsWithLength(){
		return Stream.of(
				Arguments.of("Hello",5),
				Arguments.of("Junit 5",7));

	}}
