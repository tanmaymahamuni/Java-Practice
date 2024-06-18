package com.demo.dao;

import java.util.Map;

public interface CourseDao {

	boolean save(String cname, int i);

	Map<String, Integer> findAll();

	int findInfo(String cname);

	Map<String, Integer> findByCapacity(int c);

	boolean removeByName(String cname);

	boolean updateCapacity(String cname, int c);

	boolean updateCoursename(String cname, String newname);

	Map<String, Integer> arrangeByName();

}
