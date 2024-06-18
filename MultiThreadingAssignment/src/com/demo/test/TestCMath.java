package com.demo.test;
import com.demo.beans.*;
import com.demo.threads.*;
public class TestCMath {

	public static void main(String[] args) {
		CMath c = new CMath();
		
		//c.isPrime(12);
		//c.addDigits(546);
		//c.squareFrom(5, 10);
		IsPrimeThread i = new IsPrimeThread(8, c);
		i.start();
		AddDigitsThread a = new AddDigitsThread(567, c);
		a.start();
		SquareFromThread s = new SquareFromThread(5, 15, c);
		s.start();
		
		
			try {
				i.join();
				a.join();
				s.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}

}
