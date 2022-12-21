package com.Junit;
import java.util.logging.Logger;

	@TestInstance(Lifecycle.PER_CLASS)
	interface TestLifecycleLogger {
		@BeforeAll
		default void beforeAllTest() {
			System.out.println("Before All Test");
		}
		
		@AfterAll
		default void afterAllTest() {
			System.out.println("after All Test");
		}
		
	}


