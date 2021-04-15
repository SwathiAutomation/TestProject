package com.adactin.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;

import com.adactin.utilities.ExcelUtils;

public class LoginPage extends TestBase {
	public static ExcelUtils excelUtils;
	public static String username;
	public static String password;
	public static String currentPassword;
	public static String newPassword;
	public static String confirmPassword;
	

	public static void loginwithValidCredentials() throws IOException {

		excelUtils.excelRead();

		excelUtils.sheet = excelUtils.workBook.getSheet("Login Page");

		username = excelUtils.sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("username---" + username);
		password = excelUtils.sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Password------" + password);

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();

	}

	public static void changePassword() {
		excelUtils.sheet = excelUtils.workBook.getSheet("Change Password");
		driver.findElement(By.linkText("Change Password")).click();
		currentPassword = excelUtils.sheet.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.id("current_pass")).sendKeys("Test");
		newPassword = excelUtils.sheet.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("new_password")).sendKeys(newPassword);
		confirmPassword = excelUtils.sheet.getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("re_password")).sendKeys(confirmPassword);
		driver.findElement(By.id("Submit")).click();

	}

	public static void logOut() {
		driver.findElement(By.linkText("Logout")).click();

	}

}
