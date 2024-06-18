package com.demo.enums;

public enum Grade {

	Distinction(80,100), First(65,79), Second(50,64), Pass(40,49), Fail(0,39);
	
	private float minmarks, maxmarks;

	private Grade() {
	}

	private Grade(float minmarks, float maxmarks) {
		this.minmarks = minmarks;
		this.maxmarks = maxmarks;
	}

	public float getMinmarks() {
		return minmarks;
	}

	public void setMinmarks(float minmarks) {
		this.minmarks = minmarks;
	}

	public float getMaxmarks() {
		return maxmarks;
	}

	public void setMaxmarks(float maxmarks) {
		this.maxmarks = maxmarks;
	}
	
	
			
}
