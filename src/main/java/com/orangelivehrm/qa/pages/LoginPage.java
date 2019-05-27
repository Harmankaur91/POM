package com.orangelivehrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrnlive.qa.base.TestBase;

public class LoginPage extends TestBase{

	

	//Page Repositories----OR
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement  password;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	@FindBy(id="divLogo")
	WebElement logo;
	
	//initializing the page object
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public String validateLogingPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validatepagelogo()
	{
		return logo.isDisplayed();
	}
	// don't write driver.findelement because we already defined @Findby with 
	//element which is equivalent to Driver.findelement advantage- maintenance pointofview
	public DashboardPage login(String un,String ps) throws IOException //this method is returning new Dashboardpage 
	//class object because we land to the Dashboardpage after login
	{
		username.sendKeys(un);
		password.sendKeys(ps);
		loginbtn.click();
		
		return new DashboardPage();
	}
}
