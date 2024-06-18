package com.demo.beans;

public class Friend {

	private String name;
	private String mob;
	private String address;
	
	public Friend() {
		super();
	}

	public Friend(String name, String mob, String address) {
		super();
		this.name = name;
		this.mob = mob;
		this.address = address;
	}
	
	

	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "Friend [name=" + name + ", mob=" + mob + ", address=" + address + "]";
	}
	
	
}
