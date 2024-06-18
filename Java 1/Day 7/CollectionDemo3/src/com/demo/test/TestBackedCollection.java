package com.demo.test;

import java.time.LocalDate;
import java.util.SortedSet;
import java.util.TreeSet;

import com.demo.beans.Product;

public class TestBackedCollection {

	public static void main(String[] args) {

		TreeSet<Product> ts=new TreeSet<>();
		ts.add(new Product(12,"lays",4,56,LocalDate.of(2024, 11,11)));
		ts.add(new Product(10,"50-50",3,55,LocalDate.of(2024, 12,11)));
		ts.add(new Product(13,"Marie",41,5,LocalDate.of(2025, 11,11)));
		ts.add(new Product(1,"lays1111",40,60,LocalDate.of(2025, 11,11)));
		ts.add(new Product(3,"lays",4,56,LocalDate.of(2024, 11,11)));
		ts.stream().forEach(System.out::println);
		SortedSet<Product> hset=ts.headSet(new Product(10));
		System.out.println(hset);
		SortedSet<Product> tset=ts.tailSet(new Product(10));
		System.out.println(tset);
		ts.add(new Product(15,"Maggie",45,60,LocalDate.of(2025, 11,11)));
		System.out.println(hset);
		System.out.println(tset);
		
	}

}
