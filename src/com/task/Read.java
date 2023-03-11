package com.task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Read {

	static String arr[];

	public void readData() {
		int i = 1;
		File file = new File("C:\\Users\\Samir\\Desktop\\dictonry");

		arr = new String[19384];
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {

				if (sc.next().startsWith("s")) {
					// System.out.println(sc.next());
					arr[i] = sc.next();
					i++;

				}

			}
			System.out.println(i);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void readDataFromFile() {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("s.txt"));
			
			String x[] = new String[19384];
			x = (String[]) in.readObject();
			for(String s:x) {
				System.out.println(s);
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void storeData() {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("s.txt"));
			out.writeObject(arr);
			System.out.println("done...");
			out.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {

		Read r = new Read();
		r.readData();
		r.storeData();
		r.readDataFromFile();
//		for (String s : arr) {
//			System.out.println(s);
//		}

	}
}
