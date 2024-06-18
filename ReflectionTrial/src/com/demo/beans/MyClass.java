package com.demo.beans;

public class MyClass {
	private int id;
	private String name;
	public MyClass() {
		super();
	}
	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	
	public int method1(int x) {
		System.out.println("in method 1 "+x);
		return x+10;
	}
	
	public int method5(int a, int b, int c, int d) {
		System.out.println("in method 5 "+a+" "+b+" "+c+" "+d);
		return a+b+c+d;
	}
		
	public int method6(int a, int b, int c, int d) {
		System.out.println("in method 6 "+a+" "+b+" "+c+" "+d);
		return a+b+c+d;
	}

}
