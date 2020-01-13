package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.PartyCompleteEditEntity;
import com.aqm.testing.testDataEntity.PartyEntity;
import com.aqm.testing.testDataEntity.PartyRolesFunctDetailsEntity;

public class PartyCompleteEdit extends BasePage {
	
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public PartyCompleteEdit(WebDriver driver, String pageName) {
		super(driver, pageName);

		reasonForInitiatingThisActionTextArea = new PageElement(By.xpath(locatorforPanel("Reason for initiating this action", "textarea")),"Reason for initiating this action Text Area", false, WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillCompleteEditWindow(PartyCompleteEditEntity partyCompleteEdit, CustomAssert assertReference){
		if(partyCompleteEdit.getAction().equalsIgnoreCase("add")){
			if (partyCompleteEdit.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, partyCompleteEdit.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	
	public void saveCompleteEditWindow(PartyCompleteEditEntity partyCompleteEdit) {
		if (partyCompleteEdit.getBooleanValueForField("ConfigSaveBtn")) {
			click(saveButton);
		}
	}
	
	public void backCompleteEditWindow(PartyCompleteEditEntity partyCompleteEdit) {
		if (partyCompleteEdit.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	
	public void fillSAndSaveDetails(PartyCompleteEditEntity partyCompleteEdit, CustomAssert assertReference) {
		fillCompleteEditWindow(partyCompleteEdit, assertReference);
		saveCompleteEditWindow(partyCompleteEdit);
		//backCompleteEditWindow(partyCompleteEdit);
	}
	
	
	
}
