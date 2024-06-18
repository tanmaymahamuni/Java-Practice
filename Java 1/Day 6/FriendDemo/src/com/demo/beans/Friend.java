package com.demo.beans;

public class Friend implements MyNameComparator <Friend> {
  private int fid;
  private String name;
  private String mobile;
	public Friend() {
		super();
	}
	
	public Friend(int fid) {
		super();
		this.fid = fid;
	}

	public Friend(int fid, String name, String mobile) {
		super();
		this.fid = fid;
		this.name = name;
		this.mobile = mobile;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", name=" + name + ", mobile=" + mobile + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals"+this.fid+"----->"+((Friend)obj).fid);
		System.out.println("Name: "+this.name+"--->"+((Friend)obj).name);
		return this.fid==((Friend)obj).fid; //&& this.name.equals(((Friend)obj).name);
	}
	public int compare(Friend o) {
		//return (this.fid-o.fid);
		System.out.println("in compare to function using name"+this.name+"---->"+o.name);
		return this.name.compareTo(o.name);
	}

	@Override
	public int compare(Friend o1, Friend o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
  
}
