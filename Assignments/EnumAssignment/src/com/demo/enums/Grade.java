package com.demo.enums;

public enum Grade {

	
	Distinction(80,100),First(65,79),Second(50,64),Pass(40,49),Fail(0,39);
	
	private int minimum_marks;
	private int maximum_marks;
	
	private Grade(int minimum_marks, int maximum_marks) {
		this.minimum_marks = minimum_marks;
		this.maximum_marks = maximum_marks;
	}

	public int getMinimum_marks() {
		return minimum_marks;
	}

	public void setMinimum_marks(int minimum_marks) {
		this.minimum_marks = minimum_marks;
	}

	public int getMaximum_marks() {
		return maximum_marks;
	}

	public void setMaximum_marks(int maximum_marks) {
		this.maximum_marks = maximum_marks;
	}

	
	
	
	
	
}
