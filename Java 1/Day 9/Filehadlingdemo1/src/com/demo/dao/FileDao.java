package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface FileDao {

	void writeToFile();

	List<Product> readFromFile();

}
