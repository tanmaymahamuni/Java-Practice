package com.demo.dao;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	Employee[] findAll();

	Employee getById(int pid);

	Employee[] getByName(String nm);

	boolean modifySalById(int pid, float s);

}
