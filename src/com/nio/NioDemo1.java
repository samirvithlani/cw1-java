package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo1 {

	//Path interface
	//Paths class
	//Files class
	
	public static void main(String[] args) {
		
		
		Path path = Paths.get("nio.txt");
		
		try {
			if(!Files.exists(path)) {
				Files.createFile(path);
			}
			else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path path2 = Paths.get("test1/test2/a/b");
		if(!Files.exists(path2)) {
			
			try {
				//Files.createDirectory(path2);
				Files.createDirectories(path2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("folder already exist...");
		}
	}
}
