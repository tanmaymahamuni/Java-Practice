package com.demo.test;

import java.util.Scanner;

import com.demo.enums.Grade;

public class TestGrade {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Grade gd;

		System.out.println("Enter Your Grade");
		String grade=scn.next();
		
		switch(grade)
		{
		
		case "A":
			gd=Grade.Distinction;
			
			System.out.println("Distinction");
			System.out.println("Minimum marks is: "+gd.getMinimum_marks()+"Maximum marks is: "+gd.getMaximum_marks());
			break;
		
		case "B":
			gd=Grade.First;
			System.out.println("First Class");
			System.out.println("Minimum marks is: "+gd.getMinimum_marks()+"Maximum marks is: "+gd.getMaximum_marks());
			break;
		
		case "C":
			gd=Grade.Second;
			System.out.println("Second Class");
			System.out.println("Minimum marks is: "+gd.getMinimum_marks()+"Maximum marks is: "+gd.getMaximum_marks());
			break;
		
		case "D":
			gd=Grade.Pass;
			System.out.println("Pass");
			System.out.println("Minimum marks is: "+gd.getMinimum_marks()+"Maximum marks is: "+gd.getMaximum_marks());
			break;
		
		case "E":
			gd=Grade.Fail;
			System.out.println("Fail");
			System.out.println("Minimum marks is: "+gd.getMinimum_marks()+"Maximum marks is: "+gd.getMaximum_marks());
			break;
	}
	}

}
