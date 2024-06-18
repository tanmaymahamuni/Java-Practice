package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.MyClass;

public class TestReflection {

	public static void main(String[] args) {
		
		MyClass ob = new MyClass(1, "Tanmay");
		Class c = ob.getClass();
		
		Constructor[] carr = c.getConstructors();
		for(Constructor c1:carr)
			System.out.println(c1.getName()+"---->"+c1.getParameterCount());
		
		Method[] marr = c.getMethods();
		for(Method m:marr) {
			System.out.println(m.getName()+"---->"+m.getParameterCount());
			if(m.getParameterCount()>3) {
				Method t = null;
				try {
					t=c.getDeclaredMethod(m.getName(), m.getParameterTypes());
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					t.invoke(ob, 1,2,3,4);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		Field[] farr = c.getDeclaredFields();
		for(Field f:farr) {
			System.out.println("in for");
			System.out.println("name: "+f.getName());
			System.out.println("type: "+f.getType());
		}
		
		farr[0].setAccessible(true);
		farr[1].setAccessible(true);
		
		try {
			farr[0].set(ob, 2);
			System.out.println(ob);
			farr[1].set(ob, "Tejas");
			System.out.println(ob);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ob.method1(34);
		
		Method tm;
		try {
			tm=c.getDeclaredMethod("method1", int.class);
			try {
				tm.invoke(ob, 34);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
