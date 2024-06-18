package com.demo.beans;

import java.time.LocalDate;

public class Product {
private int pid;
private String pname;
private int pqty;
private double price;
private LocalDate expdt;
public Product() {
	super();
}
public Product(int pid, String pname, int pqty, double price, LocalDate expdt) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pqty = pqty;
	this.price = price;
	this.expdt = expdt;
}
public Product(int pid) {
	super();
	this.pid =  pid;
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
public int getPqty() {
	return pqty;
}
public void setPqty(int pqty) {
	this.pqty = pqty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
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
	return "Product [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + ", expdt=" + expdt
			+ "]";
}
public boolean equals(Object obj)
{
	Product other = ((Product)obj);
	return this.pid==other.pid;
}
}