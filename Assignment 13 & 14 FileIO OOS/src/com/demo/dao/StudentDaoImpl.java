package com.demo.dao;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{
	
	private static List<Student> slist = new ArrayList<>();
	

	@Override
	public boolean save(Student s) {
		return slist.add(s);
	}


	@Override
	public List<Student> findAlll() {
		return slist;
	}


	@Override
	public void writeFile() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student2.txt"));){
			for(Student s:slist) {
				oos.writeObject(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void readFile() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student2.txt"));){
			
			while(true) {
				Student s = (Student)ois.readObject();
				slist.add(s);
			}
		} catch(EOFException e) {
			System.out.println("Reached End Of Line");
			System.out.println("Length: " + slist.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
