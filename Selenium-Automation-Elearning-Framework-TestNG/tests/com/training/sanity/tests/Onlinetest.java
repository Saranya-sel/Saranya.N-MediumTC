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
import com.training.pom.assessmentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Onlinetest {

	private WebDriver driver;
	private String baseUrl;
	private assessmentPOM onlinetest;
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
		onlinetest = new assessmentPOM(driver); 
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
		onlinetest.sendUserName("SaranLearner");
		onlinetest.sendPassword("Learner135");
		onlinetest.clickLoginBtn();
		Thread.sleep(3000);
		//2.Click on course Catalog
		onlinetest.clickCatalog();
		onlinetest.sendCoursename("PM");
		onlinetest.searchCourse();
		// 3.Click on subscribe course for unsubcribed course
		//MockTest.ClicksubcribeCourse();
		//screenShot.captureScreenShot("Course subscribed");
		//MockTest.cnsearchagain("PM");
		//MockTest.searchagain();
		//4.Click on title
		onlinetest.clickTitle();
		//5.Click on CouseHome
		onlinetest.clickCH();
		//6.Click on assessment
		onlinetest.Clickassessment();
		//7.Click on test to be taken
		onlinetest.ClickMockTest1();
		//8.Click on start test
		onlinetest.ClickStartTest();
		//9.Move to frame to send answer
		onlinetest.Movetoframe();
		Thread.sleep(3000);
		onlinetest.SendAnswer();
		Thread.sleep(5000);
		//10.Click End Test
		onlinetest.EndTEST();
		
	    
		
	}
	
	
	
}



