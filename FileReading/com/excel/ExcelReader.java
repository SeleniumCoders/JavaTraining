package com.excel;

import java.io.File;
import java.io.FileInputStream;
public class ExcelReader {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream(new File(".//ReasourceFiles//DataFile.xlsx"));
		//XSSFWorkbook workbook = new XSSFWorkbook(file);
		//System.out.println(workbook.getNumberOfSheets());
		
	}

}
