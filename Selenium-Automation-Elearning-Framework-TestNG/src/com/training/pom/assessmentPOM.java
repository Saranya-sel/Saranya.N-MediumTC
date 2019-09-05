package com.training.pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class assessmentPOM {
	private WebDriver driver; 
	
	public assessmentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
    private WebElement loginBtn; 
	
	@FindBy(xpath="//*[contains(text(),'Course catalog')]")
    private WebElement coursecatalog; 
	@FindBy(name="search_term")
    private WebElement courseName; 
	
	@FindBy(xpath="//*[@class='btn btn-default']")
    private WebElement couseNamesearch; 
	
	
	
	//@FindBy(xpath="//*[@class='col-sm-8']/a")
    //private WebElement clicksubscribecourse;
	
	//@FindBy(name="search_term")
    //private WebElement CNsearchagain;
	
	//@FindBy(xpath="//*[@class='btn btn-default']")
   // private WebElement clicksearchagain; 
	
	@FindBy(xpath="//*[@class='title']/a")
    private WebElement clicktitle; 
	
	@FindBy(xpath="//*[@class='session-subscribe']/a")
    private WebElement clickch; 
	
	@FindBy(xpath="//*[contains(text(),'Assessments')]")
    private WebElement clickassicon; 
	
	@FindBy(xpath="//*[contains(text(),'MockTest1')]")
	private WebElement clickmocktest;
	
	
	
	@FindBy(xpath="//*[@class='btn btn-success btn-large']")
    private WebElement clickstarttest;
	
	@FindBy(xpath="//*[@class='cke_wysiwyg_frame cke_reset']")
    private WebElement iframe;
	
	@FindBy(css="body")
    private WebElement sendanswer;
	
	@FindBy(name="save_now")
	private WebElement endtest;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		
		
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCatalog() {
		this.coursecatalog.click(); 
	}
    
 
	public void sendCoursename(String courseName) {
		this.courseName.clear();
		this.courseName.sendKeys(courseName);
	
}
public void searchCourse() {
		
		this.couseNamesearch.click();
		
	}


//public void ClicksubcribeCourse() {
	
//this.clicksubscribecourse.click();
//}


//public void cnsearchagain(String cn) {
	
	//this.CNsearchagain.sendKeys(cn);
	
//}


//public void searchagain() {
	
	//this.clicksearchagain.click();
	
//}


public void clickTitle() {
	
	this.clicktitle.click();
	
}

public void clickCH() {
	
	this.clickch.click();
}

public void Clickassessment() {
	
	this.clickassicon.click();
	
}
public void ClickMockTest1() {
	
	this.clickmocktest.click();
	
}

public void ClickStartTest() {
	
	this.clickstarttest.click();
	
}

public void Movetoframe() {
	
	driver.switchTo().frame(iframe);
	
	System.out.println("Move to Frame");
}

public void SendAnswer() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>SProjectManagement</h1>'", sendanswer);
	
	driver.switchTo().defaultContent();
}


public void EndTEST() {
	
	this.endtest.click();
	
}



}
