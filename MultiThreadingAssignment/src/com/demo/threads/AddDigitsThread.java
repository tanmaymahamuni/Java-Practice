package com.demo.threads;

import com.demo.beans.CMath;

public class AddDigitsThread extends Thread{
	
	private int n;
	private CMath c;
	public AddDigitsThread(int n, CMath c) {
		super();
		this.n = n;
		this.c = c;
	}
	
	public void run() {
		c.addDigits(n);
	}

}
