package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable{

	private int sid;
	private String sname;
	private String sdegree;
	private String semail;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, String sdegree, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdegree = sdegree;
		this.semail = semail;
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

	public String getSdegree() {
		return sdegree;
	}

	public void setSdegree(String sdegree) {
		this.sdegree = sdegree;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sdegree=" + sdegree + ", semail=" + semail + "]";
	}
	
	
}
