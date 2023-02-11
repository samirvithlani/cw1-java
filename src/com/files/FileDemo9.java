package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo9 {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Samir\\Desktop\\dictonry");
		try {
			Scanner sc = new Scanner(file);
//			String data ="";
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
