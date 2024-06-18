package com.demo.beans;

import java.time.LocalDate;

public abstract class Employee extends Person {
	private String dept;
	private String desg;
	private LocalDate doj;
	
	
	public Employee() {
		//System.out.println("in employee default constructor");
	}


	public Employee(int pid, String pname, String mob,String dept, String desg,LocalDate ldt) {
		super(pid,pname,mob);
		//System.out.println("in employee parametrized constructor");
		this.dept = dept;
		this.desg = desg;
		this.doj=ldt;
	}


	public String getDept() {
		return dept;
	}
    protected void method1() {
    	System.out.println("in method1");
    }

	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

    public abstract double calcNetSal();  
	@Override
	public String toString() {
		
		//System.out.println("in Employee tostring");
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	
	

}
