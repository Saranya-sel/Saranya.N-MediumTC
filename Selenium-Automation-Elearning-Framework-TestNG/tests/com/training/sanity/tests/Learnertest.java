package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LearnerPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Learnertest {

	private WebDriver driver;
	private String baseUrl;
	private LearnerPOM tpp;
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
		tpp = new LearnerPOM(driver); 
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
						tpp.sendUserName("Saranya_sel"); 
						tpp.retriveun();
					    tpp.sendPassword("Hanshi135");
						Thread.sleep(3000); 
						tpp.clickLoginBtn(); 
						Thread.sleep(3000);
						
				//Click on the course and create the test//
						 tpp.ClickProject();
						 tpp.ClickTest();
						 tpp.ClickCreateTest();
						 
						 //Send test title//
						 tpp.SendTestTitle("Onlinetest5");
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
						 
						//Adding 2 question and answer//
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
						 tpp.clickLogout();
						 
						//Logging in as Learner//
							tpp.sendUserName("SaranLearner");
							tpp.retriveun();
							tpp.sendPassword("Learner135");
							Thread.sleep(3000); 
							tpp.clickLoginBtn(); 
							 Thread.sleep(3000);
							 tpp.clickCatalog();
								tpp.sendCoursename("Maths");
								tpp.searchCourse();
								tpp.clickTitle();
								tpp.clickCH();
								tpp.Clicktesticon();
								//Click on Start test and giving Answers//
								tpp.clickTest();
								tpp.ClickStartTest();
								tpp.SelectAns1();
								tpp.SavetAns1();
								tpp.SelectAns2();
								tpp.SavetAns2();
								Thread.sleep(3000);
								tpp.ClickIcon();
								tpp.clickLogout();
								
								//Loin as Admin//
								tpp.sendUserName("admin");
								tpp.retriveun();
								tpp.sendPassword("admin@123");
								Thread.sleep(3000); 
								tpp.clickLoginBtn(); 
								 Thread.sleep(3000);
								 //Click on reporting tab//
								 tpp.ClickReportingTab();
								 //click on followed Students//
								tpp.clickstudent();
								//give Student name as keyword to search//
								 tpp.sendLearner("saranya");
								 tpp.ClickSearch();
								 Thread.sleep(3000);
								 tpp.ClickSaranya();
								 //Click the course for which test is to be corrected//
								 tpp.clickM1();
								 Thread.sleep(3000);
								 tpp.clickT();
								  Thread.sleep(3000);
								  //sending mail to learner//
								 tpp.SendMail();
								 tpp.CorrectTest();
								 screenShot.captureScreenShot("Mailsent");
								 String actual= driver.findElement(By.xpath("//*[contains(text(),'Message Sent')]")).getText();
								 System.out.println(actual);
								Assert.assertEquals(actual, "Message Sent");
								tpp.clickLogout();
								  
				
				
			}
			
		
				
		
		
	}
	