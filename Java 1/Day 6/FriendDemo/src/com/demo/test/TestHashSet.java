package com.demo.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Friend;
import com.demo.comparators.MyMobileComparator;

public class TestHashSet {

	public static void main(String[] args) {
		/*Set<Friend> fset=new HashSet<>();
		fset.add(new Friend(1,"Raj","11111"));
		fset.add(new Friend(2,"Raj","11111"));
		fset.add(new Friend(2,"ccccc","11111"));
		System.out.println(fset);
		int fid=2;
		System.out.println(fset.contains(new Friend(2)));*/
			
		Set<Friend> fset=new TreeSet<>(new MyMobileComparator());
		fset.add(new Friend(1,"Raj","11111"));
		fset.add(new Friend(2,"Raj","11111"));
		fset.add(new Friend(2,"ccccc","11111"));
		System.out.println(fset);
		int fid=2;
		System.out.println(fset.contains(new Friend(2,"cccc",null)));
		
		

	}

}
