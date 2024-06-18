package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	static List<Product> plist;
	static {
		plist = new ArrayList<>();
	}
	@Override
	public boolean save(Product p) {
		
		return plist.add(p);
	}
	@Override
	public List<Product> findAll() {
		
		return plist;
	}
	@Override
	public void writeFile() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.txt"));){
			
			for(Product p:plist) {
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
	public void readFile() {
	
		File f = new File("empdata.txt");
		if(f.exists()) {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));){
				
				while(true) {
					Product p = (Product)ois.readObject();
					plist.add(p);
				}
				
			} catch(EOFException e) {
				System.out.println("Reached End Of Line");
				System.out.println("Length: " + plist.size());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public boolean removeById(int pid) {

		return plist.remove(new Product(pid));
	
	}
	
	public Product searchById(int pid) {
		int pos = plist.indexOf(new Product(pid));
		if(pos==-1) {
			return null;
		} else {
			return plist.get(pos);
		}
	}
	
	@Override
	public boolean updateProduct(int pid, int qty, float price) {
		
		Product p = searchById(pid);
		if(p!=null) {
			p.setQty(qty);
			p.setPrice(price);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}
