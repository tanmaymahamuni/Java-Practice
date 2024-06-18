package com.demo.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.Friend;
import com.demo.beans.MyClass;
import com.demo.beans.Rectangle;
import com.demo.beans.Student;

public class Testreflection {

	public static void main(String[] args) {
		
		
		//Rectangle Class Information 
		Rectangle robj = new Rectangle(4,6);
		Class rcls=robj.getClass();
		
		System.out.println("Rectangle Class Information: ");
		System.out.println("Class Name: "+rcls.getName());
		
		Method [] rmarr = rcls.getDeclaredMethods();
		
		for(Method r:rmarr)
		{
			System.out.println("Method Name: "+r.getName()+" , Method Parameters: "+r.getParameterCount());
		}
		
		Field[] rfarr = rcls.getDeclaredFields();
		for(Field f:rfarr)
		{
			System.out.println("Parameter Name : "+f.getName()+" , Parameter Type: "+f.getType().getName());
		}
		System.out.println();
		
		
		//Friend Class Information
		Friend fobj = new Friend("Akansha","12345","Nagpur");
		Class fcls=fobj.getClass();
		
		System.out.println("Friend Class Information: ");
		System.out.println("Class Name: "+fcls.getName());
		
		Method [] fmarr = fcls.getDeclaredMethods();
		
		for(Method r:fmarr)
		{
			System.out.println("Method Name: "+r.getName()+" , Method Parameters: "+r.getParameterCount());
		}
		
		Field[] ffarr = fcls.getDeclaredFields();
		for(Field f:ffarr)
		{
			System.out.println("Parameter Name : "+f.getName()+" , Parameter Type: "+f.getType().getName());
		}
		System.out.println();

		//Student Class Information
		Student sobj = new Student(1,"Akansha","akansha@gmail.com","Nagpur");
		Class scls=sobj.getClass();
		
		System.out.println("Student Class Information: ");
		System.out.println("Class Name: "+scls.getName());
		
		Method [] smarr = scls.getDeclaredMethods();
		
		for(Method r:smarr)
		{
			System.out.println("Method Name: "+r.getName()+" , Method Parameters: "+r.getParameterCount());
		}
		
		Field[] sfarr = scls.getDeclaredFields();
		for(Field f:sfarr)
		{
			System.out.println("Parameter Name : "+f.getName()+" , Parameter Type: "+f.getType().getName());
		}
		
		System.out.println();
		//MyClass Class Information
		MyClass mobj = new MyClass(1,2,3,4);
		Class mcls=mobj.getClass();
		
		System.out.println("MyClass Class Information: ");
		System.out.println("Class Name: "+mcls.getName());
		
		Method [] mmarr = mcls.getDeclaredMethods();
		
		for(Method r:mmarr)
		{
			System.out.println("Method Name: "+r.getName()+" , Method Parameters: "+r.getParameterCount());
			if(r.getParameterCount()>=3)
			{
				try {
					System.out.println("Invokation of more than 4 parameter method");
					r.invoke(mobj, 2,3,4,5);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		Field[] mfarr = mcls.getDeclaredFields();
		for(Field f:mfarr)
		{
			System.out.println("Parameter Name : "+f.getName()+" , Parameter Type: "+f.getType().getName());
		}
		System.out.println();
		
		
	}

}
