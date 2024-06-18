package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestDataOutputStream {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("myfile.txt"));
			DataInputStream dis=new DataInputStream(new FileInputStream("myfile.txt"));){
			
			System.out.println("Enter empid");
			int empid=sc.nextInt();
			dos.writeInt(empid);
			System.out.println("Enter ename");
			String nm=sc.next();
			dos.writeUTF(nm);
			System.out.println("Enter salary");
		    double sal=sc.nextDouble();
		    dos.writeDouble(sal);
		    ///to read the file
		    int eid=dis.readInt();
		    String enm=dis.readUTF();
		    double s=dis.readDouble();
		    System.out.println("id: "+eid+"Name: "+enm+"Salary : "+s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
