package com.calander;

import java.time.LocalDate;
import java.time.LocalTime;

public class Datetime4 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date.getEra());

		LocalTime time = LocalTime.now();

	}
}
