package com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class MyClass implements I1,I2{

	@Override
	public void m11() {
		System.out.println("in myclass m1 method");
		
	}

	@Override
	public int m12() {
		System.out.println("in myclass m1 method");
		int x=45;
		return x;
		
		
	}
	//overrride default method
	public int m13() {
		I1.super.m13(); //call to default method
		System.out.println("in m13 myclass method");
		int y=12;
		return y;
	}

	@Override
	public void m21() {
		System.out.println("in m21 method")
		
	}

}
