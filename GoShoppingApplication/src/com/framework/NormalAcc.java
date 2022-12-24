package com.framework;

public abstract class NormalAcc extends ShopAcc{
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	private final float deliveryCharges;
  public  void float bookProduct(float deliveryCharges) {
		
	}
@Override
public String toString() {
	return "NormalAcc [deliveryCharges=" + deliveryCharges + ", accNm=" + accNm + ", charges=" + charges
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}



}
