package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		File f=new File("testcopy1.txt");
		BufferedOutputStream bos=null;
		if(f.exists()) {
			try {
				bos=new BufferedOutputStream(new FileOutputStream(f,true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			
				try {
					bos=new BufferedOutputStream(new FileOutputStream(f));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		try(BufferedInputStream bis=
				new BufferedInputStream(new FileInputStream("test.txt"));
				BufferedOutputStream bos1=bos; ){
			   int i=bis.read();
			   while(i!=-1) {
				   bos.write(i);
				   i=bis.read();
			   }
			   System.out.println("copy done!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
