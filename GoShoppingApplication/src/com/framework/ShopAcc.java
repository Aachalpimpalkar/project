package com.framework;

public abstract class ShopAcc {
	protected int accNo;
	protected String accNm;
	protected float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void float  bookProduct(float charges) {
		
	}
	public void float  items(float charges) {
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
