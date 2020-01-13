package com.aqm.staf.library.pages.rural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.AssertionType;
import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.staf.library.BasePage;
import com.aqm.testing.testDataEntity.ClaimChrgSubLimitREntity;

public class ClaimChargesSubLimitsRural extends BasePage{
	private PageElement courtMasterForAllProductTitle;
	private PageElement claimTab;
	private PageElement insuredItemTab;
	private PageElement documentTab;
	private PageElement partiesTab;
	private PageElement reserveTab;
	private PageElement paymentTab;
	private PageElement attributesTab;
	private PageElement insuredItemDetailsTab;
	private PageElement insuredItemAttributeTab;
	private PageElement claimTabTitle;
	private PageElement insuredItemTabTitle;
	private PageElement documentTabTitle;
	private PageElement partiesTabTitle;
	private PageElement reserveTabTitle;
	private PageElement paymentTabTitle;
	private PageElement attributesTabTitle;
	private PageElement insuredItemDetailsTabTitle;
	private PageElement insuredItemAttributeTabTitle;
	private PageElement claimNumberLabel;
	private PageElement policyNumberLabel;
	private PageElement claimDateLabel;
	private PageElement claimStatusLabel;
	private PageElement productCodeLabel;
	private PageElement causeOfLossLabel;
	private PageElement insuredSerialNoLabel;
	private PageElement insuredItemCodeLabel;
	private PageElement applicableEventCodeLabel;

	private PageElement forwardButton;
	private PageElement backButton;

	private PageElement postmortemDetailsDropDown;
	private PageElement nameOfDoctorTextField;
	private PageElement registrationNoTextField;
	private PageElement addressOfVeterinaryDoctorTextArea;
	private PageElement postMortemRemarksTextArea;
	private PageElement ptdDetailsTextArea;
	
	//YT
	private PageElement assessmentReportDropDown;
	private PageElement IRDALicenseNoTextField;
	private PageElement NameOfTheAssessorTextField;
	private PageElement AddressOfTheAssessorTextArea;
	private PageElement RemarksOfTheAssessorTextArea;
	private PageElement uniqueCoinsuranceDocumentscodeTextField;
	
	//HB
	private PageElement inspectorCertificateDetailsDropDown;
	private PageElement nameOfInspectorTextField;
	private PageElement addressOfInspectorTextField;
	private PageElement inspectionRemarksTextField;
	private PageElement saveButton;
	
	//GG
	private PageElement isReinstatementRequiredDropdown;
	
	//JI
	private PageElement outstandingClaimReasonDropdown;
	
	public ClaimChargesSubLimitsRural(WebDriver driver, String pageName){
		super(driver, pageName);
		
		claimTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Claim')]"), "Claim Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Insured Item')]"), "Insured Item Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		documentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Document')]"), "Document Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		partiesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Parties')]"), "Parties Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		reserveTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Reserve')]"), "Reserve Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		paymentTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Payment')]"), "Payment Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		attributesTab = new PageElement(By.xpath("//a//b//div[contains(text(),'Attributes')]"), "Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemDetailsTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Details')]"), "Insured Item Details Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);
		insuredItemAttributeTab = new PageElement(By.xpath("//a//b//font[contains(text(),'Attributes')]"), "Insured Item Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE,10);

		claimTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Details')]"), "Claim TabTitle",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Damage')]"), "Claim Insured InterestDamage Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Document')]"), "Claim Documents Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		partiesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Parties')]"), "Claim Associated Parties Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		reserveTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Reserve')]"), "Claim Reserve Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		paymentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment')]"), "Claim Payments Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		attributesTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemDetailsTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Damage Detail')]"), "Claim Insured InterestDamage Detail Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemAttributeTabTitle=new PageElement(By.xpath("//div//b[contains(text(),'Property')]"), " Claim Insured Property Title",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		claimNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Claim")), "Claim Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		policyNumberLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Policy Number")), "Policy Number Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimDateLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Claim Date")), "Claim Date Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		claimStatusLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Status")), "Claim Status Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		productCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201","Product")), "Product Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		causeOfLossLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Cause Of Loss")), "Cause Of Loss Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredSerialNoLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Serial No")), "Member Serial No Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		insuredItemCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Member Code")), "Member Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		applicableEventCodeLabel=new PageElement(By.xpath(genericLocatorforLabel("S0201", "Applicable Event Code")), "Applicable Event Code Label",false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);

		forwardButton=new PageElement(By.name("Next1"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10); 
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		postmortemDetailsDropDown= new PageElement(By.xpath("//td//div[contains(text(),'Postmortem Details')]/following::select"), "Postmortem Details DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		nameOfDoctorTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of Doctor')]/following::input"), "Name of Doctor TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		registrationNoTextField= new PageElement(By.xpath("//td//div[contains(text(),'Registration No')]/following::input"), "Registration No TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressOfVeterinaryDoctorTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Address of Veterinary Doctor')]/following::textarea"), "Address of Veterinary Doctor TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		postMortemRemarksTextArea= new PageElement(By.xpath("//td//div[contains(text(),'Post Mortem Remarks')]/following::textarea"), "Post Mortem Remarks TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//YT
		IRDALicenseNoTextField =new PageElement(By.xpath("//td//div[contains(text(),'IRDA license no')]/following::input[1]"), "IRDA License No TextField", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);;
		NameOfTheAssessorTextField = new PageElement(By.xpath("//td//div[contains(text(),'Name of the assessor')]/following::input[1]"), "Name Of The Assessor TextField", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		AddressOfTheAssessorTextArea = new PageElement(By.xpath("//td//div[contains(text(),'Address of the assessor')]/following::textarea[1]"), "Address Of The Assessor TextArea", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		RemarksOfTheAssessorTextArea =new PageElement(By.xpath("//td//div[contains(text(),'Remarks of the assessor')]/following::textarea[1]"), "Remarks Of The Assessor TextArea", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		
		assessmentReportDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Assessment Report')]/following::select"), "Assessment Report DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);
		ptdDetailsTextArea= new PageElement(By.xpath("//td//div[contains(text(),'PTD Details')]/following::textarea"), "Post Mortem Remarks TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		uniqueCoinsuranceDocumentscodeTextField=new PageElement(By.xpath("//td//div[contains(text(),'Unique Co-insurance Documents code')]/following::input"), "Unique Co-insurance Documents code", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		//HB
		inspectorCertificateDetailsDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Inspector certificate details')]/following::select"), "Inspector certificate details DropDown", false,WaitType.WAITFORELEMENTTOBEEENABLED,10);	
		nameOfInspectorTextField= new PageElement(By.xpath("//td//div[contains(text(),'Name of Inspector')]/following::input"), "Name of Inspector TextField", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		addressOfInspectorTextField= new PageElement(By.xpath("//td//div[contains(text(),'Address of Inspector')]/following::textarea"), "Address of Inspector TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		inspectionRemarksTextField= new PageElement(By.xpath("//td//div[contains(text(),'Inspection Remarks')]/following::textarea"), "Inspection Remarks TextArea", false,WaitType.WAITFORELEMENTTOBEDISPLAYED,10);
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//Sachin GG
		isReinstatementRequiredDropdown =new PageElement(By.xpath("//td//div[contains(text(),'Is Reinstatement Required')]/following::select"), "Is Reinstatement Required Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Sachin JI
		outstandingClaimReasonDropdown =new PageElement(By.xpath("//td//div[contains(text(),'Outstanding Claim Reason')]/following::select"), "Outstanding Claim Reason Dropdown", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			
	}
	
	public void fillClaimChargesSubLimitsRural(ClaimChrgSubLimitREntity claimChrgSubLimitREntity ,CustomAssert assertReference) throws InterruptedException{
		if(claimChrgSubLimitREntity.getAction().equalsIgnoreCase("add") || claimChrgSubLimitREntity.getAction().equalsIgnoreCase("edit")){
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPostmortemDetails")) {
				selectValueFromList(postmortemDetailsDropDown, claimChrgSubLimitREntity.getStringValueForField("PostmortemDetails"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigNameOfDoctor")) {
				clearAndSendKeys(nameOfDoctorTextField, claimChrgSubLimitREntity.getStringValueForField("NameOfDoctor"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigInspectorCertificateDetails")) {
				selectValueFromList(inspectorCertificateDetailsDropDown, claimChrgSubLimitREntity.getStringValueForField("InspectorCertificateDetails"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigRegistrationNo")) {
				clearAndSendKeys(registrationNoTextField, claimChrgSubLimitREntity.getStringValueForField("RegistrationNo"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAddressOfVeterinaryDoctor")) {
				clearAndSendKeys(addressOfVeterinaryDoctorTextArea, claimChrgSubLimitREntity.getStringValueForField("AddressOfVeterinaryDoctor"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPostMortemRemarks")) {
				clearAndSendKeys(postMortemRemarksTextArea, claimChrgSubLimitREntity.getStringValueForField("PostMortemRemarks"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAssessmentReport")) {
				selectValueFromList(assessmentReportDropDown, claimChrgSubLimitREntity.getStringValueForField("AssessmentReport"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigNameOfTheAssessor")) {
				clearAndSendKeys(NameOfTheAssessorTextField, claimChrgSubLimitREntity.getStringValueForField("NameOfTheAssessor"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigIRDALicenseNo")) {
				clearAndSendKeys(IRDALicenseNoTextField, claimChrgSubLimitREntity.getStringValueForField("IRDALicenseNo"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAddressOfTheAssessor")) {
				clearAndSendKeys(AddressOfTheAssessorTextArea, claimChrgSubLimitREntity.getStringValueForField("AddressOfTheAssessor"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigRemarksOfTheAssessor")) {
				clearAndSendKeys(RemarksOfTheAssessorTextArea, claimChrgSubLimitREntity.getStringValueForField("RemarksOfTheAssessor"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPTDDetails")) {
				clearAndSendKeys(ptdDetailsTextArea, claimChrgSubLimitREntity.getStringValueForField("PTDDetails"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigNameOfInspector")) {
				clearAndSendKeys(nameOfInspectorTextField, claimChrgSubLimitREntity.getStringValueForField("NameOfInspector"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAddressOfInspector")) {
				clearAndSendKeys(addressOfInspectorTextField, claimChrgSubLimitREntity.getStringValueForField("AddressOfInspector"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigInspectionRemarks")) {
				clearAndSendKeys(inspectionRemarksTextField, claimChrgSubLimitREntity.getStringValueForField("InspectionRemarks"));
			}
		}
		else if(claimChrgSubLimitREntity.getAction().equalsIgnoreCase("verify")){
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigClaimNumber")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("ClaimNumber"), fetchValueFromFields(claimNumberLabel), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPolicyNumber")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("PolicyNumber"),fetchValueFromFields(policyNumberLabel), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigClaimDate")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("ClaimDate"),fetchValueFromFields(claimDateLabel), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigClaimStatus")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("ClaimStatus"),fetchValueFromFields(claimStatusLabel), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigProductCode")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("ProductCode"),fetchValueFromFields(productCodeLabel), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigCauseOfLoss")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("CauseOfLoss"),fetchValueFromFields(causeOfLossLabel), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigApplicableEventCode")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("ApplicableEventCode"),fetchValueFromTextFields(applicableEventCodeLabel), AssertionType.WARNING);
			}
			
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPostmortemDetails")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("PostmortemDetails"),fetchValueFromList(postmortemDetailsDropDown), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigNameOfDoctor")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("NameOfDoctor"),fetchValueFromTextFields(nameOfDoctorTextField), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigRegistrationNo")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("RegistrationNo"),fetchValueFromTextFields(registrationNoTextField), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAddressOfVeterinaryDoctor")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("AddressOfVeterinaryDoctor"),fetchValueFromTextFields(addressOfVeterinaryDoctorTextArea), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPostMortemRemarks")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("PostMortemRemarks"),fetchValueFromTextFields(postMortemRemarksTextArea), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAssessmentReport")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("AssessmentReport"),fetchValueFromList(assessmentReportDropDown), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPTDDetails")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("PTDDetails"),fetchValueFromTextFields(ptdDetailsTextArea), AssertionType.WARNING);
			}
			
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigInspectorCertificateDetails")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("InspectorCertificateDetails"),fetchValueFromList(inspectorCertificateDetailsDropDown), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigNameOfInspector")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("NameOfInspector"),fetchValueFromTextFields(nameOfInspectorTextField), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAddressOfInspector")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("AddressOfInspector"),fetchValueFromTextFields(addressOfInspectorTextField), AssertionType.WARNING);
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigInspectionRemarks")) {
				assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("InspectionRemarks"),fetchValueFromTextFields(inspectionRemarksTextField), AssertionType.WARNING);
			}
		}
	}
	public void navigateToMainAttributePage(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigBackButton")){		
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}	
	public void navigateToclaimHomePage(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigClaimTab")){		
			click(claimTab);
			switchToFrame("display");
			isElementDisplayed(claimTabTitle);
		}
	}

	public void navigateToInsuredItem(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigInsuredItemTab")){		
			click(insuredItemTab);
			switchToFrame("display");
			isElementDisplayed(insuredItemTabTitle);
		}
	}
	public void navigateToDocument(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigDocumentTab")){		
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToParties(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPartiesTab")){		
			click(partiesTab);
			switchToFrame("display");
			isElementDisplayed(partiesTabTitle);
		}
	}
	public void navigateToReserve(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigReserveTab")){		
			click(reserveTab);
			switchToFrame("display");
			isElementDisplayed(reserveTabTitle);
		}
	}

	public void navigateToPayment(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigPaymentTab")){		
			click(paymentTab);
			switchToFrame("display");
			isElementDisplayed(paymentTabTitle);
		}
	}

	public void navigateToAttribute(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigAttributesTab")){		
			click(attributesTab);
			switchToFrame("display");
			isElementDisplayed(attributesTabTitle);
		}
	}
	
	public void clickOnForwardButton(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigForwardButton")){		
			click(forwardButton);
			switchToFrame("display");
			courtMasterForAllProductTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimChrgSubLimitREntity.getStringValueForField("CourtMasterForAllProductTitle")+"')]"), " Court Master For All Product ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		     //isElementDisplayed(courtMasterForAllProductTitle);
		}
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigForwardButtonForJP")){		
			click(forwardButton);
			switchToFrame("display");
			click(saveButton);
			
		}
	}
	
	public void fillClaimChargesSubLimits(ClaimChrgSubLimitREntity claimChrgSubLimitREntity ,CustomAssert assertReference) throws InterruptedException{
		if(claimChrgSubLimitREntity.getAction().equalsIgnoreCase("add") || claimChrgSubLimitREntity.getAction().equalsIgnoreCase("edit")){
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigUniqueCoinsuranceDocumentscode")) {
				clearAndSendKeys(uniqueCoinsuranceDocumentscodeTextField, claimChrgSubLimitREntity.getStringValueForField("UniqueCoinsuranceDocumentscode"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigIsReinstatementRequiredGG")) {
				selectValueFromList(isReinstatementRequiredDropdown, claimChrgSubLimitREntity.getStringValueForField("IsReinstatementRequiredGG"));
			}
		}
			else if(claimChrgSubLimitREntity.getAction().equalsIgnoreCase("verify")){
				if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigUniqueCoinsuranceDocumentscode")) {
					assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("UniqueCoinsuranceDocumentscode"),fetchValueFromTextFields(uniqueCoinsuranceDocumentscodeTextField), AssertionType.WARNING);
				}
				if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigIsReinstatementRequiredGG")) {
					assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("IsReinstatementRequiredGG"), fetchValueFromList(isReinstatementRequiredDropdown), AssertionType.WARNING);
				}
			}
	
		click(forwardButton);
		switchToFrame("display");
		}
	
	public void fillClaimChargesSubLimitsForMiscNonLiability(ClaimChrgSubLimitREntity claimChrgSubLimitREntity ,CustomAssert assertReference) throws InterruptedException{
		if(claimChrgSubLimitREntity.getAction().equalsIgnoreCase("add") || claimChrgSubLimitREntity.getAction().equalsIgnoreCase("edit")){
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigIsReinstatementRequiredGG")) {
				selectValueFromList(isReinstatementRequiredDropdown, claimChrgSubLimitREntity.getStringValueForField("IsReinstatementRequiredGG"));
			}
			if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigOutstandingClaimReason")) {
				selectValueFromList(outstandingClaimReasonDropdown, claimChrgSubLimitREntity.getStringValueForField("OutstandingClaimReason"));
			}
		}
			else if(claimChrgSubLimitREntity.getAction().equalsIgnoreCase("verify")){
				if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigIsReinstatementRequiredGG")) {
					assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("IsReinstatementRequiredGG"), fetchValueFromList(isReinstatementRequiredDropdown), AssertionType.WARNING);
				}
				if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigOutstandingClaimReason")) {
					assertReference.assertEquals(claimChrgSubLimitREntity.getStringValueForField("OutstandingClaimReason"), fetchValueFromList(outstandingClaimReasonDropdown), AssertionType.WARNING);
				}
			}
	}
	public void clickOnForwardButtonForMiscNonLiability(ClaimChrgSubLimitREntity claimChrgSubLimitREntity){
		if (claimChrgSubLimitREntity.getBooleanValueForField("ConfigForwardSaveButton")){		
			click(forwardButton);
			switchToFrame("display");
			click(saveButton);
			courtMasterForAllProductTitle= new PageElement(By.xpath("//div//b[contains(text(),'"+claimChrgSubLimitREntity.getStringValueForField("CourtMasterForAllProductTitle")+"')]"), " Court Master For All Product ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
			isElementDisplayed(courtMasterForAllProductTitle);
		}
	}
	public void fillandSubmitClaimChargesSubLimitsRural(ClaimChrgSubLimitREntity claimChrgSubLimitREntity, CustomAssert assertReference) throws InterruptedException {
		if (isConfigTrue(claimChrgSubLimitREntity.getConfigExecute())){
			switchToFrame("display");
			fillClaimChargesSubLimitsRural(claimChrgSubLimitREntity, assertReference);
			clickOnForwardButton(claimChrgSubLimitREntity);
			if(claimChrgSubLimitREntity.getStringValueForField("Product").equalsIgnoreCase("YS")||claimChrgSubLimitREntity.getStringValueForField("Product").equalsIgnoreCase("YB")||claimChrgSubLimitREntity.getStringValueForField("Product").equalsIgnoreCase("GG")||claimChrgSubLimitREntity.getStringValueForField("Product").equalsIgnoreCase("LI")){
				fillClaimChargesSubLimits(claimChrgSubLimitREntity,assertReference);
			}
			if(claimChrgSubLimitREntity.getStringValueForField("Product").equalsIgnoreCase("JI")||claimChrgSubLimitREntity.getStringValueForField("Product").equalsIgnoreCase("MI")){
				fillClaimChargesSubLimitsForMiscNonLiability(claimChrgSubLimitREntity,assertReference);
				clickOnForwardButtonForMiscNonLiability(claimChrgSubLimitREntity);
			}
			navigateToMainAttributePage(claimChrgSubLimitREntity);
			navigateToclaimHomePage(claimChrgSubLimitREntity);
			navigateToInsuredItem(claimChrgSubLimitREntity);
			navigateToDocument(claimChrgSubLimitREntity);
			navigateToParties(claimChrgSubLimitREntity);
			navigateToReserve(claimChrgSubLimitREntity);
			navigateToPayment(claimChrgSubLimitREntity);
			navigateToAttribute(claimChrgSubLimitREntity);
			
		}
	}

}
