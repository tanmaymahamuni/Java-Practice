package com.demo.test;o

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestAppend {

	public static void main(String[] args) {
		File f=new File("testcopy.txt");
		FileOutputStream fos=null;
		if(f.exists()) {
			//open it in append mode
			try {
				fos=new FileOutputStream("testcopy.txt",true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			//create a new file
		  try {
			fos=new FileOutputStream("te  ky.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		//autoclosable resource block
		try(FileInputStream fis=new FileInputStream("test.txt");
			FileOutputStream fos1=fos;
			) {
			//copy a file
			int i=fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			System.out.println("copy of file done");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
