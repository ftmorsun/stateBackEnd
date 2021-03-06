package com.bank.util;

import java.text.SimpleDateFormat;
import java.util.Date;
//This one will convert date to string and return it
public class DateUtil {

	private DateUtil() {
	}//It will avoid object creation

	public static final String SIMPLE_DATE_TIME_FORMAT = "dd/MM/yyyy hh:mm a";
	public static final String SIMPLE_DATE_FORMAT = "dd/MM/yyyy";

	public static String getDateAsString(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

}