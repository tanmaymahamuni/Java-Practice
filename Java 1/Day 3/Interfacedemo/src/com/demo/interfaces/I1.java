package com.demo.interfaces;

public interface I1 {
	void m11();
	int m12();
	
	public static void method4(int x) {
		System.out.println("in method 4 static method"+x);
	}
	private void f11(){
		System.out.println("in private f11 method");
		System.out.println("in private f11 method line 2");
	}
	default int m13() {
		f11();
		System.out.println("in default m13 method");
		int x=20;
		return x;
	}
	default int m14() {
		f11();
		System.out.println("in default m14 method");
		int x=50;
		return x;
	}
}
