package com.demo.beans;

public class Current extends Account {
	private int NoOfTransaction;

	public Current() {
		super();
	}

	public Current(String C,String nm, double balance,int noOfTransaction) {
		super(C ,nm ,balance);
		NoOfTransaction = noOfTransaction;
	}

	public int getNoOfTransaction() {
		return NoOfTransaction;
	}

	public void setNoOfTransaction(int noOfTransaction) {
		NoOfTransaction = noOfTransaction;
	}

	@Override
	public String toString() {
		return super.toString()+"Current [NoOfTransaction=" + NoOfTransaction + "]";
	}

	
	public void CalculateInterest() {
		
		System.out.println("Current Account does not provide interest facility.");
	}
	

}
