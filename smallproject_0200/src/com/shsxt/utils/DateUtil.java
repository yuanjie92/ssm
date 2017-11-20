package com.shsxt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private static final String FORMAT_1 = "yyyyMMddHHmmss";
	private static final String FORMAT_2 = "yyyy-MM-dd";
	private static final String FORMAT_3 = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 
	 * @param dateString
	 * @return
	 */
	public static String getDateStartByString(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_2);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT_1);
		return sdf2.format(date);
	}

	public static Date getDateByString(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_2);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String getDateStartByStringForHubang(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_2);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT_3);
		return sdf2.format(date);
	}

	/**
	 * 
	 * @param dateString
	 * @return
	 */
	public static String getDateNextDayByString(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_2);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, 1);

		SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT_1);
		return sdf2.format(new Date(c.getTimeInMillis()));
	}

	public static String getDateNextDayByStringForHubang(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_2);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, 1);

		SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT_3);
		return sdf2.format(new Date(c.getTimeInMillis()));
	}

	public static void main(String[] args) {
		System.out.println(getDateStartByString("2017-03-31"));
	}
}
