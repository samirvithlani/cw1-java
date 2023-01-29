package com.files;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	
	@Override
	public String toString() {
		System.out.println("called....");
		return "hello";
	}

	public static void main(String[] args) {

//		FileDemo1 f1 = new FileDemo1();
//		System.out.println(f1);
//		
		
	//retive path
	//abso path D:\workspaces\java\CW1-JAVA\src\com\files
		//./ current directory
		// ../ parent direcory
		//../../ p to p
		File file = new File("../../demo.txt");
		try {
			boolean flag = file.createNewFile();
			if(flag == true) {
				System.out.println("file created...");
			}
			else {
				throw new IOException("File not created.....");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
