package com.demo.interfaces;

public interface I2 {
	void m21();
	default void m22() {
		System.out.println("in m22 method");
	}

}
