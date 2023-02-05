package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo7 {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("sum.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no1 ");
			int no1 = sc.nextInt();
			System.out.println("enter no2");
			int no2 = sc.nextInt();
			
			int ans = no1 + no2;
			
			writer.write("no1 = "+no1);
			writer.write("no2 = "+no2);
			writer.write("ans = "+ans);
			writer.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
