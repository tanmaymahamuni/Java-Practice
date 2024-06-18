package com.demo.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.demo.beans.Product;
import com.demo.comparators.MyNameComparator;
import com.demo.comparators.MyPriceComparator;

public class ProductDaoImpl implements ProductDao{
	static List<Product> plist;
	static {
		plist = new ArrayList<>();
		plist.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		plist.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
	}
	@Override
	// add a product in a list
	public boolean save(Product p) {
		return plist.add(p);
	}
	@Override
	public List<Product> findAll() {
		
		return plist;
	}
	@Override
	public Product findById(int pid) {
		int pos = plist.indexOf(new Product(pid));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public List<Product> findByName(String nm) {
		/*
		List<Product> lst = new ArrayList<>();
		for(Product p:plist) {
			if(p.getPname().equals(nm)) {
				lst.add(p);
			}
		}
		*/
		List<Product> lst = plist.stream()
				.filter(ob->ob.getPname().equals(nm))
				.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;
	}
	@Override
	public List<Product> findByPrice(float price) {
		 
		List<Product>lst = plist.stream()
				.filter(ob->ob.getPrice()>price)
				.collect(Collectors.toList());
	     if(lst.isEmpty()) {
	    	 return null;
	     }
	         return lst;
				
	}
	@Override
	public boolean deleteById(int id) {
		return plist.remove(new Product(id));
		
	}
	@Override
	public boolean updateById(int pid, int qty, float price) {
		plist.sort(null);
		Product p = findById(pid);
		if(p!=null) {
			p.setQty(qty);
			p.setPrice(price);
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public List<Product> arrangeByPrice() {
		List<Product> lst=new ArrayList<>();
		for(Product p:plist) {
			lst.add(p);
		}
		//Collections.copy(lst, plist);
		lst.sort(new MyPriceComparator());
		return lst;
	}
	@Override
	public List<Product> arrangeByName() {
		List<Product> lst=new ArrayList<>();
		for(Product p:plist) {
			lst.add(p);
		}
		//Collections.copy(lst, plist);
		lst.sort(new MyNameComparator());
		return lst;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
