package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo2 {

	public static void main(String[] args) {
		
		//src...
		Path p1 = Paths.get("buffer.txt");
		Path p2 = Paths.get("test/buffer2.txt");

		try {
			Files.copy(p1, p2);
			System.out.println("copied...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
