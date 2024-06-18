package com.demo.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(34);
		q.add(12);
		q.add(13);
		System.out.println(q);
		for(Integer i:q) {
			System.out.println(i);
		}
		System.out.println("Peek : "+q.peek());
		while(!q.isEmpty())
			System.out.println(q.poll());
		
		
		
	}

}
