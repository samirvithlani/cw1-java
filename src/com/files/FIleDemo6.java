package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleDemo6 {

	/*
	 *  high level class
	 *    string char word line...
	 *  low level class...
	 *  bytes....
	 * 
	 * */
	public static void main(String[] args) {
		
		
		File file = new File("Hello.txt");
		//file.createNewFile()
		try {
			FileWriter writer = new FileWriter(file,true);
			writer.write("Hello this is new file....");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
