package com.demo.beans;

public class Demat extends Account {
	private static float commission;
	static {
		commission=0;
	}
	public Demat() {
		super();
	}

	public Demat(String C, String nm, double balance) {
		super(C, nm, balance);
	}

	public float getCommission() {
		return commission;
	}


	@Override
	public String toString() {
		return super.toString()+"Demat [commission=" + commission + "]";
	}

	public void CalculateInterest() {
		
		System.out.println("Demat Account does not provide interest facility.");
	}

}
