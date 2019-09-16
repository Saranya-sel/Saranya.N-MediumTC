package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.TrainerPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TrainerDBtest {
	private WebDriver driver;
	private String baseUrl;
	private TrainerPOM tpp;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		tpp = new TrainerPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String password ) throws InterruptedException {
		// for demonstration 
     //	genericMethods.getElement("login", "id"); 
				
		
		//Logging in as Trainer//
		tpp.sendUserName("Saranya_sel"); 
	    tpp.sendPassword("Hanshi135");
		Thread.sleep(3000); 
		tpp.login();
		Thread.sleep(3000);
		
//Click on the course and create the test//
		 tpp.ClickProject();
		 tpp.ClickTest();
		 tpp.ClickCreateTest();
		 
		 //Send test title//
		 tpp.SendTestTitle("OnlineTest5");
		 tpp.ClickAdvancedSetting();
		 tpp.Movetoframe();
		 tpp.Editable();
		 tpp.EnableStart();
		 tpp.ClickRadiobutton();
		 
		 //Changing the correct time when we are starting the test//
		 tpp.clickChangeTime();
		 tpp.ChangeTime();
		 tpp.clickDone();
		 
		 //sending the pass percentage//
		 tpp.SendPassPercent("60");
		 tpp.proceed();
		 tpp.ClickMC();
		 
		 //set the questions and answers and save//
		 tpp.Sendquestion("which course your learning");
		 tpp.Movetoans1frame();
		 tpp.SendAnswer1();
		 tpp.Movetoans2frame();
		 tpp.SendAnswer2();
		 tpp.Movetoans3frame();
		 tpp.SendAnswer3();
		 tpp.Movetoans4frame();
		 tpp.SendAnswer4();
		 tpp.Enableans1();
		 tpp.Marksq1("5");
		 Thread.sleep(3000);
		 tpp.AddQ();
		 
		//Adding 2 question//
		 tpp.ClickMC2();
		 tpp.Sendquestion2("Level of Testing");
		 tpp.Movetoans1frameq2();
		 tpp.SendAnswer1q2();
		 tpp.Movetoans2frameq2();
		 tpp.SendAnswer2q2();
		 tpp.Movetoans3frameq2();
		 tpp.SendAnswer3q2();
		 tpp.Movetoans4frameq2();
		 tpp.SendAnswer4q2();
		 tpp.Enableans1q2();
		 tpp.Marksq2("5");
		 Thread.sleep(3000);
		 tpp.AddQ2();
		 
		 //Preview the questions and save the answers//
		 tpp.Clickpreview();
		 tpp.ClickStartTest();
		 tpp.SelectAns1();
		 tpp.SavetAns1();
		 tpp.SelectAns2();
		 tpp.SavetAns2();
		 tpp.ClickIcon();
		 tpp.ClickLOGOUT();
		 
        // Login as admin//
		 
		 tpp.sendUserName(userName);
		 tpp.sendPassword(password);
		 tpp.login();
		 tpp.ClickReporting();
		 tpp.ClickFollowedTeachers();
		 tpp.ClickName();
		 tpp.ClickMaths();
		 tpp.clickTest();
		 tpp.SendMail();
		 tpp.CorrectTest();
		 String actual= driver.findElement(By.xpath("//*[contains(text(),'Message Sent')]")).getText();
		 System.out.println(actual);
		Assert.assertEquals(actual, "Message Sent");
		tpp.ClickLOGOUT();
		  
		


}
		
	}