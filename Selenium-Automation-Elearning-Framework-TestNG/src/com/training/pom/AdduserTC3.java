package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdduserTC3 {
	private WebDriver driver; 
	
	public AdduserTC3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
    private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id='settings']/div/div/div[2]/div[2]/ul/li[2]/a")
	private WebElement clickadduser;
	
	@FindBy(id="firstname")
	private WebElement sendfirstname;
	
	@FindBy(id="lastname")
	private WebElement sendlastname;
	
	@FindBy(id="email")
	private WebElement sendemail;
	
	
	@FindBy(id="phone")
	private WebElement sendepn;
	
	@FindBy(id="username")
	private WebElement sendnewun;
	
	@FindBy(xpath="//*[@name='password[password_auto]' and @value='163']")
	private WebElement enbleenterpwd;
	
	@FindBy(id="password")
	private WebElement sendpwd;
	
	@FindBy(name="submit")
	private WebElement clickadd;
	
	
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
	
	public void ClickAddUser() {
		this.clickadduser.click();
	}
	
	public void sendFirstName(String FN) {
		this.sendfirstname.clear(); 
		this.sendfirstname.sendKeys(FN);
	}
	
	public void sendLastName(String LN) {
		this.sendlastname.clear(); 
		this.sendlastname.sendKeys(LN);
	}
	
	public void sendEmail(String mail) {
		this.sendemail.clear(); 
		this.sendemail.sendKeys(mail);
	}
	
	public void sendPhoneNUM(String num) {
		this.sendepn.clear(); 
		this.sendepn.sendKeys(num);
	}
	
	public void sendNewUN(String nun) {
		this.sendnewun.clear(); 
		this.sendnewun.sendKeys(nun);
	}
	
	public void clickEnablePWD() {
		this.enbleenterpwd.click();
	}
	
	public void sendPWD(String npwd) {
		this.sendpwd.clear(); 
		this.sendpwd.sendKeys(npwd);
	}
	
	public void clickADD() {
		this.clickadd.click();
	}
	
	
	
	
	
}