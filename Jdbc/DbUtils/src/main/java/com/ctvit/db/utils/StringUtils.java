package com.ctvit.db.utils;

public class StringUtils {

	/**
	 * 字符串
	 * 非空指针 非null
	 * */
	public static boolean isNotEmpty(String str){
		boolean flag = false;
		if(str!=null && !"".equals(str.trim()) && !"null".equals(str)){
			flag = true;
		}
		return flag;
	}
}
