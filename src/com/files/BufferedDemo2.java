package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedDemo2 {

	public static void main(String[] args) {
		String data ="";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Samir\\Desktop\\dictonry"));
			int count=0;
			while((data = br.readLine())!=null) {
				System.out.println(data);
				count++;
			}
			System.out.println(count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
