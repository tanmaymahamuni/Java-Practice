package com.demo.service;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;

import com.demo.dao.*;

public class StudentServiceImpl implements StudentService{
	private StudentDao sdao = new StudentDaoImpl();

	@Override
	public boolean addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id= sc.nextInt();
		System.out.println("Enter name");
		String nm = sc.next();
		System.out.println("Enter degree");
		String deg = sc.next();
		System.out.println("Enter email");
		String em = sc.next();
		Student s = new Student(id, nm, deg, em);
		
		return sdao.save(s);
	}

	@Override
	public List<Student> displayAll() {
		return sdao.findAlll();
	}

	@Override
	public void writeTofile() {
		sdao.writeFile();
	}

	@Override
	public void readFromFile() {
		 sdao.readFile();
	}

}
