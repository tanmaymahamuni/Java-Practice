package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCrudProductFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService pservice = new ProductServiceImpl();
		pservice.readFromFile();
		int choice=0;
		do {
		System.out.println("1. Add new product\n 2. display all\n 3. delete by id\n");
		System.out.println("4. modify product\n 5. display by id\n 6. exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			
			boolean status = pservice.addNewProduct();
			
			if(status) {
				System.out.println("Added Successfully");
			} else {
				System.out.println("Error");
			}
			
			break;
			
		case 2:
			
			List<Product> plist = pservice.displayAll();
			
			plist.forEach(System.out::println);
			
			break;
		case 3:
			System.out.println("Enter Id to delete");
			int pid = sc.nextInt();
			
			status = pservice.deleteById(pid);
			
			if(status) {
				System.out.println("Deleted Succesfully");
			} else {
				System.out.println("Not Found");
			}
			
			break;
		case 4:
			System.out.println("Enter Id to modify");
			pid = sc.nextInt();
			System.out.println("Enter new Qty");
			int qty = sc.nextInt();
			System.out.println("Enter New Price");
			float price = sc.nextFloat();
			
			status = pservice.modifyProduct(pid, qty, price);
			if(status) {
				System.out.println("Modified Successfully");
			}else {
				System.out.println("Not Found");
				
			}
			break;
		case 5:
			System.out.println("Enter Id to search");
			pid = sc.nextInt();
			
			Product p = pservice.getById(pid);
			if(p!=null) {
				System.out.println(p);
			}else {
				System.out.println("Not Found");
			}
			
			break;
		case 6:
			sc.close();
			System.out.println("Thank you");
			pservice.writeToFile();
			
			break;
		default:
			System.out.println("invalid choice");
			
		}
		}while(choice!=6);
		
	}

}
