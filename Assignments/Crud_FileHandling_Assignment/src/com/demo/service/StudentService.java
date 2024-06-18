package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	boolean addStudent();

	List<Student> displayAll();

	void writeToFile();

	void readFromFile();

}
