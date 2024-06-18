package com.demo.beans;

public class CMath {
	
	public void isPrime(int n) {
		int i, flag=0;
		
		if(n==0||n==1)
			flag=1;
		
		for(i=2; i<n/2; i++)
		{
			if(n%i==0) {
				flag=1;
				break;
		}
	}
		if(flag==0)
			System.out.println(n+" is a prime number\n");
		else
			System.out.println(n+" is not a prime number\n");
	}
	
	public void addDigits(int n) {
		 int sum=0;
		 int temp = n;
		 while(n!=0) {
			 sum = sum + n%10;
			 n=n/10;
		 }
		 System.out.println("Sum of digits of "+temp+" is "+sum+"\n");
	}
	
	public void squareFrom(int i, int j) {
		for(int m=i;m<=j;m++)
		{
			int n=m*m;
			System.out.println("Square of "+ m+ " is "+n+"\n");
		}
	}
}
