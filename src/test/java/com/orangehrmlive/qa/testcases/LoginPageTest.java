package com.orangehrmlive.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrnlive.qa.base.TestBase;
import com.orangelivehrm.qa.pages.DashboardPage;
import com.orangelivehrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	DashboardPage dashboardpage;
	//its compulsory to call parent class constructor with super keyword then it will come 
	//over inside the setup method and then only it will not give the nullpointerexception
	//because my properties are already defined. we have to learn the sequence.
	public LoginPageTest() throws IOException {
		super();
		// constructor is made so the base class constructor will be called and we can initialize our Properties class
	}
// y we use before method and after method every time 
	//1. if we execute 100 test cases on one launch of the browser the browser will exhaust 
	//and cookies issues of the browser, catch issues  will be there. we execute lots of test cases 
	//without refreshing, sometime browser will crash, blank page is coming. so by using this technique
	//no test case is linked with each other.so its a good practice.
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		// create the object of the loginPage class
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateLogingPageTitle();
		Assert.assertEquals(title, "OrangeHRM", "Login page title not matched");
	}
	
	@Test(priority=2)
	public void orangelogoimgTest()
	{
		boolean flag=loginpage.validatepagelogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() throws IOException
	{
		dashboardpage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
