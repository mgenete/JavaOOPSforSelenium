package com.oops;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {


		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format3 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		System.out.println(format3.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.AM_PM));


	}

}
