package com.demo.beans;

public class Storage {
	private int n;
	private boolean state;
	public Storage() {
		super();
		state=false;
	}
	
	synchronized public  void put(int x) {
		if(state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//producer logic
		System.out.println("put : "+x);
		this.n=x;
		//***************************
		state=true;
		notify();
	}
	
	synchronized public  void get() {
		if(!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//consumer logic
		System.out.println("get : "+n);
		//*********************
		state=false;
		notify();
		
	}
	

}
