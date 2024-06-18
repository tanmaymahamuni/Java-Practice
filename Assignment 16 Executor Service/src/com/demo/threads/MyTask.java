package com.demo.threads;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{
	
	private int num1, num2, num3;

	

	public MyTask(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}



	@Override
	public Integer call() throws Exception {
		
		int sum = num1+num2+num3;
		return sum;
	}

}
