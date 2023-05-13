package com.calander;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//user birth date.. enter year month time..
public class StringtoDate {

	public static void main(String[] args) {
		
		String strDate = "14-02-2023";
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date d = sd.parse(strDate);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
