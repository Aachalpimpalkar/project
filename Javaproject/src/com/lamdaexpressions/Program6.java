package com.lamdaexpressions;

interface Lambda
{
	abstract public void disp(String x, double d);
	
}

public class Program6 {

	public static void main(String[] args) {
		


		
				Lambda obj=(String x,double y)->{
					System.out.println("value of x is" +x +"value of y is" +y );
				};
				obj.disp("Ruhi",97.5);
			}

		


	}