package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(12, 13, 14);
		List<Integer> lst1=List.of(1,2,3,11,23,12,14,11,5,11);
		System.out.println(lst1);
		System.out.println("Max: "+Collections.max(lst1));
		System.out.println("frequency: "+Collections.frequency(lst1,11));
		
		List<Integer> lst2=new ArrayList<>();
		lst2.add(4);
		lst2.add(2);
		lst2.add(3);
		lst2.add(5);
		lst2.add(6);
		lst2.add(1);
		for(int i=0;i<3;i++) {
			Collections.shuffle(lst2);
			System.out.println(lst2);
		}
		
		
		
		
	}

}
