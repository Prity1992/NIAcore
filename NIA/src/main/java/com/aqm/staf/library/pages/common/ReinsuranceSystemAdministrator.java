package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.WaitType;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;

public class ReinsuranceSystemAdministrator extends BasePage
{

	private PageElement party;
	
	public ReinsuranceSystemAdministrator(WebDriver driver, String pageName) {
		super(driver, pageName);

		party=new PageElement(By.id("pParty"),"Save Button",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);

	}


	public void navigateToParty() {
		switchToFrame("head");
		click(party);
	}




}



