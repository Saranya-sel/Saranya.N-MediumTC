
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.givetest;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MockTest {

	private WebDriver driver;
	private String baseUrl;
	private givetest MockTest;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		MockTest = new givetest(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		//1.Logging in as Trainer//
		MockTest.sendUserName("SaranLearner");
		MockTest.sendPassword("Learner135");
		MockTest.clickLoginBtn();
		Thread.sleep(3000);
		//2.Click on Course Catalog and search course
		MockTest.clickCatalog();
		MockTest.sendCoursename("Maths");
		MockTest.searchCourse();
		//3.Click on subcribe course to subscribe the course
		//MockTest.ClicksubcribeCourse();
		//screenShot.captureScreenShot("Course subscribed");
		//MockTest.cnsearchagain("Maths");
		//MockTest.searchagain();
		//4.click on course title
		MockTest.clickTitle();
		//5.Click on coursehome
		MockTest.clickCH();
		//6.Click on Test
		MockTest.ClickTest();
		//7.Click on test to be given
		MockTest.ClickMockTest();
		//8.Click on start test
		MockTest.ClickStartTest();
		//9.Move to frame to send answers
		MockTest.Movetoframe();
		Thread.sleep(3000);
		MockTest.SendAnswer();
		// 10. Click on end test
		Thread.sleep(5000);
		MockTest.EndTEST();
		
	    
		
	}
	
	
	
}
