package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class FileDaoImpl implements FileDao {
	static List<Product> plist;
	static {
		plist=new ArrayList<>();
		Product p1=new Product(1,"chair",34,2345,LocalDate.of(2025, 3,3));
		Product p2=new Product(2,"shelf",50,333,LocalDate.of(2025, 4,4));
		Product p3=new Product(3,"table",100,4545,LocalDate.of(2025, 5,5));
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
	}
	@Override
	public void writeToFile() {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("productdata.txt"));){
			for(Product p:plist) {
				//serialize the object
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Product> readFromFile() {
		List<Product> lst=new ArrayList<>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("productdata.txt"))){
			
			while(true) {
				Product p=(Product)ois.readObject();
				lst.add(p);
			}
			
		} catch(EOFException e) {
			System.out.println("reached to end of file");
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	

}
