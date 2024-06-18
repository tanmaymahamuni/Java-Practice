package com.demo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{

	static List<Student> slist=null;
	
	static{
		
		slist = new ArrayList<>();
	}
	
	@Override
	public boolean addStudentDetails(Student s) {
		
		return slist.add(s);
	}

	@Override
	public List<Student> displayAll() {
		
		return slist;
	}

	@Override
	public void writeFile() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text.txt"));)
		{
			for(Student p : slist)
			{
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void readFile() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text.txt"));)
		{
			while(true)
			{
				Student p=(Student)ois.readObject();
				slist.add(p);
			}
			
		} catch(EOFException e)
		{
			System.out.println("End Of file");
		}
		catch (FileNotFoundException e) {
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
