package com.demo.test;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		System.out.println("1. Create new account\n2. Deposit Money\n3. Withdraw Money\n4. Check balance");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		do {
		switch(choice) {
		case 1:
			AddAcc();
			break;
		case 2:
			Deposit();
			break;
		case 3:
			Withdraw();
			break;
		case 4:
			ShowBalance();
			break;
		case 5:
			System.out.println("Thank you for visiting!");
			s.close();
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
		}while(choice!=5);

	}



}
