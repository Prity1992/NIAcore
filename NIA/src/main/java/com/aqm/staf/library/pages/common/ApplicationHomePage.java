package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.WebPage;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.ChildRecordEntity;

public class ApplicationHomePage extends BasePage {
	private PageElement homePageTitle;
	public ApplicationHomePage(WebDriver driver, String pageName) {
		super(driver, pageName);
		homePageTitle=new PageElement(By.xpath("//td//b[contains(text(),'CWISS - CORE INSURANCE')]"), "Home Page Title", true, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
	}

	public void verifyHomePage() {
		switchToFrame("head");
		if(isElementDisplayed(homePageTitle));
		return;
	}

	public void verifyHomePage(ChildRecordEntity childRecord, CustomAssert assertReference) {
		
	}

	public void fillHomePage(ChildRecordEntity childRecord, CustomAssert assertReference) {
		
	}
}
