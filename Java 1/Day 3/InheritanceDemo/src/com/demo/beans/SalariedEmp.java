package com.demo.beans;

import java.time.LocalDate;

public class SalariedEmp extends Employee{
	private double sal;
	private double bonus;
	
	public SalariedEmp() {
		super();
	}

	public SalariedEmp(int pid, String pname, String mob,String dept, String desg,LocalDate ldt,double sal) {
		super(pid,pname,mob,dept,desg,ldt);
		System.out.println("in salariedemp parametrized constructor");
		this.sal = sal;
		this.bonus = 0.10*sal;
	}
	@Override
	public void method1() {
    	System.out.println("in method1 in salariedemp");
    }

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
    public int m1() {
    	System.out.println("in method m1");
    	return 10;
    }
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}

	@Override
	public double calcNetSal() {
		return sal+bonus+0.10*sal+0.15*sal-0.08*sal;
	}
	
	

}
