package com.application;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}



	private static final float Charges=0;
	
	

	public void float bookProduct(float charges) {
		
	}



	@Override
	public String toString() {
		return "GSPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}