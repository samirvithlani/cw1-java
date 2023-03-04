package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo3 {

	
	public static void main(String[] args) {
		
		Path src = Paths.get("sum.txt");
		Path dest = Paths.get("test/sum1.txt");
		
		try {
			Files.move(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
