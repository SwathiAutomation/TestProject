package com.adactin.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingConfirmation extends TestBase {
	public static String orderId=null;

	public static void myItinerarypage() {
		WebElement orderNumber = driver.findElement(By.id("order_no"));
		orderId = orderNumber.getAttribute("value");
		System.out.println("order id---" + orderId);
		driver.findElement(By.id("my_itinerary")).click();
	}

}
