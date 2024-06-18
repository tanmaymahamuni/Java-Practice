package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.demo.beans.MyClass;

public class TestReflection {
	public static void main(String[] args) {
		MyClass ob=new MyClass(12,"Deepa");
			Class cls=ob.getClass();
		//to retrieve the constructors
		Constructor[] carr=cls.getConstructors();
		for(Constructor c:carr) 
		{
			System.out.println(c+"---->"+c.getParameterCount());
		}
		//find method names
		Method[] marr=cls.getMethods();
		for(Method m:marr) {
			System.out.println(m.getName()+"---->"+m.getParameterCount());
		}
		//list of fields
		Field[] farr=cls.getDeclaredFields();
	    System.out.println("length :"+farr.length);
	    for(Field f1:farr) {
	    	System.out.println("in for");
	    	System.out.println("name : "+f1.getName());
	    	System.out.println("type :"+f1.getType().getName());
	    }
	    
	    // to change privte variabls value
	    farr[0].setAccessible(true);
	    farr[1].setAccessible(true);
	    try {
			farr[0].set(ob, 23);
			System.out.println(ob);
			farr[1].set(ob, "Kedar");
			System.out.println(ob);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  //ob.method1(34);
	    //execute method using reflection
	   
	    Method tm;
		try {
			tm = cls.getDeclaredMethod("method1", int.class);
			tm.invoke(ob, 34);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
