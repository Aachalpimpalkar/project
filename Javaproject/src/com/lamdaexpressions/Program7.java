package com.lamdaexpressions;

interface Lambda
{
	abstract public void disp(int x, long d);
	
}

public class Program7 {

	public static void main(String[] args) {
		


		
				Lambda obj=(int x,long y)->{
					System.out.println("value of x is" +x +"value of y is" +y );
				};
				obj.disp(4,5l);
			}

		

}