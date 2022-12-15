package com.lamdaexpressions;

interface Lambda
{
	abstract public int disp();
	
}



public class Prog1 {
	public static void main(String args[]) {
		Lambda obj=()->67;{
			System.out.println(obj.disp());
		};
	}

}
