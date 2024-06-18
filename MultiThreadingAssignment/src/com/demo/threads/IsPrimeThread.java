package com.demo.threads;

import com.demo.beans.CMath;

public class IsPrimeThread extends Thread{
	
	private int n;
	private CMath c;
	public IsPrimeThread(int n, CMath c) {
		super();
		this.n = n;
		this.c = c;
	}
	
	public void run() {
		c.isPrime(n);
	}

}
