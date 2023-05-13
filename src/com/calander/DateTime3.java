package com.calander;

import java.time.LocalDateTime;

public class DateTime3 {

	public static void main(String[] args) {
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.getYear());
		System.out.println(time.getMonth());
		System.out.println(time.getDayOfMonth());
		System.out.println(time.getDayOfWeek());
		System.out.println(time.getDayOfYear());
		
		
		System.out.println(time.getHour()+" : "+time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		System.out.println(time.getChronology());
		
		
	}
}
