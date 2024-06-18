package com.demo.test;

import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Product;
import com.demo.service.FileService;
import com.demo.service.FileServiceImpl;

public class TestSerialization {

	public static void main(String[] args) {
		FileService fs=new FileServiceImpl();
		fs.writeFile();
		List<Product> plst=fs.readFile();
		plst.forEach(System.out::println);

	}

}
