package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {

		File file;

		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for create file");
		System.out.println("press 2 for create folder");
		System.out.println("press 3 for create folders...");
		System.out.println("press 4 for existance...");
		System.out.println("press 5 for delete file...");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:

			break;

		case 2:
			System.out.println("enter foldername create....");
			String flname = sc.next();
			file = new File(flname);
			try {
				if (file.mkdir()) {
					System.out.println(flname + " is created...");
				} else {
					throw new Exception("error while creating folder...");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("enter folder names sept with /");
			String flnames = sc.next();
			file = new File(flnames);
			file.mkdirs();
			// try catch....
			break;
		case 4:
			System.out.println("enter file name of folder to check exists or not");
			String fname = sc.next();
			file = new File(fname);
			if (file.exists()) {
				System.out.println("file or folder is exist..");
//				if(file.isDirectory())
				if (!file.isFile()) {
					System.out.println(fname + " is folder...");
				} else {
					System.out.println(fname + " is file...");
				}
			} else {
				System.out.println(fname + " does not exist...");
			}

			break;
		case 5:
			System.out.println("enter file name to delete...");
			fname = sc.next();
			file = new File(fname);
			if (file.exists() && file.isFile()) {
				boolean flag = file.delete();
				if (flag) {
					System.out.println(fname + "is deleted...");

				} else {
					System.out.println(fname + " is not deleeted....");
				}
			}
			else {
				//System.err.println("file not exist...");
				System.out.println("file not exist...");
			}

			break;
			
		case 6:
					
			break;

		}

	}
}
