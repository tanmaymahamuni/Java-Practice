package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{

	StudentDao sdao;
	
	public StudentServiceImpl() {
		sdao= new StudentDaoImpl();
	}

	@Override
	public boolean addStudent() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		int id=sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name=sc.next();
		
		System.out.println("Enter Student Degree");
		String degree=sc.next();
		
		System.out.println("Enter Student Email");
		String email=sc.next();
		
		Student s = new Student(id,name,degree,email);
		
		return sdao.addStudentDetails(s);
		
		
	}

	@Override
	public List<Student> displayAll() {
		
		return sdao.displayAll();
	}

	@Override
	public void writeToFile() {
		
		sdao.writeFile();
		
	}

	@Override
	public void readFromFile() {
		
		sdao.readFile();
		
	}
	
	
	
}
