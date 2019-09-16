package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainerPOM {
	private WebDriver driver; 
	
	public TrainerPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[contains(text(),'Maths')]")
	private WebElement clickproject;
	
	@FindBy(xpath="//*[contains(text(),'Tests')]")
	private WebElement clickTest;
	
	@FindBy(xpath="//*[@class='actions']/a[1]/img")
	private WebElement clickcreatetest;
	
	@FindBy(id="exercise_title")
	private WebElement sendtesttitle;
	
	@FindBy(id="advanced_params")
	private WebElement clickadvancedsetting;
	
	
	@FindBy(xpath="//*[@class='cke_wysiwyg_frame cke_reset']")
	private WebElement frame1;
	
	@FindBy(xpath="//*[@Class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	private WebElement editable;
	
	@FindBy(id="exerciseType_0")
	private WebElement clickRB;
	
	@FindBy(xpath="//*[@name='activate_start_date_check' and @value='1']")
	private WebElement enableicon;
	@FindBy(id="date_time_wrapper_start_time")
	private WebElement clickchangetime;
	
	
	@FindBy(xpath="//*[@class='ui-slider-handle ui-state-default ui-corner-all']")
	private WebElement horizontalscroll;
	
	@FindBy(xpath="//*[contains(text(),'Done')]")
	private WebElement clickdone;
	
	@FindBy(id="pass_percentage")
	private WebElement sendpasspercent;
	
	@FindBy(name="submitExercise")
	private WebElement Proceed;
	
	@FindBy(xpath="//*[@class='icon-image']/a/img")
	private WebElement clickmultichoice;
	
	@FindBy(name="questionName")
	private WebElement sendq;
	
	
	@FindBy(xpath="//*[@id='cke_2_contents']/iframe")
	private WebElement ansframe1;
	
	@FindBy(css="body")
	private WebElement sendanswer1;
	
	@FindBy(xpath="//*[@id='cke_4_contents']/iframe")
	private WebElement ansframe2;
    
	@FindBy(css="body")
	private WebElement sendanswer2;
	
	@FindBy(xpath="//*[@id='cke_6_contents']/iframe")
	private WebElement ansframe3;
    
	@FindBy(css="body")
	private WebElement sendanswer3;
	
	@FindBy(xpath="//*[@id='cke_8_contents']/iframe")
	private WebElement ansframe4;
    
	@FindBy(css="body")
	private WebElement sendanswer4;
	
	@FindBy(xpath="//*[@name='correct' and @value='1']")
	private WebElement enableans1;
	
	@FindBy(name="weighting[1]")
	private WebElement marksq1;
	
	
	@FindBy(xpath="//*[@name='correct' and @value='2']")
	private WebElement enableansq2;
	
	@FindBy(name="weighting[1]")
	private WebElement marksq2;
	
	@FindBy(id="submit-question")
	private WebElement addq;
	
	@FindBy(xpath="//*[@class='actions']/a[2]/img")
	private WebElement clickpreview;
	
	@FindBy(xpath="//*[contains(text(),'Start test')]")
	private WebElement clickstarttest;
	
  
	@FindBy(xpath="//*[contains(text(),'Selenium')]")
	private WebElement selectans1;
	
	@FindBy(name="save_now")
	private WebElement saveans1;
	
	
	@FindBy(xpath="//*[contains(text(),'ST')]")
	private WebElement selectans2;
	
	@FindBy(name="save_now")
	private WebElement saveans2;
	
	@FindBy(xpath="//*[@class='dropdown avatar-user']/a")
	private WebElement moveicon;
	
	
	@FindBy(id="logout_button")
	private WebElement clicklogout;
	
	
	@FindBy(xpath="//*[contains(text(),'Reporting')]")
	private WebElement clickreporting;
	
	@FindBy(xpath="//*[contains(text(),'Followed teachers')]")
	private WebElement clickfollowedteachers;
	
     @FindBy(xpath="//*[@id='cm-content']/div/div[3]/table/tbody/tr[5]/td[5]/a/img")
	private WebElement clickname;
     
     @FindBy(xpath="//*[@class='table table-striped table-hover courses-tracking']/tbody/tr[8]/td[7]/a/img")
 	private WebElement clickm;
	
     @FindBy(xpath="//*[@id='cm-content']/div/div[8]/table/tbody/tr[11]/td[5]/a/img")
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
	
	public void login() {
		this.loginBtn.click();
	}
	
	public void ClickProject() {
		this.clickproject.click();
	}
	
	public void ClickTest() {
		this.clickTest.click();
	}
	
	public void ClickCreateTest() {
		this.clickcreatetest.click();
	}
	public void SendTestTitle(String TT) {
		this.sendtesttitle.sendKeys(TT);
	}
	
	public void ClickAdvancedSetting() {
		this.clickadvancedsetting.click();
	}
	
	public void Movetoframe() {
		
		driver.switchTo().frame(frame1);
		System.out.println("Move to Frame");
		
	}
	
public void Editable() {
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.body.innerHTML = '<br>'");
		 editable.sendKeys("Quiz2");
		 driver.switchTo().defaultContent();
	}

	
public void ClickRadiobutton() {
		
		this.clickRB.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,400)");
		
	}


public void EnableStart() {
	
	this.enableicon.click();
	JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,800)");
}
	
public void clickChangeTime() {
	
	this.clickchangetime.click();
}

public void ChangeTime() {
	
	Actions act = new Actions(driver);
	
	act.clickAndHold(horizontalscroll).moveByOffset(20, 0).release().perform();
}


public void clickDone() {
	
	this.clickdone.click();
}	

public void SendPassPercent(String i) {
	
	this.sendpasspercent.sendKeys(i);
}		
public void proceed() {
	
	this.Proceed.click();
}	




public void ClickMC() {
	
	this.clickmultichoice.click();
}	

public void Sendquestion(String q) {
	this.sendq.sendKeys(q);
	
}		

public void Movetoans1frame() {
	
	driver.switchTo().frame(ansframe1);
	System.out.println("Move to ansFrame1");
	
}

public void SendAnswer1() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>Selenium</h1>'", sendanswer1);
	
	driver.switchTo().defaultContent();
}

public void Movetoans2frame() {
	
	driver.switchTo().frame(ansframe2);
	System.out.println("Move to ansFrame2");
	
}
public void SendAnswer2() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>python</h1>'", sendanswer2);
	
	driver.switchTo().defaultContent();
}
public void Movetoans3frame() {
	
	driver.switchTo().frame(ansframe3);
	System.out.println("Move to ansFrame3");
	
}

public void SendAnswer3() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>SQL</h1>'", sendanswer3);
	
	driver.switchTo().defaultContent();

}

public void Movetoans4frame() {
	
	driver.switchTo().frame(ansframe4);
	System.out.println("Move to ansFrame4");
	
}
public void SendAnswer4() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>none</h1>'", sendanswer4);
	
	driver.switchTo().defaultContent();
}
public void Enableans1() {
	
	this.enableans1.click();
	
}

public void Marksq1(String marks1) {
	
	this.marksq1.sendKeys(marks1);
	
}



public void AddQ() {
	
	this.addq.click();
	
}
public void ClickMC2() {
	
	this.clickmultichoice.click();
}	

public void Sendquestion2(String q) {
	this.sendq.sendKeys(q);
	
}		

public void Movetoans1frameq2() {
	
	driver.switchTo().frame(ansframe1);
	System.out.println("Move to ansFrame1");
	
}

public void SendAnswer1q2() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>ST</h1>'", sendanswer1);
	
	driver.switchTo().defaultContent();
}

public void Movetoans2frameq2() {
	
	driver.switchTo().frame(ansframe2);
	System.out.println("Move to ansFrame2");
	
}
public void SendAnswer2q2() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>dve</h1>'", sendanswer2);
	
	driver.switchTo().defaultContent();
}
public void Movetoans3frameq2() {
	
	driver.switchTo().frame(ansframe3);
	System.out.println("Move to ansFrame3");
	
}

public void SendAnswer3q2() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>dve</h1>'", sendanswer3);
	
	driver.switchTo().defaultContent();

}

public void Movetoans4frameq2() {
	
	driver.switchTo().frame(ansframe4);
	System.out.println("Move to ansFrame4");
	
}
public void SendAnswer4q2() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].innerHTML = '<h1>abs</h1>'", sendanswer4);
	
	driver.switchTo().defaultContent();
}



public void Enableans1q2() {
	
	this.enableans1.click();
	
}

public void Marksq2(String marks2) {
	
	this.marksq2.sendKeys(marks2);
	
}



public void AddQ2() {
	
	this.addq.click();
	
}

public void Clickpreview() {
	
	this.clickpreview.click();
	
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




public void SelectAns2() {
	
	this.selectans2.click();
	
}


public void SavetAns2() {
	
	this.saveans2.click();
	
}

public void ClickIcon() {
	
	this.moveicon.click();
	
}

public void ClickLOGOUT() {
	
	this.clicklogout.click();
	
}
	
	public void ClickReporting() {
		this.clickreporting.click();
	}
	
	public void ClickFollowedTeachers() {
		
		this.clickfollowedteachers.click();
	}
	
	
      public void ClickName() {
		
		this.clickname.click();
     }
      
      public void ClickMaths() {
  		
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

}
	