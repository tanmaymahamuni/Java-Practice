package com.demo.beans;

import java.time.LocalDate;


public class Vendor extends Employee{
	private double amount;
	private int noofemp;
	public Vendor() {
		super();
	}
	public Vendor(int pid, String pname, String mob, String dept, String desg, LocalDate ldt, double amount, int noofemp) {
		super(pid, pname, mob, dept, desg, ldt);
		this.amount = amount;
		this.noofemp = noofemp;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNoofemp() {
		return noofemp;
	}
	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendor [amount=" + amount + ", noofemp=" + noofemp + "]";
	}
	@Override
	public double NetSalary() {
		double netsal = amount*noofemp;
		return netsal;
	}
	

}
