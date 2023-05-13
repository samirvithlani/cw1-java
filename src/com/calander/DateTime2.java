package com.calander;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime2 {

	public static void main(String[] args) {
		
		LocalDateTime currenttime = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String nowstr = currenttime.format(formatter);
		System.out.println(nowstr);
	}
}
