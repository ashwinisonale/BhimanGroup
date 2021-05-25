package com.BhimanGroup.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testutil {
	
	public static Object[][] getValidInvalidTestDataFromExcel(String path, String sheetName,Integer colNumber) {
		Object[][] data = null;
		try {
			FileInputStream inputstream = new FileInputStream(new File(path));
			XSSFWorkbook book = new XSSFWorkbook(inputstream);
			Sheet sheet = book.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			DataFormatter formatter=new DataFormatter();
			
			data = new Object[rowCount][colNumber];
			Iterator<Row> rowIterator = sheet.iterator();
			int nums = 0;
			rowIterator.next();
			while (rowIterator.hasNext()) {
				Row nextRow = rowIterator.next();

				Iterator<Cell> cellIterator = nextRow.cellIterator();
				int cellNum = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
						String value=formatter.formatCellValue(cell);
						data[nums][cellNum++]=value;
						
					/*
					 * switch (cell.getCellTypeEnum()) { case STRING: data[nums][cellNum++] =
					 * cell.getStringCellValue(); break;
					 * 
					 * case BOOLEAN: data[nums][cellNum++] = cell.getBooleanCellValue(); break;
					 * 
					 * case NUMERIC: data[nums][cellNum++] = cell.getNumericCellValue(); break;
					 * 
					 * case BLANK: data[nums][cellNum++] = cell.getStringCellValue();
					 * 
					 * default: break; }
					 */	
						}
				nums++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
