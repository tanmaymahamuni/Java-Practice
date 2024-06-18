package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	void writeToFile();

	void readFromFile();

	boolean deleteById(int pid);

	boolean modifyProduct(int pid, int qty, float price);

	Product getById(int pid);

}
