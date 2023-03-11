package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo4 {

	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\Users\\Samir\\Desktop\\desk1.txt");
//		try {
//			//Files.delete(path);
//			Files.deleteIfExists(path);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(Files.isReadable(path)) {
			System.out.println("readble..");
		}
		else {
			System.out.println("not readable....");
		}
		if(Files.isExecutable(path)) {
			System.out.println("exceutable");
		}
		else {
			System.out.println("not exceutable...");
		}
		if(Files.isWritable(path)) {
			System.out.println("writable");
		}
		else {
			System.out.println("read onlyt...");
		}
		
		try {
			if(Files.isHidden(path)) {
				System.out.println("yes");
			}
			else {
				System.out.println("not..");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
