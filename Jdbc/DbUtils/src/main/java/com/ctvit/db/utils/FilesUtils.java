package com.ctvit.db.utils;

import java.io.File;import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

public class FilesUtils {

	private static final Logger logger=Logger.getLogger(FilesUtils.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="E:\\pic";
		System.out.println(filePath);
		List<String> filelist=new ArrayList<String>();
		reNameFiles(filePath, filelist);
	}
	
	public static List<String> reNameFiles(String filePath,List<String> filelist)
	{
		File root=new File(filePath);
		if(!root.exists()){
			logger.info(filePath+"  not exist!");
			System.out.println("not exits");
		}else{
			File[] files=root.listFiles();
			Arrays.sort(files,new FilesUtils.CompratorByLastModified());
			
			for(int i=0;i<files.length;i++){
				File file=files[i];
				if(file.isDirectory()){
					reNameFiles(file.getAbsolutePath(), filelist);
				}else{
					filelist.add(file.getAbsolutePath());
					String parentPath=file.getParent()+File.separator;
					String prefix=getFileExtendName(file);
					file.renameTo(new File(parentPath+TimeUtils.getDateForPattern(Constants.DATE_FORMAT_SSS)+"1"+prefix));
				}
			}
			
			
//			for(File file:files){
//				if(file.isDirectory()){
//					reNameFiles(file.getAbsolutePath(),filelist);
//				}else{
//					filelist.add(file.getAbsolutePath());
//					//System.out.println("FileAbsolutePath:"+file.getAbsolutePath());
//					//System.out.println("FileName:"+file.getName());
//					file.renameTo(new File(file.getPath()+"1"+file.getName()));
//					//System.out.println(file.getPath());
//					System.out.println(file.getParent());
//				}
//			}
		}
		
		return filelist;
	}
	public static String getFileExtendName(File file){
		String fileName=file.getName();
		String prefix=fileName.substring(fileName.lastIndexOf(".")+1);
		return "."+prefix;
	}
	
	//利用递归思想完成文件的遍历和排序
	public static List<String> getFiles(String filePath,List<String> filelist)
	{
		File root=new File(filePath);
		if(!root.exists()){
			logger.info(filePath+"  not exist!");
		}else{
			File[] files=root.listFiles();
			Arrays.sort(files,new FilesUtils.CompratorByLastModified());
			for(File file:files){
				if(file.isDirectory()){
					getFiles(file.getAbsolutePath(),filelist);
				}else{
					filelist.add(file.getAbsolutePath());
				}
			}
		}
		
		return filelist;
	}
	//根据文件修改时间进行比较的内部类
	static class CompratorByLastModified implements Comparator<File>{

		@Override
		public int compare(File o1, File o2) {
			long diff=o1.lastModified()-o2.lastModified();
			if(diff>0){
				return 1;
			}else if(diff==0){
				return 0;
			}else{
				return -1;
			}
		}
		
	}
	

}
