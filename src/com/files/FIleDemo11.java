package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FIleDemo11 {

	public static void main(String[] args) {
		
		String name = "royal";
		
		try {
			OutputStream out = new FileOutputStream("out.txt");
			byte[] b = name.getBytes();
			out.write(b);
			out.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
