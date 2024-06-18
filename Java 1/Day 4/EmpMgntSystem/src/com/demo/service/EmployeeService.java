package com.demo.service;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addnewEmployee(int ch);

	Employee[] displayall();

	Employee findById(int pid);

	Employee[] findByName(String nm);

	boolean updateSalById(int pid, float s);

}
