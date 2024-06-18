package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {
		
		StudentService sservice = new StudentServiceImpl();
		sservice.readFromFile();
		Scanner scn=new Scanner(System.in);
		int choice=0;
		
		do {
			
			System.out.println("1.Add Student Details \n2.Display All \n3.Exit");
			System.out.println("Enter Your Choice: ");
			choice=scn.nextInt();
			
			switch(choice)
			{
				case 1:
					boolean status = sservice.addStudent();
					if(status)
					{
						System.out.println("Added Successfully");
					}
					else
					{
						System.out.println("Error Ocurred");
					}
					break;
					
				case 2:
					List<Student> lst = sservice.displayAll();
					lst.forEach(System.out :: println);
					break;
					
				case 3:
					scn.close();
					System.out.println("Thank You!");
					scn.close();
					sservice.writeToFile();
					break;
					
					
					
				default:
					System.out.println("Wrong choice");
					break;
			}
			
		}while(choice!=3);
		

	}

}
