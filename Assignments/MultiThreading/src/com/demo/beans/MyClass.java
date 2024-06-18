package com.demo.beans;

public class MyClass {
	
	//Addition of digits of a number
	public void addDigits(int num)
	{
		int sum=0;
		int rem;
		
		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("Addition of digit is: "+sum);
	}
	
	//square of numbers from start to end
	
	public void squares(int num1,int num2)
	{
		int sqr;
		for(int i=num1;i<=num2;i++)
		{
			sqr=i*i;
			System.out.println("Square of "+i+" is: "+sqr);
		}
		
	}
	
	//prime number
	
	public void primeNumber(int num)
	{
		int primeno;
		int count=1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				count++;
			else
				continue;
			
		}
		
		if(count>1)
		{
			System.out.println(num+" is a not prime number.");
		}
		else
		{
			System.out.println(num+" is  a prime number.");
		}
		
		
		
	}
	

}
