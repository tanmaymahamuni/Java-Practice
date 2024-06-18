package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	private ProductDao pdao;

	public ProductServiceImpl() {
		super();
		pdao = new ProductDaoImpl();
	}

	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid");
		int pid = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter quantity");
		int qty = sc.nextInt();
		System.out.println("Enter price");
		float price = sc.nextFloat();
		System.out.println("Enter exp dat in format (dd/MM/yyyy)");
		String dt = sc.next();
		
		LocalDate dt1 = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p = new Product(pid, name, qty, price, dt1);
		
		return pdao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		
		return pdao.findAll();
	}

	@Override
	public void writeToFile() {
		
		 pdao.writeFile();
	}

	@Override
	public void readFromFile() {
		pdao.readFile();
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public boolean modifyProduct(int pid, int qty, float price) {
		// TODO Auto-generated method stub
		return pdao.updateProduct(pid, qty, price);
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return pdao.searchById(pid);
	}
	
	
	
	
	
	
	
	
}
