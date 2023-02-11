package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDmeo {

	public static void main(String[] args) {
		
		try {
			FileReader fw = new FileReader("Hello.txt");
			//BufferedReader redReader = new BufferedReader(new FileReader("Hello.txt"));
			BufferedReader reader = new BufferedReader(fw);
			//int c = reader.read();
			int c =0;
			//char x = (char)c;
			//System.out.println((char)c);
			int count = 0;
			while((c=reader.read())!= -1) {
				
				System.out.print((char)c);
				count++;
			}
			System.out.println(count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
