package com.demo.test;

import com.demo.beans.FileHandling;
import com.demo.threads.SearchThread;

public class TestFileSearch {

	public static void main(String[] args) {
		FileHandling f=new FileHandling();
		String[] arr= {"Joy","Happy","Enthusiastic","Play","Enjoy","funny"};
		Thread[] tarr=new Thread[arr.length];
		int i=0;
		for(String word:arr) {
			tarr[i]=new SearchThread(f, word);
			tarr[i].start();
		}
	}
}
