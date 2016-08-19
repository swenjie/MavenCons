package com.ctvit.utils;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;

import sun.net.TelnetInputStream;
import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;

/**
 * FTP远程命令列表<br>
 * USER PORT RETR ALLO DELE SITE XMKD CDUP FEAT<br>
 * PASS PASV STOR REST CWD STAT RMD XCUP OPTS<br>
 * ACCT TYPE APPE RNFR XCWD HELP XRMD STOU AUTH<br>
 * REIN STRU SMNT RNTO LIST NOOP PWD SIZE PBSZ<br>
 * QUIT MODE SYST ABOR NLST MKD XPWD MDTM PROT<br>
 * 在服务器上执行命令,如果用sendServer来执行远程命令(不能执行本地FTP命令)的话，所有FTP命令都要加上\r\n<br>
 * ftpclient.sendServer("XMKD /test/bb\r\n"); //执行服务器上的FTP命令<br>
 * ftpclient.readServerResponse一定要在sendServer后调用<br>
 * nameList("/test")获取指目录下的文件列表<br>
 * XMKD建立目录，当目录存在的情况下再次创建目录时报错<br>
 * XRMD删除目录<br>
 * DELE删除文件<br>
 * <p>
 * Title: 使用JAVA操作FTP服务器(FTP客户端)
 * </p>
 * <p>
 * Description: 上传文件的类型及文件大小都放到调用此类的方法中去检测，比如放到前台JAVASCRIPT中去检测等
 * 针对FTP中的所有调用使用到文件名的地方请使用完整的路径名（绝对路径开始）。
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008
 * </p>
 * 
 * @version 1.0
 */
public class FtpFileUtil {
	private FtpClient ftpclient;

	private String ip = "";

	private String username = "";

	private String password = "";

	private int port = 21;

	/**
	 * 构造函数
	 * 
	 * @param ip
	 *            String 机器IP
	 * @param port
	 *            String 机器FTP端口号
	 * @param username
	 *            String FTP用户名
	 * @param password
	 *            String FTP密码
	 * @throws Exception
	 */
	public FtpFileUtil(String ip, String username, String password) throws Exception {
		this.ip = ip;
		this.username = username;
		this.password = password;
		ftpclient = new FtpClient(this.ip, this.port);
	}

	public FtpFileUtil(String ip, int port, String username, String password) throws Exception {
		this.ip = ip;
		this.port = port;
		this.username = username;
		this.password = password;
		ftpclient = new FtpClient(this.ip, this.port);
	}

	/**
	 * 登录FTP服务器
	 * 
	 * @throws Exception
	 */
	public void login() throws Exception {
		ftpclient.login(this.username, this.password);
	}

	/**
	 * 退出FTP服务器
	 * 
	 * @throws Exception
	 */
	public int logout() throws Exception {
		ftpclient.sendServer("QUIT\r\n");
		return ftpclient.readServerResponse();
	}

	/**
	 * 在FTP服务器上建立指定的目录,当目录已经存在的情下不会影响目录下的文件,这样用以判断FTP
	 * 上传文件时保证目录的存在。目录格式必须以"/"根目录开头
	 * 
	 * @param pathList
	 *            String
	 * @throws Exception
	 */
	public void buildList(String pathList) throws Exception {
		ftpclient.ascii();
		StringTokenizer s = new StringTokenizer(pathList, "/"); // sign
		// int count = s.countTokens();
		String pathName = "";
		while (s.hasMoreElements()) {
			pathName = pathName + "/" + (String) s.nextElement();
			try {
				ftpclient.sendServer("XMKD " + pathName + "\r\n");
			} catch (Exception e) {
				e = null;
			}
			ftpclient.readServerResponse();
		}
		ftpclient.binary();
	}

	/**
	 * 上传文件到FTP服务器,destination路径以FTP服务器的"/"开始，带文件名、 上传文件只能使用二进制模式，当文件存在时再次上传则会覆盖
	 * 
	 * @param source
	 *            String
	 * @param destination
	 *            String
	 * @throws Exception
	 */
	public void upFile(String source, String destination) throws Exception {
		buildList(destination.substring(0, destination.lastIndexOf("/")));
		ftpclient.binary();

		TelnetOutputStream ftpOut = ftpclient.put(destination);
		TelnetInputStream ftpIn = new TelnetInputStream(new FileInputStream(source), true);

		byte[] buf = new byte[2048];
		int bufsize = 0;
		while ((bufsize = ftpIn.read(buf, 0, buf.length)) != -1) {
			ftpOut.write(buf, 0, bufsize);
		}
		ftpIn.close();
		ftpOut.close();

	}

	//
	//	public void upFile(FileObject fo, String destination) throws Exception {
	//		if (fo == null)
	//			return;
	//		buildList(destination.substring(0, destination.lastIndexOf("/")));
	//		ftpclient.binary();
	//
	//		TelnetOutputStream ftpOut = ftpclient.put(destination);
	//		TelnetInputStream ftpIn = new TelnetInputStream(fo.getContent()
	//				.getInputStream(), true);
	//
	//		byte[] buf = new byte[2048];
	//		int bufsize = 0;
	//		while ((bufsize = ftpIn.read(buf, 0, buf.length)) != -1) {
	//			ftpOut.write(buf, 0, bufsize);
	//		}
	//		ftpIn.close();
	//		ftpOut.close();
	//
	//	}

	/**
	 * JSP中的流上传到FTP服务器, 上传文件只能使用二进制模式，当文件存在时再次上传则会覆盖 字节数组做为文件的输入流,此方法适用于JSP中通过
	 * request输入流来直接上传文件在RequestUpload类中调用了此方法， destination路径以FTP服务器的"/"开始，带文件名
	 * 
	 * @param sourceData
	 *            byte[]
	 * @param destination
	 *            String
	 * @throws Exception
	 */
	public void upFile(byte[] sourceData, String destination) throws Exception {
		buildList(destination.substring(0, destination.lastIndexOf("/")));
		ftpclient.binary(); // 此行代码必须放在buildList之后
		TelnetOutputStream ftpOut = ftpclient.put(destination);
		ftpOut.write(sourceData, 0, sourceData.length);
		// ftpOut.flush();
		ftpOut.close();
	}

	/**
	 * 从FTP文件服务器上下载文件SourceFileName，到本地destinationFileName 所有的文件名中都要求包括完整的路径名在内
	 * 
	 * @param SourceFileName
	 *            String
	 * @param destinationFileName
	 *            String
	 * @throws Exception
	 */
	public void downFile(String SourceFileName, String destinationFileName) throws Exception {
		ftpclient.binary(); // 一定要使用二进制模式
		TelnetInputStream ftpIn = ftpclient.get(SourceFileName);
		byte[] buf = new byte[204800];
		int bufsize = 0;
		FileOutputStream ftpOut = new FileOutputStream(destinationFileName);
		while ((bufsize = ftpIn.read(buf, 0, buf.length)) != -1) {
			ftpOut.write(buf, 0, bufsize);
		}
		ftpOut.close();
		ftpIn.close();
	}

	/**
	 *从FTP文件服务器上下载文件，输出到字节数组中
	 * 
	 * @param SourceFileName
	 *            String
	 * @return byte[]
	 * @throws Exception
	 */
	public byte[] downFile(String SourceFileName) throws Exception {
		ftpclient.binary(); // 一定要使用二进制模式
		TelnetInputStream ftpIn = ftpclient.get(SourceFileName);
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		byte[] buf = new byte[204800];
		int bufsize = 0;

		while ((bufsize = ftpIn.read(buf, 0, buf.length)) != -1) {
			byteOut.write(buf, 0, bufsize);
		}
		byte[] return_arraybyte = byteOut.toByteArray();
		byteOut.close();
		ftpIn.close();
		return return_arraybyte;
	}

	//删除FTP服务器上的指定文件 
	public void delectFile(String fileName) throws Exception {
		String cmd = "DELE " + fileName + "\r\n";
		ftpclient.sendServer(cmd);

	}

	public static void main(String[] args) throws Exception {
		FtpFileUtil ftpU = new FtpFileUtil("10.8.50.21", "zsgxvod", "zsgxvod");
		ftpU.login();
		ftpU.upFile("C:\\hewei.mp4", "/b5f37531a45c46d48df8e46606c1405d.mp4");
		ftpU.logout();

	}
}