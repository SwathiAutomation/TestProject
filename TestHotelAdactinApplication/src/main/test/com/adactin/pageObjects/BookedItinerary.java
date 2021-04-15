	package com.adactin.pageObjects;
	
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	
	public class BookedItinerary extends TestBase {
	
		public static BookingConfirmation bookingConfirmation;
	
		public static void cancelBookedHotel() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
			driver.findElement(By.id("order_id_text")).sendKeys(bookingConfirmation.orderId);
			System.out.println("booked itinerary---" + bookingConfirmation.orderId);
	
			driver.findElement(By.id("search_hotel_id")).click();
	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type='button']")).click();
			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("Deleted successfully");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("order_id_text")).sendKeys(bookingConfirmation.orderId);
			System.out.println("booked itinerary---" + bookingConfirmation.orderId);
			driver.findElement(By.id("search_hotel_id")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Show all")).click();
		}
	}
