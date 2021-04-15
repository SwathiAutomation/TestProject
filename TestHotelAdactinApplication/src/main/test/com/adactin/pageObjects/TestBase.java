package com.adactin.pageObjects;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.adactin.utilities.BrowserUtils;
import com.adactin.utilities.PropertyUtils;

public class TestBase extends BrowserUtils {
	public static BrowserUtils browserUtils;
	public static PropertyUtils propertyUtils;
	public static LoginPage loginPage;
	public static SearchHotel searchHotel;
	public static SelectHotel selectHotel;
	public static BookHotel bookHotel;
	public static BookingConfirmation bookingConfirmation;
	public static BookedItinerary bookedItinerary;

	public static Logger logger = Logger.getLogger(TestBase.class);

	@BeforeClass
	public static void setUp() throws Exception {
		browserUtils.openBrowser();
		driver.get(propertyUtils.Url);
		driver.manage().window().maximize();
		logger.info("Driver launched successfully");
	}

	@Test
	public static void allPages() throws IOException {
		loginPage.loginwithValidCredentials();
		logger.info("Login page launched successfully");
		searchHotel.searchHotelForBooking();
		logger.info("Search hotel successfully");
		selectHotel.selectHotelForBooking();
		logger.info("Select hotel successfully");
		bookHotel.bookHotelwithvalidValues();
		logger.info("Book hotel successfully");
		bookingConfirmation.myItinerarypage();
		logger.info("Book confirmation success");
		bookedItinerary.cancelBookedHotel();
		logger.info("Booked itinerary successfully");

	}

	@AfterClass
	public static void close() {
		loginPage.changePassword();
		// loginPage.logOut();
		// driver.quit();
		logger.info("logged out successfully");
	}

}
