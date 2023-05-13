package com.date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {

		// java.util.Date -->
		Date d = new Date();
		System.out.println(d);
		System.out.println("date.." + d.getDate());
		System.out.println("minitue..." + d.getMinutes());
		System.out.println(d.getHours());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());
		System.out.println(d.getTime());
		//1900+123 =2023
		//1970 1st january 5 30
		//1900
		System.out.println(d.getYear());
		
		Date d1 = new Date(1l);
		System.out.println(d1);

	}
}
