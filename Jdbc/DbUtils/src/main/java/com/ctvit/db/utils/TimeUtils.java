package com.ctvit.db.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
	private static final SimpleDateFormat dateFormatGmt=new SimpleDateFormat();
	public static String getDateForPattern(String pattern){
		dateFormatGmt.applyPattern(pattern);
		return dateFormatGmt.format(new Date());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
