package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Product;
import com.demo.comparators.MyNameComparator;
import com.demo.comparators.MyPriceComparator;

public class ProductDaoISetImpl implements ProductDao {

	static Set<Product> pset ;
	
	static {
		pset = new HashSet<>();
		pset.add(new Product(10,"lays",34,45,LocalDate.of(2024, 06,06)));
		pset.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		pset.add(new Product(35,"Maggi",40,50,LocalDate.of(2024, 05,06)));
	}
	
	@Override
	public boolean save(Product p) {
		return pset.add(p);
	}

	@Override
	public Set<Product> findAll() {
		
		return pset;
	}

	@Override
	public Product findById(int pid) {
		for(Product p : pset)
		{
			if(p.getPid()==pid)
			{
				return p;
			}
		}
		return null;
	}

	@Override
	public List<Product> findByName(String nm) {
		List<Product> lst = new ArrayList<>();
		for(Product p : pset)
		{
			if(p.getPname().equals(nm)) {
				lst.add(p);
			}
				
		}
		if(lst.isEmpty())
		{
			return null;
		}
		return lst;
		
	}

	@Override
	public List<Product> findByPrice(float price) {
		
		List<Product> lst=pset.stream().filter(ob->ob.getPrice()>price)
			.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
	
		return lst;
	}

	@Override
	public boolean deleteById(int id) {
		return pset.remove(new Product(id));
		
	}

	@Override
	public boolean updateById(int pid, int qty, float price) {
		
		Product p = findById(pid);
		
		if(p!=null)
		{
			p.setQty(qty);
			p.setPrice(price);
			
			return true;
		}
		
		return false;
	}

	@Override
	public List<Product> arrangeByPrice() {
		List<Product> lst=new ArrayList<>();
		for(Product p : pset)
		{
			lst.add(p);
		}
		lst.sort(new MyPriceComparator());
		
		return lst;
	}

	@Override
	public List<Product> arrangeByName() {
		
		List<Product> lst=new ArrayList<>();
		for(Product p : pset)
		{
			lst.add(p);
		}
		lst.sort(new MyNameComparator());
		
		return lst;
		
		
	}

	@Override
	public Set<Product> arrangeById() {
		Set<Product> tset=new TreeSet<>();
		for(Product p : pset)
		{
			tset.add(p);
		}
		
		return tset;
		
	}
	
}
