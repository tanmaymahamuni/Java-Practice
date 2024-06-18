package com.demo.test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		//generic class
		Vector<Integer> v=new Vector<>();
		v.add(12);
		//arr[0]
		v.add(23);
		v.add(33);
		v.add(44);
		System.out.println(v);
		System.out.println("number of elements in the vactor"+v.size());
		System.out.println("memory allocated to the vector"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("number of elements in the vactor"+v.size());
		System.out.println("memory allocated to the vector"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("number of elements in the vactor"+v.size());
		System.out.println("memory allocated to the vector"+v.capacity());
          System.out.println(v);
	}

}
