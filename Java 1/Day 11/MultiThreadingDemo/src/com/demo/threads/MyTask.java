package com.demo.threads;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{
     private int start,end;
     
	public MyTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(start+"-->"+end+"---->"+Thread.currentThread().getId()+"--->"+Thread.currentThread().getName());
		int s=0;
		for(int i=start;i<=end;i++) {
			s=s+i;
		}
		return s;
	}

}
