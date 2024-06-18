package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAll();

	void writeFile();

	void readFile();

	boolean removeById(int pid);

	boolean updateProduct(int pid, int qty, float price);

	Product searchById(int pid);

}
