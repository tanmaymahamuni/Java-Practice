package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	Set<Product> displayAll();

	Product displayById(int pid);

	List<Product> displayByName(String nm);

	List<Product> displayByPrice(float price);

	boolean removeById(int id);

	boolean modifyById(int pid, int qty, float price);

	List<Product> sortByPrice();

	List<Product> sortByName();

	Set<Product> sortById();

}
