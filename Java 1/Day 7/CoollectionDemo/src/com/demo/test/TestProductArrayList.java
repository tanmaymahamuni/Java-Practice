package com.demo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.demo.beans.Product;
import com.demo.comparators.MyPriceComparator;

public class TestProductArrayList {

	public static void main(String[] args) {
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		plist.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
		plist.add(new Product(10,"Maggi11",56,50,LocalDate.of(2024, 05,06)));
		plist.add(new Product(5,"Maggi22",10,52,LocalDate.of(2024, 05,06)));
		plist.add(new Product(7,"Maggi333",25,57,LocalDate.of(2024, 05,06)));
		System.out.println(plist);
		Product p=new Product(2);
		System.out.println(plist);
		System.out.println(plist.contains(p));
		//System.out.println(plist.remove(p));
		//System.out.println(plist);
		//List<Product> plist1=new ArrayList<>();
		//plist1.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		//plist1.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
		//System.out.println(plist.containsAll(plist1));
		plist.sort(new MyPriceComparator());
		System.out.println(plist);
		//Collections.sort( (List<Product>) plist);

	}

}






