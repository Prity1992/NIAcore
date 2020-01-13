package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.WebPage;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.ClaimDisputedWindowEntity;
import com.aqm.testing.testDataEntity.ClaimProcessWindowEntity;

public class ClaimProcessWindowPage extends BasePage {
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public ClaimProcessWindowPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"),"Reason For Initiating This Action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBEEENABLED,10);
	}
	//SERVICES//
	public void fillClaimProcessWindowDetails(ClaimProcessWindowEntity claimProcessWindowEntity, CustomAssert assertReference){
		if(claimProcessWindowEntity.getAction().equalsIgnoreCase("add")){
			if (claimProcessWindowEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, claimProcessWindowEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	public void saveClaimProcessWindowDetails(ClaimProcessWindowEntity claimProcessWindowEntity) {
		if (claimProcessWindowEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromClaimProcessWindowDetails(ClaimProcessWindowEntity claimProcessWindowEntity) {
		if (claimProcessWindowEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndSubmitPolicyRejectAlterationDetails(ClaimProcessWindowEntity claimProcessWindowEntity, CustomAssert assertReference) {
		switchToFrame("display");
		fillClaimProcessWindowDetails(claimProcessWindowEntity, assertReference);
		saveClaimProcessWindowDetails(claimProcessWindowEntity);
		//backFromClaimProcessWindowDetails(claimProcessWindowEntity);
	}
}
