package com.atmecs.konakart.utils;

import java.io.IOException;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.DataProvider;

public class KonakartpagexlsxReader {

	Object[][] object;
	Konakartpagexlsx provider;

	public KonakartpagexlsxReader() {
		provider = new Konakartpagexlsx("C:\\Users\\Srinischal.Thiparani\\eclipse-workspace\\konakart\\konakartpage.xlsx");

	}

	@DataProvider(name = "destination")
	public Object[][] provideData() {

		Iterator<Row> rows = null;
		try {
			rows = Konakartpagexlsx.getData();

			int noOfRows = provider.getNoOfRows();
			System.out.println(noOfRows);
			int noOfColumns = provider.getNoOfColumns();
			System.out.println(noOfColumns);
			object = new Object[noOfRows][noOfColumns];

		} catch (IOException e) {
			System.out.println("Exception");
		}
		int i = 0;
		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> iterator = row.cellIterator();
			int j = 0;
			while (iterator.hasNext()) {
				Cell cell = iterator.next();
				object[i][j] = cell.toString();
				j++;
			}
			i++;
		}
		return object;
	}
}