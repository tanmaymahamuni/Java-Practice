package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService{

	ProductDao pdao = new ProductDaoImpl();
	
	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String nm = sc.next();
		System.out.println("Enter qty");
		int qty = sc.nextInt();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		System.out.println("Enter date of expiry in dd/mm/yyyy");
		String dt = sc.next();
		LocalDate exdt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p = new Product(id, nm, qty, price, exdt);
		
		
		return pdao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		return pdao.findAll();
	}

	@Override
	public Product displayById(int pid) {
		
		return pdao.findById(pid);
	}

	@Override
	public List<Product> displayByName(String nm) {
		return pdao.findByName(nm);
	}

	@Override
	public boolean removeById(int id) {
		return pdao.deleteById(id);
	}

	@Override
	public boolean modifyById(int id, int qty, double price) {
		return pdao.updateById(id, qty, price);
	}

	@Override
	public List<Product> displayByPrice(double price) {
		return pdao.findByPrice(price);
	}

	@Override
	public List<Product> sortByPrice() {
		return pdao.arrangeByPrice();
	}

	@Override
	public List<Product> sortByName() {
		return pdao.arrangeByName();
	}

	
	}




	



	
