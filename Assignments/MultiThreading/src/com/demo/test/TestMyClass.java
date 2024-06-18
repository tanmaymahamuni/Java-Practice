package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.PrimeNumberThread;
import com.demo.threads.SquaresThread;

public class TestMyClass {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
		obj.addDigits(1234);
		
		PrimeNumberThread pnt1 = new PrimeNumberThread(7,obj);
		pnt1.start();
		
		PrimeNumberThread pnt2 = new PrimeNumberThread(9,obj);
		pnt2.start();
		
		SquaresThread st = new SquaresThread(5,9,obj);
		st.start();
		
		

	}

}
