package com.demo.service;

import java.util.Map;
import java.util.Scanner;

import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService{
	private CourseDao cdao;

	public CourseServiceImpl() {
		cdao=new CourseDaoImpl();
	}

	@Override
	public boolean addnewCourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr course name");
		String cname=sc.next();
		System.out.println("enetr capacity");
		int i=sc.nextInt();
		return cdao.save(cname,i);
		
	}

	@Override
	public Map<String, Integer> displayAll() {
		return cdao.findAll();
	}

	@Override
	public int getInfo(String cname) {
		return cdao.findInfo(cname);
	}

	@Override
	public Map<String, Integer> getByCapacity(int c) {
		return cdao.findByCapacity(c);
	}

	@Override
	public boolean deleteByName(String cname) {
		return cdao.removeByName(cname);
	}

	@Override
	public boolean modifycapacity(String cname, int c) {
		return cdao.updateCapacity(cname,c);
	}

	@Override
	public boolean modifycoursename(String cname, String newname) {
		return cdao.updateCoursename(cname,newname);
		
	}

	@Override
	public Map<String, Integer> sortByName() {
		return cdao.arrangeByName();
	}
	
	

}
