package com.application;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	private static final float MINBAL=0;
	
	public void withdraw(float accBal) {
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", toString()=" + super.toString()
				+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
