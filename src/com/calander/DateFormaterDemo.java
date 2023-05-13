package com.calander;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormaterDemo {

	
	public static void main(String[] args) {
		
		//date to string
		Date date = new Date();
		SimpleDateFormat sd = new  SimpleDateFormat("dd/MMM/yyyy HH:mm:ss zzzz a");
		
		String strDate = sd.format(date);
		System.out.println(strDate);
		
	}
}
