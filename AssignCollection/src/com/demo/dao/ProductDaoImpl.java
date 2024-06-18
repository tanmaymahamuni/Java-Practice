package com.demo.dao;
import com.demo.comparators.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{

	static List<Product> plist;
	
	static {
		plist = new ArrayList<>();
		plist.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		plist.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
	}
	
	@Override
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
		if(pos!=-1)
		{
			System.out.println(pos);
			return plist.get(pos);
		}
			
		else
			return null;
	}
	
	


	@Override
	public List<Product> findByName(String nm) {
		List<Product> lst = plist.stream().filter(ob->ob.getPname().equals(nm)).collect(Collectors.toList());
		if(lst.isEmpty())
			return null;
		return lst;
		
	}

	@Override
	public boolean deleteById(int id) {
		Product p = findById(id);
		return plist.remove(p);
	}

	@Override
	public boolean updateById(int id, int qty, double price) {
		Product p = findById(id);
		if(p!=null)
		{
			p.setPqty(qty);
			p.setPrice(price);
			return true;
		}
		return false;
	}

	@Override
	public List<Product> findByPrice(double price) {
		
		List<Product> lst = new ArrayList<>();
		lst = plist.stream().filter(ob->ob.getPrice()>price).collect(Collectors.toList());
		if(lst.isEmpty())
			return null;
		return lst;
	}

	@Override
	public List<Product> arrangeByPrice() {
		List<Product> lst = new ArrayList<>();
		for(Product p: plist)
		{
			lst.add(p);
		}
		lst.sort(new MyPriceComparator());
		return lst;
	}

	@Override
	public List<Product> arrangeByName() {
		List<Product> lst = new ArrayList<>();
		for(Product p: plist)
		{
			lst.add(p);
		}
		lst.sort(new MyNameComparator());
		return lst;
	}}
	



