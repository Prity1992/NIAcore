package com.aqm.staf.library.pages.common;

import org.openqa.selenium.WebDriver;

import com.aqm.staf.library.BasePage;

public class LogOut  extends BasePage{ 
	public LogOut(WebDriver driver,String pageName) {
		super(driver, pageName);
	}

	public void navigateToLoginPage() {
		logout(driver);
		switchToFrame("display");

	}
}
