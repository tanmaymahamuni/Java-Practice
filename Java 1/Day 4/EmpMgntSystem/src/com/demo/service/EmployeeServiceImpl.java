package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addnewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter pid");
		int pid=sc.nextInt();
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter mobile");
		String m=sc.next();
		System.out.println("Enter department");
		String dt=sc.next();
		System.out.println("Enter designation");
		String ds=sc.next();
		System.out.println("Enter date of joining (dd/MM/yyyy");
		String dt1=sc.next();
		//Convert given string into date fomat
		LocalDate ldt=LocalDate.parse(dt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		switch(ch) {
		case 1:
			System.out.println("enetr salary");
			double s=sc.nextDouble();
			e=new SalariedEmp(pid,nm,m,dt,ds,ldt,s);
			break;
		case 2:
			System.out.println("enetr hrs");
			float h=sc.nextFloat();
			System.out.println("enetr charges");
			float charges=sc.nextFloat();
			e=new ContractEmp(pid,nm,m,dt,ds,ldt,h,charges);
			break;
		/*case 3: use this case for vendor
			    */
		}
		return edao.save(e);
		
		
	}

	@Override
	public Employee[] displayall() {
		return edao.findAll();
	}

	@Override
	public Employee findById(int pid) {
		return edao.getById(pid);
	}

	@Override
	public Employee[] findByName(String nm) {
		return edao.getByName(nm);
	}

	@Override
	public boolean updateSalById(int pid, float s) {
		return edao.modifySalById(pid,s);
	}
	
	

}
