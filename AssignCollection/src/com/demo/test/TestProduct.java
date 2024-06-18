package com.demo.test;
import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService pser = new ProductServiceImpl();
		int choice = 0;
		do {
		System.out.println("Please enter your choice from the following: ");
		System.out.println("1. Add new product\n2. Display all products\n3. Display by id\n4. Display by name");
		System.out.println("5. Display by price\n6. Display in order of price\n7. Display in order of name");
		System.out.println("8. Delete by id\n9. Modify by id\n10. Exit\nChoice:");
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			boolean status = pser.addNewProduct();
			if(status)
				System.out.println("Product added successfully");
			else
				System.out.println("Error occurred");
			break;
		case 2:
			List<Product> plist = pser.displayAll();
			plist.stream().forEach(ob->System.out.println(ob));
			break;
		case 3:
			System.out.println("Enter Pid");
			int pid = sc.nextInt();
			Product p = pser.displayById(pid);
			if(p!=null)
				System.out.println(p);
			else
				System.out.println("Invalid Id");
			break;
		case 4:
			System.out.println("Enter Name");
			String nm = sc.next();
			plist = pser.displayByName(nm);
			plist.stream().forEach(ob->System.out.println(ob));
			break;
		case 5:
			System.out.println("Enter price");
			double price = sc.nextDouble();
			plist = pser.displayByPrice(price);
			plist.stream().forEach(ob->System.out.println(ob));
			break;
		case 6:
			plist=pser.sortByPrice();
			plist.stream().forEach(System.out::println);
			break;
		case 7:
			plist = pser.sortByName();
			plist.stream().forEach(System.out::println);
			break;
		case 8:
			System.out.println("Enter id");
			int id = sc.nextInt();
			status = pser.removeById(id);
			if(status)
				System.out.println("Deleted successfully");
			else
				System.out.println("Error occurred");
			break;
		case 9:
			System.out.println("Enter id");
			id = sc.nextInt();
			System.out.println("Enter qty");
			int qty = sc.nextInt();
			System.out.println("Enter price");
			price = sc.nextDouble();
			status = pser.modifyById(id, qty, price);
			if(status)
				System.out.println("Modified successfully");
			else
				System.out.println("Error occurred");
			break;
		case 10:
			sc.close();
			System.out.println("Thank you for visiting!");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		}while(choice!=10);
	}

}
