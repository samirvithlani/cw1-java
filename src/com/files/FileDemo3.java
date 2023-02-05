package com.files;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Samir\\Desktop\\test1.txt");
		System.out.println("exe"+file.canExecute());
		System.out.println("read."+file.canRead());
		System.out.println("write,,,"+file.canWrite());
		
		System.out.println(file.isHidden());
		
		
		
	}
}
