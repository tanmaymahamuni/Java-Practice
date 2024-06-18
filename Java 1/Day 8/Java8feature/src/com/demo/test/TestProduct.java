package com.demo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.demo.beans.Product;

public class TestProduct {

	public static void main(String[] args) {
		List<Product> lst=new ArrayList<>();
		lst.add(new Product(10,"lays",34,45,LocalDate.of(2024, 06,6)));
		lst.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,9)));
		lst.add(new Product(35,"Maggi",40,50,LocalDate.of(2024, 05,06)));
		Optional<Integer> s=lst.stream().map(Product::getQty).reduce((acc,num)->acc+num);
		System.out.println(s.get());
		Optional<Integer> s1=lst.stream()
				.filter(x->x.getPrice()>40)
				.peek(x->System.out.println(x))
				.map(Product::getQty)
				.reduce((acc,num)->acc+num);
		System.out.println("filtered data"+s1.get());

	}

}
