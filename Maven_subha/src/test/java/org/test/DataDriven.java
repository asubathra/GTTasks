package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class DataDriven {
public static void main(String[] args) throws IOException {
	File f = new File("D:\\SubathraSpace\\eclipse-workspace\\Maven_subha\\excel\\DATA.xlsx");
	FileInputStream fis = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fis);
	Sheet mysheet = w.getSheet("SAMPLE DATAS");
	
	Row r = mysheet.getRow(2);
	Cell c = r.getCell(1);
	int cellType =c.getCellType();
	if(cellType ==1) {
		String value =c.getStringValue()
	}
	else if (Dateutil.isDateCellFormatted(c)) {
		Date dd = c.getDateCellValue();
		SimpleDateFormat sim = new SimpleDateFormat("dd:mm:yyyy");
		value =sim.format(dd);
	}
	else {double d = c.getNumeicCellValue();
	long l = (long)d;
	value = String.valueOf(false);
	
	}
	}
}
 
