package com.demo.prime;

import java.util.Scanner;

public class PrimeAppr2 {

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int [] num=new int[3];
	int count=0;
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter "+(i+1)+" number");
		num[i]=scn.nextInt();
	}
	
	for(int i=0;i<3;i++)
	{
		for(int j=2;j<num.length;j++)
		{
			if(num[i]%j!=0)
			{
				for(int k=1;k<=10;k++)
				{
					System.out.println("Table is: "+num[i]+" * "+k+" = "+num[i]*k);
					
				}
				System.out.println("-------------------------------------------");
			}
			else
			{
				int res=num[i]/10;
				System.out.println("result is: "+res);
			}
		}
		
	}
	
	
	
	
}

}
