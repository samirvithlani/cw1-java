package com.date;

import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		
		Date d = new Date();
		d.setDate(14);
		d.setHours(12);
		d.setYear(95);
		d.setMinutes(21);
		d.setMonth(1);
		
		System.out.println(d);
		
		Date d3= new Date(95, 0, 18);
		System.out.println(d3);
		
		System.out.println(d.after(d3)); //if d is after dat of d2  d moth feb d3 jan
		System.out.println(d.before(d3));
	}
}
