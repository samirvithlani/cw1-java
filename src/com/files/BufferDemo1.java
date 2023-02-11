package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo1 {

	public static void main(String[] args) {
		
		FileWriter fw;
		try {
			//modes r w a  
			fw = new FileWriter("buffer.txt",true);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("hello this is buffer writer....");
			//writer.append("ok");
			writer.close();
			System.out.println("data write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
