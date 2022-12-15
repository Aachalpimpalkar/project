package com.lamdaexpressions;
interface Lambda
{
	abstract public void disp(int x, float y);
	
}

public class Program5 {

	public static void main(String[] args) {
		


		
				Lambda obj=(int x,float y)->{
					System.out.println("value of x is" +x +"value of y is" +y );
				};
				obj.disp(54,97.5f);
			}

		


	}


