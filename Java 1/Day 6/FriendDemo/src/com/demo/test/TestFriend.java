package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import com.demo.beans.Friend;
import com.demo.comparators.MyMobileComparator;

public class TestFriend {

	public static void main(String[] args) {
		List<Friend> flist=new ArrayList<>();
		flist.add(new Friend(1,"Raj","1111"));
		flist.add(new Friend(2,"Ashu","2222"));
		flist.add(new Friend(3,"Manjiri","33333"));
		flist.add(new Friend(4,"Mugdha","55555"));
		flist.add(new Friend(5,"Raj","66666"));
		System.out.println(flist);
		/*int id=3;
		String name="Mugdha";
		System.out.println(flist.contains(new Friend(id,name,null)));
        flist.sort(null); 
        flist.stream().forEach(System.out::println);
        flist.sort(new MyMobileComparator()); 
        flist.stream().forEach(System.out::println);*/
		//navigate through the list
		/*for(Friend f:flist) {
			System.out.println(f);
		}*/
		//using iterator
		Iterator<Friend> it=flist.iterator();
		int cnt=1;
		while(it.hasNext()) {
			Friend f =it.next();
			if(cnt==1) {
				flist.add(new Friend(7,"Gauri","77777"));
				cnt++;
			}
			System.out.println(f);
			if(f.getName().equals("Raj")) {
				
				it.remove();
			}
			
		}
		//ListIterator<Friend> lit=flist.listIterator();
		flist.removeIf(ob->ob.getName().startsWith("R"));
		System.out.println(flist);
	
		
	}

}
