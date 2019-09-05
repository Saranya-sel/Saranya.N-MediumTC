package com.training.pom;

import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class add {
	private WebDriver driver; 
	
	public add(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
    private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@class='col-md-2']/a/img")
	private WebElement clickpi;
	
	
	@FindBy(xpath="//*[contains(text(),'Projects')]")
	private WebElement clicknewpi;
	
	@FindBy(xpath="//*[@class='actions']/a/img")
	private WebElement createnewpi;
	
	@FindBy(name="blog_name")
	private WebElement sendtitle;
	
	@FindBy(name="blog_subtitle")
	private WebElement sendsubtitle;
	
	@FindBy(id="add_blog_submit")
	private WebElement save;
	
	
	@FindBy(xpath="//*[contains(text(),'Testing')]")
	private WebElement clickproject;
	
	@FindBy(xpath="//*[@class='col-sm-12']/a[2]/img")
	private WebElement clicknewtask;
	
	@FindBy(id="add_post_title")
	private WebElement addposttitle;
	
	@FindBy(id="add_post_save")
	private WebElement titlesave;
	
	@FindBy(xpath="//*[@class='col-sm-12']/a[3]/img")
	private WebElement rolemangementicon;
	
	@FindBy(xpath="//*[@class='actions']/a[1]/img")
	private WebElement addnewroleicon;
	
	@FindBy(name="task_name")
	private WebElement sendroletitle;
	
	@FindBy(name="Submit")
	private WebElement saveroletitile;
	
	
	@FindBy(xpath="//*[@class='actions']/a[2]")
	private WebElement clickassignrole;
	
	@FindBy(id="assign_task_task_user_id")
	private WebElement dd1;
	
	@FindBy(id="assign_task_task_task_id")
	private WebElement dd2;
	
	@FindBy(id="assign_task_submit")
	private WebElement clickvalidate;
	
	@FindBy(xpath="//*[@id='toolbar']/div/div/a[4]/img")
    private WebElement clicckum; 
	
	
	
	@FindBy(xpath="//*[@name='user[]' and @value='163']")
	private WebElement enableicon;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement clickregister;
	
	public void sendUserName(String userName) {
		this.userName.clear();
	    this.userName.sendKeys(userName);
	}
	
	public void  retriveun() {
		
	 String UN = userName.getAttribute("value");
	 System.out.println(UN);
			}
	
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void  retrivepwd() {
		
		 String pwd = password.getAttribute("value");
		 System.out.println(pwd);
				}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickPI() {
		this.clickpi.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,800)");
	       
				}
	public void clickNewPI() {
		this.clicknewpi.click();
		
				}
	public void createNewPI() {
	
		this.createnewpi.click();
		}
	
	public void sendTitle(String sendtitle) {
		this.sendtitle.clear();
		this.sendtitle.sendKeys(sendtitle);
	}
	
	public void sendSubtitle(String sendsubtitle) {
		this.sendsubtitle.clear();
		this.sendsubtitle.sendKeys(sendsubtitle);
	}
	
	public void clickSave() {
		this.save.click();
		}
	
	
    public void clickProjectadded() {
		 
		this.clickproject.click();
	}
	
   public void clickNewtask() {
		
		this.clicknewtask.click();
	}
   public void sendPosttitle(String title1) {
		
		this.addposttitle.sendKeys(title1);
	}
   
   public void clicktitleSave() {
		
		this.titlesave.click();
	}
  
  public void clickRoleMgmnticon() {
		
		this.rolemangementicon.click();
	}
  
  public void addnewrole() {
		
		this.addnewroleicon.click();
	}
  public void sendRoletitle(String title2) {
		
		this.sendroletitle.sendKeys(title2);
	}
  
  
 
  public void saveRoleTitle() {
		
		this.saveroletitile.click();
	}
  
  public void clickAssignrole() {
		
		this.clickassignrole.click();
	}
  
public void Dropdown1() {
	
	
	
	Select sel = new Select(dd1);
	List<WebElement>options = sel.getOptions();
	System.out.println(options.size());
	
	for(int i=0;i<options.size();i++) 
	{
		System.out.println(options.get(i).getText());
	}
	
	sel.selectByVisibleText("Saranya N");
	
}
	
  
	
  public void ClickValidate() {
	  
	  		
		this.clickvalidate.click();
	}
		
	
  public void ClickUserManagement() {
		
		this.clicckum.click();
	}
  
  public void EnableIcon() {
		
		this.enableicon.click();
	}
	
  public void Register() {
		
		this.clickregister.click();
	}
	
}
    