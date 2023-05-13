package com.calander;

import java.util.Calendar;

public class CalenderDemo1 {

	public static void main(String[] args) {
		
		Calendar c =Calendar.getInstance();
//		c.add(Calendar.YEAR, 1);
//		c.add(Calendar.MONTH, -1);
		
		System.out.println("YEAR :"+c.get(Calendar.YEAR));
		System.out.println("MONTH :"+c.get(Calendar.MONTH));
		System.out.println("DATE :"+c.get(Calendar.DATE));
		System.out.println("HOUR :"+c.get(Calendar.HOUR));
		System.out.println("MIN :"+c.get(Calendar.MINUTE));
		System.out.println("SEC :"+c.get(Calendar.SECOND));
		System.out.println("MILLS :"+c.get(Calendar.MILLISECOND));
		System.out.println("DAY OF MONTH :"+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY OF WEEK :"+c.get(Calendar.DAY_OF_WEEK));
		System.out.println("week of month :"+c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("week of the year :"+c.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println(Calendar.getAvailableCalendarTypes());
		
	}
}
