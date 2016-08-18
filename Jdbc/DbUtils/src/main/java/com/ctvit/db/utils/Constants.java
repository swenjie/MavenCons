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
}
