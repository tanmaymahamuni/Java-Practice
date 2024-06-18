package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAll();

	Product findById(int pid);

	List<Product> findByName(String nm);

	boolean deleteById(int id);

	boolean updateById(int id, int qty, double price);

	List<Product> findByPrice(double price);

	List<Product> arrangeByPrice();

	List<Product> arrangeByName();
	
	

}
