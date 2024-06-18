package com.demo.test;

import java.time.LocalDate;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;

public class TestEmployee {

	public static void main(String[] args) {
		Person p=new Person(12,"xxx","242342");
		//Employee e=new Employee(13,"yyy","45678","Hr","MGR",LocalDate.of(2023,3,24));
		//System.out.println(e);
		SalariedEmp s=new SalariedEmp(14,"zzz","555","Hr","MGR",LocalDate.of(2023,3,24),67895);
		ContractEmp c=new ContractEmp(15,"ttttt","4444","admin","MGR",LocalDate.of(2023,3,24),30,6000);
		System.out.println(s.calcNetSal());
		System.out.println(c.calcNetSal());
		Scanner sc=new Scanner(System.in);
		Employee e1=null;
		System.out.println("1. SalariedEmp \n 2.ContractEmp ");
        int choice=sc.nextInt();
        switch(choice) {
        case 1:
        	e1=new SalariedEmp(14,"zzz","555","Hr","MGR",LocalDate.of(2023,3,24),67895);
        	
        	break;
        case 2:
        	e1=new ContractEmp(15,"ttttt","4444","admin","MGR",LocalDate.of(2023,3,24),30,6000);
        	
        	break;
        }
        e1.calcNetSal();
        
	}

}
