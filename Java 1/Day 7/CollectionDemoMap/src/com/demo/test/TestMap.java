package com.demo.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		//add data in map
		hm.put("DAC", 240);
		hm.put("DBDA", 120);
		hm.put("DVLSI", 60);
		//overwrite previous value of DBDA key by 200
		hm.put("DBDA", 200);
		System.out.println(hm);
		
		String s="DVLSI";
		//to retrieve the data if the key is known
		System.out.println(s+"--->"+hm.get(s));
		System.out.println(hm.containsKey(s));
		if(!hm.containsKey("DBDA")) {
			hm.put("DBDA", 250);
		}else {
			System.out.println("duplicate key");
		}
		//to retireve all keys
		System.out.println(hm.keySet());/
		System.out.println(hm.entrySet());
		
		//finding keys based on value
		Set<String> keys=hm.keySet();
		for(String k:keys) {
			if(hm.get(k)>100) {
				System.out.println(k);
			}
		}
		
		List<Integer> lst=(List<Integer>) hm.values();
		Set<Map.Entry<String,Integer>> entryset=hm.entrySet();
		for(Map.Entry<String,Integer> m:entryset) {
			if(m.getValue()>100)
			   System.out.println(m.getKey()+"--->"+m.getValue());
			
		}
	
	}

}
