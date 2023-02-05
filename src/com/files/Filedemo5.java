package com.files;

import java.io.File;

public class Filedemo5 {

	public static void main(String[] args) {
		
		
		File file = new File("D:\\projects\\23-react-weekend\\learning");
		
		String fileList[] = file.list();
		File  files[] = file.listFiles();
		
		for(File f :files) {
			System.out.println(f);
		}
		
		
		for(int i=0;i<fileList.length;i++) {
			System.out.println(fileList[i]);
		}
		
		
		for(String s:fileList) {
			System.out.println(s);
		}
		
//		for(String s: fileList) {
//			System.out.println(s);
//		}
		
		
	}
}
