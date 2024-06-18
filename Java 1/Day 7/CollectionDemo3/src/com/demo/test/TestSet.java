package com.demo.test;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		TreeSet<Integer> tset=new TreeSet<>();
		tset.add(10);
		tset.add(5);
		tset.add(7);
		tset.add(1);
		tset.add(3);
		tset.add(12);
		tset.add(15);
		tset.add(16);
		System.out.println(tset);
		SortedSet<Integer> hset=tset.headSet(11,true);
		SortedSet<Integer> tail=tset.tailSet(10);
		System.out.println("headset:"+hset);
		System.out.println("tailset"+tail);
		tset.add(2);
		tset.add(20);
		System.out.println("headset after adding 2:"+hset);
		System.out.println("tailset after adding 20"+tail);
	}

}
