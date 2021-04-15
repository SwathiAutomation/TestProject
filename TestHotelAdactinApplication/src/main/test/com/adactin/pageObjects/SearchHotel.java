package com.adactin.pageObjects;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.utilities.ExcelUtils;

public class SearchHotel extends TestBase {

	public static ExcelUtils excelUtils;
	public static String location;
	public static String hotelsName;
	public static String roomType;
	public static String roomNo;
	public static Date checkInDate;
	public static Date checkOutDate;
	public static String adultsPerRoom;
	public static String childrenPerRoom;
	public static String SimpleDateFormat;

	public static void searchHotelForBooking() throws IOException

	{

		excelUtils.excelRead();

		excelUtils.sheet = excelUtils.workBook.getSheet("Search Hotel");

		location = excelUtils.sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("location---" + location);
		driver.findElement(By.id("location")).sendKeys(location);

		hotelsName = excelUtils.sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("hotelsName------" + hotelsName);
		driver.findElement(By.id("hotels")).sendKeys(hotelsName);

		roomType = excelUtils.sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println("roomType------" + roomType);
		driver.findElement(By.id("room_type")).sendKeys(roomType);

		roomNo = excelUtils.sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println("roomNo------" + roomNo);
		driver.findElement(By.id("room_nos")).sendKeys(roomNo);

		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
		checkInDate = excelUtils.sheet.getRow(1).getCell(4).getDateCellValue();
		String dateFormat1 = date1.format(checkInDate);
		WebElement datepikIn = driver.findElement(By.id("datepick_in"));
		datepikIn.clear();
		datepikIn.sendKeys(dateFormat1);
		System.out.println("dateFormat1------" + dateFormat1);

		SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
		checkOutDate = excelUtils.sheet.getRow(1).getCell(5).getDateCellValue();
		String dateFormat2 = date2.format(checkOutDate);
		WebElement datepikOut = driver.findElement(By.id("datepick_out"));
		datepikOut.clear();
		datepikOut.sendKeys(dateFormat2);
		System.out.println("dateFormat2------" + dateFormat2);

		adultsPerRoom = excelUtils.sheet.getRow(1).getCell(6).getStringCellValue();
		driver.findElement(By.id("adult_room")).sendKeys(adultsPerRoom);
		System.out.println("adultsPerRoom------" + adultsPerRoom);

		childrenPerRoom = excelUtils.sheet.getRow(1).getCell(7).getStringCellValue();
		driver.findElement(By.id("child_room")).sendKeys(childrenPerRoom);
		System.out.println("childrenPerRoom------" + childrenPerRoom);

		driver.findElement(By.id("Submit")).click();

	}
}
