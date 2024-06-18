package com.demo.test;

import com.demo.beans.Friend;

public class TestFriendHashCode {
public static void main(String[] args) {
	Friend fa=new Friend(1,"xxxx","1111");
	System.out.println(fa.hashCode());
	Friend f=new Friend(2,"yyyy","33");
	System.out.println(f.hashCode());
	Friend ff=new Friend(1,"xxxx","1111");
	System.out.println(ff.hashCode());
}
}
