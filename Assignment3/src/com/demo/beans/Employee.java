package com.demo.beans;

import java.time.LocalDate;


public abstract class Employee extends Person{
	private String dept;
	private String desg;
	private LocalDate localDOJ;
	public Employee() {
		super();
	}
	public Employee(int pid, String pname, String mob, String dept, String desg, LocalDate DOJ) {
		super(pid, pname, mob);
		this.dept = dept;
		this.desg = desg;
		this.localDOJ = DOJ;
	}
	public String getDept() {
		return dept;
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
	public LocalDate getLocalDOJ() {
		return localDOJ;
	}
	public void setLocalDOJ(LocalDate localDOJ) {
		this.localDOJ = localDOJ;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + ", localDOJ=" + localDOJ + "]";
	}
	public abstract double NetSalary();

}
