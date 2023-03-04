package com.files.serilize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Student implements Serializable{
	
	String name;
	int age;
	
	public Student(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	

	
}
public class SerilizeDemo {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("manan", 26);
		System.out.println(s1.age);
		System.out.println(s1.name);
		
		
		///
		FileOutputStream out;
		try {
			out = new FileOutputStream("student.txt");
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(s1);
			obj.close();
			out.close();
			
			System.out.println("serilized done...");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InputStream in = new FileInputStream("student.txt");
			
			ObjectInputStream input = new ObjectInputStream(in);
			Student s2 = (Student)input.readObject();
			System.out.println(s2.age);
			System.out.println(s2.name);
			
			
		} catch ( IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
