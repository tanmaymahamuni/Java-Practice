package com.demo.test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		//generic class
		Vector<Integer> v=new Vector<>(20,5);
		v.add(12);
		v.add(23);
		v.add(33);
		v.add(23);
		System.out.println("check 23"+v.contains(23));
		System.out.println(v);
		System.out.println("number of elements in the vactor"+v.size());
		System.out.println("memory allocated to the vector"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("number of elements in the vactor"+v.size());
		System.out.println("memory allocated to the vector"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i+10);
		}
		System.out.println("number of elements in the vactor"+v.size());
		System.out.println("memory allocated to the vector"+v.capacity());

	}

}
