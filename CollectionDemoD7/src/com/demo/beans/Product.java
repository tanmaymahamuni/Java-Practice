package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Product implements Comparable<Product>{
	private int pid;
	private String pname;
	private int qty;
	private float price;
	private LocalDate expdt;
	public Product() {
		super();
	}
	
	public Product(int pid) {
		super();
		this.pid = pid;
	}

	public Product(int pid, String pname, int qty, float price, LocalDate expdt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.expdt = expdt;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return pid == other.pid;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getExpdt() {
		return expdt;
	}
	public void setExpdt(LocalDate expdt) {
		this.expdt = expdt;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", expdt=" + expdt
				+ "]";
	}

	@Override
	public int compareTo(Product obj) {
		System.out.println("In compareTo"+this.qty+"--->"+obj.qty);
		
		return this.pid-obj.pid; 
	}
	

}
