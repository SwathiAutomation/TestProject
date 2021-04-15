package com.adactin.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class SelectHotel extends TestBase {
	public static void selectHotelForBooking()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.id("continue")).click();
				
	}
	

}
