package com.toolsqa.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
//import com.crm.qa.pages.ContactsPage;
//import com.crm.qa.pages.HomePage;
//import com.crm.qa.pages.LoginPage;
//import com.crm.qa.util.TestUtil;
import com.toolsqa.qa.pages.ToolsQAHomePage;

public class ToolsQAHomePageTest extends TestBase{

	ToolsQAHomePage ToolsQAhomePage;
	
	public ToolsQAHomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		//testUtil = new TestUtil();
		//contactsPage = new ContactsPage();
		//loginPage = new LoginPage();
		ToolsQAhomePage = new ToolsQAHomePage();
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = ToolsQAhomePage.verifyToolsQAHomePageTitle();
		Assert.assertEquals(homePageTitle, "ONLINE STORE | Toolsqa Dummy Test site","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyToolsQALogoTest(){
		//testUtil.switchToFrame();
		Assert.assertTrue(ToolsQAhomePage.verifyToolsQALogo());
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest(){
		//testUtil.switchToFrame();
		ToolsQAhomePage.clickOnProductCategory();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
