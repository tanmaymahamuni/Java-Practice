package com.demo.test;
import com.demo.beans.Student;
import com.demo.service.*;

import java.util.List;
import java.util.Scanner;


public class TestStudent {

	public static void main(String[] args) {
		
		StudentService sservice = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		sservice.readFromFile();
		
		do {
			
			
			System.out.println("1. Add new student\n2. Display all students\n3. Exit");
			
			choice = sc.nextInt();
				switch(choice) {
				case 1:
					boolean status = sservice.addStudent();
					if(status)
						System.out.println("Student added successfully");
					else
						System.out.println("Error occurred");
					break;
				case 2:
					List<Student> list = sservice.displayAll();
					for(Student s:list) {
						System.out.println(s);
					}
					break;
				case 3:
					sc.close();
					sservice.writeTofile();
					System.out.println("Thank you!");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
		}while(choice!=3);

	}

}
