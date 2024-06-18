package com.demo.threads;

import com.demo.beans.MyClass;

public class SquaresThread extends Thread{

	private int num1;
	private int num2;
	private MyClass obj;
	
	public SquaresThread(int num1,int num2,MyClass obj)
	{
		this.num1=num1;
		this.num2=num2;
		this.obj=obj;
	}
	
	public void run()
	{
		obj.squares(num1,num2);
	}
}
