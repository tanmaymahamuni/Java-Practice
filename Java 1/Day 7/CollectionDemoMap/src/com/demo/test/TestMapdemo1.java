package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapdemo1 {

	public static void main(String[] args) {
		Map<String,List<String>> hm=new HashMap<>();
		List<String> lst=new ArrayList<>();
		lst.add("Neem");
		lst.add("Mango");
		hm.put("Pune",lst);
		List<String> lst1=new ArrayList<>();
		lst1.add("Neem");
		lst1.add("Mango");
		lst1.add("coconut");
		hm.put("Mumbai",lst1);
		System.out.println(hm);
		System.out.println(hm.get("Mumbai"));
		

	}

}
