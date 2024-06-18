package com.demo.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CourseDaoImpl implements CourseDao{
	static Map<String,Integer> hm;
	static {
		hm=new HashMap<>();
		hm.put("DAC", 240);
		hm.put("DBDA", 200);
		hm.put("DVLSI", 60);
	}
	@Override
	public boolean save(String cname, int i) {
		if(!hm.containsKey(cname)){
			hm.put(cname, i);
			return true;
		}
		return false;
		
	}
	@Override
	public Map<String, Integer> findAll() {
		return hm;
	}
	@Override
	public int findInfo(String cname) {
		Integer v=hm.get(cname);
		if(v==null)
			 return -1;
		return v;
	}
	@Override
	public Map<String, Integer> findByCapacity(int c) {
		Map<String,Integer> mapdata=new HashMap<>();
		for(String k:hm.keySet()) {
			if(hm.get(k)>c) {
				mapdata.put(k,hm.get(k) );
			}
			
		}
		if(mapdata.isEmpty()) {
			return null;
		}
		return mapdata;
	}
	@Override
	public boolean removeByName(String cname) {
		Integer v= hm.remove(cname);
		if(v!=null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean updateCapacity(String cname, int c) {
		if(hm.containsKey(cname)) {
				hm.put(cname, c);
				return true;
		}
		return false;
	}
	@Override
	public boolean updateCoursename(String cname, String newname) {
		Integer v=hm.remove(cname);
		if(v!=null) {
			hm.put(newname, v);
			return true;
		}
		return false;
		
	}
	@Override
	public Map<String, Integer> arrangeByName() {
		Map<String,Integer> tm=new TreeMap<>();
		for(String k:hm.keySet()) {
			tm.put(k,hm.get(k));
			
		}
		return tm;
	}
	

}
