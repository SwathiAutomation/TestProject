package com.adactin.utilities;

import java.util.Properties;

/**
 * @author Swathi
 *
 */
public class PropertyUtils {

	public static String Url;
	public static String ExcelSheetPath;
	public static String browserName;

	/**
	 * This method is used to read properties file and stores the data
	 * 
	 */
	public static void initProperties() {

		try {
			initTestProperties();
			Properties properties = CommonUtil.getProperties(
					"E:\\Adactin\\TestHotelAdactinApplication\\src\\main\\resources\\main.properties");
			Url = properties.getProperty("url");
			browserName = properties.getProperty("browser");
			System.out.println(browserName);
		} catch (Exception ex) {
			System.out.println("Exception occured in initProperties");
		}
	}

	public static void initTestProperties() {
		try {
			Properties properties = CommonUtil.getProperties(
					"E:\\Adactin\\TestHotelAdactinApplication\\src\\main\\test\\test\\resources\\test.properties");
			ExcelSheetPath = CommonUtil.getPropertiesValue(properties, "excelPath");
			
		} catch (Exception ex) {
			System.out.println("Exception occured in initTestProperties");
		}
	}
	public static void main(String args[])
	{
		initProperties();
	}
}
