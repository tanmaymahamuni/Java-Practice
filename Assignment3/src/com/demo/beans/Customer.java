package com.demo.beans;

public class Customer extends Person{
	private String type;
	private double creditlimit;
	public Customer() {
		super();
	}
	public Customer(int pid, String pname, String mob, String type, double creditlimit) {
		super(pid, pname, mob);
		this.type = type;
		this.creditlimit = creditlimit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}
	@Override
	public String toString() {
		return super.toString()+"Customer [type=" + type + ", creditlimit=" + creditlimit + "]";
	}
	

}
