package com.demo.test;
import com.demo.beans.Saving;
import com.demo.beans.Current;
public class TestAccount {

	public static void main(String[] args) {
		
		Saving s1 = new Saving("Pune", "Tanmay", 10000);
		System.out.println(s1);	
		s1.CalculateInterest();
	}
	
	
	

}
