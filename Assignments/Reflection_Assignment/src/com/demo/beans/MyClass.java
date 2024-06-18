package com.demo.beans;

public class MyClass {

	
	private int a;
	private int b;
	private int c;
	private int d;
	
	public MyClass() {
		super();
	}

	public MyClass(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public void method5(int a,int b,int c,int d)
	{
		int res=a+b+c+d;
		System.out.println("Addition of four numbers is: "+res);
	}
	
	public void method6(int a,int b,int c,int d)
	{
		int res=a*b*c*d;
		System.out.println("Multiplication of four numbers is: "+res);
	}
	@Override
	public String toString() {
		return "MyClass [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	
}
