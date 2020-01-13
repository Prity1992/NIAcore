package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.ForeignExchangeDetailEntity;
import com.aqm.testing.testDataEntity.PolicyEntity;

public class AccountingExchangeRateForeignExchangeRatePage extends BasePage{

	//This Page consists a Table too.
	private PageElement foreignExchangeRateTitle;
	private PageElement newButton;
	private PageElement backButton;

	public AccountingExchangeRateForeignExchangeRatePage(WebDriver driver,String pageName) {
		super(driver, pageName);

		foreignExchangeRateTitle = new PageElement (By.xpath("//div//b[contains(text(),'Exchange Rate')]"), "Foreign Exchange Rate Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		newButton=new PageElement(By.name("New"), "New Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton = new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}


	public void navigateToCreateForeignExchangeDetail(ForeignExchangeDetailEntity foreignExchangeDetailEntity) {
		if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigNewButton")) {
			click(newButton);
			switchToFrame("display");
		}
	}



	public void backFromForeignExchangeDetail(ForeignExchangeDetailEntity foreignExchangeDetailEntity) {
		if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
			switchToFrame("display");
		}
	}
	
	public void selectCurrencyCode(ForeignExchangeDetailEntity foreignExchangeDetailEntity){
		if (foreignExchangeDetailEntity.getBooleanValueForField("ConfigSearchCurrencyCode")){
			String currencyCode = foreignExchangeDetailEntity.getStringValueForField("PolicyNo").trim();
			PageElement currencyCodeLink = new PageElement(By.xpath("//a//font[contains(text(),'"+currencyCode+"')]"), "Currency Code Search in Search Panel", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
			click(currencyCodeLink);
			switchToFrame("display");
		}
	}
}

