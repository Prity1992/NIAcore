package com.aqm.staf.library.pages.health;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.AssertionType;
import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.framework.helper.RandomCodeGenerator;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.IsMemPortNonNIAPolEntity;
import com.aqm.testing.testDataEntity.MembAtachCovrgPremSchdEntity;
import com.aqm.testing.testDataEntity.PolMemPreExstngDisesEntity;
import com.aqm.testing.testDataEntity.PolMemStrtDateForMemEntity;
import com.aqm.testing.testDataEntity.PolicyMemberAttributeEntity;
import com.aqm.testing.testDataEntity.PortabilityEntity;

public class PolicyMemStartDateForMember extends BasePage {

	private PageElement startDateForMemberTitle;
	private PageElement policyTitle;
	private PageElement attributesTitle;
	private PageElement memberTitle;
	private PageElement coverageTitle;
	private PageElement loanTitle;
	private PageElement clientDetailsTitle;
	private PageElement relationsTitle;
	private PageElement paymentsTitle;
	private PageElement followupTitle;
	private PageElement documentTitle;
	private PageElement detail1Title;
	private PageElement attributes1Title;
	private PageElement attachCoverageTitle;
	private PageElement relations1Title;
	private PageElement payments1Title;
	private PageElement	fundTitle;
	private PageElement preExistingDiseaseatRenewTitle;
	//TABS
	private PageElement policyQuoteDetailsTitle;
	private PageElement policyAttributesTitle;
	private PageElement policyInsuredInterestTitle;
	private PageElement policyCoverageListTitle;
	private PageElement clientDetailTitle;
	private PageElement policyRelationsTitle;
	private PageElement policyPaymentListTitle;
	private PageElement quotePolicyTitle;
	private PageElement policyDocumentTitle;
	//sub tabs
	private PageElement policyMemberDetailsTitle;
	private PageElement memberAttriubutesTitle;
	private PageElement memberRelationTitle;
	private PageElement memberPaymentListTitle;
	private PageElement insuredInterestCoverageTitle;

	private PageElement quoteNoLabel;
	private PageElement statusLabel;	
	private PageElement policyHolderLabel;
	private PageElement productLabel;
	private PageElement memberCodeLabel;
	private PageElement memberSerialNoLabel;

	private PageElement startdateformemberinpolicyTextField;
	private PageElement isTheMemberPortedFromNonNIAPolicydropdown;

	private PageElement forwordButton;
	private PageElement previousButton;
	private PageElement backButton;
	private PageElement saveButton;


	public PolicyMemStartDateForMember(WebDriver driver,String pageName) {
		super(driver, pageName);
		//TITLE
		startDateForMemberTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Start date for member')]"), "Start date for member Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		policyTitle=new PageElement(By.xpath("//td//div//b[contains(text(),'Policy')]"), "Policy Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTitle=new PageElement(By.linkText("Policy"),"AttributesTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		memberTitle=new PageElement(By.xpath("//div//b[contains(text(),'Member')]"), "Member Title", false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		coverageTitle=new PageElement(By.linkText("Coverage"),"Coverage Title ",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		loanTitle=new PageElement(By.linkText("Loan"),"Loan Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);					
		clientDetailsTitle=new PageElement(By.xpath("//div//b[contains(text(),'Client Details')]"),"ClientDetailsTitle",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);			
		relationsTitle=new PageElement(By.linkText("Relations"),"Relations Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);				
		paymentsTitle=new PageElement(By.linkText("Payments"),"Payments Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		followupTitle=new PageElement(By.linkText("Foolowup"),"Foolowup Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		documentTitle=new PageElement(By.xpath("//div//b[contains(text(),'Document')]"),"Document Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		loanTitle = new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		detail1Title=new PageElement(By.linkText("Detail"),"Detail Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributes1Title=new PageElement(By.linkText("Attributes"),"Attributes1 Title",false,WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attachCoverageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverage')]"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		relations1Title= new PageElement(By.xpath("//div[@title='Relation']"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);		
		payments1Title=new PageElement(By.xpath("//div[@title='Relation']/following::td"), "Attach Coverage Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		fundTitle=new PageElement(By.xpath("//div//b[contains(text(),'Fund')]"), "Fund Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		preExistingDiseaseatRenewTitle= new PageElement(By.xpath("//div//b//font[contains(text(),'Pre Existing Disease at Renew')]"), "Pre Existing Disease at Renew Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		memberAttriubutesTitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Member Attriubutes')]"), "Member Attriubutes Title", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		// LABEL
		quoteNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Quote No"))," Quote Number Field Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Status")), "Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", " Policyholder")), "Policyholder Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Product")), "Product Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberCodeLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "MemberCode")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		memberSerialNoLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Member Serial No.")), "Member Serial number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		startdateformemberinpolicyTextField=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Start date for member in policy", "input")), "Startdate for member in policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		// BUTTON
		forwordButton=new PageElement(By.name("Next"), "Go to forword Button", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		saveButton=new PageElement(By.name("btnSave"),  "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "backButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		previousButton=new PageElement(By.name("Previous"), "previousButton", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TABS
		policyQuoteDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Details')]"), "Policy Quote Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyAttributesTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyInsuredInterestTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Insured Interest')]"), "Policy Insured Interest Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyCoverageListTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Coverage List')]"), "Policy Coverage List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailTitle=new PageElement(By.xpath("//b[contains(text(),'Client Detail')]"), "Client Detail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyRelationsTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Relations')]"), "Policy Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Policy Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quotePolicyTitle=new PageElement(By.xpath("//b[contains(text(),'Quote/Policy')]"), "Quote Policy Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyDocumentTitle=new PageElement(By.xpath("//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyMemberDetailsTitle=new PageElement(By.xpath("//b[contains(text(),'Member Details')]"), "Member Details Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberAttriubutesTitle=new PageElement(By.xpath("//b[contains(text(),'Member Attributes')]"), "Member Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCoverageTitle=new PageElement(By.xpath("//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Coverage Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberRelationTitle=new PageElement(By.xpath("//b[contains(text(),'Member Relations')]"), "Member Relations Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		memberPaymentListTitle=new PageElement(By.xpath("//b[contains(text(),'Payment List')]"), "Payment List Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		isTheMemberPortedFromNonNIAPolicydropdown=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is the member ported from non NIA Policy", "select")), "Enter Is The Member Ported From Non NIA Policydropdown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);



	}
	public void fillPolicyMemStartDateForMember(PolMemStrtDateForMemEntity polMemStrtDateForMem, CustomAssert assertReference) throws InterruptedException{
		if(polMemStrtDateForMem.getAction().equalsIgnoreCase("add") || polMemStrtDateForMem.getAction().equalsIgnoreCase("edit")){

			if (polMemStrtDateForMem.getBooleanValueForField("ConfigStartdateformemberinpolicy")) {
				String dateOfApplivcation=RandomCodeGenerator.dateGenerator(polMemStrtDateForMem.getStringValueForField("Startdateformemberinpolicy"));
				clearAndSendKeys(startdateformemberinpolicyTextField,dateOfApplivcation);
			}
		}
			else if(polMemStrtDateForMem.getAction().equalsIgnoreCase("verify")){
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigPolicyHolderName")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigMemberCoode")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("MemberCoode"), fetchValueFromFields(memberCodeLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigSerialNo")) {
					assertReference.assertEquals(polMemStrtDateForMem.getStringValueForField("SerialNo"), fetchValueFromFields(memberSerialNoLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMem.getBooleanValueForField("ConfigStartdateformemberinpolicy")) {
					assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polMemStrtDateForMem.getStringValueForField("Startdateformemberinpolicy")),fetchValueFromTextFields(startdateformemberinpolicyTextField), AssertionType.WARNING);
				}

			}
		
	}

	public void fillPolicyMemberIsTheMemberPortedFromNonNIAPolicy(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity, CustomAssert assertReference) throws InterruptedException{
		if(polMemStrtDateForMemEntity.getBooleanValueForField("ConfigPrimaryInformation")){
			if(polMemStrtDateForMemEntity.getAction().equalsIgnoreCase("add") || polMemStrtDateForMemEntity.getAction().equalsIgnoreCase("edit")){
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigIsMemPortFromNonNIAPolicy")) {
					selectValueFromList(isTheMemberPortedFromNonNIAPolicydropdown, polMemStrtDateForMemEntity.getStringValueForField("IsMemPortFromNonNIAPolicy"));
				}
			}
			else if(polMemStrtDateForMemEntity.getAction().equalsIgnoreCase("verify")){
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigQuoteNo")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("QuoteNo"), fetchValueFromFields(quoteNoLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigStatus")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("Status"), fetchValueFromFields(statusLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigPolicyholder")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("Policyholder"), fetchValueFromFields(policyHolderLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigProductName")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("ProductName"), fetchValueFromFields(productLabel),AssertionType.WARNING);
				}
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberCode")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("MemberCode"), fetchValueFromTextFields(memberCodeLabel), AssertionType.WARNING);
				}
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberSerialNo")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("MemberSerialNo"), fetchValueFromTextFields(memberSerialNoLabel), AssertionType.WARNING);
				}
				if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigIsMemPortFromNonNIAPolicy")) {
					assertReference.assertEquals(polMemStrtDateForMemEntity.getStringValueForField("IsMemPortFromNonNIAPolicy"), fetchValueFromList(isTheMemberPortedFromNonNIAPolicydropdown), AssertionType.WARNING);
				}

			}
		}
	}

	//SERVICES

	public void navigateToPolicyTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigPolicyTab")){
			click(policyTitle);
			isElementDisplayed(policyQuoteDetailsTitle);
		}
	}
	public void navigateToAttributeTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigAttributeTab")){
			click(attributesTitle);
			isElementDisplayed(policyAttributesTitle);
		}
	}
	public void navigateToInsuredInterestTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberTab")){
			click(memberTitle);
			isElementDisplayed(policyInsuredInterestTitle);
		}
	}
	public void navigateToCoverageTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigCoverageTab")){
			click(coverageTitle);
			isElementDisplayed(policyCoverageListTitle);
		}
	}
	public void navigateToClientDetailsTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigClientDetailsTab")){
			click(clientDetailsTitle);
			isElementDisplayed(clientDetailTitle);
		}
	}
	public void navigateToRelationsTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigRelationsTab")){
			click(relationsTitle);
			isElementDisplayed(policyRelationsTitle);
		}
	}
	public void navigateToPaymentsTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigPaymentsTab")){
			click(paymentsTitle);
			isElementDisplayed(policyPaymentListTitle);
		}
	}
	public void navigateToFollowupTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigFollowupTab")){
			click(followupTitle);
			isElementDisplayed(quotePolicyTitle);
		}
	}
	public void navigateToDocumentTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigDocumentTab")){
			click(documentTitle);
			isElementDisplayed(policyDocumentTitle);
		}
	}
	public void navigateToDetail1Tab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberDetailsTab")){
			click(detail1Title);
			isElementDisplayed(policyMemberDetailsTitle);
		}
	}
	public void navigateToAttributes1Tab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberAttributesTab")){
			click(attributes1Title);
			isElementDisplayed(memberAttriubutesTitle);
		}
	}
	public void navigateToAttachCoverageTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigAttachCoverageTab")){
			click(attachCoverageTitle);
			isElementDisplayed(insuredInterestCoverageTitle);
		}
	}
	public void navigateToRelationTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberRelationsTab")){
			click(relations1Title);
			isElementDisplayed(memberRelationTitle);
		}
	}
	public void navigateToPaymentTab(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigMemberPaymentTab")){
			click(payments1Title);
			isElementDisplayed(memberPaymentListTitle);
		}
	}

	public void navigateToforwardMemberPage(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if(polMemStrtDateForMemEntity.getStringValueForField("Product").equalsIgnoreCase("TI")){
			click(saveButton);
		}
		else if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwordButton);
			switchToFrame("display");
		}
	}
	public void navigateToPreviousMemberePage(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigPreviousButton")){			
			click(previousButton);
			switchToFrame("display");
			isElementDisplayed(preExistingDiseaseatRenewTitle);
		}
	}
	public void navigateToBackMemberPage(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(memberAttriubutesTitle);
		}
	}

	public void saveButtonIsMemberPortedFromNonNiaPolicyPage(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity){
		if(polMemStrtDateForMemEntity.getBooleanValueForField("ConfigSaveButtonFM")){
			click(saveButton);
		}
		if (polMemStrtDateForMemEntity.getBooleanValueForField("ConfigSaveButton")){
			if(polMemStrtDateForMemEntity.getStringValueForField("Product").equalsIgnoreCase("JM")||
					polMemStrtDateForMemEntity.getStringValueForField("Product").equalsIgnoreCase("MC")||
					polMemStrtDateForMemEntity.getBooleanValueForField("ConfigRenew")){
				click(saveButton);
			}
			else {
				click(forwordButton);
			}
		}
			//(polMemStrtDateForMemEntity.getStringValueForField("Product").equalsIgnoreCase("FM"))
				if(polMemStrtDateForMemEntity.getStringValueForField("Product").equalsIgnoreCase("SC")){
					click(forwordButton);
				}
				click(saveButton);
				switchToFrame("display");
			}
		
	

	public void fillandsubmitPolicyMemStartDateForMember(PolMemStrtDateForMemEntity polMemStrtDateForMemEntity, CustomAssert assertReference) throws InterruptedException{
		if(isConfigTrue(polMemStrtDateForMemEntity.getConfigExecute())){
			switchToFrame("display");
			try{
				acceptAlertAndReturnConfirmationMessage();
			}catch(Exception e){

			}
			fillPolicyMemStartDateForMember(polMemStrtDateForMemEntity,assertReference);
			navigateToforwardMemberPage(polMemStrtDateForMemEntity);
			fillPolicyMemberIsTheMemberPortedFromNonNIAPolicy(polMemStrtDateForMemEntity, assertReference);
			saveButtonIsMemberPortedFromNonNiaPolicyPage(polMemStrtDateForMemEntity);
			navigateToPreviousMemberePage(polMemStrtDateForMemEntity);
			navigateToBackMemberPage(polMemStrtDateForMemEntity);
			navigateToPolicyTab(polMemStrtDateForMemEntity);
			navigateToAttributeTab(polMemStrtDateForMemEntity);
			navigateToInsuredInterestTab(polMemStrtDateForMemEntity);
			navigateToCoverageTab(polMemStrtDateForMemEntity);
			navigateToClientDetailsTab(polMemStrtDateForMemEntity);
			navigateToRelationsTab(polMemStrtDateForMemEntity);
			navigateToPaymentsTab(polMemStrtDateForMemEntity);
			navigateToFollowupTab(polMemStrtDateForMemEntity);
			navigateToDocumentTab(polMemStrtDateForMemEntity);
			navigateToDetail1Tab(polMemStrtDateForMemEntity);
			navigateToAttributes1Tab(polMemStrtDateForMemEntity);
			navigateToAttachCoverageTab(polMemStrtDateForMemEntity);
			navigateToRelationTab(polMemStrtDateForMemEntity);
			navigateToPaymentTab(polMemStrtDateForMemEntity);
		}
	}
}
