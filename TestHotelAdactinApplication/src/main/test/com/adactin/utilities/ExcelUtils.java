package com.adactin.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


/**
 * @author Swathi
 *
 */
public class ExcelUtils {

	public static XSSFWorkbook workBook;
	public static XSSFWorkbook workBookoutput;
	public static XSSFSheet sheet;
	public static XSSFSheet spreadsheet;
	public static XSSFRow header;
	public static XSSFRow row;
	public static Cell cell;
	static FileOutputStream fos = null;
    static File file;

	/**
	 * This method is used to read excel values
	 * @throws IOException
	 */
	public static void excelRead() throws IOException {
		FileInputStream fis = new FileInputStream(PropertyUtils.ExcelSheetPath);
		workBook = new XSSFWorkbook(fis);
	
	}
	

}