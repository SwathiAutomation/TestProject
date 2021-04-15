package com.adactin.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Swathi
 *
 */
public class CommonUtil {

	/**
	 * @param propertiesFilePath PropertiesFile Path
	 * @return
	 */
	public static Properties getProperties(String propertiesFilePath) {
		Properties properties = null;
		try {
			File file = new File(propertiesFilePath);
			FileInputStream fileInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Exception occured fileNotFoundException");
		} catch (IOException ioException) {
			System.out.println("Exception occured IOException");
		}
		return properties;
	}

	/**
	 * @param properties Properties
	 * @param propertieKey Propertie Key
	 * @return
	 */
	public static String getPropertiesValue(Properties properties,
			String propertieKey) {
		String propertieValue = null;

		try {
			propertieValue = properties.getProperty(propertieKey);
		} catch (Exception exception) {
			System.out.println("Exception occured getPropertiesValue");
		}
		return propertieValue;
	}

}
