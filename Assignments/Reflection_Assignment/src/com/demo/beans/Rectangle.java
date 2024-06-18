package com.demo.beans;

public class Rectangle {

	private float rlength;
	private float rbreadth;
	
	public Rectangle() {
		super();
	}

	public Rectangle(float rlength, float rbreadth) {
		super();
		this.rlength = rlength;
		this.rbreadth = rbreadth;
	}

	public float getRlength() {
		return rlength;
	}

	public void setRlength(float rlength) {
		this.rlength = rlength;
	}

	public float getRbreadth() {
		return rbreadth;
	}

	public void setRbreadth(float rbreadth) {
		this.rbreadth = rbreadth;
	}
	
	public void findPerimeter()
	{
		float perimeter=(rlength+rbreadth)*2;
		System.out.println("Perimeter of Rectangle is : "+perimeter);
	}
	
	public void findArea()
	{
		float area= (rbreadth*rlength);
		System.out.println("Area of rectangle is : "+area);
	}

	@Override
	public String toString() {
		return "Rectangle [rlength=" + rlength + ", rbreadth=" + rbreadth + "]";
	}
	
	
}
