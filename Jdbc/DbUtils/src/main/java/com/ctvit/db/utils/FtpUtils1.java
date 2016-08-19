package com.ctvit.db.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

public class FtpUtils1 {

	private static final Logger logger = Logger.getLogger(FtpUtils1.class);

	private FTPClient ftp;

	/** 
	 *  
	 * @param path 上传到ftp服务器哪个路径下    
	 * @param addr 地址 
	 * @param port 端口号 
	 * @param username 用户名 
	 * @param password 密码 
	 * @return 
	 * @throws Exception 
	 */
	public boolean connect(String path, String addr, int port, String username, String password) throws Exception {
		boolean result = false;
		ftp = new FTPClient();
		int reply;
		ftp.connect(addr, port);
		ftp.login(username, password);
		ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
		reply = ftp.getReplyCode();
		if (!FTPReply.isPositiveCompletion(reply)) {
			ftp.disconnect();
			return result;
		}
		//        result = ftp.makeDirectory(path);    
		ftp.changeWorkingDirectory(path);
		result = true;
		return result;
	}

	/** */
	/** 
	* 递归创建远程服务器目录 
	* @param remote 远程服务器文件绝对路径 
	* @param ftpClient FTPClient对象 
	* @return 目录创建是否成功 
	* @throws IOException 
	*/
	public boolean CreateDirecroty(String remote) throws IOException {
		boolean flag = true;
		String directory = remote.substring(0, remote.lastIndexOf("/") + 1);
		if (!directory.equalsIgnoreCase("/") && !ftp.changeWorkingDirectory(new String(directory.getBytes("utf-8"), "iso-8859-1"))) {
			//如果远程目录不存在，则递归创建远程服务器目录   
			int start = 0;
			int end = 0;
			if (directory.startsWith("/")) {
				start = 1;
			} else {
				start = 0;
			}
			end = directory.indexOf("/", start);
			while (true) {
				String subDirectory = new String(remote.substring(start, end).getBytes("utf-8"), "iso-8859-1");
				if (!ftp.changeWorkingDirectory(subDirectory)) {
					if (ftp.makeDirectory(subDirectory)) {
						ftp.changeWorkingDirectory(subDirectory);
					} else {
						logger.error("创建目录" + remote + "失败");
						flag = false;
						return flag;
					}
				}

				start = end + 1;
				end = directory.indexOf("/", start);

				//检查所有目录是否创建完毕   
				if (end <= start) {
					break;
				}
			}
		}
		return flag;
	}

	/** 
	 *  
	 * @param file 上传的文件或文件夹 
	 * @throws Exception 
	 */
	public void upload(File file, String path) throws Exception {
		File file2 = new File(file.getPath());
		FileInputStream input = new FileInputStream(file2);
		String dir = path.substring(0, path.lastIndexOf("/") + 1);
		// 创建目录
		CreateDirecroty(dir);
		ftp.changeWorkingDirectory(dir);
		boolean flag = ftp.storeFile(path.substring(path.lastIndexOf("/") + 1), input);
		logger.info("上传文件：" + flag);
		input.close();
	}

	/** 
	* FTP下载单个文件
	 * @throws IOException 
	*/
	public static void download(File file, String path) throws IOException {
		FTPClient ftpClient = new FTPClient();
		FileOutputStream fos = new FileOutputStream(file);
		ftpClient.setBufferSize(1024);
		//设置文件类型（二进制） 
		ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
		boolean flag = ftpClient.retrieveFile(path, fos);
		logger.info("下载文件：" + flag);
		IOUtils.closeQuietly(fos);
		ftpClient.disconnect();
	}

	public void close() throws Exception {
		ftp.disconnect();
	}

	public static void main(String[] args) throws Exception {
		FtpUtils1 t = new FtpUtils1();
		boolean flag = t.connect("", "10.3.3.166", 21, "", "");
		System.out.println(flag);
		File file = new File("360压缩软件3.2.0.2070.exe");
		//t.upload(file, "/2013/10/31/965f77bb9ba249b995ddec3828c55b89.mp4");
		t.download(file, "");

	}
}