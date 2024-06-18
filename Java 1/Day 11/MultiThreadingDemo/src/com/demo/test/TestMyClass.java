package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.FactorialThread;
import com.demo.threads.PrintTableThread;

public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		MyClass ob1=new MyClass();
		System.out.println("addition : "+ob.add(5, 7));
		
		PrintTableThread pt1=new PrintTableThread(ob,7);
	    pt1.start();
	    PrintTableThread pt2=new PrintTableThread(ob1,5);
	    pt2.start();
	    FactorialThread f=new FactorialThread(ob,5);
	    Thread th1=new Thread(f);
		th1.start();
		pt1.setPriority(Thread.NORM_PRIORITY);
		//pt1.setDaemon(true);
		
		try {
			//makes parent thread wait till the child thread 
			//finishes the execution
			pt1.join(400);
			pt2.join();
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("At the end of main");
	}

}
