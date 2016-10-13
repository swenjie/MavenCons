package com.ctvit.excel.poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParseExcel {
	/*
	 * 
	 * 
	 * */
	private List<String[]> rosolveFile(InputStream is, String suffix, int startRow)
			throws IOException, FileNotFoundException {

		// 根据两种xls 文件创建不同的对象进行解析
		Workbook xssfWorkbook = null;
		if ("xls".equals(suffix)) {
			xssfWorkbook = new HSSFWorkbook(is);
		} else if ("xlsx".equals(suffix)) {
			xssfWorkbook = new XSSFWorkbook(is);
		}

		Sheet xssfSheet = xssfWorkbook.getSheetAt(0);
		if (xssfSheet == null) {
			return null;
		}

		ArrayList<String[]> list = new ArrayList<String[]>();

		int lastRowNum = xssfSheet.getLastRowNum();

		for (int rowNum = startRow; rowNum <= lastRowNum; rowNum++) {
			// 在这里开始行循环 逐行检查数据

			if (xssfSheet.getRow(rowNum) != null) {
				// ----
				Row xssfRow = xssfSheet.getRow(rowNum);
				short firstCellNum = xssfRow.getFirstCellNum();
				short lastCellNum = xssfRow.getLastCellNum();

				if (firstCellNum != lastCellNum) {

					String[] values = new String[lastCellNum];

					for (int cellNum = firstCellNum; cellNum < lastCellNum; cellNum++) {

						// 在这里开始一行内逐列检查数据 行内一个一个Cell返回数据

						Cell xssfCell = xssfRow.getCell(cellNum);
						if (xssfCell == null) {
							values[cellNum] = "";
						} else {
							values[cellNum] = parseExcel(xssfCell);
						}

					}
					list.add(values);
				}
				// ----
			}
		}
		return list;
	}

	/*
	 * 
	 * 
	 */
	private String parseExcel(Cell cell) {
		String result = new String();
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_NUMERIC:// 数字类型
			if (HSSFDateUtil.isCellDateFormatted(cell)) {
				// 处理日期格式、时间格式
				SimpleDateFormat sdf = null;
				if (cell.getCellStyle().getDataFormat() == HSSFDataFormat.getBuiltinFormat("h:mm")) {
					sdf = new SimpleDateFormat("HH:mm");
				} else {// 日期
					sdf = new SimpleDateFormat("yyyy-MM-dd");
				}
				Date date = cell.getDateCellValue();
				result = sdf.format(date);
			} else if (cell.getCellStyle().getDataFormat() == 58) {
				// 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				double value = cell.getNumericCellValue();
				Date date = org.apache.poi.ss.usermodel.DateUtil.getJavaDate(value);
				result = sdf.format(date);

			} else {

				double value = cell.getNumericCellValue();
				CellStyle style = cell.getCellStyle();
				DecimalFormat format = new DecimalFormat();
				String temp = style.getDataFormatString();
				// 单元格设置成常规
				if (temp.equals("General")) {
					format.applyPattern("#");
				}
				result = format.format(value);
			}
			break;

		case HSSFCell.CELL_TYPE_STRING:// String类型
			result = cell.getRichStringCellValue().toString();
			break;

		case HSSFCell.CELL_TYPE_BLANK:
			result = "";
		default:
			result = "";
			break;
		}
		return result;
	}

	// ---------------------------------------------------------------------------------------------
	public List<Checkcar> createCheckCar(String fileName, String suffix) throws Exception, IOException {

		List<Checkcar> car = new ArrayList<Checkcar>();
		List<String[]> list = this.rosolveFile(new FileInputStream(fileName), "xls", 1);
		for (int i = 0; i < list.size(); i++) {
			String[] arr = list.get(i);
			Checkcar c = new Checkcar();
			c.setCarnumber(arr[0].trim());
			c.setCarstyle(arr[1].trim());
			c.setUsername(arr[2].trim());
			c.setTelnum(arr[3].trim());
			/*
			 * c.setCaryearcheck(Tools.formatString(arr[5].trim(),
			 * "yyyy-MM-dd")); c.setTowlevel(Tools.formatString(arr[6].trim(),
			 * "yyyy-MM-dd"));
			 * c.setTechnologylevel(Tools.formatString(arr[7].trim(),
			 * "yyyy-MM-dd"));
			 * c.setCompulsoryinsurance(Tools.formatString(arr[8].trim(),
			 * "yyyy-MM-dd"));
			 */
			car.add(c);
		}
		return car;
	}

	public static void main(String[] args) throws Exception, Exception {
		ParseExcel p = new ParseExcel();
		List<Checkcar> c = p.createCheckCar("d:\\检车信息备份文件2016-09-20.xls", "xls");
		List<Checkcar> c1 = p.createCheckCar("d:\\检车信息备份文件2016-09-20.xls", "xls");
		for (Checkcar listc : c1) {
			System.out.println("listc 汽车号："+listc.getCarnumber());
		
		}
		Set<Checkcar> set = new HashSet<Checkcar>();
		set.addAll(c);
		for (Checkcar setc : set) {
			System.out.println("setc 汽车号："+setc.getCarnumber());
			for (Checkcar listc : c1) {
				System.out.println("listc 汽车号："+listc.getCarnumber());
				if (!setc.getCarnumber().equals(listc.getCarnumber())) {
					System.out.println("比较后："+listc.getCarnumber());
					//只输出c1 的第一行值  并且 比总行少一个
					break;
				}
			}
		}
		for (Checkcar car : c) {
			System.out.println(car.getCarnumber());
		}
	}

}
