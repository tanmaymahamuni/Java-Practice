package com.demo.test;

import java.time.LocalDate;

import com.demo.beans.*;



public class TestPerson {

	public static void main(String[] args) {
	 SalariedEmp s1 = new SalariedEmp(1, "Tanuja", "45844859", "Devops", "CEO", LocalDate.of(2024, 05, 06), 500000, 2000000);
	 System.out.println(s1);
	 System.out.println(s1.getPname()+" net salary is "+s1.NetSalary());
	 
	 ContractEmp ce1 = new ContractEmp(4, "Tina", "745093476", "HR", "Mgr", LocalDate.of(2024, 12, 04), 200, 2000);
	 System.out.println(ce1);
	 System.out.println(ce1.getPname()+" net salary is "+ce1.NetSalary());
	 
	 Vendor v1 = new Vendor(2, "Tejas", "75034700", "Sales", "CFO", LocalDate.of(2024, 03, 03), 5000000, 10);
	 System.out.println(v1);
	 System.out.println(v1.getPname()+" net salary is "+v1.NetSalary());
	 
	 Customer c1 = new Customer(3, "Tanmay", "80783407", "Regular", 100000);
	 System.out.println(c1);
	

	}

}
