package com.gacl.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


/**
 *users表所对应的实体类 
 * */
public class User {
	
	
	public void unZip(String unZipfile,String destFile){

	FileOutputStream fileOut;
	File file;
	InputStream inputStream;
	byte[] buf=new byte[1024*4];
	
	try {
		ZipFile zipFile=new ZipFile(unZipfile);
		//遍历zipFile中所有的实体，并把他们解压出来
		for(@SuppressWarnings("unchecked")
			Enumeration<ZipEntry> entries=(Enumeration<ZipEntry>) zipFile.entries();
				entries.hasMoreElements();
		){
			
			
		}
	} catch (Exception ioe) {
		ioe.printStackTrace();
	}
		
		
	}
	
	//实体类属性和表字段名称一致
	private int userId;
	private String userName;
	private int userAge;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id="+userId+",name="+userName+",age="+userAge+"]";
	}
	
	
	
}
