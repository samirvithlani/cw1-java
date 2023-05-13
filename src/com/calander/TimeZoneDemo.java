package com.calander;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {

	
	public static void main(String[] args) {
		
		String ids[] = TimeZone.getAvailableIDs();
		for(String s:ids) {
			System.out.println(s);
		}
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Chicago");
		System.out.println(timeZone.getDisplayName());
		Calendar chikgo = new GregorianCalendar(timeZone);
		System.out.println(chikgo.get(Calendar.HOUR) + " : "+chikgo.get(Calendar.MINUTE));
		
		
	}
}
