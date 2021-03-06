package com.tns.framework;

import com.tns.framework.*;

import com.tns.application.*;

public class PrimeAcc extends ShopAcc
{

	protected static float deliveryCharges = 00;
	protected static boolean isPrime;
	
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges);
		
		this.setPrime(isPrime);
	}

	public boolean isPrime() 
	{
		return isPrime;
	}

	public void setPrime(boolean isPrime) 
	{
		this.isPrime = isPrime;
	}
	
	public static float getDeliverycharges() {
		return deliveryCharges;
	}



	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime()=" + isPrime() + ", getAccNo()=" + getAccNo() + ", getCharges()=" + getCharges()
				+ ", getAccNm()=" + getAccNm() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



	
}
