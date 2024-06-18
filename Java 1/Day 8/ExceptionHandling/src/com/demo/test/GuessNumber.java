package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.InvalidNumberException;

public class GuessNumber {

	public static void main(String[] args) {
		int num=45;
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("enetr number");
				int num1=sc.nextInt();
				if(num1==num) {
					System.out.println("Yepee!! you got the number");
					break;
				}else {
					throw new InvalidNumberException("OOPS!!!, you lost one attempt");
				}
			}catch(InvalidNumberException e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		
	}
}
