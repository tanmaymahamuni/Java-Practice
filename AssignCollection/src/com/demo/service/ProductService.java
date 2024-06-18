package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	Product displayById(int pid);

	List<Product> displayByName(String nm);

	boolean removeById(int id);

	boolean modifyById(int id, int qty, double price);

	List<Product> displayByPrice(double price);

	List<Product> sortByPrice();

	List<Product> sortByName();




}
