package com.training.pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TPPOM2 {
	public WebDriver driver; 
	
	public TPPOM2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	public WebElement userName; 
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(name="submitAuth")
   public WebElement loginBtn; 
	
	@FindBy(xpath="//*[contains(text(),'Course catalog')]")
    public WebElement coursecatalog; 
	@FindBy(name="search_term")
    public WebElement courseName; 
	
	@FindBy(xpath="//*[@class='btn btn-default']")
    public WebElement couseNamesearch; 
	
	@FindBy(xpath="//*[@class='title']/a")
   public WebElement clicktitle; 
	
	@FindBy(xpath="//*[@class='session-subscribe']/a")
   public WebElement clickch; 
	
	@FindBy(xpath="//*[contains(text(),'Tests')]")
    public WebElement clicktesticon; 
	
	@FindBy(xpath="//*[contains(text(),'Onlinetest5')]")
	public WebElement clickonlinetest;
	
	@FindBy(xpath="//*[@class='btn btn-success btn-large']")
	public WebElement clickstarttest; 
	
	
	@FindBy(xpath="//*[contains(text(),'Selenium')]")
	public WebElement selectans1;
	
	@FindBy(name="save_now")
	public WebElement saveans1;
	
	@FindBy(xpath="//*[contains(text(),'ST')]")
	public WebElement selectans2;
	
	@FindBy(name="save_now")
	public WebElement saveans2;
	
	@FindBy(id="logout_button")
	private WebElement clicklogout;
	
	
	
	@FindBy(xpath="//*[contains(text(),'Reporting')]")
	private WebElement clickreporting;
	
	@FindBy(xpath="//*[contains(text(),'Followed students')]")
	private WebElement clickfollowedstudents;
	
	
	@FindBy(id="search_user_keyword")
	private WebElement sendln;
	
	@FindBy(id="search_user_submit")
	private WebElement clicksearch;
	
	
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[3]/table/tbody/tr[2]/td[1]/a")
	private WebElement clickname;
	
	
	@FindBy(xpath="//*[ @class='table table-striped table-hover courses-tracking']/tbody/tr[10]/td[7]/a")
	private WebElement clickm;
	
	@FindBy(xpath="//*[@id='cm-content']/div/div[8]/table/tbody/tr[7]/td[5]/a")
	private WebElement clickt;
	
	
	
	@FindBy(xpath="//*[@name='send_notification' and @value='1']")
	private WebElement enableemail;
	
	@FindBy(id="form-email_submit")
    private WebElement ct; 
	
	
	
	@FindBy(xpath="//*[@class='alert alert-info']")
	private WebElement alertch; 
	
	
	

	
	
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

public void clickTitle() {
	
	this.clicktitle.click();
	
}

public void clickCH() {
	
	this.clickch.click();
}

public void Clicktesticon() {
	
	this.clicktesticon.click();
	
}
public void Clickonlinetest4() {
	
	this.clickonlinetest.click();
	
}
public void ClickStartTest() {
	
	this.clickstarttest.click();
	
}

public void SelectAns1() {
	
	this.selectans1.click();
	
}


public void SavetAns1() {
	
	this.saveans1.click();
	
}

public void clickLogout() {
	
	this.clicklogout.click();
	
}


public void ClickReportingTab() {
	this.clickreporting.click(); 
}




public void clickstudent() {
	this.clickfollowedstudents.click(); 
}

public void sendLearner(String s) {
	this.sendln.sendKeys(s);
}

public void ClickSearch() {
	this.clicksearch.click();
}

public void ClickSaranya() {
	
	this.clickname.click();
}

public void clickM() {
	this.clickm.click(); 
}

public void clickTest() {
	this.clickt.click(); 
}

public void SendMail() {
	this.enableemail.click();
}

public void CorrectTest() {
	this.ct.click();
}

public void SelectAns2() {
	
	this.selectans2.click();
	
}
public void SavetAns2() {
	
	this.saveans2.click();
	
}
	
}
	