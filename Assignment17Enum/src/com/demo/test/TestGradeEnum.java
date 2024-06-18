package com.demo.test;
import java.util.Scanner;
import com.demo.enums.*;

import com.demo.enums.Grade;

public class TestGradeEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade:");
		String result = sc.next();
		
		switch(result) {
		case "Distinction":
			Grade g = Grade.Distinction;
			System.out.println("Your marks are between "+g.getMinmarks()+" and "+g.getMaxmarks());
			break;
		case "First":
			Grade g1 = Grade.First;
			System.out.println("Your marks are between "+g1.getMinmarks()+" and "+g1.getMaxmarks());
			break;
		case "Second":
			Grade g2 = Grade.Second;
			System.out.println("Your marks are between "+g2.getMinmarks()+" and "+g2.getMaxmarks());
			break;
		case "Pass":
			Grade g3 = Grade.Pass;
			System.out.println("Your marks are between "+g3.getMinmarks()+" and "+g3.getMaxmarks());
			break;
		case "Fail":
			Grade g4 = Grade.Fail;
			System.out.println("Your marks are between "+g4.getMinmarks()+" and "+g4.getMaxmarks());
			break;
		
		}
		
		

	}

}
