package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface FileService {

	void writeFile();

	List<Product> readFile();

}
