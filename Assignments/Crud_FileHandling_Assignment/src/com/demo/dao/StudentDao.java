package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	boolean addStudentDetails(Student s);

	List<Student> displayAll();

	void writeFile();

	void readFile();

}
