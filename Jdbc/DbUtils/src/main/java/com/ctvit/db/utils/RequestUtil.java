package com.ctvit.db.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//simport javax.faces.application.Application;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.BeanFactory;


/**
 * Convenience class for setting and retrieving cookies.
 */
public class RequestUtil {
	private static final String DEFAULT_REQUEST_ENCODING = "iso-8859-1";
	private static final Logger logger = Logger.getLogger(RequestUtil.class);

	/**
	 * Convenience method to set a cookie
	 * 
	 * @param response
	 * @param name
	 * @param value
	 * @param path
	 */
	public static void setCookie(HttpServletResponse response, String name,
			String value, String path) {
		Cookie cookie = new Cookie(name, value);
		cookie.setSecure(false);
		cookie.setPath(path);
		cookie.setMaxAge(3600 * 24 * 30); // 30 days

		response.addCookie(cookie);
	}

	/**
	 * Convenience method to get a cookie by name
	 * 
	 * @param request
	 *            the current request
	 * @param name
	 *            the name of the cookie to find
	 * 
	 * @return the cookie (if found), null if not found
	 */
	public static Cookie getCookie(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();
		Cookie returnCookie = null;

		if (cookies == null) {
			return returnCookie;
		}

		for (int i = 0; i < cookies.length; i++) {
			Cookie thisCookie = cookies[i];

			if (thisCookie.getName().equals(name)) {
				// cookies with no value do me no good!
				if (!thisCookie.getValue().equals("")) {
					returnCookie = thisCookie;

					break;
				}
			}
		}

		return returnCookie;
	}

	/**
	 * Convenience method for deleting a cookie by name
	 * 
	 * @param response
	 *            the current web response
	 * @param cookie
	 *            the cookie to delete
	 * @param path
	 *            the path on which the cookie was set (i.e. /appfuse)
	 */
	public static void deleteCookie(HttpServletResponse response,
			Cookie cookie, String path) {
		if (cookie != null) {
			// Delete the cookie by setting its maximum age to zero
			cookie.setMaxAge(0);
			cookie.setPath(path);
			response.addCookie(cookie);
		}
	}

	/**
	 * Convenience method to get the application's URL based on request
	 * variables.
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @return String
	 */
	public static String getAppURL(HttpServletRequest request) {
		StringBuffer url = new StringBuffer();
		int port = request.getServerPort();
		if (port < 0) {
			port = 80; // Work around java.net.URL bug
		}
		String scheme = request.getScheme();
		url.append(scheme);
		url.append("://");
		url.append(request.getServerName());
		if ((scheme.equals("http") && (port != 80))
				|| (scheme.equals("https") && (port != 443))) {
			url.append(':');
			url.append(port);
		}
		url.append(request.getContextPath());
		return url.toString();
	}

	public static String getRequestBytes(HttpServletRequest request, String name) {
		return RequestUtil.getRequestBytes(request.getParameter(name));
	}

	public static String getRequestBytes(String str) {
		return getRequestBytes(str, DEFAULT_REQUEST_ENCODING);
	}

	public static String getRequestBytes(String str, String enc) {
		if (null == str)
			return "";
		if ("".equals(enc))
			enc = DEFAULT_REQUEST_ENCODING;
		try {
			String str2 = new String(str.getBytes(enc), "utf-8");
			return str2;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return str;
		}
	}

	public static Document getRequestDocument(InputStream in) {
		SAXReader reader = new SAXReader();
		try {
			return reader.read(in);
		} catch (DocumentException e) {
			return null;
		}
	}
	

	public static String postHttpRequest(String urlAddress,
			List<Map<String, String>> params) throws Exception {
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader in = null;
		StringBuffer result = new StringBuffer();
		
		try {
			url = new URL(urlAddress);
			con = (HttpURLConnection) url.openConnection();
			con.setUseCaches(false);
			con.setDoOutput(true);
			con.setRequestMethod("POST");
		
			String paramsTemp = "";
			for (Map<String, String> param : params) {
				for (String key : param.keySet()) {
					String temp = key + "=" + param.get(key);
					paramsTemp += "&" + temp;
				}
			}
			paramsTemp = paramsTemp.replaceAll("%", "%25")
					.replaceAll("[+]", "%2B").replaceAll("&lt;", "<")
					.replaceAll("&gt;", ">");
			
			byte[] b = paramsTemp.getBytes("utf-8");
			con.getOutputStream().write(b, 0, b.length);
			con.getOutputStream().flush();
			con.getOutputStream().close();
			
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while (true) {
				String line = in.readLine();
				if (line == null) {
					break;
				} else {
					result.append(line);
				}
			}
		} catch (IOException e) {
			throw new Exception(e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (con != null) {
					con.disconnect();
				}
			} catch (IOException e) {

			}
		}
		logger.info("POST请求处理结果：" + result.toString());
		return result.toString();
	}
	
	//歌华儿童剧集post请求 add by shangwenjie 2016-5-18
	public static String appadd(String content,String addRUrl) {
		    	Boolean returnFlag=false;
		    	URL url=null;
		    	HttpURLConnection connection=null;
		    	BufferedReader in = null;
		    	StringBuffer result = new StringBuffer();
		        try {
		            //创建连接
		            url = new URL(addRUrl);
		            connection = (HttpURLConnection) url
		                    .openConnection();
		            connection.setDoOutput(true);
		            connection.setDoInput(true);
		            connection.setRequestMethod("POST");
		            connection.setUseCaches(false);
		            //connection.setInstanceFollowRedirects(true);
		            connection.setRequestProperty("Content-Type",
		                    "application/json");
		            connection.connect();
		            
//		            byte[] b = paramsTemp.getBytes("utf-8");
//					con.getOutputStream().write(b, 0, b.length);
//					con.getOutputStream().flush();
//					con.getOutputStream().close();
		            byte[] b=content.getBytes("utf-8");
		            connection.getOutputStream().write(b, 0, b.length);
		            connection.getOutputStream().flush();
		            connection.getOutputStream().close();
		            //POST请求
//		            DataOutputStream out = new DataOutputStream(
//		                    connection.getOutputStream());
//		            out.writeBytes(content);
//		            out.flush();
//		            out.close();
		            
//		        	in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//					while (true) {
//						String line = in.readLine();
//						if (line == null) {
//							break;
//						} else {
//							result.append(line);
//						}
//					}
		            in=new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
		            while(true){
		            	String line=in.readLine();
		            	if(line==null){
		            		break;
		            	}else{
		            		result.append(line);
		            	}
		            }
		          //  System.out.println(result.toString());
		          //  System.out.println(connection.getResponseCode());
		         //   System.out.println(connection.getResponseMessage());
		            //读取响应
//		            BufferedReader reader = new BufferedReader(new InputStreamReader(
//		                    connection.getInputStream()));
//		            String lines;
//		            System.out.println(connection.getResponseCode());
//		            StringBuffer sb = new StringBuffer("");
//		            while ((lines = reader.readLine()) != null) {
//		                lines = new String(lines.getBytes(), "utf-8");
//		                sb.append(lines);
//		            }
//		            System.out.println(sb);
//		            if(connection.getResponseCode()==200){
//		            	returnFlag=true;
//		            }
		           
		        } catch (MalformedURLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (UnsupportedEncodingException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }finally{
		        	  // 断开连接
		        	if(connection!=null){
		        	 connection.disconnect();
		        	 }
		        }
		        
				return result.toString();

		    }
	
	
	public static void main(String[] args) throws Exception {
		
	}

}
