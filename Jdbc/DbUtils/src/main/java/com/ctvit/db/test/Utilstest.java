package com.ctvit.db.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ctvit.db.beans.UserInfo;
import com.ctvit.db.utils.JdbcUtils;
import com.ctvit.db.utils.MySqlJDBCUtils;
public class Utilstest {
	//private static final Logger log=Logger.getLogger(Utilstest.class);
	private static final String quesql="select* from userinfo";
	private static final String inssql="insert into userinfo(username,password) values (?,?),(?,?) ";
	public static void main(String[] args) {
		MySqlJDBCUtils jdbcUtils=new MySqlJDBCUtils();
		jdbcUtils.getConnection();
		
		//插入操作
		/*
		List<Object> params=new ArrayList<Object>();
		params.add("admin1");
		params.add("admin01");
		params.add("admin2");
		params.add("admin02");
		
		try {
			boolean flag=jdbcUtils.updateByPreparedStatement(inssql, params);
			System.out.println(flag);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//log.error("数据库操作出错:"+e);
			e.printStackTrace();
		}
		*/
		
		//查询操作
		try {
			List<Map<String,Object>> list=jdbcUtils.findModeResult(quesql, null);
			System.out.println(list);
			System.out.println("...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//利用发射查询操作
		List<UserInfo> userlist=new ArrayList<UserInfo>();
		try {
			userlist=jdbcUtils.findMoreRefResult(quesql, null, UserInfo.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userlist);
		System.out.println(123);
		
}

}
