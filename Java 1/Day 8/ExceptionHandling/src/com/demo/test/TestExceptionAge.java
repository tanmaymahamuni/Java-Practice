package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.demo.exceptions.InValidAgeException;

public class TestExceptionAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
				try {
				System.out.println("enetr age");
				int age=sc.nextInt();
				
					if(age<18||age>60){
						throw new InValidAgeException("age should be between 18 and 60");		
					}
					else
						System.out.println("age is valid");
				
				break;
				
				}catch(InputMismatchException e) {
					System.out.println(e.getMessage());
					//e.printStackTrace();
				} catch (InValidAgeException e) {
					System.out.println(e.getMessage());
				}
		}
	}
		

	

}
