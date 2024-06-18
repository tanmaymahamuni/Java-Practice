package com.demo.beans;

public class Student {

	private int sid;
	private String sname;
	private String email;
	private String address;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, String email, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.address = address;
	}
	
	

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "Student Details [sid=" + sid + ", sname=" + sname + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
