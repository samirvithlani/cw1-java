package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class FileDemo10 {

	public static void main(String[] args) {
		
		try {
			InputStream in = new FileInputStream("out.txt");
			int x =0;
			while((x = in.read())!= -1 ) {
				System.out.println((char)x);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
