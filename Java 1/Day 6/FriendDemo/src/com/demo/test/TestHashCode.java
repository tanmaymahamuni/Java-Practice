package com.demo.test;

public class TestHashCode {

	public static void main(String[] args) {
		String s1="xxx";
		System.out.println(s1.hashCode());
		String s2=s1;
		System.out.println(s2.hashCode());
		String s3=new String("xxx");
		System.out.println(s3.hashCode());
		String s4="Welcome";
		System.out.println(s4.hashCode());
		
		
	}

}
