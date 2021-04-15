package com.adactin.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.adactin.utilities.ExcelUtils;

public class BookHotel extends TestBase {
	
	public static ExcelUtils excelUtils;
	public static String firstName;
	public static String lastName;
	public static String billingAddress;
	public static double creditCardNo;
	public static String creditCardType;
	public static String expiryMonth;
	public static int expiryYear;
	public static int cvv;

	

	public static void bookHotelwithvalidValues() throws IOException {
		excelUtils.excelRead();
		
		excelUtils.sheet = excelUtils.workBook.getSheet("Book Hotel");

		firstName = excelUtils.sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("firstName---" + firstName);
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		
		lastName = excelUtils.sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("lastName------" + lastName);
		driver.findElement(By.id("last_name")).sendKeys(lastName);

		billingAddress = excelUtils.sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println("billingAddress---" + billingAddress);
		driver.findElement(By.id("address")).sendKeys(billingAddress);
		
		creditCardNo = excelUtils.sheet.getRow(1).getCell(3).getNumericCellValue();
		System.out.println("creditCardNo---" + creditCardNo);
		driver.findElement(By.id("cc_num")).sendKeys(String.valueOf(creditCardNo));
		
		creditCardType = excelUtils.sheet.getRow(1).getCell(4).getStringCellValue();
		System.out.println("creditCardType---" + creditCardType);
		driver.findElement(By.id("cc_type")).sendKeys(creditCardType);
		
		expiryMonth = excelUtils.sheet.getRow(1).getCell(5).getStringCellValue();
		System.out.println("expiryMonth---" + expiryMonth);
		driver.findElement(By.id("cc_exp_month")).sendKeys(expiryMonth);
		
		expiryYear = (int) excelUtils.sheet.getRow(1).getCell(6).getNumericCellValue();
		System.out.println("expiryYear---" + expiryYear);
		driver.findElement(By.id("cc_exp_year")).sendKeys(String.valueOf(expiryYear));
		
		cvv = (int) excelUtils.sheet.getRow(1).getCell(7).getNumericCellValue();
		System.out.println("cvv---" + cvv);
		driver.findElement(By.id("cc_cvv")).sendKeys(String.valueOf(cvv));
		
		driver.findElement(By.id("book_now")).click();

	}
}
