package com.demo.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.demo.beans.Product;

public class TestClass {

	public static void main(String[] args) {
		int sum=IntStream.of(12,13,13,14).filter(x->x%2==0).sum();
		System.out.println("Sum :"+sum);
		List<Integer> lst=List.of(12,1,3,4,23,56);
		lst.stream().forEach(System.out::println);
		List<Product> plist= lst.stream().map(Product::new).collect(Collectors.toList());
		System.out.println(plist);
		
		

	}

}
