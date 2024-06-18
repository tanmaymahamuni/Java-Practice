package com.demo.beans;

import java.time.LocalDate;
import java.io.Serializable;

//serializable is a marker interface
public class Product implements Comparable<Product>,Serializable{
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
	public int hashCode()
	{
		return pid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Product other=((Product)obj);
		System.out.println("in Product equals method"+this.pid+"---->"+other.pid);
		return this.pid==other.pid;
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
	public int compareTo(Product o) {
		System.out.println("In compareTo"+this.qty+"--->"+o.qty);
		/*if(this.pid<o.pid) 
			return -1;
		else if (this.pid==o.pid)
			  return 0;
		else 
			return 1;*/
//		return this.qty-o.qty;
		return this.pid-o.pid; 
		//return this.pname.compareTo(o.pname);
	}
	

}
