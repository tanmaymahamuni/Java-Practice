package com.demo.dao;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));){
			for(Student s:slist) {
				bw.write(s.getSid()+","+s.getSname()+","+s.getSdegree()+","+s.getSemail()+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void readFile() {
		try(BufferedReader br = new BufferedReader(new FileReader("student.txt"));){
			String s = br.readLine();
			while(s!=null) {
				String[] arr = s.split(",");
				int id = Integer.parseInt(arr[0]);
				String nm = arr[1];
				String deg = arr[2];
				String em = arr[3];
				Student st = new Student(id,nm,deg,em);
				slist.add(st);
				s=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
