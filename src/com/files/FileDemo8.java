package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo8 {

	public static void main(String[] args) {
		
		
		try {
			FileReader reader = new FileReader("Hello.txt");
			int c=0;
			int count=0;
			while((c= reader.read())!= -1) {
				count++;
				System.out.print((char)c);	
			}
			System.out.println(count);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
