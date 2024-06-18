package com.demo.test;

import com.demo.interfaces.CheckInterface;

public class TestGenerics {
	public static void main(String[] args) {
		CheckInterface<Integer> c=new CheckInterface<Integer>() {
			public Integer add(Integer x,Integer y) {
				return x+y;
			}
		};
		System.out.println(c.add(12, 13));
		
		CheckInterface<Integer> c1=(x,y)->{return x+y;};
		System.out.println(c1.add(12,13));
		CheckInterface<String> c2=(x,y)->{return x+y;};
		System.out.println(c2.add("aaaa","paqr"));

	}

}
