package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{
	private float hrs;
	private float charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int pid, String pname, String mob,String dept, String desg,LocalDate ldt,float hrs, float charges) {
		super(pid,pname,mob,dept,desg,ldt);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int m2() {
    	System.out.println("in method m2");
    	return 10;
    }
	public float getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	@Override
	public double calcNetSal() {
		return hrs*charges;
	};
	
	

}
