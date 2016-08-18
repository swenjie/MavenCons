package com.ctvit.db.utils;

import java.io.Serializable;

public class Constants implements Serializable{
	/**
	 * 常用参数配置
	 */
	private static final long serialVersionUID = 1L;
	public static final String MYSQL_JDBC_DRIVER="com.mysql.jdbc.Driver";
	public static final String MYSQL_JDBC_URL=
			"jdbc:mysql://db:3306/vdpdb?useUnicode=true&characterEncoding=utf-8";
	public static final String MYSQL_JDBC_USERNAME="root";
	public static final String MYSQL_JDBC_PASSWORD="1026";
	public static final String DATE_FORMAT_SSS="SSS";//当前小时毫秒数
	public static final String DATE_FORMAT_DATE="yyyy-MM-dd aHH:mm:ss:SSs";//年-月-日 小时：分：秒：毫秒
	
}
