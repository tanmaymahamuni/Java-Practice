package com.demo.beans;

public abstract class Account {
	private static String BankName;
	private static int count;
	private String City;
	private int AccNo;
	private String Name;
	private double balance;
	static {
		BankName = "SBI";
		count=1;
	}
	public Account() {
		super();
		
	}
	public Account(String city, String name, double balance) {
		super();
		AccNo=count;
		count++;
		City = city;
		Name = name;
		this.balance = balance;
	}
	public int getAccNo() {
		return AccNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//public void GenerateAccno() {
		//AccNo=count;
		//count++;
	//}
	public abstract void CalculateInterest() ;
	@Override
	public String toString() {
		return "Account [City=" + City + ", AccNo=" + AccNo + ", Name=" + Name + ", balance=" + balance + "]";
	}
	
}
