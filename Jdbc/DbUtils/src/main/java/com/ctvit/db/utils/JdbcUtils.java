package com.ctvit.db.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import com.mysql.jdbc.Connection;
public class JdbcUtils {
	//连接数据库的参数
    private static String url = null;
    private static String user = null;
    private static String driver = null;
    private static String password = null;
    private JdbcUtils () {
    	 
    }
    private static JdbcUtils instance = null;
    public static JdbcUtils getInstance() {
        if (instance == null) {
            synchronized (JdbcUtils.class) {
                if (instance == null) {
                    instance = new JdbcUtils();
                }
 
            }
        }
 
        return instance;
    }
    //配置文件
    private static Properties prop=new Properties();
    
    //注册驱动
    static{
    	//利用类加载器读取配置文件
    	try {
    		InputStream is=JdbcUtils.class.getClass().getResourceAsStream("src/main/resource/dbinfo.properties");
			prop.load(is);
			url=prop.getProperty("url");
			user=prop.getProperty("user");
			driver=prop.getProperty("driver");
			password=prop.getProperty("password");
			Class.forName(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    //该方法获得连接
    public Connection getConnection() throws SQLException{
    	return (Connection) DriverManager.getConnection(url, user, password);
    }
    //释放资源
    public void free(Connection conn,PreparedStatement ps,ResultSet rs){
    	if(rs!=null){
    		try{
    			rs.close();
    		}catch(SQLException e){
    			e.printStackTrace();
    		}finally{
    			try {
					if(ps!=null){
						ps.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}finally {
					if(conn!=null){
						try {
							conn.close();
						} catch (Exception e3) {
							e3.printStackTrace();
						}
					}
				}
    		}
    	}
    }
    
}
