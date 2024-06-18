package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.demo.exceptions.InvalidUserEXception;

public class TestValidateUser {
	public static void main(String[] args) {
		Map<String,String> hm=new HashMap<>();
		hm.put("user1","pass1");
		hm.put("user2","pass2");
		hm.put("user3","pass3");
		hm.put("user4","pass4");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		try {
			System.out.println("enetr username");
			String uname=sc.next();
			System.out.println("enetr password");
			String pass=sc.next();
			if(hm.containsKey(uname)) {
				String v=hm.get(uname);
				if(v.equals(pass)) {
					System.out.println("Valid creadentials");
					break;
				}else {
					throw new InvalidUserEXception("credentials are wrong");
				}
			}else {
				throw new InvalidUserEXception("credentials are wrong");
			}
			
		}catch(InvalidUserEXception e) {
			System.out.println(e.getMessage());
		}
		}
		System.out.println("outside try block");
		sc.close();
				
		
		
		
	}

}
