package com.orangelivehrm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrnlive.qa.base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIMLink;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement LeaveLink;
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement TimeLink;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement RecruitmentLink;
	
	@FindBy(id="menu__Performance")
	WebElement PerformanceLink;
	
	@FindBy(id="menu_dashboard_index")
	WebElement DashboardLink;
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement DirectoryLink;
	
	@FindBy(id="menu_maintenance_purgeEmployee")
	WebElement MaintenanceLink;
	
	@FindBy(xpath="//*contains(text(),'Welcome Admin')")
	WebElement userNameLabel;
	
	public DashboardPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
	}
	public AdminPage ClickOnAdminLink() throws IOException
	{
		AdminLink.click();
		return new AdminPage();//next Landing page. so it is returning the adminpage object
	}
	public PIMPage ClickOnPIMLink() throws IOException
	{
		PIMLink.click();
		return new PIMPage();
	}
	public LeavePage ClickonLeaveLink() throws IOException
	{
		LeaveLink.click();
		return new LeavePage();
	}
	public TimePage ClickOnTimeLink() throws IOException
	{
		TimeLink.click();
		return new TimePage();
	}
	public RecruitmentPage ClickOnRecruitmentLink() throws IOException
	{
		RecruitmentLink.click();
		return new RecruitmentPage();
	}
	public PerformancePage ClickOnPerformanceLink() throws IOException
	{
		PerformanceLink.click();
		return new PerformancePage();
	}
	public DirectoryPage ClickOnDirectoryLink() throws IOException
	{
		DirectoryLink.click();
		return new DirectoryPage();
	}
	public MaintenancePage ClickOnMaintenanceLink() throws IOException
	{
		MaintenanceLink.click();
		return new MaintenancePage();
	}
}
