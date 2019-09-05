 package com.training.sanity.tests;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.add;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddTest {

	private WebDriver driver;
	private String baseUrl;
	private add addpd;
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
		addpd = new add(driver); 
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
		//Logging in as Trainer//
		addpd.sendUserName("Saranya_sel");
		
		//Fetching username and pwd on console using getattribute//
	     addpd.retriveun();
       addpd.sendPassword("Hanshi135");
       addpd.retrivepwd();
		addpd.clickLoginBtn();
		Thread.sleep(3000);
		//1. Click on  projectCatalog
		addpd.clickPI();
		Thread.sleep(3000);
		//2. click on project icon
        addpd.clickNewPI();   
		Thread.sleep(3000);
		//3.click on Create New Project Icon
		addpd.createNewPI();
		Thread.sleep(3000);
		//4.Send title and subTitle
		addpd.sendTitle("Testing");
		addpd.sendSubtitle("ST");
		addpd.clickSave();
		
		
		Thread.sleep(5000);
		screenShot.captureScreenShot("Project Added");
		
		
		
		//5.click on Project Added
		addpd.clickProjectadded();
		Thread.sleep(3000);
		
		//Using assert checking Welcome message
		String actual= driver.findElement(By.xpath("//*[@class='title-post']")).getText();
		Assert.assertEquals(actual, "Welcome !");
	   System.out.println(actual);
	   screenShot.captureScreenShot("Welcome to Project");
		
		//6.Click on New Task
		addpd.clickNewtask();
		Thread.sleep(3000);
		//7. send title as design
		addpd.sendPosttitle("design");
		addpd.clicktitleSave();
		Thread.sleep(3000);
		//8. Click on Role Management icon
		addpd.clickRoleMgmnticon();
		Thread.sleep(3000);
		//9.Add a new Role
		addpd.addnewrole();
		Thread.sleep(3000);
		//10.send role title as developer and save it
		addpd.sendRoletitle("developer");
		
		addpd.saveRoleTitle();
		Thread.sleep(3000);
		//11.Click on assign Role
		addpd.clickAssignrole();
	Thread.sleep(3000);
	//12.Click on dropdown and select the name and the role and Validate
	    addpd.Dropdown1();
	    Thread.sleep(5000);
	     addpd.ClickValidate();
	     //13.Click on User Management
		addpd.ClickUserManagement();
		//14.Click on checkbox which name is to registered
		addpd.EnableIcon();
		//Click on Register
		addpd.Register();
		
		screenShot.captureScreenShot("Registered");
		
	}
	
	
	
}
