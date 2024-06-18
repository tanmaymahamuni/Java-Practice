package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Friend;

public class MyNameComparator implements Comparator <Friend>{

	
public  MyNameComparator(String string) {


}

@Override
public int compare(Friend o1, Friend o2) {
	//return o1.getName().compareTo(o2.getName());
return 0;
}}
