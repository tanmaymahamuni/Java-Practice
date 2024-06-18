package com.demo.test;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestException {
	public static float divide(int n1,int n2) {
		try {
		float a=n1/n2;
		return a;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {
				System.out.println("enetr number 1");
				int n1=sc.nextInt();
				System.out.println("enetr number 2");
				int n2=sc.nextInt();
				float c=divide(n1,n2);
				System.out.println("The answer : "+c);
				List<Integer> lst=null;
				lst.add(5);
				lst.add(7);
				break;
			}catch(InputMismatchException|NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("pls enter number");
			}catch(Exception e){
				System.out.println("error occured, "+e.getMessage());
			}finally {
				System.out.println("in finally block");
			}
		}
		
	}

}
