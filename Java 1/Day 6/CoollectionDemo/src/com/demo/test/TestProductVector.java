package com.demo.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Vector;

import com.demo.beans.Product;

public class TestProductVector {

	public static void main(String[] args) {
		List<Product> plist=new Vector<>();
		plist.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		plist.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
		System.out.println(plist);
		Product p=new Product(3);
		System.out.println(plist);
		System.out.println(plist.contains(p));
		System.out.println(plist.remove(p));
		//System.out.println(plist);
		List<Product> plist1=new Vector<>();
		plist1.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist1.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
		System.out.println(plist.containsAll(plist1));
	}

}
