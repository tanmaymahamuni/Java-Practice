package com.demo.beans;

import java.time.LocalDate;


public class SalariedEmp extends Employee{
	private double salary;
	private double bonus;
	public SalariedEmp() {
		super();
	}
	public SalariedEmp(int pid, String pname, String mob, String dept, String desg, LocalDate localDate, double salary, double bonus) {
		super(pid, pname, mob, dept, desg, localDate);
		this.salary = salary;
		this.bonus = bonus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}
	@Override
	public double NetSalary() {
		double netsal = this.salary+this.salary*0.1+this.salary*0.15-this.salary*0.08;
		return netsal;
	}
	

}
