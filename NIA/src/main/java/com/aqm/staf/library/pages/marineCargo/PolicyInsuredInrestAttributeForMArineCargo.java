package com.aqm.staf.library.pages.marineCargo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aqm.framework.constant.AssertionType;
import com.aqm.framework.constant.WaitType;
import com.aqm.framework.core.CustomAssert;
import com.aqm.framework.helper.PageElement;
import com.aqm.framework.helper.RandomCodeGenerator;
import com.aqm.staf.library.BasePage;
import com.aqm.staf.library.ScenarioTestData;
import com.aqm.testing.testDataEntity.PolAttrMarinCargoEntity;
import com.aqm.testing.testDataEntity.PolInsIntAttCarDetMCEntity;
import com.aqm.testing.testDataEntity.PolInsIntAttrMCargoEntity;
import com.aqm.testing.testDataEntity.PolicyRelationDetailEntity;


public class PolicyInsuredInrestAttributeForMArineCargo extends BasePage {
	private PageElement policyTab;	
	private PageElement attributeTab;	
	private PageElement insuredInterestTab;	
	private PageElement coverageTab;	
	private PageElement loanTab;	
	private PageElement clientDetailsTab;	
	private PageElement relationsTab;	
	private PageElement paymentsTab;	
	private PageElement followupTab;	
	private PageElement documentTab;
	private PageElement policyTabTitle;	
	private PageElement attributeTabTitle;	
	private PageElement insuredInterestTabTitle;	
	private PageElement coverageTabTitle;
	private PageElement loanTabTitle;

	private PageElement clientDetailsTabTitle;	
	private PageElement relationsTabTitle;	
	private PageElement paymentsTabTitle;	
	private PageElement followupTabTitle;	
	private PageElement documentTabTitle;
	private PageElement nextAttributePageTitle;

	private PageElement quoteNoLabel;
	private PageElement productLabel;
	private PageElement policyHolderLabel;
	private PageElement statusLabel;
	private PageElement policyNoLabel;
	private PageElement insuredInterestCodeLabel;
	private PageElement insuredInterestSerialNoLabel;
	private PageElement forwardButton;
	private PageElement backButton;
	private PageElement insuredInterestDetailTab;
	private PageElement insuredInterestAttributesTab;
	private PageElement insuredInterestAttachCoveragesTab;
	private PageElement insuredInterestRelationsTab;
	private PageElement insuredInterestPaymentsTab;
	private PageElement insuredInterestScheduleTab;

	private PageElement insuredInterestAttributesPageTitle;
	private PageElement insuredInterestDetailsPageTitle;
	private PageElement insuredInterestAttachCoveragePageTitle;
	private PageElement insuredInterestRelationsPageTitle;
	private PageElement insuredInterestPaymentPageTitle;

	//DIGVIJAY  AT
	private PageElement whetherOverDimensionalCargotoBeCoveredDropDown;
	private PageElement whetherInsuredIsaCompanyAsPerCompanyActDropDown;
	private PageElement whetherITSystemIsInPlaceDropDown;
	private PageElement whetherCapitalGoodsPlantAndMachineryToBeCoveredDropDown;
	private PageElement indigenousDomesticSalesTurnoverTextField;
	private PageElement exportSalesTurnoverTextField;
	private PageElement expectedProvisionalAnnualSalesTurnoverTextField;
	private PageElement extraForBasisOfValuationTextField;
	private PageElement totalProvisionalAnnualSumInsuredTextField;
	private PageElement commodityDetailsOpenButton;
	private PageElement warAndSRCCApplicableDropDown;
	private PageElement warAndSRCCRateTextField;
	private PageElement srccApplicableDropDown;
	private PageElement srccRateTextField;
	private PageElement detOfProviDispAndShipsDurThePolPeriodOfSEZLocationTextArea;
	private PageElement noOfTransitTypesDesiredTextField;
	private PageElement transitTypeDetailsOpenButton;
	private PageElement premiumRateTextField;
	//digvijay AT commodity details open button
	private PageElement commodityTypeDropDownOfNextWindow;
	private PageElement commodityDescriptionTextAreaOfNextWindow;
	private PageElement packagingDropDownOfNextWindow;
	private PageElement packagingDescriptionTextAreaOfNextWindow;
	private PageElement commoditySumInsuredTextFieldOfNextWindow;
	private PageElement commodityRateTextFieldOfNextWindow;
	//digvijay AT Transit Type details open button
	private PageElement transitTypeForATDropDownOfNextWindow; 
	private PageElement riskCoveredForATDropDownOfNextWindow;
	private PageElement basisOfValuationForATDropDownOfNextWindow;
	private PageElement extraTextFieldOfNextWindow;
	//DIGVIJAY  AN
	private PageElement transitTypeForMarineCargoDropDown;
	private PageElement totalLossOnlyDropDown;
	private PageElement singleCarryingLimitTextField;
	private PageElement distanceInKmTextField;
	//DIGVIJAY  SI
	private PageElement transitTypeForSIDropDown;
	//DIGVIJAY  SV SAME LIKE AN,SI

	//OCInsured dharmendra  
	private PageElement yearTextField;	
	private PageElement majorCommodityDropDown;
	private PageElement limitPerLocationTextField;
	private PageElement limitPerLocationlClauseDropDown;
	private PageElement transitTypedetailsButton;
	private PageElement transitDetailsButton;
	//ocopenbutton
	private PageElement openButton;
	private PageElement serialNoTextFieldOfNextWindow;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow;
	private PageElement transitTypeforOCTextField;
	private PageElement commodityTypeTextField;
	//private PageElement commodityDescriptionTextArea;
	private PageElement packagingTextField;
	private PageElement packagingDescriptionTextField;
	//private PageElement commodityRateTextField;
	private PageElement riskCoveredforOCTextField;
	private PageElement warAndSRCCrateforTransitTypeTextField;
	private PageElement increasedValueRateTextField;
	private PageElement dutyRateTextField;
	private PageElement dutyRateforWarandSRCCTextField;
	//Rajkumar -- DI
	private PageElement transitTypeForDITitle;
	private PageElement transitTypeForMarineDropDown;
	//Rajkumar -- IV
	//Rajkumar -- TC
	private PageElement policyTypeForTeaCropInsuranceDropDown;
	private PageElement estateCodeClickButton;
	//Open button Field
	private PageElement estateCodeTextField;
	private PageElement estateNameTextField;
	private PageElement searchButton;
	private PageElement estateCodeToBeSelectedLink;
	private PageElement BackButtons;
	private PageElement estateCodeVerify;

	//OcInsured dharmendra 22

	private PageElement addButtonOfNextWindowButton;
	private PageElement warandSRCCrateforIncreasedValueTextField;
	private PageElement transitTypeforOCDropDown;
	private PageElement commodityTypeDropDown;
	private PageElement packagingDropDown;
	private PageElement riskCoveredforOCDropDown;
	private PageElement modeOfTransportsDropDown;
	private PageElement landConveyanceCodeCDropDown;
	private PageElement fromPlaceTextArea;
	private PageElement toPlaceTextArea;
	//CC Insured dharmendra
	private PageElement journeyStartDateDateField;
	private PageElement transitTypeforOCInsuredccDropDown;
	private PageElement commodityTypeInsuredDropDown;
	private PageElement packagingInsuredccDropDown;
	private PageElement consigneeTextArea;
	private PageElement commoditydescriptionTextArea;
	private PageElement otherCommodityDescriptionTextArea;
	private PageElement packagingDescriptionTextArea;
	//OP Insured Dharmendra

	//private PageElement transportDetailsOpenButton;
	private PageElement commoditySumInsuredTextField;	
	private PageElement commodityRateOfOPTextField;	
	private PageElement seaApplicableDropDown;
	private PageElement airApplicableDropDown;
	private PageElement railRoadApplicableDropDown;
	private PageElement postApplicableDropDown;
	private PageElement courierApplicableDropDown;
	private PageElement coastalApplicableDropDown;
	private PageElement isTotalLossRiskApplicableDropDown;
	private PageElement isSVCApplicableDropDown;
	private PageElement isICCAapplicableDropDown;
	private PageElement iCCAClauseapplicableDropDown;
	private PageElement isICCBApplicableDropDown;
	private PageElement iCCBclauseApplicableDropDown;
	private PageElement isICCCApplicableDropDown;
	private PageElement iCCCclauseApplicableDropDown;
	private PageElement isICCAirApplicableDropDown;
	private PageElement iCCAirclauseApplicableDropDown;
	private PageElement isITCAApplicableDropDown;
	private PageElement iTCAClauseApplicableDropDown;
	private PageElement isITCBApplicableDropDown;
	private PageElement iTCBclauseApplicableDropDown;
	private PageElement isITCCApplicableDropDown;
	private PageElement iTCCclauseApplicableDropDown;
	private PageElement commodityRateTextField;
	private PageElement commodityDescriptionTextArea;

	//private PageElement transportModeDropDown;
	private PageElement landConveyanceCodeDropDown;
	private PageElement portofLoading;
	private PageElement exportToCountryClickButton;
	private PageElement exportToCountryTextField;
	private PageElement countrySearchTextField;
	private PageElement contrySearchFindButton;
	private PageElement exportToCityTextField;
	private PageElement exportToCityClickButton;
	private PageElement citySearchTextField;
	private PageElement citySearchFindButton;
	private PageElement citySearchToBeSelectedLink;
	private PageElement countrySearchToBeSelectedLink;
	private PageElement addButton;
	private PageElement limitPerLocationClauseDropDown;
	private PageElement limitPerAircraftTextField;
	private PageElement limitPerVesselTextField;
	private PageElement limitPerRegisteredPostTextField;
	private PageElement declarationBookStartNoTextField;
	private PageElement declarationBookEndNoTextField;
	private PageElement whetherOverDimensionalDropDown;
	private PageElement basisOfValuationForAnnualPolicyDropDown;
	private PageElement typeOfBillDropDown;
	private PageElement billNumberTextArea;
	private PageElement billDateTextField;
	private PageElement markNumberTextArea;
	private PageElement typeOfPostDropDown;
	private PageElement typeOfCarrierDropDown;
	private PageElement cargoPolicyNumberTextField;
	private PageElement issuingOfficeAddressTextArea;
	private PageElement machinerySubjectToClauseDropdown;
	private PageElement carrierLimitedLiabilityDropDown;
	private PageElement portOfDischargeTextArea;
	private PageElement machineryDropDown;
	private PageElement secondHandDropDown;
	private PageElement journeyStartDateTextField;
	private PageElement transporterNameTextArea;
	private PageElement estateAddressTextField;
	private PageElement totalCropAreaOfEstateTextField;
	private PageElement nurseryCropAreaInHectaresTextField;
	private PageElement minimumElevationTextField;
	private PageElement averageElevationTextField;
	private PageElement approxDateOfCommencementOfPluckingTextField;
	private PageElement approxDateOfTerminationOfPluckingTextField;
	private PageElement periodOfPluckingInMonthsTextField;
	private PageElement ratioOfGreenLeafToMadeTeaTextField;
	private PageElement averageMadeTeaProducedInLastThreeyearsTextField;
	private PageElement basisOfValuationForTeaCropDropDown;
	private PageElement valuePerKgForInlandTextField;
	private PageElement natureOfPackingForTeaTextArea;
	private PageElement typeOfExportDropDown ;
	private PageElement basisOfValuationTextField ;
	private PageElement transportDetailsOpenButton;
	private PageElement addOpenButton;
	private PageElement modeOfTransDropDown;
	//AT
	private PageElement WhetherOverDimensionalCoverToBeCovered;
	private PageElement WhetherInsuredIsCompany;
	private PageElement WhetherCapitalGoodsToBeCovered;
	private PageElement IndigenousSalesTurnOver;
	private PageElement ExportSalesTurnOver;
	private PageElement ExtraForBasisValuation;
	private PageElement ConfigCommodityDetails;
	private PageElement WARAndSRCCApplicable;
	private PageElement SRCCApplicable;
	private PageElement DetailsOfProvisionalDispatches;
	private PageElement NoOfTransistTypeDesired;
	private PageElement PremiumRate;
	private PageElement ConfigTransitTypeDetails;
	private PageElement ContainerizedCargo;
	private PageElement CargoSumInsured;
	private PageElement DutyInsuranceValue;
	private PageElement BaicValuationForOc;
	private PageElement ExtraPer;
	private PageElement BasisOfValuationForMarine;
	private PageElement transportModeDropDown;
	private PageElement modeOfTransportDropDown;
	//code commit by piyush for fior marine cargo 
	private PageElement PremiumrateTC;
	private PageElement DiversionrateTC;
	private PageElement ISMComplianceSumInsured;
	private PageElement EstimatedquantityofmadeteasoldforOverseas;
	private PageElement ISMComplianceRate;
	private PageElement transistDetailsOpenButton;
	private PageElement transistTypeForOcDropdown;
	private PageElement commodityTypeOCDropDownOfNextWindow;
	private PageElement packagingOCDropDown;
	private PageElement commodityDescriptionCCTextArea;
	private PageElement otherCommodityDescriptionOCTextArea;
	private PageElement consigneeOCTextArea;
	private PageElement packagingDescriptionOCTextArea;
	public PolicyInsuredInrestAttributeForMArineCargo(WebDriver driver, String pageName) {
		super(driver, pageName);
		packagingDescriptionOCTextArea = new PageElement(By.xpath("//div[starts-with(text(),'Packaging Description')]//following::textarea[1]"), "Packing Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfTransportDropDown= new PageElement(By.xpath("//b[contains(text(),'Mode of Transport')]//following::select[1]"), "ModeOf DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		consigneeOCTextArea= new PageElement(By.xpath("//div[starts-with(text(),'Consignee Name')]//following::textarea[1]"), "Consignee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherCommodityDescriptionOCTextArea = new PageElement(By.xpath("//div[starts-with(text(),'Other Commodity Description')]//following::textarea[1]"), "Other Commodity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDescriptionCCTextArea= new PageElement(By.xpath("//div[starts-with(text(),'Commodity Description')]//following::textarea[1]"), "Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingOCDropDown = new PageElement(By.xpath("//div[contains(text(),'Transit Type for OC')]//following::select[3]"), "Packing OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transistTypeForOcDropdown = new PageElement(By.xpath("//div[contains(text(),'Transit Type for OC')]//following::select[1]"), "Transist Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transistDetailsOpenButton= new PageElement(By.xpath("//div[contains(text(),'Transit Details')]/following::input[1]"), "Open", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PremiumrateTC=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium rate (%)", "input")), "PremiumrateTC", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DiversionrateTC=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diversion rate (%)", "input")), "DiversionrateTC", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transportModeDropDown = new PageElement(By.xpath("//b[contains(text(),'Transport Mode')]//following::select[1]"),"Transport Mode", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		DiversionrateTC=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Diversion rate (%)", "input")), "DiversionrateTC", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transportDetailsOpenButton = new PageElement(By.xpath("//div[contains(text(),'Transport Details')]//following::input[1]"), "Transport Details Open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		estateAddressTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estate Address')]/following::textarea"), "Estate Address TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		portofLoading=new PageElement(By.xpath("//textarea[@name=('propValues2')]"),"Port of Loading",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalCropAreaOfEstateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Crop Area of Estate.(In Hectares)')]/following::input"), "Total Crop Area of Estate In Hectares TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nurseryCropAreaInHectaresTextField=new PageElement(By.xpath("//td//div[contains(text(),'Nursery Crop Area(In Hectares)')]/following::input"), "Nursery Crop Area In Hectares TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		minimumElevationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average Elevation')]/following::input"), "Minimum Elevation TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		averageElevationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average Elevation')]/following::input"), "Average Elevation TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approxDateOfCommencementOfPluckingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approx Date of commencement of plucking')]/following::input"), "Approx Date Of Commencement Of Plucking Date Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approxDateOfTerminationOfPluckingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approx date of termination of plucking')]/following::input"), "Approx Date Of Termination Of Plucking Date Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfExportDropDown= new PageElement(By.xpath("//div[contains(text(),'Type of Export')]//following::select[1]"), "Type Of export", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationTextField = new PageElement(By.xpath("//div[contains(text(),'Basis of Valuation')]//following::input[1]"), "Basis Of Valuation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		periodOfPluckingInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period of plucking in months')]/following::input"), "Period Of Plucking In Months Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratioOfGreenLeafToMadeTeaTextField=new PageElement(By.xpath("//td//div[contains(text(),'%)Ratio of green leaf to made tea.')]/following::input"), "Ratio Of Green Leaf To Made Tea Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		averageMadeTeaProducedInLastThreeyearsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average made tea produced in last 3 years')]/following::input"), "Average Made Tea Produced In Last Three years", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForTeaCropDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for Tea Crop')]/following::select"), "Basis Of Valuation For Tea Crop List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valuePerKgForInlandTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value per kg for Inland')]/following::input"), "Value Per Kg For Inland Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfPackingForTeaTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Packing For Tea')]/following::textarea"), "Nature Of Packing For Tea Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		modeOfTransportDropDown= new PageElement(By.xpath("//b[contains(text(),'Mode of Transport')]//following::select[1]"), "ModeOf DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transporterNameTextArea= new PageElement(By.xpath("//div[contains(text(),'Transporter Name')]//following::textarea[1]"), "Transporters Nmae", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		journeyStartDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Journey Start Date')]/following::input"), "Journey Start Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		portOfDischargeTextArea=new PageElement(By.xpath("//div[contains(text(),'Port of Discharge')]//following::textarea[1]"),"Port of Discharge",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		machineryDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery')]/following::select"), "Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		secondHandDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Second Hand')]/following::select"), "Second Hand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machinerySubjectToClauseDropdown = new PageElement(By.xpath("//div[contains(text(),'Machinery subject to clause')]//following::select[1]"), "Machinery Subject to Clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		carrierLimitedLiabilityDropDown = new PageElement(By.xpath("//div[contains(text(),'Carrier Limited Liability')]//following::select[1]"), "Carrier Limited Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cargoPolicyNumberTextField= new PageElement(By.xpath("//div[contains(text(),'Cargo Policy Number')]//following::input[1]"), "Cargo Policy Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		issuingOfficeAddressTextArea= new PageElement(By.xpath("//div[contains(text(),'Issuing Office Address')]//following::textarea[1]"), "Issuing office address", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationBookStartNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book Start No')]/following::input"), "Declaration Book Start No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationBookEndNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book End No')]/following::input"), "Declaration Book End No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherOverDimensionalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether over-dimensional')]/following::select"), "Whether over-dimensional", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForAnnualPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation-SI or Actual Duty paid,which ever is less')]/following::select"), "Basis of Valuation for Annual Policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBillDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Bill')]/following::select"), "Type of Bill", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		billNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bill Date')]/following::input"), "Bill Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPostDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Post')]/following::select"), "Type of Post", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfCarrierDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Carrier')]/following::select"), "Type of Carrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitPerAircraftTextField= new PageElement(By.xpath("//div[contains(text(),'Limit Per Aircraft')]//following::input[1]"), "Limit Per Aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerVesselTextField= new PageElement(By.xpath("//div[contains(text(),'Limit Per Vessel')]//following::input[1]"), "Limit Per Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerRegisteredPostTextField= new PageElement(By.xpath("//div[contains(text(),'Limit Per Registered Post')]//following::input[1]"), "Limit Per Registered Post", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		addOpenButton=new PageElement(By.xpath("//input[@value=('Add')]"), "Add", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		limitPerLocationClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location Clause')]/following::select"), "Limit Per Location Clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		addButton= new PageElement(By.xpath("//input[@name=('btnAdd')]"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		portofLoading=new PageElement(By.xpath("//div[contains(text(),'Port of Loading')]//following::textarea[1]"),"Port of Loading",false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyTab=new PageElement(By.xpath("//a//div//b[contains(text(),'Policy')]"), "Policy Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		attributeTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Attribute')]"), "Attribute Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Insured Interest')]"), "Insured Interest Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		coverageTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Coverage')]"), "Coverage Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		loanTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Loan')]"), "Loan Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		clientDetailsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Client Details')]"), "Client Details Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		relationsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Relations')]"), "Relations Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		paymentsTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Payments')]"), "Payments Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		followupTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Followup')]"), "Followup Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		documentTab=new PageElement(By.xpath("//td//div//b[contains(text(),'Document')]"), "Document Tab Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		quoteNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Quote No')]/following::td"), "Quote No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyNoLabel= new PageElement(By.xpath("//div//b[contains(text(),'Policy No.')]/following::td"), "policyNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		productLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Product')]/following::td"), "Product", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		statusLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Status')]/following::td"), "Status", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		policyHolderLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Policyholder')]/following::td"), "Policyholder", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//policyHolderLabel= new PageElement(By.xpath(genericLocatorforLabel("S0042", "Policyholder"))," Policy Holder Label", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestCodeLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured InterestCode')]/following::td"), "Insured InterestCode", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestSerialNoLabel= new PageElement(By.xpath("//form[@name='S0042']//td//b[contains(text(),'Insured Interest Serial No')]/following::td"), "Insured Interest Serial", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		forwardButton=new PageElement(By.name("Next"), "Forward Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//
		policyTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote')]"), "Policy/Qoute Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		attributeTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Attributes')]"), "Policy Attributes Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Insured Interest')]"), "Insured Interest Tab Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		coverageTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Coverage')]"), "Coverage Details", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		loanTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Loan')]"), "Loan", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		clientDetailsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Client Detail')]"), "client Details TabTitle ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		relationsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Relations", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		paymentsTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Payment Titile ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		followupTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quote/Policy')]"), "Follow up Title ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		documentTabTitle= new PageElement(By.xpath("//div//b[contains(text(),'Policy Document')]"), "Policy Document Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		nextAttributePageTitle= new PageElement(By.xpath("//div//b[contains(text(),'Quotation Details')]")," Next Attribute Page Tittle", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//
		insuredInterestDetailTab = new PageElement(By.xpath("//div[@title='Detail']/b"), "Insured Interest Detail Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttachCoveragesTab = new PageElement(By.xpath("//div//b[contains(text(),'Attach Coverages')]"), "Insured Interest Attach Coverages Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestRelationsTab = new PageElement(By.xpath("//div[@title='Relation']/b"), "Insured Interest Relations Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestPaymentsTab = new PageElement(By.xpath("//div[@title='Relation']/following::td//a//div/b"), "Insured Interest Payments Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestScheduleTab = new PageElement(By.xpath("//div//b[contains(text(),'Schedule')]"), "Insured Interest Schedule Tab", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		insuredInterestAttributesPageTitle=new PageElement(By.xpath("//b[contains(text(),'Attributes')]"), "Insured Interest Attributes Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestDetailsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Policy')]"), "Insured Interest Details Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestAttachCoveragePageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Insured Interest Coverage')]"), "Insured Interest Attach Coverage Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestRelationsPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Relations')]"), "Insured Interest Relations Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		insuredInterestPaymentPageTitle=new PageElement(By.xpath("//div//b[contains(text(),'Payment List')]"), "Insured Interest Payment Page Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY  AT
		whetherOverDimensionalCargotoBeCoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Over Dimensional cargo to be covered?')]/following::select"), "Whether Over Dimensional cargo to be covered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherInsuredIsaCompanyAsPerCompanyActDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Insured is a Company as per Company Act')]/following::select"), "Whether Insured is a Company as per Company Act", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherITSystemIsInPlaceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether IT System is in place?')]/following::select"), "Whether IT System is in place", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherCapitalGoodsPlantAndMachineryToBeCoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Capital Goods (Plant and Machinery)')]/following::select"), "Whether Capital Goods (Plant and Machinery)", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		indigenousDomesticSalesTurnoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Indigenous (Domestic) sales turnover')]/following::input"), "Indigenous (Domestic) sales turnover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exportSalesTurnoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Export sales turnover')]/following::input"), "Export sales turnover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		expectedProvisionalAnnualSalesTurnoverTextField=new PageElement(By.xpath("//td//div[contains(text(),'Expected (Provisional) annual sales turnover')]/following::input"), "Expected (Provisional) annual sales turnover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extraForBasisOfValuationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Extra for basis of valuation')]/following::input"), "Extra for basis of valuation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		totalProvisionalAnnualSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total (Provisional) Annual Sum Insured')]/following::input"), "Total (Provisional) Annual Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Details')]/following::input"), "Open Button for Commodity Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		warAndSRCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'WAR and SRCC Applicable')]/following::select"), "WAR and SRCC Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		warAndSRCCRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'WAR and SRCC rate')]/following::input"), "WAR and SRCC rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		srccApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Applicable')]/following::select[2]"), "SRCC Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		srccRateTextField=new PageElement(By.xpath("//tr[15]//td//div[contains(text(),'SRCC rate')]/following::input"), "SRCC rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detOfProviDispAndShipsDurThePolPeriodOfSEZLocationTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Details of provisional dispatches and shipments during the policy period')]/following::textarea"), "Details of provisional dispatches and shipments during the policy", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfTransitTypesDesiredTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of Transit Types Desired')]/following::input"), "No of Transit Types Desired", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Type details')]/following::input"), "Open Button for Transit Type details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		premiumRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Premium Rate')]/following::input"), "Premium Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay AT commodity details open button
		serialNoTextFieldOfNextWindow=new PageElement(By.name("slNo0"), "serialNo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityTypeDropDownOfNextWindow=new PageElement(By.name("Data_213906805022010_0"), "commodityType", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeOCDropDownOfNextWindow=new PageElement(By.xpath("//div[contains(text(),'Transit Type for OC')]//following::select[2]"), "commodityType", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityDescriptionTextAreaOfNextWindow=new PageElement(By.name("Data_213910105022010_0"), "commodityDescription", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDropDownOfNextWindow=new PageElement(By.name("Data_213910205022010_0"), "packaging", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDescriptionTextAreaOfNextWindow=new PageElement(By.name("Data_213913805022010_0"), "ackagingDescription", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commoditySumInsuredTextFieldOfNextWindow=new PageElement(By.name("Data_213913905022010_0"), "commoditySumInsured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateTextFieldOfNextWindow=new PageElement(By.name("Data_213914005022010_0"), "commodityRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//digvijay AT Transit Type details open button
		transitTypeForATDropDownOfNextWindow=new PageElement(By.name("Data_232176127082010_0"), "transitTypeForATDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskCoveredForATDropDownOfNextWindow=new PageElement(By.name("Data_232177527082010_0"), "riskCoveredForATDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForATDropDownOfNextWindow=new PageElement(By.name("Data_232245127082010_0"), "basisOfValuationForATDropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extraTextFieldOfNextWindow=new PageElement(By.name("Data_213916805022010_0"), "extraTextField", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY  AN
		transitTypeForMarineCargoDropDown=new PageElement(By.xpath("//select[@name=('propValues1')]"), "Transit Type For Marine Cargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalLossOnlyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Total Loss Only')]/following::select"), "Total Loss Only", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		singleCarryingLimitTextField=new PageElement(By.xpath("//td//div[contains(text(),'Single Carrying Limit')]/following::input"), "Single Carrying Limit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		distanceInKmTextField=new PageElement(By.xpath("//td//div[contains(text(),'Distance in Km')]/following::input"), "Distance in Km", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY  SI
		transitTypeForSIDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type For SI')]/following::select"), "Transit Type For SI", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//OCInsured
		majorCommodityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Major Commodity')]/following::select"), "Major Commodity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitPerLocationlClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location Clause')]/following::select"), "Limit Per Location Clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Year')]/following::input"), "Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerAircraftTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Aircraft')]/following::input"), "Limit Per Aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerVesselTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Vessel')]/following::input"), "Limit Per Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerRegisteredPostTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Registered Post')]/following::input"), "Limit Per Registered Post", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerLocationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location')]/following::input"), "Limit Per Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		serialNoTextFieldOfNextWindow= new PageElement(By.name("slNo0"), "SerialNo Of New Window", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//installmentPercentageTextFieldOfNextWindow= new PageElement(By.name("Data_210784827092009_0"+rowCounts+""), "InstallmentPercentageTextField of New Window", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transitTypeForDITitle=new PageElement(By.xpath("//div//b//font[contains(text(),'Transit Type For DI')]"), "Transit Type For DI Title", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeForMarineDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type For Marine')]/following::select"), "Transit Type For Marine List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//OCInsured dharmendra 22
		transitTypedetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Type details')]/following::input"), "Transit Type details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		transitDetailsButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Details')]/following::input"), "Transit Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		addButtonOfNextWindowButton= new PageElement(By.name("btnAdd"), "AddButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextFieldOfNextWindow= new PageElement(By.name("slNo0"), "Serial No.", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextField= new PageElement(By.name("Data_213913805022010_0"), "Packaging Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateTextField= new PageElement(By.name("Data_213914005022010_0"), "Commodity Rate(%) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		warAndSRCCrateforTransitTypeTextField= new PageElement(By.name("Data_232190427082010_0"), "War and SRCC rate for Transit Type(%) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		increasedValueRateTextField= new PageElement(By.name("Data_232184427082010_0"), "Increased Value Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dutyRateTextField= new PageElement(By.name("Data_232184327082010_0"), "Duty Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		dutyRateforWarandSRCCTextField= new PageElement(By.name("Data_232184627082010_0"), "Duty Rate for War and SRCC(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDescriptionTextArea= new PageElement(By.name("Data_213910105022010_0"), "Commodity Description ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		warandSRCCrateforIncreasedValueTextField= new PageElement(By.name("Data_232184727082010_0"), "War and SRCC rate for Increased Value(%) ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeforOCDropDown=new PageElement(By.name("Data_232182127082010_0"), "Transit Type for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeDropDown=new PageElement(By.name("Data_213906805022010_0"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDropDown=new PageElement(By.xpath("//b[contains(text(),'Packaging')]/following::select[3]"), "Packaging ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskCoveredforOCDropDown=new PageElement(By.name("Data_232189327082010_0"), "Risk Covered for OC  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		fromPlaceTextArea= new PageElement(By.name("Data_213898705022010_0"), "From Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		toPlaceTextArea= new PageElement(By.name("Data_213898805022010_0"), "To Place  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfTransportsDropDown=new PageElement(By.xpath("//b[contains(text(),'Mode of Transports')]/following::select[1]"), "Mode of Transports ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		landConveyanceCodeCDropDown=new PageElement(By.name("Data_232556027082010_0"), "Land Conveyance Code  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//CC Insured dharmendra
		journeyStartDateDateField=new PageElement(By.xpath("//td//div[contains(text(),'Journey Start Date')]/following::input"), "Journey Start Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		transitTypeforOCInsuredccDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type for OC')]/following::select"), "Transit Type for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeInsuredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Type')]/following::select')]/following::select"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingInsuredccDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Packaging')]/following::select"), "Packaging", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		consigneeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee')]/following::textarea"), "Consignee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commoditydescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Description')]/following::textarea"), "Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherCommodityDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Other Commodity Description')]/following::textarea"), "Other Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Packaging Description')]/following::textarea"), "Packaging Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//OP Insured dharmendra 
		//transportDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Transport Details')]/following::input"), "Transport Details", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		commoditySumInsuredTextField= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Sum Insured')]/following::input"), "Commodity Sum Insured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityRateOfOPTextField= new PageElement(By.xpath("//td//div[contains(text(),'Commodity Rate(%)')]/following::input"), "Commodity Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		seaApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sea Applicable')]/following::select"), "Sea Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		airApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Air Applicable')]/following::select"), "Air Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		railRoadApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Rail/Road Applicable')]/following::select"), "Rail/Road Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		postApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Post Applicable')]/following::select"), "Post Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		courierApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Courier Applicable')]/following::select"), "Courier Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		coastalApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Coastal Applicable')]/following::select"), "Coastal Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isTotalLossRiskApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is Total Loss Risk Applicable?')]/following::select"), "Is Total Loss Risk Applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isSVCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is SVC Applicable?')]/following::select"), "Is SVC Applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCAapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-A applicable?')]/following::select"), "Is ICC-A applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCAClauseapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (A) clause applicable')]/following::select"), "ICC (A) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCBApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-B applicable?')]/following::select"), "Is ICC-B applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCBclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (B) clause applicable')]/following::select"), "ICC (B) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-C applicable?')]/following::select"), "Is ICC-C applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCCclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (C) clause applicable')]/following::select"), "ICC (C) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCAirApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ICC-Air applicable?')]/following::select"), "Is ICC-Air applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iCCAirclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ICC (Air) clause applicable')]/following::select"), "ICC (Air) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCAApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ITC-A applicable?')]/following::select"), "Is ITC-A applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iTCAClauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ITC (A) clause applicable')]/following::select"), "ITC (A) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCBApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ITC-B applicable?')]/following::select"), "Is ITC-B applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iTCBclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ITC (B) clause applicable')]/following::select"), "ITC (B) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Is ITC-C applicable?')]/following::select"), "Is ITC-C applicable?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		iTCCclauseApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'ITC (C) clause applicable')]/following::select"), "ITC (C) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TC--Rajkumar
		policyTypeForTeaCropInsuranceDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Policy Type for Tea Crop Insurance')]/following::select"), "Policy Type For Tea Crop Insurance List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estateCodeTextField=new PageElement(By.name("pEstateCode"), "Estate Code Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		estateNameTextField=new PageElement(By.name("pEstateName"), "Estate Name Text", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButton=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		estateCodeClickButton=new PageElement(By.xpath("//td//b[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Estate Code Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		estateCodeVerify= new PageElement(By.xpath("//td//div[contains(text(),'Estate Code')]/following::input"), "Estate Code Verify", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);

		//packagingDropDown=new PageElement(By.name("Data_232199227082010_0"), "Transport Mode ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//packagingDropDown=new PageElement(By.name("Data_232556027082010_0"), "Land Conveyance Code  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);

		exportToCountryClickButton=new PageElement(By.xpath("//td//div[contains(text(),'Country')]/following::input/following::a[@name='firstFocus']"), "Export to Country Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exportToCountryTextField= new PageElement(By.xpath("//td//div[contains(text(),'Export to Country')]/following::input"), "Export to Country", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countrySearchTextField=new PageElement(By.name("cntcty"), "Country Search Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		contrySearchFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Country Search')]/following::input/following::a[@name='firstFocus']"), "Country Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exportToCityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Export to City')]/following::input"), "Export to City", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exportToCityClickButton=new PageElement(By.xpath("//td//div[contains(text(),'City')]/following::input/following::a[@name='firstFocus']"), "Export to Country Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		citySearchTextField=new PageElement(By.name("cntcty"), "City Search Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		citySearchFindButton=new PageElement(By.xpath("//td//b[contains(text(),'City Search')]/following::input/following::a[@name='firstFocus']"), "City Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//AT
	 	WhetherOverDimensionalCoverToBeCovered=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Over Dimensional cargo to be covered?", "select")), "WhetherOverDimensionalCoverToBeCovered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WhetherInsuredIsCompany=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Insured is a Company as per Company Act?", "select")), "WhetherInsuredIsCompany", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WhetherCapitalGoodsToBeCovered=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Capital Goods (Plant and Machinery) to be covered?", "select")), "WhetherCapitalGoodsToBeCovered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IndigenousSalesTurnOver=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Indigenous (Domestic) sales turnover", "input")), "IndigenousSalesTurnOver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExportSalesTurnOver=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Export sales turnover", "input")), "ExportSalesTurnOver", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExtraForBasisValuation=new PageElement(By.xpath(locatorforQuestionAnswerPanel("(%) Extra for basis of valuation", "input")), "ExtraForBasisValuation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WARAndSRCCApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("WAR and SRCC Applicable", "select")), "WARAndSRCCApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SRCCApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC Applicable", "select")), "SRCCApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		DetailsOfProvisionalDispatches=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Details of provisional dispatches and shipments during the policy period", "textarea")), "DetailsOfProvisionalDispatches", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NoOfTransistTypeDesired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Transit Types Desired", "input")), "NoOfTransistTypeDesired", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PremiumRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Premium Rate", "input")), "PremiumRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ContainerizedCargo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Containerized Cargo", "select")), "ContainerizedCargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		CargoSumInsured=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Cargo Sum Insured", "input")), "CargoSumInsured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DutyInsuranceValue=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Duty Insurance Value", "input")), "DutyInsuranceValue", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BaicValuationForOc=new PageElement(By.xpath("//div[contains(text(),'Basis of Valuation for OC')]//following::select[1]"), "BaicValuationForOc", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExtraPer=new PageElement(By.xpath("//div[contains(text(),'% Extra')]//following::input[1]"), "ExtraPer", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfTransDropDown = new PageElement(By.xpath("//b[contains(text(),'Mode Of Transport')]//following::select[1]"), "ModeOf DropDown", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BasisOfValuationForMarine=new PageElement(By.name("propValues8"), "Basis Of Valuation For Marine", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TC
		ISMComplianceSumInsured=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ISM Compliance Sum Insured", "input")), "ISMComplianceSumInsured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ISMComplianceRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ISM Compliance Rate(%)", "input")), "ISMComplianceRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		EstimatedquantityofmadeteasoldforOverseas=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Estimated quantity of made tea sold for Overseas", "input")), "EstimatedquantityofmadeteasoldforOverseas", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		modeOfTransportDropDown= new PageElement(By.xpath("//b[contains(text(),'Mode of Transport')]//following::select[1]"), "Mode Of Transport", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		
	}
	public void fillPolicyInsuredInrestAttributeTransistDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity, CustomAssert assertReference) throws InterruptedException{
		if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("AN"))) {		

			if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("add") || polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("edit")){
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarineCargo")) {
					selectValueFromList(transitTypeForMarineCargoDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForMarineCargo"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
					selectValueFromList(totalLossOnlyDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TotalLossOnly"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSingleCarryingLimit")) {
					clearAndSendKeys(singleCarryingLimitTextField, polInsIntAttrMCargoEntity.getStringValueForField("SingleCarryingLimit"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDistanceInKm")) {
					clearAndSendKeys(distanceInKmTextField, polInsIntAttrMCargoEntity.getStringValueForField("DistanceInKm"));
					click(forwardButton);
				}
			}
		
		
		else if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarineCargo")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForMarineCargo"), fetchValueFromList(transitTypeForMarineCargoDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TotalLossOnly"), fetchValueFromList(totalLossOnlyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSingleCarryingLimit")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SingleCarryingLimit"), fetchValueFromTextFields(singleCarryingLimitTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDistanceInKm")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DistanceInKm"), fetchValueFromTextFields(distanceInKmTextField), AssertionType.WARNING);
				click(forwardButton);
			}

		}
		}
	}

	public void fillPolicyInsuredInrestTransistTransportAndCommodityDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("add") || polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("edit")){
			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("AT"))) {

				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCoverToBeCovered")) {
					selectValueFromList(WhetherOverDimensionalCoverToBeCovered, polInsIntAttrMCargoEntity.getStringValueForField("WhetherOverDimensionalCoverToBeCovered"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherInsuredIsCompany")) {
					selectValueFromList(WhetherInsuredIsCompany, polInsIntAttrMCargoEntity.getStringValueForField("WhetherInsuredIsCompany"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherCapitalGoodsToBeCovered")) {
					selectValueFromList(WhetherCapitalGoodsToBeCovered, polInsIntAttrMCargoEntity.getStringValueForField("WhetherCapitalGoodsToBeCovered"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIndigenousSalesTurnOver")) {
					clearAndSendKeys(IndigenousSalesTurnOver, polInsIntAttrMCargoEntity.getStringValueForField("IndigenousSalesTurnOver"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportSalesTurnOver")) {
					clearAndSendKeys(ExportSalesTurnOver, polInsIntAttrMCargoEntity.getStringValueForField("ExportSalesTurnOver"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtraForBasisValuation")) {
					clearAndSendKeys(ExtraForBasisValuation, polInsIntAttrMCargoEntity.getStringValueForField("ExtraForBasisValuation"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDetailsAT")) {
					fillCommodityDetails(polInsIntAttrMCargoEntity);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWARAndSRCCApplicable")) {
					selectValueFromList(WARAndSRCCApplicable, polInsIntAttrMCargoEntity.getStringValueForField("WARAndSRCCApplicable"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSRCCApplicable")) {
					selectValueFromList(SRCCApplicable, polInsIntAttrMCargoEntity.getStringValueForField("SRCCApplicable"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDetailsOfProvisionalDispatches")) {
					clearAndSendKeys(DetailsOfProvisionalDispatches, polInsIntAttrMCargoEntity.getStringValueForField("DetailsOfProvisionalDispatches"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigNoOfTransistTypeDesired")) {
					clearAndSendKeys(NoOfTransistTypeDesired, polInsIntAttrMCargoEntity.getStringValueForField("NoOfTransistTypeDesired"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPremiumRate")) {
					clearAndSendKeys(PremiumRate, polInsIntAttrMCargoEntity.getStringValueForField("PremiumRate"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeATDetails")) {
					fillTransitTypedetails(polInsIntAttrMCargoEntity);
				}
			}	
			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("SV"))) {

				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarineIVCargo")) {
					selectValueFromList(transitTypeForMarineCargoDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForIVMarineCargo"));
					click(forwardButton);
				}
			
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossIVOnly")) {
					selectValueFromList(totalLossOnlyDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TotalLossIVOnly"));
					click(forwardButton);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransporterIVName")) {
					clearAndSendKeys(transporterNameTextArea, polInsIntAttrMCargoEntity.getStringValueForField("TransporterIVName"));
					click(forwardButton);
				}
				
			}
			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("DI"))) {

				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForDIMarineCargo")) {
					selectValueFromList(transitTypeForMarineCargoDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForDIMarineCargo"));
					click(forwardButton);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransporterDIName")) {
					clearAndSendKeys(transporterNameTextArea, polInsIntAttrMCargoEntity.getStringValueForField("TransporterDIName"));
					click(forwardButton);
				}
			}
			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && ((polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("IV"))||(polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("SI")))) {
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForMarineIVCargo")) {
					selectValueFromList(transitTypeForMarineCargoDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForIVMarineCargo"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalLossIVOnly")) {
					selectValueFromList(totalLossOnlyDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TotalLossIVOnly"));
					click(forwardButton);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransporterIVName")) {
					clearAndSendKeys(transporterNameTextArea, polInsIntAttrMCargoEntity.getStringValueForField("TransporterIVName"));
					click(forwardButton);
				}

			}
			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && ((polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("TC")))) {
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyTypeForTeaCropInsurance")) {
					selectValueFromList(policyTypeForTeaCropInsuranceDropDown, polInsIntAttrMCargoEntity.getStringValueForField("PolicyTypeForTeaCropInsurance"));
					
				}
				
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFillestateCodeSearch")) {
					fillestateCodeSearch(polInsIntAttrMCargoEntity);
					click(forwardButton);
				}
				
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateCCName")) {
					clearAndSendKeys(estateNameTextField, polInsIntAttrMCargoEntity.getStringValueForField("EstateCCName"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateCCAddress")) {
					clearAndSendKeys(estateAddressTextField, polInsIntAttrMCargoEntity.getStringValueForField("EstateCCAddress"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTotalCropAreaOfEstate")) {
					clearAndSendKeys(totalCropAreaOfEstateTextField, polInsIntAttrMCargoEntity.getStringValueForField("TotalCropAreaOfEstate"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigNurseryCropAreaInHectares")) {
					clearAndSendKeys(nurseryCropAreaInHectaresTextField, polInsIntAttrMCargoEntity.getStringValueForField("NurseryCropAreaInHectares"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMinimumElevation")) {
					clearAndSendKeys(minimumElevationTextField, polInsIntAttrMCargoEntity.getStringValueForField("MinimumElevation"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAverageElevation")) {
					clearAndSendKeys(averageElevationTextField, polInsIntAttrMCargoEntity.getStringValueForField("AverageElevation"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigApproxDateOfCommencementOfPlucking")) {
					String dateOfCommencement=RandomCodeGenerator.dateGenerator(polInsIntAttrMCargoEntity.getStringValueForField("ApproxDateOfCommencementOfPlucking"));
					clearAndEnterDate(approxDateOfCommencementOfPluckingTextField, dateOfCommencement);

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigApproxDateOfTerminationOfPlucking")) {
					String dateOfTermination=RandomCodeGenerator.dateGenerator(polInsIntAttrMCargoEntity.getStringValueForField("ApproxDateOfTerminationOfPlucking"));
					clearAndEnterDate(approxDateOfTerminationOfPluckingTextField, dateOfTermination);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPeriodOfPluckingInMonths")) {
					clearAndSendKeys(periodOfPluckingInMonthsTextField, polInsIntAttrMCargoEntity.getStringValueForField("PeriodOfPluckingInMonths"));

				}

				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRatioOfGreenLeafToMadeTea")) {
					clearAndSendKeys(ratioOfGreenLeafToMadeTeaTextField, polInsIntAttrMCargoEntity.getStringValueForField("RatioOfGreenLeafToMadeTea"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAverageMadeTeaProducedInLastThreeyears")) {
					clearAndSendKeys(averageMadeTeaProducedInLastThreeyearsTextField, polInsIntAttrMCargoEntity.getStringValueForField("AverageMadeTeaProducedInLastThreeyears"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasisOfValuationForTeaCrop")) {
					selectValueFromList(basisOfValuationForTeaCropDropDown, polInsIntAttrMCargoEntity.getStringValueForField("BasisOfValuationForTeaCrop"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigValuePerKgForInland")) {
					clearAndSendKeys(valuePerKgForInlandTextField, polInsIntAttrMCargoEntity.getStringValueForField("ValuePerKgForInland"));
				}

				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigNatureOfPackingForTea")) {
					clearAndSendKeys(natureOfPackingForTeaTextArea, polInsIntAttrMCargoEntity.getStringValueForField("NatureOfPackingForTea"));
					click(forwardButton);

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigNameOfOverseasCenter")) {
					clearAndSendKeys(periodOfPluckingInMonthsTextField, polInsIntAttrMCargoEntity.getStringValueForField("NameOfOverseasCenter"));

				}
				
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPremiumRateTC")) {
					clearAndSendKeys(PremiumrateTC, polInsIntAttrMCargoEntity.getStringValueForField("PremiumRateTC"));
					click(forwardButton);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstimatedquantityofmadeteasoldforOverseas")) {
					clearAndSendKeys(EstimatedquantityofmadeteasoldforOverseas, polInsIntAttrMCargoEntity.getStringValueForField("EstimatedquantityofmadeteasoldforOverseas"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigISMComplianceRate")) {
					clearAndSendKeys(ISMComplianceRate, polInsIntAttrMCargoEntity.getStringValueForField("ISMComplianceRate"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigISMComplianceSumInsured")) {
					clearAndSendKeys(ISMComplianceSumInsured, polInsIntAttrMCargoEntity.getStringValueForField("ISMComplianceSumInsured"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPortOfLoadingTC")) {
					clearAndSendKeys(portofLoading, polInsIntAttrMCargoEntity.getStringValueForField("PortOfLoadingTC"));

				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPortOfDischargeTC")) {
					clearAndSendKeys(portOfDischargeTextArea, polInsIntAttrMCargoEntity.getStringValueForField("PortOfDischargeTC"));
				}
			}
			

			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && ((polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("CC")))) {
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigJourneyStartDate")){
					String dateOfFirstPolicy=RandomCodeGenerator.dateGenerator(polInsIntAttrMCargoEntity.getStringValueForField("JourneyStartDate"));
					clearAndEnterDate(journeyStartDateTextField, dateOfFirstPolicy);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeOfOC")) {
					selectValueFromList(transistTypeForOcDropdown, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeOfOC"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityType")) {
					selectValueFromList(commodityTypeOCDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("commodityType"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackaging")) {
					selectValueFromList(packagingOCDropDown, polInsIntAttrMCargoEntity.getStringValueForField("Packaging"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDescription")) {
					clearAndSendKeys(commodityDescriptionCCTextArea, polInsIntAttrMCargoEntity.getStringValueForField("CommodityDescription"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigOtherCommodityDescription")) {
					clearAndSendKeys(otherCommodityDescriptionOCTextArea, polInsIntAttrMCargoEntity.getStringValueForField("OtherCommodityDescription"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigConsignee")) {
					clearAndSendKeys(consigneeOCTextArea, polInsIntAttrMCargoEntity.getStringValueForField("Consignee"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportToCountry")) {
					fillExportToCountry(polInsIntAttrMCargoEntity);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportToCity")) {
					fillExportToCity(polInsIntAttrMCargoEntity);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescription")) {
					clearAndSendKeys(packagingDescriptionOCTextArea, polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescription"));
					click(forwardButton);
					click(forwardButton);
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigContainerizedCargo")) {
					selectValueFromList(ContainerizedCargo, polInsIntAttrMCargoEntity.getStringValueForField("ContainerizedCargo"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCargoSumInsured")) {
					clearAndSendKeys(CargoSumInsured, polInsIntAttrMCargoEntity.getStringValueForField("CargoSumInsured"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyInsuranceValue")) {
					clearAndSendKeys(DutyInsuranceValue, polInsIntAttrMCargoEntity.getStringValueForField("DutyInsuranceValue"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBaicValuationForOc")) {
					selectValueFromList(BaicValuationForOc, polInsIntAttrMCargoEntity.getStringValueForField("BaicValuationForOc"));
				}
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtraPer")) {
					clearAndSendKeys(ExtraPer, polInsIntAttrMCargoEntity.getStringValueForField("ExtraPer"));
				}
				 
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCargoSumInsuredIV")) {
				clearAndSendKeys(CargoSumInsured, polInsIntAttrMCargoEntity.getStringValueForField("CargoSumInsuredIV"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDetailsOpenButton")) {
				fillTransportDetailsOpenButton(polInsIntAttrMCargoEntity);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypedetailsForOP")) {
				fillTransitTypedetailsForOP(polInsIntAttrMCargoEntity);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypedetails")) {
				fillTransitDetailsButton(polInsIntAttrMCargoEntity);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPortOfLoading")) {
				clearAndSendKeys(portofLoading, polInsIntAttrMCargoEntity.getStringValueForField("PortOfLoading"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPortOfDischarge")) {
				clearAndSendKeys(portOfDischargeTextArea, polInsIntAttrMCargoEntity.getStringValueForField("PortOfDischarge"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDetails")) {
				//click(commodityDetailsOpenButton);
				fillCommodityDetails(polInsIntAttrMCargoEntity);
			}
			
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMachinery")) {
				selectValueFromList(machineryDropDown, polInsIntAttrMCargoEntity.getStringValueForField("Machinery"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSecondHand")) {
				selectValueFromList(secondHandDropDown, polInsIntAttrMCargoEntity.getStringValueForField("SecondHand"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeclarationBookStartNo")) {
				clearAndSendKeys(declarationBookStartNoTextField, polInsIntAttrMCargoEntity.getStringValueForField("DeclarationBookStartNo"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeclarationBookEndNo")) {
				clearAndSendKeys(declarationBookEndNoTextField, polInsIntAttrMCargoEntity.getStringValueForField("DeclarationBookEndNo"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWhetherOverDimensional")) {
				selectValueFromList(whetherOverDimensionalDropDown, polInsIntAttrMCargoEntity.getStringValueForField("WhetherOverDimensional"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasisOfValuationForAnnualPolicy")) {
				selectValueFromList(basisOfValuationForAnnualPolicyDropDown, polInsIntAttrMCargoEntity.getStringValueForField("BasisOfValuationForAnnualPolicy"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTypeOfBill")) {
				selectValueFromList(typeOfBillDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TypeOfBill"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBillNumber")) {
				clearAndSendKeys(billNumberTextArea, polInsIntAttrMCargoEntity.getStringValueForField("BillNumber"));;
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBillDate")) {
				String billdate=RandomCodeGenerator.dateGenerator(polInsIntAttrMCargoEntity.getStringValueForField("BillDate"));
				clearAndEnterDate(billDateTextField, billdate);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMarkNumber")) {
				clearAndSendKeys(markNumberTextArea, polInsIntAttrMCargoEntity.getStringValueForField("MarkNumber"));
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTypeOfPost")) {
				selectValueFromList(typeOfPostDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TypeOfPost"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTypeOfCarrier")) {
				selectValueFromList(typeOfCarrierDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TypeOfCarrier"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCarrierLimitedLiability")) {
				selectValueFromList(carrierLimitedLiabilityDropDown, polInsIntAttrMCargoEntity.getStringValueForField("CarrierLimitedLiability"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMachinerySubjectToClause")) {
				selectValueFromList(machinerySubjectToClauseDropdown, polInsIntAttrMCargoEntity.getStringValueForField("MachinerySubjectToClause"));
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCargoPolicyNumber")) {
				clearAndSendKeys(cargoPolicyNumberTextField, polInsIntAttrMCargoEntity.getStringValueForField("CargoPolicyNumber"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIssuingOfficeAddress")) {
				clearAndSendKeys(issuingOfficeAddressTextArea, polInsIntAttrMCargoEntity.getStringValueForField("IssuingOfficeAddress"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommoditySumInsured")) {
				clearAndSendKeys(commoditySumInsuredTextField, polInsIntAttrMCargoEntity.getStringValueForField("CommoditySumInsured"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRateOfOP")) {
				clearAndSendKeys(commodityRateOfOPTextField, polInsIntAttrMCargoEntity.getStringValueForField("CommodityRateOfOP"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSeaApplicable")) {
				selectValueFromList(seaApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("SeaApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAirApplicable")) {
				selectValueFromList(airApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("AirApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRailRoadApplicable")) {
				selectValueFromList(railRoadApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("RailRoadApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPostApplicable")) {
				selectValueFromList(postApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("PostApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCourierApplicable")) {
				selectValueFromList(courierApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("CourierApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCoastalApplicable")) {
				selectValueFromList(coastalApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("CoastalApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsTotalLossRiskApplicable")) {
				selectValueFromList(isTotalLossRiskApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsTotalLossRiskApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsSVCApplicable")) {
				selectValueFromList(isSVCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsSVCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAapplicable")) {
				selectValueFromList(isICCAapplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCAapplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAClauseapplicable")) {
				selectValueFromList(iCCAClauseapplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCAClauseapplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCCApplicable")) {
				selectValueFromList(isICCCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCCclauseApplicable")) {
				selectValueFromList(iCCCclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCCclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCAirApplicable")) {
				selectValueFromList(isICCAirApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCAirApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCAirclauseApplicable")) {
				selectValueFromList(iCCAirclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCAirclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCAApplicable")) {
				selectValueFromList(isITCAApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsITCAApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCAClauseApplicable")) {
				selectValueFromList(iTCAClauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ITCAClauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCBApplicable")) {
				selectValueFromList(isITCBApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsITCBApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCBclauseApplicable")) {
				selectValueFromList(iTCBclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ITCBclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsITCCApplicable")) {
				selectValueFromList(isITCCApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsITCCApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigITCCclauseApplicable")) {
				selectValueFromList(iTCCclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ITCCclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIsICCBApplicable")) {
				selectValueFromList(isICCBApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("IsICCBApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigICCBclauseApplicable")) {
				selectValueFromList(iCCBclauseApplicableDropDown, polInsIntAttrMCargoEntity.getStringValueForField("ICCBclauseApplicable"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTypeOfExportSV")) {
				selectValueFromList(typeOfExportDropDown, polInsIntAttrMCargoEntity.getStringValueForField("TypeOfExportSV"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasisOfValuationSV")) {
				clearAndSendKeys(basisOfValuationTextField, polInsIntAttrMCargoEntity.getStringValueForField("BasisOfValuationSV"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerAircraft")) {
				clearAndSendKeys(limitPerAircraftTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerAircraft"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerVessel")) {
				clearAndSendKeys(limitPerVesselTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerVessel"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerRegisteredPost")) {
				clearAndSendKeys(limitPerRegisteredPostTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerRegisteredPost"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				clearAndSendKeys(limitPerLocationTextField, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerLocation"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLimitPerLocationClause")) {
				selectValueFromList(limitPerLocationClauseDropDown, polInsIntAttrMCargoEntity.getStringValueForField("LimitPerLocationClause"));
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasisOfValuationForMarine")) {
				selectValueFromList(BasisOfValuationForMarine, polInsIntAttrMCargoEntity.getStringValueForField("BasisOfValuationForMarine"));

			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCargoSumInsuredIV")) {
				clearAndSendKeys(CargoSumInsured, polInsIntAttrMCargoEntity.getStringValueForField("CargoSumInsuredIV"));
			}

		}

		else if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(!(polInsIntAttrMCargoEntity.getStringValueForField("Product").equalsIgnoreCase("AN"))) {
				if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDetailsOpenButton")) {
					verifyTransportDetailsOpenButton(polInsIntAttrMCargoEntity, assertReference);
				}
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDetails")) {
				//click(commodityDetailsOpenButton);
				verifyCommodityDetailsOpenButton(polInsIntAttrMCargoEntity, assertReference);
			}
		}
	}
	//**************************************************************Fill Methods**************************************************************************	

	public void clickOnStakeCodeFindButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateCodeClickButton")){
			click(estateCodeClickButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Estate List");
			}catch(Exception e){
				switchToWindow("Estate List");
			}
		}
	}		
	public void fillestateCodeSearch(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickOnStakeCodeFindButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateCode")){
			Thread.sleep(3000);
			clearAndSendKeys(estateCodeTextField,polInsIntAttrMCargoEntity.getStringValueForField("EstateCode") );	
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigEstateName")){
			Thread.sleep(3000);
			clearAndSendKeys(estateNameTextField,polInsIntAttrMCargoEntity.getStringValueForField("EstateName") );	
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBackButton")){
			click(backButton);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSearchButton")){
			Thread.sleep(3000);
			click(searchButton);
			selectEstateCode(polInsIntAttrMCargoEntity);
		}
	}


	public void selectEstateCode(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		estateCodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttrMCargoEntity.getStringValueForField("EstateCode")+"')]"),"Estate Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(estateCodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void clickToOpenTransitDetailsButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeOCOPENDetails")){
			click(transistDetailsOpenButton);
			try{
				switchToWindow("'Transit Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Transit Details' Details");
			}
			click(addOpenButton);
		}
		}
	public void clickToOpenTransitTypeButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
	if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeOPENDetails")){
		click(transitTypeDetailsOpenButton);
		try{
			switchToWindow("'Transit Details' Details");
		}
		catch(Exception e){
			switchToWindow("'Transit Details' Details");
		}
		click(addOpenButton);
	}
	}
	public void clickToOpenTransitDetailsOCButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeOCOPENDetails")){
			click(transitTypeDetailsOpenButton);
			try{
				switchToWindow("Transit Type details");
			}
			catch(Exception e){
				switchToWindow("Transit Type details");
			}
			click(addOpenButton);
		}
		}
	public void clickToOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityOpenButton")){
			click(commodityDetailsOpenButton);
		
			try{
				switchToWindow("'Commodity Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Commodity Details' Details");

			}
			if((polInsIntAttrMCargoEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("add")) {		
				{
			click(addOpenButton);
				}
			
			}
		}
	

		
		//oc dharmendra 22
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypedetailsButton")){
			click(transitTypedetailsButton);
			try{
				switchToWindow("Parameter List for Transit Type details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Transit Type details");

			}
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitDetailsButton")){
			click(transitDetailsButton);
			try{
				switchToWindow("Parameter List for Transit Details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Transit Details");
			}
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDetailsOpenMarineButton")){
			click(transportDetailsOpenButton);
			try{
				switchToWindow("Parameter List for Transport Details");
			}
			catch(Exception e){
				switchToWindow("Parameter List for Transport Details");
			}
		}
	}
	public void clickTransportDOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportDOpenButton")){
			click(transportDetailsOpenButton);
			
			try{
				switchToWindow("'Transport Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Transport Details' Details");

			}
			click(addOpenButton);
		}
	}


	//************************************************Fill Details Methods**********************************************************************
	public void fillCommodityDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommTypeOfNextWindow")) {
			selectValueFromList(commodityTypeDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommTypeOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommDescOfNextWindow")) {
			clearAndSendKeys(commodityDescriptionTextAreaOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommDescOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingOfNextWindow")) {
			selectValueFromList(packagingDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("PackagingOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescOfNextWindow")) {
			clearAndSendKeys(packagingDescriptionTextAreaOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommSumInsOfNextWindow")) {
			clearAndSendKeys(commoditySumInsuredTextFieldOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommSumInsOfNextWindow"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommRateOfNextWindow")) {
			clearAndSendKeys(commodityRateTextFieldOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("CommRateOfNextWindow"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	
	public void verifyCommodityDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromTextFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommTypeOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommTypeOfNextWindow"), fetchValueFromList(commodityTypeDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommDescOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommDescOfNextWindow"), fetchValueFromTextFields(commodityDescriptionTextAreaOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingOfNextWindow"), fetchValueFromList(packagingDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescOfNextWindow"), fetchValueFromTextFields(packagingDescriptionTextAreaOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommSumInsOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommSumInsOfNextWindow"), fetchValueFromTextFields(commoditySumInsuredTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommRateOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommRateOfNextWindow"), fetchValueFromTextFields(commodityRateTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 

	}

	public void fillTransitTypedetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenTransitTypeButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForAT")) {
			selectValueFromList(transitTypeForATDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForAT"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredForAT")) {
			selectValueFromList(riskCoveredForATDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredForAT"));
		}
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasOfValForAT")) {
			selectValueFromList(basisOfValuationForATDropDownOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("BasOfValForAT"));
		}

		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtra")) {
			clearAndSendKeys(extraTextFieldOfNextWindow, polInsIntAttrMCargoEntity.getStringValueForField("Extra"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButton")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButtonAT")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransitTypedetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);
		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromTextFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeForAT")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeForAT"), fetchValueFromList(transitTypeForATDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredForAT")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredForAT"), fetchValueFromList(riskCoveredForATDropDownOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBasOfValForAT")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("BasOfValForAT"), fetchValueFromList(basisOfValuationForATDropDownOfNextWindow), AssertionType.WARNING);
			}

			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExtra")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Extra"), fetchValueFromTextFields(extraTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}

	public void fillTransitTypedetailsForOP(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenTransitTypeButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeforOC")){
			selectValueFromList(transitTypeforOCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeforOC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityTransType")){
			selectValueFromList(commodityTypeDropDown,polInsIntAttrMCargoEntity.getStringValueForField("CommodityTransType"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityTransDescription")){
			clearAndSendKeys(commodityDescriptionTextArea,polInsIntAttrMCargoEntity.getStringValueForField("CommodityTransDescription"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransPackaging")){
			selectValueFromList(packagingDropDown,polInsIntAttrMCargoEntity.getStringValueForField("TransPackaging"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingTransDescription")){
			clearAndSendKeys(packagingDescriptionTextField,polInsIntAttrMCargoEntity.getStringValueForField("PackagingTransDescription"));
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRate")){
			clearAndSendKeys(commodityRateTextField,polInsIntAttrMCargoEntity.getStringValueForField("CommodityRate"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredforOC")){
			selectValueFromList(riskCoveredforOCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredforOC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCrateforTransitType")){
			clearAndSendKeys(warAndSRCCrateforTransitTypeTextField,polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCrateforTransitType"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIncreasedValueRate")){
			clearAndSendKeys(increasedValueRateTextField,polInsIntAttrMCargoEntity.getStringValueForField("IncreasedValueRate"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarandSRCCrateforIncreasedValue")){
			clearAndSendKeys(warandSRCCrateforIncreasedValueTextField,polInsIntAttrMCargoEntity.getStringValueForField("WarandSRCCrateforIncreasedValue"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRate")){
			clearAndSendKeys(dutyRateTextField,polInsIntAttrMCargoEntity.getStringValueForField("DutyRate"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRateforWarandSRCC")){
			clearAndSendKeys(dutyRateforWarandSRCCTextField,polInsIntAttrMCargoEntity.getStringValueForField("DutyRateforWarandSRCC"));
		}

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransitTypedetailsForOP(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSerialNoOfNextWindow")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("SerialNoOfNextWindow"), fetchValueFromFields(serialNoTextFieldOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityDescription")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityDescription"), fetchValueFromTextFields(commodityDescriptionTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescription")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescription"), fetchValueFromTextFields(packagingDescriptionTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityRate")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityRate"), fetchValueFromTextFields(commodityRateTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarAndSRCCrateforTransitType")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WarAndSRCCrateforTransitType"), fetchValueFromTextFields(warAndSRCCrateforTransitTypeTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigIncreasedValueRate")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("IncreasedValueRate"), fetchValueFromTextFields(increasedValueRateTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigWarandSRCCrateforIncreasedValue")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("WarandSRCCrateforIncreasedValue"), fetchValueFromTextFields(warandSRCCrateforIncreasedValueTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRate")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DutyRate"), fetchValueFromTextFields(dutyRateTextField), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDutyRateforWarandSRCC")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("DutyRateforWarandSRCC"), fetchValueFromTextFields(dutyRateforWarandSRCCTextField), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommodityType")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommodityType"), fetchValueFromList(commodityTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackaging")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("Packaging"), fetchValueFromList(packagingDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRiskCoveredforOC")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("RiskCoveredforOC"), fetchValueFromList(riskCoveredforOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransitTypeforOC")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransitTypeforOC"), fetchValueFromList(transitTypeforOCDropDown), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}

	public void fillTransitDetailsButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickToOpenTransitDetailsButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransports")){
			selectValueFromList(modeOfTransportsDropDown,polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransports"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")){
			selectValueFromList(landConveyanceCodeCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCodeC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
			clearAndSendKeys(fromPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
			clearAndSendKeys(toPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveWinButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransitDetailsButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"), fetchValueFromFields(fromPlaceTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"), fetchValueFromFields(toPlaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransports")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransports"), fetchValueFromList(modeOfTransportsDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCodeC"), fetchValueFromList(landConveyanceCodeCDropDown), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}

	public void fillTransportDetailsOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickTransportDOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);
		switchToWindow("'Transport Details' Details");
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransport")){
			selectValueFromList(modeOfTransDropDown,polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransport"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransportDI")){
			selectValueFromList(modeOfTransportDropDown,polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransportDI"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransportDI")){
			selectValueFromList(modeOfTransportDropDown,polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransportDI"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportMode")){
			selectValueFromList(transportModeDropDown,polInsIntAttrMCargoEntity.getStringValueForField("TransportMode"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCode")){
			selectValueFromList(landConveyanceCodeCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCode"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromTRANSPlace")){
			clearAndSendKeys(fromPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("FromTRANSPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTRANSToPlace")){
			clearAndSendKeys(toPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("ToTRANSPlace"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTRANSPORTDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigtransportSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	public void verifyTransportDetailsOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("FromPlace"), fetchValueFromFields(fromPlaceTextArea), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlace")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("ToPlace"), fetchValueFromFields(toPlaceTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportMode")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("TransportMode"), fetchValueFromList(transportModeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCode")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCode"), fetchValueFromList(landConveyanceCodeDropDown), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}
	
	public void verifyCommodityDetailsOpenButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getAction().equalsIgnoreCase("verify")){
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommTypeOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommTypeOfNextWindow"), fetchValueFromList(commodityTypeDropDownOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommDescOfNextWindow")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommDescOfNextWindow"), fetchValueFromFields(commodityDescriptionTextAreaOfNextWindow), AssertionType.WARNING);
			}
			if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingOfNextWindow")) {
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingOfNextWindow"), fetchValueFromList(packagingDropDownOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPackagingDescOfNextWindow")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("PackagingDescOfNextWindow"), fetchValueFromFields(packagingDescriptionTextAreaOfNextWindow), AssertionType.WARNING);
			}
			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCommSumInsOfNextWindow")){
				assertReference.assertEquals(polInsIntAttrMCargoEntity.getStringValueForField("CommSumInsOfNextWindow"), fetchValueFromFields(commoditySumInsuredTextFieldOfNextWindow), AssertionType.WARNING);
			}

			if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}

		} 
	}

	public void clickOnExportToCountryFindButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportToCountryClickButton")){
			click(exportToCountryClickButton);
			switchToWindow();

		}
	}
	public void fillExportToCountry(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickOnExportToCountryFindButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCountrySearch")){
			Thread.sleep(3000);
			clearAndSendKeys(countrySearchTextField,polInsIntAttrMCargoEntity.getStringValueForField("countrySearch") );	

		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigContrySearchFindButton")){
			Thread.sleep(3000);
			click(contrySearchFindButton);
			selectCountrySearch(polInsIntAttrMCargoEntity);
		}

	}
	public void selectCountrySearch(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		countrySearchToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttrMCargoEntity.getStringValueForField("countrySearchText")+"')]"),"Country Search to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(countrySearchToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void clickOnExportToCityFindButton(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigExportToCityClickButton")){
			click(exportToCityClickButton);
			switchToWindow();

		}
	}
	public void fillExportToCity(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickOnExportToCityFindButton(polInsIntAttrMCargoEntity);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCitySearch")){
			Thread.sleep(3000);
			clearAndSendKeys(citySearchTextField,polInsIntAttrMCargoEntity.getStringValueForField("CitySearch") );	

		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCitySearchFindButton")){
			Thread.sleep(3000);
			click(citySearchFindButton);
			selectCitySearch(polInsIntAttrMCargoEntity);
		}

	}
	public void selectCitySearch(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		citySearchToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttrMCargoEntity.getStringValueForField("countrySearchText")+"')]"),"City Search to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(citySearchToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");	
	}
	//**********************************************************************************************************************************************
	public void navigateTobackAttributePage(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void clickNextButtonPolicyAttributeCDPolicyDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			switchToFrame("display");
		}
	}
	public void navigateToPolicy(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity){
		if (polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}

	public void fillandSubmitPolicyInsuredInrestAttributeForMArineCargo(PolInsIntAttrMCargoEntity polInsIntAttrMCargoEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttrMCargoEntity.getConfigExecute())){
			switchToFrame("display");
			fillPolicyInsuredInrestAttributeTransistDetails(polInsIntAttrMCargoEntity, assertReference);
			fillPolicyInsuredInrestTransistTransportAndCommodityDetails(polInsIntAttrMCargoEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntAttrMCargoEntity);
			navigateTobackAttributePage(polInsIntAttrMCargoEntity);
			navigateToPolicy(polInsIntAttrMCargoEntity);
			navigateToAttribute(polInsIntAttrMCargoEntity);
			navigateToInsuredInterest(polInsIntAttrMCargoEntity);
			navigateToCoverage(polInsIntAttrMCargoEntity);
			navigateToLoan(polInsIntAttrMCargoEntity);
			navigateToClientDetails(polInsIntAttrMCargoEntity);
			navigateToRelation(polInsIntAttrMCargoEntity);
			navigateToPayment(polInsIntAttrMCargoEntity);
			navigateToFollowup(polInsIntAttrMCargoEntity);
			navigateToDocument(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestAttributes(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestRelations(polInsIntAttrMCargoEntity);
			navigateToInsuredInterestPayments(polInsIntAttrMCargoEntity);
		}

	}
}
