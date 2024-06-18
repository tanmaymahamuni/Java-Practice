package com.demo.test;
import com.demo.threads.*;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutorService {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		List<Future> flist = new ArrayList<>();
		for(int i=1; i<50; i+=3) {
			MyTask t = new MyTask(i,i+1, i+2);
			Future<Integer> f = es.submit(t);
			flist.add(f);
		}
		
		int sum = 0;
		for(Future f:flist) {
			int ans;
				try {
					ans = (Integer)f.get();
					sum = sum + ans;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
		System.out.println("Sum = "+sum);
		es.shutdown();

	}

}
