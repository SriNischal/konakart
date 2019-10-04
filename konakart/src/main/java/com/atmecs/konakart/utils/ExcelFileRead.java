package com.atmecs.konakart.utils;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.atmecs.konakart.constatnts.ProjectBaseConstantPaths;

public class ExcelFileRead {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet1;

	public ExcelFileRead(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getData(int index, int rowNum, int cellNum) {
// DataFormatter formatter = new DataFormatter();
		sheet1 = workbook.getSheetAt(index);
		String data = sheet1.getRow(rowNum).getCell(cellNum).getStringCellValue();

		return data;
	}

	public int totalRowsinSheet(int sheet) {
		int rowCount = workbook.getSheetAt(0).getLastRowNum();
		System.out.println("Total number of Row Count in sheet is: " + rowCount);
		return rowCount;
	}

	public int totalColsinSheet(int sheetIndex) {
		int colCount = workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();

		return colCount;
	}

	public static void main(String[] args) {
		ExcelFileRead read = new ExcelFileRead(ProjectBaseConstantPaths.TESTDATA_FILE);
		read.totalRowsinSheet(0);
		System.out.println("Total number of Column Count in sheet is :" + read.totalColsinSheet(0));
		String str = read.getData(0, 0, 0);
		System.out.println("string is " + str);

	}
}