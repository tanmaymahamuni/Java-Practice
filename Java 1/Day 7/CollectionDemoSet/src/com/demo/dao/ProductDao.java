package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductDao {
	boolean save(Product p);

	Set<Product> findAll();

	Product findById(int pid);

	List<Product> findByName(String nm);

	List<Product> findByPrice(float price);

	boolean deleteById(int id);

	boolean updateById(int pid, int qty, float price);

	List<Product> arrangeByPrice();

	List<Product> arrangeByName();

	Set<Product> arrangeById();
}
