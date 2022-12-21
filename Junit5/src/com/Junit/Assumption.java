package com.Junit;


	import org.junit.Test;
	import org.junit.api.Assumptions;

	public class Assumption {

		@Test
		void testonDev() {
			System.setProperty("ENV", "Dev");
			Assumptions.assumeFalse("Dev".equals(System.getProperty("ENV")));
		}
		
		@Test
		void testonProd() {
			System.setProperty("ENV", "Prod");
			Assumptions.assumingThat("Dev".equals(System.getProperty("ENV")),AssumptionDemo::message);
		}

		private static String message() {
			return "Test execution failed::";
		}
	}


