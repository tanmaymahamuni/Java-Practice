package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy {

	public static void main(String[] args) {
		//FileInputStream fis=new FileInputStream("c:\\newdata\\test.txt");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//file should be there, if file does not exists, then 
			//FileNotFoundException will come
			fis=new FileInputStream("test.txt");
			//if file is not there, it will create a new file
			//if file is there, it will overwrite file.
			fos=new FileOutputStream("testcopy.txt");
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
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (
				
			) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
