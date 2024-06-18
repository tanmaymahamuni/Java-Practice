package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.FileDao;
import com.demo.dao.FileDaoImpl;

public class FileServiceImpl implements FileService{
	private FileDao fdao;
	public FileServiceImpl() {
	   fdao=new FileDaoImpl();
	}
	@Override
	public void writeFile() {
		fdao.writeToFile();
		
	}
	@Override
	public List<Product> readFile() {
		return fdao.readFromFile();
		
	}
}
