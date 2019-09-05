package com.training.bean;

/**
 * 
 * @author Naveen
 * @see this class shall get the bean data 
 */
public class DBBean {
	private String url; 
	private String driver; 
	private String userName; 
	private String password;
	private String title;
	private String subtitle;
	
	public DBBean(){}
	
	public DBBean(String url, String driver, String userName, String password,String title,String subtitle) {
		super();
		this.url = url;
		this.driver = driver;
		this.userName = userName;
		this.password = password;
		this.title = title;
		this.subtitle = subtitle;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
		
		}
	public String getSubtitle() {
		return subtitle;
	}
	
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
}
