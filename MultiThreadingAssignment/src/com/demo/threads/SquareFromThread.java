package com.demo.threads;

import com.demo.beans.CMath;

public class SquareFromThread extends Thread{
	
	private int m,n;
	private CMath c;
	public SquareFromThread(int m, int n, CMath c) {
		super();
		this.m = m;
		this.n = n;
		this.c = c;
	}
	
	public void run() {
		c.squareFrom(m, n);
	}

}
