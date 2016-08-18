package com.ctvit.db.utils;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

public class DoubleResources {
	private static final Logger log =Logger.getLogger(DoubleResources.class);
	
	private static String driver1=null;
	private static  String url1=null;
	private static  String username1=null;
	private static  String password1=null;
	
	private static String driver2=null;
	private static  String url2=null;
	private static  String username2=null;
	private static  String password2=null;
	private static Properties props=new Properties();
	
	static{
		try {
			props.load(DoubleResources.class.getResourceAsStream("/jdbc.properties"));;
		} catch (IOException e) {
			e.printStackTrace();
			log.error("#error:系统加载配置文件错误");
		}
		driver1=props.getProperty("jdbc1.driverClassName");
		url1=props.getProperty("jdbc1.url");
		username1=props.getProperty("jdbc1.username");
		password1=props.getProperty("jdbc1.password");
		//注册驱动类
			try {
				Class.forName(driver1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				log.error("数据库驱动加载异常"+driver1);
			}
	}
	
	
	static{
		try {
			props.load(DoubleResources.class.getResourceAsStream("src/main/resource/dbinfo.properties"));;
		} catch (IOException e) {
			e.printStackTrace();
			log.error("#error:系统加载配置文件错误");
		}
		driver2=props.getProperty("jdbc2.driverClassName");
		url2=props.getProperty("jdbc2.url");
		username2=props.getProperty("jdbc2.username");
		password2=props.getProperty("jdbc2.password");
		//注册驱动类
			try {
				Class.forName(driver2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				log.error("数据库驱动加载异常"+driver1);
			}
	}
	public static Connection getConnectionOne(){
		Connection conn=null;
		try {
			conn=(Connection) DriverManager.getConnection(url1, username1, password1);
		} catch (SQLException e) {
			log.error("SqlException",e);
		}
		return conn;
	}
	public static Connection getConnectionTwo(){
		Connection conn=null;
		try {
			conn=(Connection) DriverManager.getConnection(url2, username2, password2);
		} catch (SQLException e) {
			log.error("#ERROR# :创建数据库连接发生异常 SqlException",e);
		}
		return conn;
	}
	
}
