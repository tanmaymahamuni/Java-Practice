package com.demo.threads;

import com.demo.beans.MyClass;

public class FactorialThread implements Runnable{
	private MyClass ob;
	private int n;
	
	public FactorialThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
		System.out.println(" Factorial Thread name : "+Thread.currentThread().getName());
		System.out.println("Factorial Thread id: "+Thread.currentThread().getId());
		int a=ob.factorial(n);
		System.out.println("Answer : "+a);
	}

}
