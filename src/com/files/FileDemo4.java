package com.files;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		File file = new File("src//com//files//file.txt");
		System.out.println(file.getAbsolutePath());
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
