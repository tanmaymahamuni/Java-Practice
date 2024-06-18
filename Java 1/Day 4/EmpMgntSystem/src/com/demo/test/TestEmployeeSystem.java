package com.demo.test;

import java.util.Scanner;
import java.util.stream.Stream;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeSystem {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		//create object of Service 
		EmployeeService eservice=new EmployeeServiceImpl();
		do {
			System.out.println("1 Add new Employee\n 2. display all\n3. search by id");
			System.out.println("4. search by name\n 5. modify salary\n 6. exit");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. Salaried employee\n 2. Contract employee\n 3. Vendor");
				int ch=sc.nextInt();
				boolean status=eservice.addnewEmployee(ch);
				if(status) {
					System.out.println("data added successfully");
				}
				else{
					System.out.println("array size is full");
				}
				break;
			case 2:
				Employee[] arr=eservice.displayall();
				//java 1.7
				for(Employee e:arr) { //[e1,e2,e3]
					if(e!=null) {
					   System.out.println(e);
					}else {
						break;
					}
				}
				//java 1.8
				//Stream.of(arr).forEach(ob->System.out.println(ob));
				//Stream.of(arr).filter((ob)->ob!=null).forEach(System.out::println);
				
				break;
			case 3:
				System.out.println("enetr id");
				int pid=sc.nextInt();
				Employee ob=eservice.findById(pid);
				if(ob!=null) {
					System.out.println(ob);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("enetr name for search");
				String nm=sc.next();
				arr=eservice.findByName(nm);
				if(arr!=null) {
					for(Employee e1:arr) {
						if(e1!=null) {
						   System.out.println(e1);
						}else {
							break;
						}
					}
					Stream.of(arr)
					.filter(ob2->ob2!=null)
					.forEach(ob1->System.out.println(ob1));
					
				}else {
					System.out.println("not found");
				}
				
				break;
			case 5:
				System.out.println("enetr pid");
				pid=sc.nextInt();
				System.out.println("enetr new salary");
				float s=sc.nextFloat();
				status=eservice.updateSalById(pid,s);
				if(status) {
					System.out.println("updated successfully");
				 }
				else {
					System.out.println("not found");
				}
				break;
			case 6:
				System.out.println("Thank you for visiting...");
				sc.close();
				break;
			default:
				System.out.println("Wrong choice");
			}
			
		}while(choice!=6);

	}

}
