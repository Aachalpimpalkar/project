package com.application;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accNm=" + accNm + ", toString()=" + super.toString()
				+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
