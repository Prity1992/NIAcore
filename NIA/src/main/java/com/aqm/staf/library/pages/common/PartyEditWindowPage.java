package com.aqm.staf.library.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.AssertionType;
import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.framework.helper.RandomCodeGenerator;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.PartyEditReasonEntity;
import com.aqm.testing.testDataEntity.PartyEntity;

public class PartyEditWindowPage extends BasePage {
	private PageElement effectiveDateForThisActionTextField;
	private PageElement reasonForInitiatingThisActionTextArea;
	private PageElement saveButton;
	private PageElement backButton;

	public PartyEditWindowPage(WebDriver driver, String pageName) {
		super(driver, pageName);
		effectiveDateForThisActionTextField = new PageElement(By.name("pEventEffectiveDate"),"Effective date for this action Text Field", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reasonForInitiatingThisActionTextArea = new PageElement(By.name("pNewRemark"),"Reason for initiating this action Text Area", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton = new PageElement(By.name("Save"),"Save Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		backButton = new PageElement(By.name("Back"),"Back Button", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
	}

	public void fillPartyEditWindowDetails(PartyEditReasonEntity partyEditReasonEntity, CustomAssert assertReference){
		if(partyEditReasonEntity.getAction().equalsIgnoreCase("add")){
			if (partyEditReasonEntity.getBooleanValueForField("ConfigEffectiveDateForThisAction")) {
				String effectiveDateForThisAction=RandomCodeGenerator.dateGenerator(partyEditReasonEntity.getStringValueForField("EffectiveDateForThisAction"));
				clearAndEnterDate(effectiveDateForThisActionTextField, effectiveDateForThisAction);
			}
			if (partyEditReasonEntity.getBooleanValueForField("ConfigReasonForInitiatingThisAction")) {
				clearAndSendKeys(reasonForInitiatingThisActionTextArea, partyEditReasonEntity.getStringValueForField("ReasonForInitiatingThisAction"));
			}
		}
	}
	public void submitEditWindowDetails(PartyEditReasonEntity partyEditReasonEntity) {
		if (partyEditReasonEntity.getBooleanValueForField("ConfigSaveButton")) {
			click(saveButton);
		}
	}
	public void backFromEditWindowDetails(PartyEditReasonEntity partyEditReasonEntity) {
		if (partyEditReasonEntity.getBooleanValueForField("ConfigBackButton")) {
			click(backButton);
		}
	}
	public void fillAndASaveFromEditWindow(PartyEditReasonEntity partyEditReasonEntity, CustomAssert assertReference) {
		fillPartyEditWindowDetails(partyEditReasonEntity, assertReference);
		submitEditWindowDetails(partyEditReasonEntity);
		//backFromEditWindowDetails(partyEditReasonEntity);
	}
}
