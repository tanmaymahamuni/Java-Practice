package com.demo.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class TestDataInputStreamdemo {
public static void main(String[] args) {
	/*String s="15,Revati,UX,45678";
	String[] sarr=s.split(",");*/
	//Stream.of(sarr).forEach(System.out::println);
	//read data from empdata.txt, and find sum of sal and number of employees
	//from admin department who are working as developer
	try(DataInputStream dis=new DataInputStream(new FileInputStream("empdata.txt"));){
		String s=dis.readLine();
		int sum=0;
		while(s!=null) {
			
			String[] data=s.split(",");
			if(data[3].equals("admin") && data[2].equals("developer")) {
				System.out.println(s);
				sum=sum+Integer.parseInt(data[4]);
			}
			s=dis.readLine();
		}
		System.out.println("Sum of salary : "+sum);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
