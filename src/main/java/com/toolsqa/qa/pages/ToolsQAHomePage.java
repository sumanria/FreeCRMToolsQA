package com.toolsqa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ToolsQAHomePage extends TestBase {

	@FindBy(xpath = "//li[@id='menu-item-33']")
	WebElement prodCategory;
	
	@FindBy(xpath = "//a[@id='logo']")
	WebElement logoToolsQA;
	
	@FindBy(xpath = "//li[@id='menu-item-33']/ul/li[1]")
	WebElement ItemAccessories;
	
	
	// Initializing the Page Objects:
			public ToolsQAHomePage() {
				PageFactory.initElements(driver, this);
			}

			public String verifyToolsQAHomePageTitle(){
				return driver.getTitle();
			}
			
			public boolean verifyToolsQALogo(){
				return logoToolsQA.isDisplayed();
			}
			
			public void clickOnProductCategory(){
				Actions action = new Actions(driver);
				action.moveToElement(prodCategory).build().perform();
				ItemAccessories.click();
				
			}
			
}
