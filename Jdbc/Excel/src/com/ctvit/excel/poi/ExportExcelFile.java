package com.ctvit.excel.poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;


public class ExportExcelFile {
	
	public static void main(String[] args) {
		String path="d:";
		List<Checkcar> list=new ArrayList<Checkcar>();
		for(int i=0;i<1000;i++)
		list.add(new Checkcar("car"+i, "user"+i, "东方红"+i, "18888888"+i));
		new ExportExcelFile().exprotExcelFile(list, path);
	}

	public void exprotExcelFile(List<Checkcar> list, String path) {
		try {
			// 第一步，创建一个webbook，对应一个Excel文件
			HSSFWorkbook workbook = new HSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			HSSFSheet sheet = workbook.createSheet("Sheet1");
			// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
			HSSFRow row = sheet.createRow((int) 0);

			// 第四步，创建单元格，并设置值表头 设置表头居中

			HSSFCellStyle style = workbook.createCellStyle();
			style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
			sheet.setColumnWidth(0, 3766);
			sheet.setColumnWidth(1, 4766);
			sheet.setColumnWidth(2, 3766);
			sheet.setColumnWidth(3, 3766);
			sheet.setColumnWidth(4, 3766);
			sheet.setColumnWidth(5, 3766);
			sheet.setColumnWidth(6, 3766);
			sheet.setColumnWidth(7, 3766);
			sheet.setColumnWidth(8, 3766);
			// 设置这些样式
			style.setFillForegroundColor(HSSFColor.YELLOW.index);
			style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			style.setBorderRight(HSSFCellStyle.BORDER_THIN);
			style.setBorderTop(HSSFCellStyle.BORDER_THIN);
			// 生成一个字体
			HSSFFont font = workbook.createFont();
			font.setColor(HSSFColor.VIOLET.index);
			font.setFontHeightInPoints((short) 14);
			font.setColor((short) 160);
			font.setFontName("宋体");
			// font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			// 把字体应用到当前的样式
			style.setFont(font);

			// 生成并设置另一个样式
			HSSFCellStyle style2 = workbook.createCellStyle();
			style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			// 生成另一个字体
			HSSFFont font2 = workbook.createFont();
			font2.setColor(HSSFColor.VIOLET.index);
			font2.setFontHeightInPoints((short) 12);
			font2.setColor((short) 160);
			font2.setFontName("宋体");
			// 把字体应用到当前的样式
			style2.setFont(font2);

			HSSFCell cell = row.createCell(0);
			cell.setCellValue("车辆号码");
			cell.setCellStyle(style);
			cell = row.createCell(1);

			cell.setCellValue("车  型");
			cell.setCellStyle(style);
			cell = row.createCell(2);

			cell.setCellValue("姓 名");
			cell.setCellStyle(style);
			cell = row.createCell(3);

			cell.setCellValue("电话号码一");
			cell.setCellStyle(style);
			cell = row.createCell(4);

			/*
			 * cell.setCellValue("电话号码二"); cell.setCellStyle(style); cell =
			 * row.createCell( 5); cell.setCellValue("年检日期");
			 * cell.setCellStyle(style);
			 * 
			 * cell = row.createCell( 6); cell.setCellValue("二保日期");
			 * cell.setCellStyle(style); cell = row.createCell( 7);
			 * cell.setCellValue("营运证日期"); cell.setCellStyle(style); cell =
			 * row.createCell( 8); cell.setCellValue("保险日期");
			 * cell.setCellStyle(style);
			 */

			// 第五步，写入实体数据 实际应用中这些数据从数据库得到，

			if (list != null && list.size() > 0) {

				for (int i = 0; i < list.size(); i++) {

					row = sheet.createRow((int) i + 1);

					Checkcar car = list.get(i);

					// 第四步，创建单元格，并设置值
					// 添加车牌号信息到excel单元格中--------------
					cell = row.createCell(0);
					cell.setCellValue(car.getCarnumber());
					// 设置该单元格样式
					cell.setCellStyle(style2);
					// --------------------------------------

					// 添加汽车类型信息到excel单元格中------------
					cell = row.createCell(1);
					cell.setCellValue(car.getCarstyle());
					// 设置该单元格样式
					cell.setCellStyle(style2);
					// --------------------------------------

					// 添加车主姓名信息到excel单元格中------------
					cell = row.createCell(2);
					cell.setCellValue(car.getUsername());
					// 设置该单元格样式
					cell.setCellStyle(style2);

					// 添加电话号码信息到excel单元格中---------
					cell = row.createCell(3);
					cell.setCellValue(car.getTelnum());
					// 设置该单元格样式
					cell.setCellStyle(style2);

					// --------------------------------------

					// 添加电话号码(一)信息到excel单元格中---------
					/*
					 * cell = row.createCell( 3);
					 * cell.setCellValue(car.getPhonenum());
					 */
					// 设置该单元格样式
					// cell.setCellStyle(style2);
					// --------------------------------------

					// --------------------------------------

					// 添加年检时间到excel单元格中----------------
					// cell = row.createCell(5);
					// cell.setCellValue(car.getCaryearcheck()!= null?new
					// SimpleDateFormat("yyyy-MM-dd").format(car.getCaryearcheck()):"");
					// 设置该单元格样式
					// cell.setCellStyle(style2);
					// ----------------------------------------

					// 添加二级维护时间到excel单元格中--------------
					// cell = row.createCell(6);
					// cell.setCellValue(car.getTowlevel()!= null?new
					// SimpleDateFormat("yyyy-MM-dd")
					// .format(car.getTowlevel()):"");
					// 设置该单元格样式
					// cell.setCellStyle(style2);
					// ----------------------------------------

					// 添加技术等级时间到excel单元格中--------------
					// cell = row.createCell(7);
					// cell.setCellValue(car.getTechnologylevel()!= null?new
					// SimpleDateFormat("yyyy-MM-dd")
					// .format(car.getTechnologylevel()):"");
					// 设置该单元格样式
					// cell.setCellStyle(style2);
					// -----------------------------------------

					// 添加强制保险时间到excel单元格中---------------
					// cell = row.createCell(8);
					// cell.setCellValue(car.getCompulsoryinsurance()!= null?new
					// SimpleDateFormat("yyyy-MM-dd")
					// .format(car.getCompulsoryinsurance()):"");
					// 设置该单元格样式
					// cell.setCellStyle(style2);
					// -----------------------------------------
				}
			}
			// 第六步，将文件存到指定位置

			FileOutputStream fout = new FileOutputStream(
					path + "/检车信息备份文件" + new 
					SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".xls");
			workbook.write(fout);
			fout.close();
		} catch (Exception e) {
			String msg = e.getMessage();
			if (msg != null && msg.indexOf("\\") != -1) {
				String flag = msg.substring(msg.lastIndexOf("\\") + 1);
				System.out.println(flag+"请查看该文件是否处于打开状态");
			} 

		} 
	}
}
