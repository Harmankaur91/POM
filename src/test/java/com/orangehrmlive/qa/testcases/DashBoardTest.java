package com.orangehrmlive.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrnlive.qa.base.TestBase;
import com.orangelivehrm.qa.pages.DashboardPage;
import com.orangelivehrm.qa.pages.LoginPage;

public class DashBoardTest extends TestBase{
	LoginPage loginpage;
	DashboardPage DashboardPage;
	public DashBoardTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		// create the object of the loginPage class
		loginpage=new LoginPage();
		//we are checking the DashBoardPage so we need to first Login to the page.so we create 
		//loginpage object because we want to access loginpage method and properties are already defined 
		//in the properties class.
		DashboardPage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void DashBoardTitleTest()
	{
		String DashBoardTitle=DashboardPage.verifyHomePageTitle();
		Assert.assertEquals(DashBoardTitle, "OrangeHRM", "DashBoard title page does not matched");
	}
	
	@Test(priority=2)
		public void veifyCorrectUsernameTest()
		{
			Assert.assertTrue(DashboardPage.verifyCorrectUserName());
		}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
