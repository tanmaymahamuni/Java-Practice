package com.demo.test;
import java.util.SortedSet;
import java.time.LocalDate;
import java.util.TreeSet;

import com.demo.beans.Product;

public class TestBackedCollection {

 	public static void main(String[] args) {
		
		TreeSet<Product> ts = new TreeSet<>();
		ts.add(new Product (12,"lays",4,56,LocalDate.of(2024, 05, 31)));
		ts.add(new Product (10,"Kurkure",3,64,LocalDate.of(2026, 02, 28)));
		ts.add(new Product (15,"Chwingum",4,52,LocalDate.of(2023, 05, 31)));
		ts.add(new Product (1,"50-50",43,78,LocalDate.of(2025, 03, 05)));
		ts.add(new Product (12,"20-20",900,4000,LocalDate.of(2028, 9, 07)));
		ts.stream().forEach(System.out::println);
		SortedSet<Product> hs = ts.headSet(new Product(10));
		System.out.println(hs);
		SortedSet<Product> tset = ts.tailSet(new Product(10));
		System.out.println(tset);
		
	}

}
