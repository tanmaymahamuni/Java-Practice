package com.demo.threads;

import com.demo.beans.MyClass;

public class PrimeNumberThread extends Thread{

	private int n;
	private MyClass obj;
	
	public PrimeNumberThread(int n,MyClass obj)
	{
		this.n=n;
		this.obj=obj;
	}
	
	
	public void run()
	{
		obj.primeNumber(n);
	}
}
