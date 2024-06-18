package com.demo.beans;
import java.util.Scanner;
public class Saving extends Account {
	private int chequebookNo;
	private static float interest;
	static {
		interest = 3;
	}

	public Saving() {
		super();
	}

	public Saving(String C, String nm, double balance) {
		super(C,nm,balance);
		chequebookNo=getAccNo()*100;
	}

	public int getChequebookNo() {
		return chequebookNo;
	}

	@Override
	public String toString() {
		return super.toString()+"Saving [chequebookNo=" + chequebookNo + "]";
	}

	public void CalculateInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int P= sc.nextInt();
		System.out.println("Enter no of Years:");
		int N= sc.nextInt();
		double I=(P*interest*N)/100;
		System.out.println("Interest of your Account:"+I);
	}
	

}
