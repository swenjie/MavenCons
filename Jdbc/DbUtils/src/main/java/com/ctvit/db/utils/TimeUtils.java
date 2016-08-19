package com.ctvit.db.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.i18n.LocaleContextHolder;

public class TimeUtils {
	private static String defaultDatePattern=null;
	private static String timePattern="HH:mm";
	private static final SimpleDateFormat dateFormatGmt=new SimpleDateFormat();
	public static String getDateForPattern(String pattern){
		dateFormatGmt.applyPattern(pattern);
		return dateFormatGmt.format(new Date());
	}
	
	public static synchronized String getDatePattern(){
		Locale locale=LocaleContextHolder.getLocale();
		try {
			defaultDatePattern=ResourceBundle.getBundle("ApplicationResources", locale).getString("date.format");
		} catch (Exception e) {
			defaultDatePattern="yyyy-MM-dd";
		}
		return defaultDatePattern;
	}
	 public static final String getDate(Date aDate){
		 SimpleDateFormat df=null;
		 String returnValue="";
		 if(aDate!=null){
			 df=new SimpleDateFormat(getDatePattern());
			 returnValue=df.format(aDate);
		 }
		return returnValue;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
