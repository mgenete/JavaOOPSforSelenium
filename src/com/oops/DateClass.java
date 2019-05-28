package com.oops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {


		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat format0 = new SimpleDateFormat("MMddyyyy_HH:mm:ss");
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat format3 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		SimpleDateFormat format4 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");


		System.out.println(format0.format(date));
		System.out.println(format1.format(date));
		System.out.println(format2.format(date));
		System.out.println(format3.format(date));
		System.out.println(format4.format(date));
		System.out.println(format5.format(date));
	}

}
