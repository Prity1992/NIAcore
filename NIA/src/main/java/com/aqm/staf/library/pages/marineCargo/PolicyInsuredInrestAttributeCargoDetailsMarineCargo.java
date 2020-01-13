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
import com.aqm.testing.testDataEntity.PolInsIntAttCarDetMCEntity;


public class PolicyInsuredInrestAttributeCargoDetailsMarineCargo extends BasePage {
	//DIGVIJAY  prod AT
	//DI S
	private PageElement TotalSI;
	private PageElement InvoiceNumber;
	private PageElement InvoiceDate;
	private PageElement StorageApplicable;
	private PageElement DurationofStorage;
	private PageElement PlaceofStorage;
	private PageElement StorageRate;	
	private PageElement ShutoutcargoApplicable;
	private PageElement ShutoutCargoSumInsured;
	private PageElement ShutoutCargoRate;
	private PageElement TransitExtensionApplicable;
	private PageElement NewDestination;
	private PageElement Rate;
	private PageElement ExcessforCargo;
	private PageElement ExcessofSI;
	private PageElement ExcessofClaim;
	private PageElement ExcessAmount;
	private PageElement MinimumRs;
	private PageElement DateOfSailing;
	private PageElement SpecialConditions;
	private PageElement NumberofDays;




	private PageElement TypeofStorage;
	private PageElement Underinsurancepercent;

	private PageElement TransitDuration;
	private PageElement ClassificationSociety;
	private PageElement LimitPerLocationClause;
	private PageElement AnnualPremiumOnTotalAnnualSumInsured;
	private PageElement WhetherFobCoverRequired;
	private PageElement BasisOfValuationForFobCover;
	private PageElement DutyApplicable;
	private PageElement BasisOfValuationForDuty;
	private PageElement Year;
	private PageElement MajorCommodity;
	private PageElement TransitDetails;
	private PageElement PortOfLoading;
	private PageElement PortofDischarge;
	private PageElement LimitPerAnyOneAircraft;	
	private PageElement LimitPerAnyOneVessel;
	private PageElement LimitPerAnyOneRegisteredPostParcel;
	private PageElement LimitPerRoadVehicleRail;
	private PageElement LimitPerLocation;
	private PageElement WhetherFullVesselLoadShipmentWillBeEffected;
	private PageElement ExcessApplicable;
	private PageElement ExcessApplicableOn;
	private PageElement ExcessSI;
	private PageElement ExcessClaimAmount;
	private PageElement ExcessOthers;
	private PageElement SellersContingencyInsuranceApplicable;
	private PageElement BasisOfValuationForSellersContingency;
	private PageElement ExtraForSellersContingencyBasisOfValuation;
	private PageElement NumberOfDays;
	private PageElement PlaceOfStorage;

	private PageElement ShutoutCargoApplicable;
	private PageElement NoOfDaysForShutout;
	private PageElement Machinery;
	private PageElement SecondHand;
	private PageElement PaymentFrequencyForAT;
	private PageElement BasisOfPremiumComputationForAT;
	private PageElement TypeOfStorage;
	private PageElement MachinerySubjectToClause;
	private PageElement DetailsOfClausesApplicable;
	private PageElement SubjectToDutyInsuranceClause;
	private PageElement SubjectToSellersInterestClause;
	private PageElement ModeOfTransportsDropDown;
	private PageElement LandConveyanceCodeCDropDown;
	private PageElement FromPlaceTextArea;
	private PageElement ToPlaceTextArea;
	private PageElement DeleteButtonOfNextWindow;
	private PageElement SaveButtonOfNextWindow;
	private PageElement CloseButtonOfNextWindow;
	private PageElement TransitTypeOpenButton;
	private PageElement ClausesApplicableForAT;
	private PageElement ForeignCurrencyRequired;
	private PageElement Currency;
	private PageElement ForeignCurrencyRate;
	private PageElement SumInsuredInForeignCurrency;
	//Added by Shwetha***********************
	private PageElement annualPremiumOnTotalProvisionalAnnualSumInsuredTextField;
	private PageElement whetherFOBCoverRequiredDropDown;
	private PageElement yearTextField;
	private PageElement majorCommodityDropDown;
	private PageElement transitDetailsOpenButton;
	private PageElement limitPerAnyOneAircraftTextField;
	private PageElement limitPerAnyOneVesselTextField;
	private PageElement limitPerAnyOneRegisteredPostParcelTextField;
	private PageElement limitPerRoadVehicleRailTextField;
	private PageElement limitPerLocationTextField;
	private PageElement whetherFullVesselLoadShipmentsWillBeEffectedDropDown;
	private PageElement excessApplicableDropDown;
	private PageElement sellersContingencyInsuranceApplicableDropDown;
	private PageElement shutoutCargoApplicableDropDown;
	private PageElement paymentFrequencyForATDropDown;
	private PageElement basisOfPremiumComputationForATDropDown;
	private PageElement limitPerLocationClauseDropDown;
	private PageElement machinerySubjectToClauseDropDown;
	private PageElement detailsOfClausesApplicableOpenButton;
	private PageElement modeOfTransportsDropDown;
	private PageElement landConveyanceCodeCDropDown;
	private PageElement fromPlaceTextArea;
	private PageElement toPlaceTextArea;
	private PageElement serialNoTextFieldOfNextWindow;
	private PageElement transitTypeForATDropDownOfNextWindow;
	private PageElement riskCoveredForATDropDownOfNextWindow; 
	private PageElement cargoClauseApplicableDropDownOfNextWindow; 
	private PageElement wARSRCCClauseApplicableDropDownOfNextWindow;
	private PageElement deleteButtonOfNextWindow;
	private PageElement saveButtonOfNextWindow;
	private PageElement closeButtonOfNextWindow; 
	//DIGVIJAY  prod AN
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
	private PageElement carrierLimitedLiabilityDropDown;
	//DIGVIJAY Prod-SV
	private PageElement transitTypeDropDown;
	private PageElement totalLossOnlyDropDown;
	//DIGVIJAY Prod-SI
	private PageElement transporterNameTextArea;
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
	private PageElement saveButton;
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
	//DI-rajkumar -2ND PAGE
	//private PageElement transporterNameTextArea;
	//TC /*-rajkumar-2ND PAGE
	private PageElement estateNameTextField;
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
	//OP DHK
	private PageElement sRCCApplicableDropDown;
	private PageElement storageApplicableDropDown;
	private PageElement typeofStorageDropDown;
	private PageElement sRCCCargoclauseapplicableDropDown;
	private PageElement placeofStorageTextArea;
	private PageElement sRCCRateTextField;
	private PageElement storageDurationInDaysTextField;
	private PageElement storageRateTextField;
	//CC DHK
	private PageElement transitTypeforOCDropDown;
	private PageElement commodityTypeDropDown;
	private PageElement packagingDropDown;
	private PageElement consigneeTextArea;
	private PageElement commodityDescriptionTextArea;
	private PageElement otherCommodityDescriptionTextArea;
	private PageElement packagingDescriptionTextArea;
	private PageElement otherCityNameTextField;
	private PageElement exportToCityTextField;
	private PageElement exportToCountryTextField;
	private PageElement vesselCodeTextField;
	private PageElement journeyStartDateTextField;
	//Vessel Code find
	private PageElement vesselNameTextField;
	private PageElement backButtons;
	//private PageElement searchButton;
	private PageElement vesselCodeClickButton;
	private PageElement vesselCodeToBeSelectedLink;
	//Export to Country Find
	private PageElement exportToCountryClickButton;
	private PageElement countrySearchTextField;
	private PageElement countrySearchToBeSelectedLink;
	private PageElement contrySearchFindButton;
	private PageElement exportToCityClickButton;
	private PageElement citySearchTextField;
	private PageElement citySearchFindButton;
	private PageElement citySearchToBeSelectedLink;
	//OC DHK
	private PageElement excessapplicableDropDown;
	private PageElement excessApplicablOnDropDown;
	private PageElement sellersContingencyApplicableDropDown;
	private PageElement storageApplicableOCDropDown;
	private PageElement shutoutcargoApplicableDropDown;
	private PageElement basisOfValuationForOCDropDown;
	private PageElement machineryDropDown;
	private PageElement secondHandDropDown;
	private PageElement whetherOverDimensionalCargotobecoveredDropDown;
	private PageElement typeOfStorageDropDown;
	private PageElement machinerysubjecttoclauseDropDown;
	private PageElement excessClaimAmountTextField;
	private PageElement excessOthersTextField;
	private PageElement excessSITextField;
	private PageElement numberOfDaysTextField;
	private PageElement storageRateOCTextField;
	private PageElement noOfdaysTextField;
	private PageElement shutoutCargoRateTextField;
	private PageElement extraTextField;
	private PageElement underInsurancepercentTextField;
	private PageElement specialConditionsTextArea;
	private PageElement detailsOfClausesApplicableOpenButtonForOC;
	private PageElement aPDAccountNoFindButtonOfOC;
	//OC OPEN BUTTON DHK
	private PageElement transitTypeforOCNextDropDown;
	private PageElement commodityTypeNextDropDown;
	private PageElement packagingNextDropDown;
	private PageElement riskCoveredforOCDropDown;
	private PageElement cargoClauseApplicableDropDown;
	private PageElement wARSRCCClauseApplicableDropDown;
	//************************************************************************************************************
	//OP
	private PageElement SRCCApplicable;
	private PageElement SRCCRate;
	private PageElement WARAndSRCCApplicable;
	private PageElement WARAndSRCCRate;
	private PageElement DutyValue;
	private PageElement DutyRate;
	private PageElement WARAndSRCCRateForDuty;
	private PageElement BasisOfValuationForDutyOP;
	private PageElement IncreasedValueApplicable;
	private PageElement IncreasedValueSumInsured;
	private PageElement IncreasedValueRate;
	private PageElement WARAndSRCCRateForIncreasedValue;
	private PageElement BasisOfValuationForIncreasedValue;
	private PageElement StorageDurationInDays;
	private PageElement StorageRateForDuty;
	private PageElement ShutoutCargoRateForDuty;
	private PageElement SubjectToIncreaseValueClause;
	private PageElement WarAndSRCCClauseAppli;
	private PageElement WarAndSRCCClauseApplicable;
	private PageElement SRCCClauseAppli;
	private PageElement SRCCClauseApplic;
	private PageElement SRCCClauseApplica;
	private PageElement WhetherOverDimensionalCargoToBeCovered;
	private PageElement BasisOfValuationForOpenPolicy;
	private PageElement ExtraForBasisOfValuation;
	private PageElement SellersContingencyApplicable;
	private PageElement ExtraForBasisOfValuationForSellersOntingency;
	private PageElement SingleCarryingLimit;
	private PageElement LimitPerRegisteredPost;
	private PageElement ContainerizedCargo;
	//TC
	private PageElement inclusionofToandFroJourneyfromestatetoanothergardenGreenLeaf;
	private PageElement rateforToandFrojourneyfromestatetoanothergardenGreenLeaf;
	private PageElement inclusionofsinglejourneyfromestatetoanothergardenorviceversa;
	private PageElement singleJourneyRate;
	private PageElement quantityofTeaWaste;
	private PageElement agreedValueperKg;
	private PageElement rateforTeaWaste;
	private PageElement carriersLegalLiabilitycoverrequired;
	private PageElement rateforcarrierslegalliability;
	private PageElement inclusionofSurpluscoverRequired;
	private PageElement surplusQuantity;
	private PageElement rateforSurplusQuantity;
	private PageElement whetherFOBextensionisrequired;
	private PageElement FOBRate;
	private PageElement extensionofstorageinFOBisRequired;
	private PageElement extensionofstoragerate;
	private PageElement additionalStorageinexcessofsevendays;
	private PageElement rateforadditionalStorage;
	private PageElement excessAmount;
	private PageElement hailExtensionRequired;
	private PageElement limitofLiabilityforHailExtension;
	private PageElement hailExtensionQuantityofstandingcrop;
	private PageElement agreedvalueforhailextensions;
	private PageElement rateforHailExtension;
	private PageElement previousPolicyNumber;
	private PageElement previousInsuranceFromDate;
	private PageElement previousInsuranceToDate;
	private PageElement isICCAirRequired;
	private PageElement isITCARequired;
	private PageElement isITCBRequired;
	private PageElement isITCCRequired;
	private PageElement underinsurancepercent;
	private PageElement ICCAirclauseapplicable;
	private PageElement ITCAclauseapplicable;
	private PageElement ITCBclauseapplicable;
	private PageElement ITCCclauseapplicable;
	//CC
	private PageElement TransporterName;
	private PageElement VesselName;
	private PageElement TypeOfVesselForCargo;
	private PageElement ApprovedClassificationSociety;
	private PageElement ISMCompliance;
	private PageElement GrossRegisteredTonnage;
	private PageElement FlagOfVesselForCargo;
	private PageElement TransportDetails;
	private PageElement TransportDetailsOpenButton;
	private PageElement Via;
	private PageElement AddButton;
	private PageElement ModeOfTransport;
	private PageElement TypeOfCarrier;
	private PageElement CarrierLimitedLiability;
	private PageElement TypeOfBillForMarine;
	private PageElement BillNumber;
	private PageElement BillDate;
	private PageElement MarkNumber;
	private PageElement WhetherVesselIsLiner;
	private PageElement NumberOfDaysForStorage;
	private PageElement ShutoutCargoValueForDuty;
	private PageElement NoOfDays;
	private PageElement WhetherFullVesselLoad;
	private PageElement OtherVesselExtra;
	private PageElement OtherVesselExtraOnDuty;
	private PageElement OtherTermsAndConditions;
	private PageElement UnderInsurancePercent;
	private PageElement LimitPerAnyOneVesselOP;
	private PageElement modeOfTransportsATDropDown;
	private PageElement LandConveyanceCodeATropDown;
	private PageElement FindButton;
	private PageElement APDAccNOToBeSelectedLink;
	private PageElement FromPlaceATTextArea;
	private PageElement ToPlaceATTextArea;
	private PageElement searchButton;
	private PageElement extraPercentageTextField;
	private PageElement invoiceDetailsOpenButton;
	private PageElement ModeOfTransportCC;
	private PageElement previousButton;
	private PageElement accountCodeTextField;
	private PageElement findButton;


	public PolicyInsuredInrestAttributeCargoDetailsMarineCargo(WebDriver driver, String pageName) {
		super(driver, pageName);
		findButton = new PageElement(By.xpath("//input[@name=('pAccountCode')]//following::img[1]"), "Find", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		accountCodeTextField = new PageElement(By.xpath("//input[@name=('pAccountCode')]"), "Account Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousButton = new PageElement(By.xpath("//input[@name=('btnPrevious')]"), "Back", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		invoiceDetailsOpenButton =new PageElement(By.xpath("//div[starts-with(text(),'Invoice Details')]//following::input[1]"), "Open", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//OC
		FindButton=new PageElement(By.xpath("//div[contains(text(),'APD Account No.')]/following::img[1]"), "FindButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		extraPercentageTextField= new PageElement(By.xpath("//div[@id=('% Extra')]/following::input[1]"), "Extra Percentage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//DIGVIJAY  prod AT
		searchButton= new PageElement(By.xpath("//input[@name='Search']"),"Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ModeOfTransportCC= new PageElement(By.xpath("//b[contains(text(),'Mode of Transport')]//following::select[1]"), "Mode Of Tranport", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		LimitPerAnyOneVesselOP = new PageElement(By.xpath("//div[contains(text(),'Limit per any one Vessel')]//following::input[1]"), "Limit per any one vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TotalSI=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total SI", "input")), "TotalSI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		StorageApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Storage Applicable", "select")), "StorageApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		StorageRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Storage Rate(%)", "input")), "StorageRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DurationofStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Duration of Storage", "input")), "DurationofStorage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PlaceofStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of Storage", "textarea")), "PlaceofStorage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ShutoutcargoApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Shutout cargo Applicable", "select")), "ShutoutcargoApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NumberofDays=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Days", "input")), "NumberofDays", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ShutoutCargoSumInsured=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Shutout Cargo Sum Insured", "input")), "ShutoutCargoSumInsured", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ShutoutCargoRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Shutout Cargo Rate(%)", "input")), "ShutoutCargoRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TransitExtensionApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Transit Extension Applicable", "select")), "ShutoutCargoRate", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NewDestination=new PageElement(By.xpath(locatorforQuestionAnswerPanel("New Destination", "input")), "NewDestination", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Rate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate(%)", "input")), "Rate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExcessforCargo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess for Cargo", "select")), "ExcessforCargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExcessofSI=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess(%) of SI", "input")), "ExcessofSI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExcessofClaim=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess(%) of Claim", "input")), "ExcessofClaim", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExcessAmount=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess Amount", "input")), "ExcessAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MinimumRs=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Minimum Rs.", "input")), "MinimumRs", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SpecialConditions=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Special Conditions", "input")), "SpecialConditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TypeofStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Storage", "select")), "TypeofStorage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		Underinsurancepercent=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance percent", "input")), "Underinsurancepercent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		InvoiceNumber=new PageElement(By.name("Data_213895605022010_0"), "InvoiceNumber", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		InvoiceDate=new PageElement(By.name("Data_213919405022010_0"), "InvoiceDate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TransitDuration=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Transit Duration", "input")), "TransitDuration", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ClassificationSociety=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Classification Society", "input")), "Classification Society", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerLocationClause=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit Per Location Clause", "select")), "LimitPerLocationClause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		AnnualPremiumOnTotalAnnualSumInsured=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Annual Premium on Total (Provisional) Annual Sum Insured", "input")), "LimitPerLocationClause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WhetherFobCoverRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether FOB cover required?", "select")), "WhetherFobCoverRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BasisOfValuationForFobCover=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Valuation for FOB cover", "input")), "BasisOfValuationForFobCover", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DutyApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Valuation for FOB cover", "select")), "DutyApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BasisOfValuationForDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Valuation for Duty", "input")), "basisOfValuationForDuty", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		Year=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Year", "input")), "Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MajorCommodity=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Major Commodity", "select")), "MajorCommodity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		TransitDetails=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Total SI", "input")), "TransitDetails", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ModeOfTransportsDropDown=new PageElement(By.name("Data_232190627082010_0"), "Mode of Transports ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		LandConveyanceCodeCDropDown=new PageElement(By.name("Data_232556027082010_0"), "Land Conveyance Code  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		LandConveyanceCodeATropDown=new PageElement(By.xpath("//b[contains(text(),'Land Conveyance Code')]//following::select[2]"), "Land Conveyance Code ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		FromPlaceTextArea= new PageElement(By.name("Data_213898705022010_0"), "From Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ToPlaceTextArea= new PageElement(By.name("Data_213898805022010_0"), "To Place  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		FromPlaceATTextArea= new PageElement(By.xpath("//b[contains(text(),'From Place')]//following::textarea[1]"), "From Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ToPlaceATTextArea= new PageElement(By.xpath("//b[contains(text(),'To Place')]//following::textarea[2]"), "To Place  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DeleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		SaveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		CloseButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TransitTypeOpenButton=new PageElement(By.xpath(locatorforPanel("Transit Details", "input")), "TransitTypeOpenButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		PortOfLoading=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Port of Loading", "textarea")), "PortOfLoading", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PortofDischarge=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Port of Discharge", "textarea")), "PortofDischarge", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerAnyOneAircraft=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit per any one Aircraft", "input")), "LimitPerAnyOneAircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerAnyOneVessel=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit per any one Vessel", "input")), "LimitPerAnyOneVessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerAnyOneRegisteredPostParcel=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit per any one Registered Post Parcel", "input")), "LimitPerAnyOneRegisteredPostParcel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerRoadVehicleRail=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit per Road Vehicle/Rail", "input")), "LimitPerRoadVehicleRail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerLocation=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit Per Location", "input")), "LimitPerLocation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WhetherFullVesselLoadShipmentWillBeEffected=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether full vessel load shipment(s) will be effected?", "select")), "WhetherFullVesselLoadShipmentWillBeEffected", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExcessApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess applicable", "select")), "ExcessApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExcessApplicableOn=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess Applicable on", "select")), "ExcessApplicableOn", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExcessSI=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess(%) SI", "input")), "ExcessSI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExcessClaimAmount=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess(%) Claim Amount", "input")), "ExcessClaimAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ExcessOthers=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess(%) Others", "input")), "ExcessOthers", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SellersContingencyInsuranceApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sellers Contingency Insurance Applicable", "select")), "SellersContingencyInsuranceApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BasisOfValuationForSellersContingency=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Valuation for Sellers Contingency", "select")), "BasisOfValuationForSellersContingency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExtraForSellersContingencyBasisOfValuation=new PageElement(By.xpath(locatorforQuestionAnswerPanel("(%) Extra for sellers contingency basis of valuation", "input")), "ExtraForSellersContingencyBasisOfValuation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NumberOfDays=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Days", "input")), "NumberOfDays", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		PlaceOfStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Place of Storage", "textarea")), "PlaceOfStorage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ShutoutCargoApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Shutout cargo Applicable", "select")), "ShutoutCargoApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NoOfDaysForShutout=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of Days for Shutout", "input")), "NoOfDaysForShutout", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		Machinery=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Machinery", "select")), "Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SecondHand=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Second Hand", "select")), "SecondHand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		PaymentFrequencyForAT=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Payment Frequency for AT", "select")), "PaymentFrequencyForAT", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BasisOfPremiumComputationForAT=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Premium Computation for AT", "select")), "BasisOfPremiumComputationForAT", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		TypeOfStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Storage", "select")), "TypeOfStorage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		MachinerySubjectToClause=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Machinery subject to clause", "select")), "MachinerySubjectToClause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		DetailsOfClausesApplicable=new PageElement(By.xpath(locatorforPanel("Details of Clauses Applicable", "input")), "DetailsOfClausesApplicable", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		SubjectToDutyInsuranceClause=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subject to Duty Insurance Clause", "select")), "SubjectToDutyInsuranceClause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SubjectToSellersInterestClause=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subject To Sellers Interest Clause", "select")), "SubjectToSellersInterestClause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TransitTypeOpenButton=new PageElement(By.xpath(locatorforPanel("Transit Details", input)
		modeOfTransportsATDropDown= new PageElement(By.xpath("//b[contains(text(),'Mode Of Transport For AT')]//following::select[1]"), "Mode of Transports ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ModeOfTransportsDropDown=new PageElement(By.name("Data_232190627082010_0"), "Mode of Transports ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		LandConveyanceCodeCDropDown=new PageElement(By.name("Data_232556027082010_0"), "Land Conveyance Code  ", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		FromPlaceTextArea= new PageElement(By.name("Data_213898705022010_0"), "From Place", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ToPlaceTextArea=new PageElement(By.name("Data_213898805022010_0"), "To Place  ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DeleteButtonOfNextWindow=new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		SaveButtonOfNextWindow=new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		CloseButtonOfNextWindow=new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TransitTypeOpenButton=new PageElement(By.xpath(locatorforPanel("Transit Details", "input")), "TransitTypeOpenButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ForeignCurrencyRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Foreign Currency Required", "select")), "ForeignCurrencyRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		Currency=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Currency", "select")), "Currency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ForeignCurrencyRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Foreign Currency Rate", "input")), "ForeignCurrencyRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SumInsuredInForeignCurrency=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sum Insured in Foreign Currency", "input")), "SumInsuredInForeignCurrency", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//Added By Shwetha **********************************************************************************************************************************
		annualPremiumOnTotalProvisionalAnnualSumInsuredTextField=new PageElement(By.xpath("//td//div[contains(text(),'Annual Premium on Total (Provisional) Annual Sum Insure')]/following::input"), "Annual Premium on Total (Provisional) Annual Sum Insure", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherFOBCoverRequiredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether FOB cover required')]/following::select"), "Whether FOB cover required", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		yearTextField=new PageElement(By.xpath("//td//div[contains(text(),'Year')]/following::input"), "Year", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		majorCommodityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Major Commodity')]/following::select"), "Major Commodity", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		transitDetailsOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Transit Details')]/following::input"), "OTransit Details open Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		limitPerAnyOneAircraftTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per any one Aircraft')]/following::input"), "Limit per any one Aircraft", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerAnyOneVesselTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per any one Vessel')]/following::input"), "Limit per any one Vessel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerAnyOneRegisteredPostParcelTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per any one Registered Post Parcel')]/following::input"), "Limit per any one Registered Post Parcel", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerRoadVehicleRailTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit per Road Vehicle/Rail')]/following::input"), "Limit per Road Vehicle/Rail", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		limitPerLocationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location')]/following::input"), "Limit Per Location", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherFullVesselLoadShipmentsWillBeEffectedDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether full vessel load shipment(s) will be effected?')]/following::select"), "Whether full vessel load shipment will be effected", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess applicable')]/following::select"), "Excess applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sellersContingencyInsuranceApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sellers Contingency Insurance Applicable')]/following::select"), "Sellers Contingency Insurance Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		storageApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		shutoutCargoApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Shutout cargo Applicable')]/following::select"), "Shutout cargo Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machineryDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery')]/following::select"), "Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		secondHandDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Second Hand')]/following::select"), "Second Hand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		paymentFrequencyForATDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Payment Frequency for AT')]/following::select"), "Payment Frequency for AT", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::textarea"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		basisOfPremiumComputationForATDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Premium Computation for AT')]/following::select"), "Basis of Premium Computation for AT", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitPerLocationClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Limit Per Location Clause')]/following::select"), "Limit Per Location Clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machinerySubjectToClauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery subject to clause')]/following::select"), "Machinery subject to clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		detailsOfClausesApplicableOpenButton= new PageElement(By.xpath("//td//div[contains(text(),'Details of Clauses Applicable')]/following::input"), "Details of Clauses Applicable", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		serialNoTextFieldOfNextWindow=new PageElement(By.name("slNo0"), "serialNoTextFieldOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10); 
		transitTypeForATDropDownOfNextWindow=new PageElement(By.name("Data_232176127082010_0"), "transitTypeForATDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		riskCoveredForATDropDownOfNextWindow=new PageElement(By.name("Data_232177527082010_0"), "riskCoveredForATDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		cargoClauseApplicableDropDownOfNextWindow=new PageElement(By.xpath("//b[contains(text(),'Cargo Clause Applicable')]//following::select[3]"), "cargoClauseApplicableDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		wARSRCCClauseApplicableDropDownOfNextWindow=new PageElement(By.xpath("//b[contains(text(),'Cargo Clause Applicable')]//following::select[4]"), "wARSRCCClauseApplicableDropDownOfNextWindow", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//DIGVIJAY  prod AN
		declarationBookStartNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book Start No')]/following::input"), "Declaration Book Start No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		declarationBookEndNoTextField=new PageElement(By.xpath("//td//div[contains(text(),'Declaration Book End No')]/following::input"), "Declaration Book End No", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		whetherOverDimensionalDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether over-dimensional')]/following::select"), "Whether over-dimensional", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForAnnualPolicyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for Annual Policy')]/following::select"), "Basis of Valuation for Annual Policy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfBillDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Bill')]/following::select"), "Type of Bill", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		billNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Bill Number')]/following::textarea"), "Bill Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		billDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Bill Date')]/following::input"), "Bill Date", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		markNumberTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Mark Number')]/following::textarea"), "Mark Number", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		typeOfPostDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Post')]/following::select"), "Type of Post", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfCarrierDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Carrier')]/following::select"), "Type of Carrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		carrierLimitedLiabilityDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Carrier Limited Liability')]/following::select"), "Carrier Limited Liability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DIGVIJAY Prod-SV
		transitTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type')]/following::select"), "Transit Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalLossOnlyDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Total Loss Only')]/following::select"), "Total Loss Only", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//DIGVIJAY Prod-SI
		transporterNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Transporter Name')]/following::textarea"), "Transporter Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
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
		saveButton=new PageElement(By.name("btnSave"), "Save Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
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
		//DI-rajkumar
		transporterNameTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Transporter Name')]/following::textarea"), "Transporter Name List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//TC -rajkumar-2ND PAGE
		estateNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estate Name')]/following::textarea"), "Estate Name TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		estateAddressTextField=new PageElement(By.xpath("//td//div[contains(text(),'Estate Address')]/following::textarea"), "Estate Address TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		totalCropAreaOfEstateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Total Crop Area of Estate.(In Hectares)')]/following::input"), "Total Crop Area of Estate In Hectares TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		nurseryCropAreaInHectaresTextField=new PageElement(By.xpath("//td//div[contains(text(),'Nursery Crop Area(In Hectares)')]/following::input"), "Nursery Crop Area In Hectares TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		minimumElevationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average Elevation')]/following::input"), "Minimum Elevation TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		averageElevationTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average Elevation')]/following::input"), "Average Elevation TextField", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approxDateOfCommencementOfPluckingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approx Date of commencement of plucking')]/following::input"), "Approx Date Of Commencement Of Plucking Date Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		approxDateOfTerminationOfPluckingTextField=new PageElement(By.xpath("//td//div[contains(text(),'Approx date of termination of plucking')]/following::input"), "Approx Date Of Termination Of Plucking Date Field", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		periodOfPluckingInMonthsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Period of plucking in months')]/following::input"), "Period Of Plucking In Months Label", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ratioOfGreenLeafToMadeTeaTextField=new PageElement(By.xpath("//td//div[contains(text(),'%)Ratio of green leaf to made tea.')]/following::input"), "Ratio Of Green Leaf To Made Tea Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		averageMadeTeaProducedInLastThreeyearsTextField=new PageElement(By.xpath("//td//div[contains(text(),'Average made tea produced in last 3 years')]/following::input"), "Average Made Tea Produced In Last Three years", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForTeaCropDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for Tea Crop')]/following::select"), "Basis Of Valuation For Tea Crop List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		valuePerKgForInlandTextField=new PageElement(By.xpath("//td//div[contains(text(),'Value per kg for Inland')]/following::input"), "Value Per Kg For Inland Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		natureOfPackingForTeaTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Nature of Packing For Tea')]/following::textarea"), "Nature Of Packing For Tea Text Area", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		deleteButtonOfNextWindow= new PageElement(By.name("btnDel"), "Delete New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		saveButtonOfNextWindow= new PageElement(By.name("btnSave"), "SaveButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		closeButtonOfNextWindow= new PageElement(By.name("btnClose"), "CloseButton New Window Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//OP DHK
		sRCCRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Rate(%)')]/following::input"), "SRCC Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageDurationInDaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage Duration in Days')]/following::input"), "Storage Duration in Days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage Rate(%)')]/following::input"), "Storage Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		sRCCApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Applicable')]/following::select"), "SRCC Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		storageApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeofStorageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Storage')]/following::select"), "Type of Storage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sRCCCargoclauseapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'SRCC (Cargo) clause applicable')]/following::select"), "SRCC (Cargo) clause applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		placeofStorageTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Place of Storage')]/following::textarea"), "Place of Storage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//27
		vesselCodeTextField= new PageElement(By.xpath("//td//div[contains(text(),'Vessel Code')]/following::input"), "Vessel Code", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		vesselNameTextField=new PageElement(By.name("pVesselName"), "Vessel Name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//searchButton=new PageElement(By.name("Search"), "Search Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		backButtons=new PageElement(By.name("Back"), "Back Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		vesselCodeClickButton=new PageElement(By.xpath("//td//div[contains(text(),'Code')]/following::input/following::a[@name='firstFocus']"), "Vessel Code Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exportToCountryClickButton=new PageElement(By.xpath("//td//div[contains(text(),'Country')]/following::input/following::a[@name='firstFocus']"), "Export to Country Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exportToCountryTextField= new PageElement(By.xpath("//td//div[contains(text(),'Export to Country')]/following::input"), "Export to Country", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		countrySearchTextField=new PageElement(By.name("cntcty"), "Country Search Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		contrySearchFindButton=new PageElement(By.xpath("//td//b[contains(text(),'Country Search')]/following::input/following::a[@name='firstFocus']"), "Country Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		exportToCityTextField= new PageElement(By.xpath("//td//div[contains(text(),'Export to City')]/following::input"), "Export to City", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		exportToCityClickButton=new PageElement(By.xpath("//td//div[contains(text(),'City')]/following::input/following::a[@name='firstFocus']"), "Export to Country Click Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		citySearchTextField=new PageElement(By.name("cntcty"), "City Search Text", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		citySearchFindButton=new PageElement(By.xpath("//td//b[contains(text(),'City Search')]/following::input/following::a[@name='firstFocus']"), "City Find Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//CC DHK
		transitTypeforOCDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Transit Type for OC')]/following::select"), "Transit Type for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		commodityTypeDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Type')]/following::select"), "Commodity Type", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		packagingDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Packaging')]/following::select"), "Packaging", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		otherCityNameTextField=new PageElement(By.xpath("//td//div[contains(text(),'Other City name')]/following::input"), "Other City name", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		consigneeTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Consignee')]/following::textarea"), "Consignee", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Commodity Description')]/following::textarea"), "Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		otherCommodityDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Other Commodity Description')]/following::textarea"), "Other Commodity Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingDescriptionTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Packaging Description')]/following::textarea"), "Packaging Description", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		journeyStartDateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Journey Start Date')]/following::input"), "Journey Start Date", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//OC DHK
		excessapplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess applicable')]/following::select"), "Excess applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessApplicablOnDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Excess Applicable on')]/following::select"), "Excess Applicable on", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		sellersContingencyApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Sellers Contingency Applicable')]/following::select"), "Sellers Contingency Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		storageApplicableOCDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Storage Applicable')]/following::select"), "Storage Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		shutoutcargoApplicableDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Shutout cargo Applicable')]/following::select"), "Shutout cargo Applicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		basisOfValuationForOCDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Basis of Valuation for OC')]/following::select"), "Basis of Valuation for OC", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machineryDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery')]/following::select"), "Machinery", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		secondHandDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Second Hand')]/following::select"), "Second Hand", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherOverDimensionalCargotobecoveredDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Whether Over Dimensional cargo to be covered?')]/following::select"), "Whether Over Dimensional cargo to be covered?", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		machinerysubjecttoclauseDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Machinery subject to clause')]/following::select"), "Machinery subject to clause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		typeOfStorageDropDown=new PageElement(By.xpath("//td//div[contains(text(),'Type of Storagee')]/following::select"), "Type of Storage", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		excessOthersTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) Others')]/following::input"), "Excess(%) Others", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessSITextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) SI')]/following::input"), "Excess(%) SI", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessClaimAmountTextField=new PageElement(By.xpath("//td//div[contains(text(),'Excess(%) Claim Amount')]/following::input"), "Excess(%) Claim Amount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		numberOfDaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'Number of Days')]/following::input"), "Number of Days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		storageRateOCTextField=new PageElement(By.xpath("//td//div[contains(text(),'Storage Rate(%)')]/following::input"), "Storage Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		shutoutCargoRateTextField=new PageElement(By.xpath("//td//div[contains(text(),'Shutout Cargo Rate(%)')]/following::input"), "Shutout Cargo Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extraTextField=new PageElement(By.xpath("//td//div[contains(text(),'% Extra')]/following::input"), "% Extra", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underInsurancepercentTextField=new PageElement(By.xpath("//td//div[contains(text(),'Under insurance percent')]/following::input"), "Under insurance percent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//aPDAccountNoFindButtonOfOC=new PageElement(By.xpath("//td//div[contains(text(),'SRCC Rate(%)')]/following::input"), "SRCC Rate(%)", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		noOfdaysTextField=new PageElement(By.xpath("//td//div[contains(text(),'No of days')]/following::input"), "No of days", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		specialConditionsTextArea=new PageElement(By.xpath("//td//div[contains(text(),'Special Conditions')]/following::input"), "Special Conditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		detailsOfClausesApplicableOpenButtonForOC= new PageElement(By.name("propValues24"), "Details of Clauses Applicable", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		//detailsOfClausesApplicableOpenButtonForOC 
		transitTypeforOCNextDropDown=new PageElement(By.name("Data_232182127082010_0"), "Transit Type for OC ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		commodityTypeNextDropDown=new PageElement(By.name("Data_213906805022010_0"), "Commodity Type ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		packagingNextDropDown=new PageElement(By.name("Data_213910205022010_0"), "Packaging ", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		riskCoveredforOCDropDown=new PageElement(By.name("Data_232189327082010_0"), "Risk Covered for OC", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		cargoClauseApplicableDropDown=new PageElement(By.name("Data_317445912022014_0"), "Cargo Clause Applicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		wARSRCCClauseApplicableDropDown=new PageElement(By.name("Data_317443712022014_0"), "WAR / SRCC Clause Applicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//OP
		SRCCApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC Applicable", "select")), "SRCCApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SRCCRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC Rate(%)", "input")), "SRCCRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WARAndSRCCApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("WAR and SRCC Applicable", "input")), "WARAndSRCCApplicable;", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WARAndSRCCRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("War and SRCC Rate(%)", "input")), "WARAndSRCCRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DutyApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Duty Applicable", "input")), "DutyApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		DutyValue=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Duty Value", "input")), "DutyValue", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		DutyRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Duty Rate(%)", "input")), "DutyRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WARAndSRCCRateForDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("WAR and SRCC rate for Duty(%)", "input")), "WARAndSRCCRateForDuty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BasisOfValuationForDutyOP=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Valuation for Duty OP", "input")), "BasisOfValuationForDutyOP", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IncreasedValueRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Rate(%)", "input")), "IncreasedValueRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WARAndSRCCRateForIncreasedValue=new PageElement(By.xpath(locatorforQuestionAnswerPanel("War and SRCC rate for Increased Value(%)", "input")), "WARAndSRCCRateForIncreasedValue", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BasisOfValuationForIncreasedValue=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis of Valuation for Increased Value", "input")), "BasisOfValuationForIncreasedValue", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		StorageDurationInDays=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Storage Duration in Days", "input")), "StorageDurationInDays", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		StorageRateForDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subject to Duty Insurance Clause", "select")), "StorageRateForDuty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ShutoutCargoRateForDuty=new PageElement(By.xpath("//input[@name=('propValues11')]"), "ShutoutCargoRateForDuty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SubjectToIncreaseValueClause=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Subject to Increase Value Clause", "select")), "SubjectToIncreaseValueClause", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WarAndSRCCClauseAppli=new PageElement(By.xpath(locatorforQuestionAnswerPanel("War & SRCC(Cargo) clause applicable", "select")), "WarAndSRCCClauseAppli", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WarAndSRCCClauseApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("War & SRCC(Air Cargo) clause applicable", "select")), "WarAndSRCCClauseApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SRCCClauseAppli=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC (Cargo) clause applicable", "select")), "SRCCClauseAppli", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SRCCClauseApplic=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC (Air Cargo) clause applicable", "select")), "SRCCClauseApplic", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SRCCClauseApplica=new PageElement(By.xpath(locatorforQuestionAnswerPanel("SRCC (Inland) clause applicable", "select")), "SRCCClauseApplica", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		WhetherOverDimensionalCargoToBeCovered=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether Over Dimensional cargo to be covered?", "select")), "WhetherOverDimensionalCargoToBeCovered", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BasisOfValuationForOpenPolicy=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Basis Of Valuation For Open Policy", "select")), "BasisOfValuationForOpenPolicy", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExtraForBasisOfValuation=new PageElement(By.xpath(locatorforQuestionAnswerPanel("(%) Extra for basis of valuation", "input")), "ExtraForBasisOfValuation", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SellersContingencyApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Sellers Contingency Applicable", "select")), "SellersContingencyApplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ExtraForBasisOfValuationForSellersOntingency=new PageElement(By.xpath(locatorforQuestionAnswerPanel("(%) Extra for Basis of Valuation for Sellers ontingency", "input")), "ExtraForBasisOfValuationForSellersOntingency", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		SingleCarryingLimit=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Single Carrying Limit", "input")), "SingleCarryingLimit", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		LimitPerRegisteredPost=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit Per Registered Post", "input")), "LimitPerRegisteredPost", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ContainerizedCargo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Containerized Cargo", "select")), "ContainerizedCargo", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		//CC
		TransporterName=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Transporter Name", "textarea")), "TransporterName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		VesselName=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Vessel Name", "textarea")), "VesselName", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TypeOfVesselForCargo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Vessel for Cargo", "textarea")), "TypeOfVesselForCargo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ApprovedClassificationSociety=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Approved Classification Society", "select")), "ApprovedClassificationSociety", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ISMCompliance=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ISM Compliance", "select")), "ISMCompliance", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		GrossRegisteredTonnage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Gross Registered Tonnage (GRT)", "input")), "GrossRegisteredTonnage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		FlagOfVesselForCargo=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Flag of Vessel for Cargo", "input")), "FlagOfVesselForCargo", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		TransportDetails= new PageElement(By.xpath("//td//div[contains(text(),'Transport Details')]/following::input"), "TransportDetails", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TransportDetailsOpenButton=new PageElement(By.name("propValues18"), "TransportDetailsOpenButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ModeOfTransport=new PageElement(By.name("Data_232190627082010_0"), "ModeOfTransport", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		Via=new PageElement(By.name("Data_31941410062014_1"), "Via", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		AddButton= new PageElement(By.xpath("//input[@name=('btnAdd')]"), "Add Button", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		TypeOfCarrier=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Carrier", "select")), "TypeOfCarrier", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		CarrierLimitedLiability=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Carrier Limited Liability", "select")), "CarrierLimitedLiability", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		TypeOfBillForMarine=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Type of Bill for Marine", "select")), "TypeOfBillForMarine", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		BillNumber=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Bill Number", "textarea")), "BillNumber", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BillDate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Bill Date", "input")), "BillDate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		MarkNumber=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Mark Number", "select")), "MarkNumber", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		DateOfSailing=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Date of Sailing", "input")), "DateOfSailing", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WhetherVesselIsLiner=new PageElement(By.xpath(locatorforQuestionAnswerPanel("whether vessel is liner?", "select")), "WhetherVesselIsLiner", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		NumberOfDaysForStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Number of Days for Storage", "input")), "NumberOfDaysForStorage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ShutoutCargoValueForDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Shutout Cargo Value for Duty", "input")), "ShutoutCargoValueForDuty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		NoOfDays=new PageElement(By.xpath(locatorforQuestionAnswerPanel("No of days", "input")), "NoOfDays", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WhetherFullVesselLoad=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether full vessel load", "select")), "WhetherFullVesselLoad", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		OtherVesselExtra=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other vessel Extra (%)", "input")), "OtherVesselExtra", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		OtherVesselExtraOnDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other vessel Extra (%) on duty", "input")), "OtherVesselExtraOnDuty", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		OtherTermsAndConditions=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Other Terms and Conditions", "textarea")), "OtherTermsAndConditions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		UnderInsurancePercent=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance percent", "input")), "UnderInsurancePercent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IncreasedValueSumInsured=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		IncreasedValueRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WARAndSRCCRateForIncreasedValue=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		BasisOfValuationForIncreasedValue=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		StorageDurationInDays=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		StorageRateForDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		//ShutoutCargoRateForDuty=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SubjectToIncreaseValueClause=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WarAndSRCCClauseApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		WarAndSRCCClauseApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		/*
		SRCCClauseApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SRCCClauseApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		SRCCClauseApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		 */
		rateforToandFrojourneyfromestatetoanothergardenGreenLeaf=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for To and Fro journey from estate to another garden.(Green Leaf)(%)", "input")), "rateforToandFrojourneyfromestatetoanothergardenGreenLeaf", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		singleJourneyRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Single Journey Rate (%)", "input")), "singleJourneyRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		quantityofTeaWaste=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Quantity of Tea Waste", "input")), "quantityofTeaWaste", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreedValueperKg=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Agreed Value per Kg", "input")), "agreedValueperKg", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforTeaWaste=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for Tea Waste(%)", "input")), "rateforTeaWaste", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforcarrierslegalliability=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate (%) for carriers legal liability", "input")), "rateforcarrierslegalliability", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		surplusQuantity=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Surplus Quantity", "input")), "surplusQuantity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforSurplusQuantity=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for Surplus Quantity(%)", "input")), "rateforSurplusQuantity", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		FOBRate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("FOB Rate(%)", "input")), "FOBRate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		extensionofstoragerate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Extension of storage rate(%)", "input")), "extensionofstoragerate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforadditionalStorage=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for additional Storage (%)", "input")), "rateforadditionalStorage", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		excessAmount=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Excess Amount", "input")), "excessAmount", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		hailExtensionQuantityofstandingcrop=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hail Extension Quantity of standing crop.", "input")), "hailExtensionQuantityofstandingcrop", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		agreedvalueforhailextensions=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Agreed value for hail extensions", "input")), "agreedvalueforhailextensions", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		rateforHailExtension=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Rate for Hail Extension (%)", "input")), "rateforHailExtension", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousPolicyNumber=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Policy Number", "input")), "previousPolicyNumber", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousInsuranceFromDate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Insurance From Date", "input")), "previousInsuranceFromDate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		previousInsuranceToDate=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Previous Insurance To Date", "input")), "previousInsuranceToDate", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		underinsurancepercent=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Under insurance percent", "input")), "underinsurancepercent", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		inclusionofToandFroJourneyfromestatetoanothergardenGreenLeaf=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Inclusion of To and Fro Journey from estate to another garden(Green Leaf)", "select")),"inclusionofToandFroJourneyfromestatetoanothergardenGreenLeaf", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		inclusionofsinglejourneyfromestatetoanothergardenorviceversa=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Inclusion of single journey from estate to another garden or vice versa", "select")),"inclusionofsinglejourneyfromestatetoanothergardenorviceversa", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		carriersLegalLiabilitycoverrequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Carriers Legal Liability cover required?", "select")),"carriersLegalLiabilitycoverrequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		inclusionofSurpluscoverRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Inclusion of Surplus cover Required", "select")),"inclusionofSurpluscoverRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		whetherFOBextensionisrequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Whether FOB extension is required?", "select")),"whetherFOBextensionisrequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		extensionofstorageinFOBisRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Extension of storage in FOB is Required?", "select")),"extensionofstorageinFOBisRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		additionalStorageinexcessofsevendays=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Additional Storage in excess of 7 days(clause 1(ii)) Required?", "select")),"additionalStorageinexcessofsevendays", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		hailExtensionRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Hail Extension Required", "select")),"hailExtensionRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		limitofLiabilityforHailExtension=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Limit of Liability for Hail Extension", "select")),"limitofLiabilityforHailExtension", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isICCAirRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is ICC -Air Required ?", "select")),"isICCAirRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCARequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is ITC -A Required ?", "select")),"isITCARequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCBRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is ITC -B Required ?", "select")),"isITCBRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		isITCCRequired=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Is ITC -C Required ?", "select")),"isITCCRequired", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ICCAirclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ICC (Air) clause applicable", "select")),"ICCAirclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ITCAclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ITC (A) clause applicable", "select")),"ITCAclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ITCBclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ITC (B) clause applicable", "select")),"ITCBclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ITCCclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ITC (C) clause applicable", "select")),"ITCCclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ITCAclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ITC (A) clause applicable", "select")),"ITCAclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		ITCBclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ITC (B) clause applicable", "select")),"ITCBclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		IncreasedValueApplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("Increased Value Applicable", "input")), "IncreasedValueApplicable", false, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		ITCCclauseapplicable=new PageElement(By.xpath(locatorforQuestionAnswerPanel("ITC (C) clause applicable", "select")),"ITCCclauseapplicable", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
	}

	public void fillPolicyInsuredInrestAttributeCargoDetailsMarineCargo(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException{
		if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("add") || polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("edit")){
			//DIGVIJAY  prod AT

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTotalSI")) {
				clearAndSendKeys(TotalSI, polInsIntAttCarDetMCEntity.getStringValueForField("TotalSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				selectValueFromList(StorageApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceofStorage")) {
				clearAndSendKeys(PlaceofStorage, polInsIntAttCarDetMCEntity.getStringValueForField("PlaceofStorage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutcargoApplicable")) {
				selectValueFromList(ShutoutcargoApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutcargoApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitExtensionApplicable")) {
				selectValueFromList(TransitExtensionApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("TransitExtensionApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicableAT")) {
				selectValueFromList(StorageApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicableAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRate")) {
				clearAndSendKeys(StorageRate, polInsIntAttCarDetMCEntity.getStringValueForField("StorageRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDurationofStorage")) {
				clearAndSendKeys(DurationofStorage, polInsIntAttCarDetMCEntity.getStringValueForField("DurationofStorage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceofStorageSI")) {
				clearAndSendKeys(PlaceofStorage, polInsIntAttCarDetMCEntity.getStringValueForField("PlaceofStorageSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutcargoApplicableSI")) {
				selectValueFromList(ShutoutcargoApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutcargoApplicableSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberofDaysSI")) {
				clearAndSendKeys(NumberofDays, polInsIntAttCarDetMCEntity.getStringValueForField("NumberofDaysSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerRoadVehicleRail")) {
				clearAndSendKeys(LimitPerRoadVehicleRail, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerRoadVehicleRail"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoSumInsured")) {
				clearAndSendKeys(ShutoutCargoSumInsured, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoSumInsured"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRate")) {
				clearAndSendKeys(ShutoutCargoRate, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRate"));
			}			

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNewDestination")) {
				clearAndSendKeys(NewDestination, polInsIntAttCarDetMCEntity.getStringValueForField("NewDestination"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRate")) {
				clearAndSendKeys(Rate, polInsIntAttCarDetMCEntity.getStringValueForField("Rate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessforCargo")) {
				selectValueFromList(ExcessforCargo, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessforCargo"));
			}			
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDays")) {
				clearAndSendKeys(NumberofDays, polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDays"));
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessofSI")) {
				clearAndSendKeys(ExcessofSI, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessofSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDays")) {
				clearAndSendKeys(NumberofDays, polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDays"));
			}			
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessofClaim")) {
				clearAndSendKeys(ExcessofClaim, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessofClaim"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessAmount")) {
				clearAndSendKeys(ExcessAmount, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessAmount"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMinimumRs")) {
				clearAndSendKeys(MinimumRs, polInsIntAttCarDetMCEntity.getStringValueForField("MinimumRs"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditionsAT")) {
				clearAndSendKeys(specialConditionsTextArea, polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditionsAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeofStorageSI")) {
				selectValueFromList(TypeofStorage, polInsIntAttCarDetMCEntity.getStringValueForField("TypeofStorageSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigUnderinsurancepercentt")) {
				clearAndSendKeys(Underinsurancepercent, polInsIntAttCarDetMCEntity.getStringValueForField("Underinsurancepercentt"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInvoiceDetails")) {
				fillInvoiceDetails(polInsIntAttCarDetMCEntity);
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDuration")) {
				clearAndSendKeys(TransitDuration, polInsIntAttCarDetMCEntity.getStringValueForField("TransitDuration"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigClassificationSociety")) {
				clearAndSendKeys(ClassificationSociety, polInsIntAttCarDetMCEntity.getStringValueForField("ClassificationSociety"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocationClauseAT")) {
				selectValueFromList(LimitPerLocationClause, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocationClauseAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAnnualPremiumOnTotalAnnualSumInsured")) {
				selectValueFromList(AnnualPremiumOnTotalAnnualSumInsured, polInsIntAttCarDetMCEntity.getStringValueForField("AnnualPremiumOnTotalAnnualSumInsured"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFobCoverRequired")) {
				selectValueFromList(WhetherFobCoverRequired, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFobCoverRequired"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForFobCover")) {
				selectValueFromList(BasisOfValuationForFobCover, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForFobCover"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDutyApplicable")) {
				selectValueFromList(DutyApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("DutyApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForDuty")) {
				selectValueFromList(BasisOfValuationForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForDuty"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigYear")) {
				clearAndSendKeys(Year, polInsIntAttCarDetMCEntity.getStringValueForField("Year"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMajorCommodity")) {
				selectValueFromList(MajorCommodity, polInsIntAttCarDetMCEntity.getStringValueForField("MajorCommodity"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDetails")) {
				selectValueFromList(TransitDetails, polInsIntAttCarDetMCEntity.getStringValueForField("TransitDetails"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPortOfLoading")) {
				clearAndSendKeys(PortOfLoading, polInsIntAttCarDetMCEntity.getStringValueForField("PortOfLoading"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPortofDischarge")) {
				clearAndSendKeys(PortofDischarge, polInsIntAttCarDetMCEntity.getStringValueForField("PortofDischarge"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneAircraft")) {
				clearAndSendKeys(LimitPerAnyOneAircraft, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneAircraft"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneVessel")) {
				clearAndSendKeys(LimitPerAnyOneVessel, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneVessel"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneRegisteredPostParcel")) {
				clearAndSendKeys(LimitPerAnyOneRegisteredPostParcel, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneRegisteredPostParcel"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerRoadVehicleRailAT")) {
				clearAndSendKeys(LimitPerRoadVehicleRail, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerRoadVehicleRailAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				clearAndSendKeys(LimitPerLocation, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocation"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFullVesselLoadShipmentWillBeEffected")) {
				selectValueFromList(WhetherFullVesselLoadShipmentWillBeEffected, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFullVesselLoadShipmentWillBeEffected"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicable")) {
				selectValueFromList(ExcessApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicableOn")) {
				selectValueFromList(ExcessApplicableOn, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicableOn"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessSI")) {
				selectValueFromList(ExcessSI, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessSI"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessClaimAmount")) {
				selectValueFromList(ExcessClaimAmount, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessClaimAmount"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessOthers")) {
				selectValueFromList(ExcessOthers, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessOthers"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyInsuranceApplicable")) {
				selectValueFromList(SellersContingencyInsuranceApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyInsuranceApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForSellersContingency")) {
				selectValueFromList(BasisOfValuationForSellersContingency, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForSellersContingency"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtraForSellersContingencyBasisOfValuation")) {
				selectValueFromList(ExtraForSellersContingencyBasisOfValuation, polInsIntAttCarDetMCEntity.getStringValueForField("ExtraForSellersContingencyBasisOfValuation"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDaysSV")) {
				selectValueFromList(NumberOfDays, polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDaysSV"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceOfStorageSV")) {
				selectValueFromList(PlaceOfStorage, polInsIntAttCarDetMCEntity.getStringValueForField("PlaceOfStorageSV"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoApplicableSV")) {
				selectValueFromList(ShutoutCargoApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoApplicableSV"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNoOfDaysForShutout")) {
				selectValueFromList(NoOfDaysForShutout, polInsIntAttCarDetMCEntity.getStringValueForField("NoOfDaysForShutout"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinery")) {
				selectValueFromList(Machinery, polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				selectValueFromList(SecondHand, polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPaymentFrequencyForAT")) {
				selectValueFromList(PaymentFrequencyForAT, polInsIntAttCarDetMCEntity.getStringValueForField("PaymentFrequencyForAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfPremiumComputationForAT")) {
				selectValueFromList(BasisOfPremiumComputationForAT, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfPremiumComputationForAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfStorage")) {
				selectValueFromList(TypeOfStorage, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfStorage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerySubjectToClause")) {
				selectValueFromList(MachinerySubjectToClause, polInsIntAttCarDetMCEntity.getStringValueForField("MachinerySubjectToClause"));
			}
			/*if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")) {
				selectValueFromList(DetailsOfClausesApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("DetailsOfClausesApplicable"));
			}*/
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSubjectToDutyInsuranceClause")) {
				selectValueFromList(SubjectToDutyInsuranceClause, polInsIntAttCarDetMCEntity.getStringValueForField("SubjectToDutyInsuranceClause"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSubjectToSellersInterestClause")) {
				selectValueFromList(SubjectToSellersInterestClause, polInsIntAttCarDetMCEntity.getStringValueForField("SubjectToSellersInterestClause"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitATButton")) {
				fillTransitDetailsATButton(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")) {
				fillDetailsOfClausesApplicableForAT(polInsIntAttCarDetMCEntity);
			}
			//OP
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCApplicable")) {
				selectValueFromList(SRCCApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCRate")) {
				selectValueFromList(SRCCRate, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARAndSRCCApplicable")) {
				selectValueFromList(WARAndSRCCApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("WARAndSRCCApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARAndSRCCRate")) {
				selectValueFromList(WARAndSRCCRate, polInsIntAttCarDetMCEntity.getStringValueForField("WARAndSRCCRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDutyApplicableOP")) {
				selectValueFromList(DutyApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("DutyApplicableOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDutyValue")) {
				selectValueFromList(DutyValue, polInsIntAttCarDetMCEntity.getStringValueForField("DutyValue"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDutyRate")) {
				selectValueFromList(DutyRate, polInsIntAttCarDetMCEntity.getStringValueForField("DutyRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARAndSRCCRateForDuty")) {
				selectValueFromList(WARAndSRCCRateForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("WARAndSRCCRateForDuty"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForDutyOP")) {
				selectValueFromList(BasisOfValuationForDutyOP, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForDutyOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigIncreasedValueApplicable")) {
				selectValueFromList(IncreasedValueApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("IncreasedValueApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigIncreasedValueSumInsured")) {
				selectValueFromList(IncreasedValueSumInsured, polInsIntAttCarDetMCEntity.getStringValueForField("IncreasedValueSumInsured"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigIncreasedValueRate")) {
				selectValueFromList(IncreasedValueRate, polInsIntAttCarDetMCEntity.getStringValueForField("IncreasedValueRate"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARAndSRCCRateForIncreasedValue")) {
				selectValueFromList(WARAndSRCCRateForIncreasedValue, polInsIntAttCarDetMCEntity.getStringValueForField("WARAndSRCCRateForIncreasedValue"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForIncreasedValue")) {
				selectValueFromList(BasisOfValuationForIncreasedValue, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForIncreasedValue"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				selectValueFromList(StorageApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicableOP")) {
				selectValueFromList(StorageApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicableOP"));
				click(forwardButton);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageDurationInDays")) {
				selectValueFromList(StorageDurationInDays, polInsIntAttCarDetMCEntity.getStringValueForField("StorageDurationInDays"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceOfStorageOP")) {
				selectValueFromList(PlaceOfStorage, polInsIntAttCarDetMCEntity.getStringValueForField("PlaceOfStorageOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRateOP")) {
				clearAndSendKeys(StorageRate, polInsIntAttCarDetMCEntity.getStringValueForField("StorageRateOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRateForDuty")) {
				selectValueFromList(StorageRateForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("StorageRateForDuty"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoApplicableOP")) {
				selectValueFromList(ShutoutCargoApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoApplicableOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDaysOP")) {
				selectValueFromList(NumberOfDays, polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDaysOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRateOP")) {
				clearAndSendKeys(ShutoutCargoRate, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRateOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRateForDuty")) {
				clearAndSendKeys(ShutoutCargoRateForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRateForDuty"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfStorageOP")) {
				selectValueFromList(TypeOfStorage, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfStorageOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSubjectToDutyInsuranceClauseOP")) {
				selectValueFromList(SubjectToDutyInsuranceClause, polInsIntAttCarDetMCEntity.getStringValueForField("SubjectToDutyInsuranceClauseOP"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSubjectToIncreaseValueClause")) {
				selectValueFromList(SubjectToIncreaseValueClause, polInsIntAttCarDetMCEntity.getStringValueForField("SubjectToIncreaseValueClause"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWarAndSRCCClauseAppli")) {
				selectValueFromList(WarAndSRCCClauseAppli, polInsIntAttCarDetMCEntity.getStringValueForField("WarAndSRCCClauseAppli"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWarAndSRCCClauseApplicable")) {
				selectValueFromList(WarAndSRCCClauseApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("WarAndSRCCClauseApplicable"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCClauseAppli")) {
				selectValueFromList(SRCCClauseAppli, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCClauseAppli"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCClauseApplic")) {
				selectValueFromList(SRCCClauseApplic, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCClauseApplic"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCClauseApplica")) {
				selectValueFromList(SRCCClauseApplica, polInsIntAttCarDetMCEntity.getStringValueForField("SRCCClauseApplica"));
			}	
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				clearAndSendKeys(TransporterName, polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselNameCC")) {
				clearAndSendKeys(VesselName, polInsIntAttCarDetMCEntity.getStringValueForField("VesselNameCC"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfVesselForCargo")) {
				clearAndSendKeys(TypeOfVesselForCargo, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfVesselForCargo"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApprovedClassificationSociety")) {
				selectValueFromList(ApprovedClassificationSociety, polInsIntAttCarDetMCEntity.getStringValueForField("ApprovedClassificationSociety"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigClassificationSocietyAT")) {
				selectValueFromList(ClassificationSociety, polInsIntAttCarDetMCEntity.getStringValueForField("ClassificationSocietyAT"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigISMCompliance")) {
				selectValueFromList(ISMCompliance, polInsIntAttCarDetMCEntity.getStringValueForField("ISMCompliance"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigGrossRegisteredTonnage")) {
				selectValueFromList(GrossRegisteredTonnage, polInsIntAttCarDetMCEntity.getStringValueForField("GrossRegisteredTonnage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("FlagOfVesselForCargo")) {
				selectValueFromList(FlagOfVesselForCargo, polInsIntAttCarDetMCEntity.getStringValueForField("FlagOfVesselForCargo"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransportDetails")) {
				fillTransportDetails(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigModeOfTransport")) {
				selectValueFromList(ModeOfTransport, polInsIntAttCarDetMCEntity.getStringValueForField("ModeOfTransport"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfCarrier")) {
				selectValueFromList(TypeOfCarrier, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfCarrier"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCarrierLimitedLiability")) {
				selectValueFromList(CarrierLimitedLiability, polInsIntAttCarDetMCEntity.getStringValueForField("CarrierLimitedLiability"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfBillForMarine")) {
				selectValueFromList(TypeOfBillForMarine, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfBillForMarine"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillNumber")) {
				clearAndSendKeys(BillNumber, polInsIntAttCarDetMCEntity.getStringValueForField("BillNumber"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillDate")) {
				clearAndSendKeys(BillDate, polInsIntAttCarDetMCEntity.getStringValueForField("BillDate"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
				clearAndSendKeys(MarkNumber, polInsIntAttCarDetMCEntity.getStringValueForField("MarkNumber"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInvoiceNumberAT")) {
				clearAndSendKeys(InvoiceNumber, polInsIntAttCarDetMCEntity.getStringValueForField("InvoiceNumberAT"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInvoiceDateAT")) {
				clearAndSendKeys(InvoiceDate, polInsIntAttCarDetMCEntity.getStringValueForField("InvoiceDateAT"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDateOfSailing")) {
				clearAndSendKeys(DateOfSailing, polInsIntAttCarDetMCEntity.getStringValueForField("DateOfSailing"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtraPercentage")) {
				clearAndSendKeys(extraPercentageTextField, polInsIntAttCarDetMCEntity.getStringValueForField("ExtraPercentage"));
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherVesselIsLiner")) {
				selectValueFromList(WhetherVesselIsLiner, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherVesselIsLiner"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				selectValueFromList(SpecialConditions, polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"));

			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherVesselIsLiner")) {
				selectValueFromList(WhetherVesselIsLiner, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherVesselIsLiner"));
				click(forwardButton);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRateForDutyCC")) {
				clearAndSendKeys(ShutoutCargoRateForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRateForDutyCC"));
				click(forwardButton);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRateForDutyCC")) {
				if(!(polInsIntAttCarDetMCEntity.getStringValueForField("Product").equalsIgnoreCase("CC"))){
				clearAndSendKeys(ShutoutCargoRateForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRateForDutyCC"));
				}
				click(forwardButton);
			}
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAPDAccNO")){
				Thread.sleep(3000);
				click(FindButton);
				switchToWindow("Bank Gurantee Search");
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAccNO")) {
					clearAndSendKeys(accountCodeTextField, polInsIntAttCarDetMCEntity.getStringValueForField("AccNO"));
					click(searchButton);
				}
				//click(searchButton);
				//switchToWindow("SL Account Search");
				selectAPDAccNO(polInsIntAttCarDetMCEntity);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsClauseOC")) {
				FillDetailsOfClausesApplicableOpenButtonForOC(polInsIntAttCarDetMCEntity);

			}
		}	
	}


	/*else if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("verify")){
			//DIGVIJAY  prod AT
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAnnualPremiumOnTotalProvisionalAnnualSumInsured")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("AnnualPremiumOnTotalProvisionalAnnualSumInsured"), fetchValueFromTextFields(annualPremiumOnTotalProvisionalAnnualSumInsuredTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFOBCoverRequired")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFOBCoverRequired"), fetchValueFromList(whetherFOBCoverRequiredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigYear")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Year"), fetchValueFromTextFields(yearTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMajorCommodity")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MajorCommodity"), fetchValueFromList(majorCommodityDropDown), AssertionType.WARNING);
			}
			// button
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDetails")) {
				verifyTransitDetailsButton(polInsIntAttCarDetMCEntity, assertReference);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneAircraft")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneAircraft"), fetchValueFromTextFields(limitPerAnyOneAircraftTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneVessel")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneVessel"), fetchValueFromTextFields(limitPerAnyOneVesselTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneRegisteredPostParcel")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneRegisteredPostParcel"), fetchValueFromTextFields(limitPerAnyOneRegisteredPostParcelTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerRoadVehicleRail")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerRoadVehicleRail"), fetchValueFromTextFields(limitPerRoadVehicleRailTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocation")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocation"), fetchValueFromTextFields(limitPerLocationTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFullVesselLoadShipmentsWillBeEffected")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFullVesselLoadShipmentsWillBeEffected"), fetchValueFromList(whetherFullVesselLoadShipmentsWillBeEffectedDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicable"), fetchValueFromList(excessApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyInsuranceApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyInsuranceApplicable"), fetchValueFromList(sellersContingencyInsuranceApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"), fetchValueFromList(storageApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoApplicable"), fetchValueFromList(shutoutCargoApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinery")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"), fetchValueFromList(machineryDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"), fetchValueFromList(secondHandDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPaymentFrequencyForAT")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PaymentFrequencyForAT"), fetchValueFromList(paymentFrequencyForATDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfPremiumComputationForAT")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfPremiumComputationForAT"), fetchValueFromList(basisOfPremiumComputationForATDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocationClause")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocationClause"), fetchValueFromList(limitPerLocationClauseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerySubjectToClause")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MachinerySubjectToClause"), fetchValueFromList(machinerySubjectToClauseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")) {
				verifyDetailsOfClausesApplicableForAT(polInsIntAttCarDetMCEntity, assertReference);
			}
			//DIGVIJAY  prod AN
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeclarationBookStartNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("DeclarationBookStartNo"), fetchValueFromTextFields(declarationBookStartNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeclarationBookEndNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("DeclarationBookEndNo"), fetchValueFromTextFields(declarationBookEndNoTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensional")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WhetherOverDimensional"), fetchValueFromList(whetherOverDimensionalDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForAnnualPolicy")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForAnnualPolicy"), fetchValueFromList(basisOfValuationForAnnualPolicyDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfBill")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfBill"), fetchValueFromList(typeOfBillDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillNumber")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BillNumber"), fetchValueFromTextFields(billNumberTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBillDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("BillDate")) ,fetchValueFromTextFields(billDateTextField),AssertionType.WARNING);
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMarkNumber")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MarkNumber"), fetchValueFromTextFields(markNumberTextArea), AssertionType.WARNING);
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfPost")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfPost"), fetchValueFromList(typeOfPostDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfCarrier")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfCarrier"), fetchValueFromList(typeOfCarrierDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCarrierLimitedLiability")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CarrierLimitedLiability"), fetchValueFromList(carrierLimitedLiabilityDropDown), AssertionType.WARNING);
			}
			//DIGVIJAY Prod-SV
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitType")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransitType"), fetchValueFromList(transitTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTotalLossOnly")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TotalLossOnly"), fetchValueFromList(totalLossOnlyDropDown), AssertionType.WARNING);
			}
			//DIGVIJAY Prod-SI
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"), fetchValueFromTextFields(transporterNameTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigQuoteNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("QuoteNo"), fetchValueFromTextFields(quoteNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPolicyNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PolicyNo"), fetchValueFromTextFields(policyNoLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStatus")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Status"), fetchValueFromTextFields(statusLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPolicyHolderName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PolicyHolderName"), fetchValueFromTextFields(policyHolderLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigProductName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ProductName"), fetchValueFromTextFields(productLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestCode")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("InsuredInterestCode"), fetchValueFromTextFields(insuredInterestCodeLabel), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestSerialNo")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("InsuredInterestSerialNo"), fetchValueFromTextFields(insuredInterestSerialNoLabel), AssertionType.WARNING);	
			}

			/////

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigEstateName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("EstateName"), fetchValueFromTextFields(estateNameTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigEstateAddress")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("EstateAddress"), fetchValueFromTextFields(estateAddressTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTotalCropAreaOfEstate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TotalCropAreaOfEstate"), fetchValueFromTextFields(totalCropAreaOfEstateTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNurseryCropAreaInHectares")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NurseryCropAreaInHectares"), fetchValueFromTextFields(nurseryCropAreaInHectaresTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMinimumElevation")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("MinimumElevation"), fetchValueFromTextFields(minimumElevationTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAverageElevation")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("AverageElevation"), fetchValueFromTextFields(averageElevationTextField), AssertionType.WARNING);	
			}
			========
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPeriodOfPluckingInMonths")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PeriodOfPluckingInMonths"), fetchValueFromTextFields(periodOfPluckingInMonthsTextField), AssertionType.WARNING);	
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRatioOfGreenLeafToMadeTea")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("RatioOfGreenLeafToMadeTea"), fetchValueFromTextFields(ratioOfGreenLeafToMadeTeaTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAverageMadeTeaProducedInLastThreeyears")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("AverageMadeTeaProducedInLastThreeyears"), fetchValueFromTextFields(averageMadeTeaProducedInLastThreeyearsTextField), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForTeaCrop")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForTeaCrop"), fetchValueFromTextFields(basisOfValuationForTeaCropDropDown), AssertionType.WARNING);	
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigValuePerKgForInland")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ValuePerKgForInland"), fetchValueFromTextFields(valuePerKgForInlandTextField), AssertionType.WARNING);	
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNatureOfPackingForTea")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NatureOfPackingForTea"), fetchValueFromTextFields(natureOfPackingForTeaTextArea), AssertionType.WARNING);	
			}

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApproxDateOfCommencementOfPlucking")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ApproxDateOfCommencementOfPlucking"), fetchValueFromTextFields(approxDateOfCommencementOfPluckingTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigApproxDateOfTerminationOfPlucking")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ApproxDateOfTerminationOfPlucking"), fetchValueFromTextFields(approxDateOfTerminationOfPluckingTextField), AssertionType.WARNING);
			}

			//Verify--DI-rajkumar
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransporterName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransporterName"), fetchValueFromTextFields(transporterNameTextArea), AssertionType.WARNING);
			}
			//OP
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCRate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SRCCRate"), fetchValueFromTextFields(sRCCRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageRate"), fetchValueFromTextFields(storageRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageDurationInDays")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageDurationInDays"), fetchValueFromTextFields(storageDurationInDaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceofStorage")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PlaceofStorage"), fetchValueFromTextFields(placeofStorageTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SRCCApplicable"), fetchValueFromList(sRCCApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicable"), fetchValueFromList(storageApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeofStorage")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeofStorage"), fetchValueFromList(typeofStorageDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSRCCCargoclauseapplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("sRCCCargoclauseapplicable"), fetchValueFromList(sRCCCargoclauseapplicableDropDown), AssertionType.WARNING);
			}
			//CC
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigJourneyStartDate")) {
				assertReference.assertEquals(RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("JourneyStartDate")) ,fetchValueFromTextFields(journeyStartDateTextField),AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCityName")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("OtherCityName"), fetchValueFromTextFields(otherCityNameTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingDescription")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PackagingDescription"), fetchValueFromTextFields(packagingDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityDescription")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CommodityDescription"), fetchValueFromTextFields(commodityDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherCommodityDescription")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("OtherCommodityDescription"), fetchValueFromTextFields(otherCommodityDescriptionTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigConsignee")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Consignee"), fetchValueFromTextFields(consigneeTextArea), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("transitTypeforOC"), fetchValueFromList(transitTypeforOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityType")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CommodityType"), fetchValueFromList(commodityTypeDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackaging")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Packaging"), fetchValueFromList(packagingDropDown), AssertionType.WARNING);
			}
			//OC
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicableOpenButtonForOC")) {
				verifyDetailsOfClausesApplicableOpenButtonForOC(polInsIntAttCarDetMCEntity, assertReference);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessapplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Excessapplicable"), fetchValueFromList(excessapplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessApplicablOn")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessApplicablOn"), fetchValueFromList(excessApplicablOnDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyApplicable"), fetchValueFromList(sellersContingencyApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageApplicableOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageApplicableOC"), fetchValueFromList(storageApplicableOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutcargoApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("shutoutcargoApplicableDropDown"), fetchValueFromList(shutoutcargoApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForOC"), fetchValueFromList(basisOfValuationForOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachineryn")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Machinery"), fetchValueFromList(machineryDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHand")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SecondHand"), fetchValueFromList(secondHandDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCargotobecovered")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("whetherOverDimensionalCargotobecoveredDropDown"), fetchValueFromList(whetherOverDimensionalCargotobecoveredDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfStorage")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfStorage"), fetchValueFromList(typeOfStorageDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerysubjecttoclause")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Machinerysubjecttoclause"), fetchValueFromList(machinerysubjecttoclauseDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessClaimAmount")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessClaimAmount"), fetchValueFromTextFields(excessClaimAmountTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessOthers")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessOthers"), fetchValueFromTextFields(excessOthersTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessSI")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExcessSI"), fetchValueFromTextFields(excessSITextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDays")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDays"), fetchValueFromTextFields(numberOfDaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRateOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("StorageRateOC"), fetchValueFromTextFields(storageRateOCTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNoOfdays")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("NoOfdays"), fetchValueFromTextFields(noOfdaysTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRate")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRate"), fetchValueFromTextFields(shutoutCargoRateTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtra")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("Extra"), fetchValueFromTextFields(extraTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigUnderInsurancepercent")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("underInsurancepercentTextField"), fetchValueFromTextFields(underInsurancepercentTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSpecialConditions")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("SpecialConditions"), fetchValueFromTextFields(specialConditionsTextArea), AssertionType.WARNING);
			}
			//CC Vessel Find
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselCode")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("VesselCode"), fetchValueFromTextFields(vesselCodeTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCountry")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExportToCountry"), fetchValueFromTextFields(exportToCountryTextField), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCity")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("ExportToCity"), fetchValueFromTextFields(exportToCityTextField), AssertionType.WARNING);
			}
		}*/
	public void fillStorageAndForeignCur(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException{
		if((polInsIntAttCarDetMCEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttCarDetMCEntity.getStringValueForField("Product").equalsIgnoreCase("CC"))) {
			if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("add") || polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("edit")){
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNumberOfDaysForStorage")) {
					selectValueFromList(NumberOfDaysForStorage, polInsIntAttCarDetMCEntity.getStringValueForField("NumberOfDaysForStorage"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPlaceOfStorageCC")) {
					selectValueFromList(PlaceOfStorage, polInsIntAttCarDetMCEntity.getStringValueForField("PlaceOfStorageCC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigStorageRateCC")) {
					selectValueFromList(StorageRate, polInsIntAttCarDetMCEntity.getStringValueForField("StorageRateCC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitExtensionApplicableCC")) {
					selectValueFromList(TransitExtensionApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("TransitExtensionApplicableCC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoValueForDuty")) {
					selectValueFromList(ShutoutCargoValueForDuty, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoValueForDuty"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigShutoutCargoRateCC")) {
					clearAndSendKeys(ShutoutCargoRate, polInsIntAttCarDetMCEntity.getStringValueForField("ShutoutCargoRateCC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigNoOfDays")) {
					selectValueFromList(NoOfDays, polInsIntAttCarDetMCEntity.getStringValueForField("NoOfDays"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherFullVesselLoad")) {
					selectValueFromList(WhetherFullVesselLoad, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherFullVesselLoad"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherVesselExtra")) {
					selectValueFromList(OtherVesselExtra, polInsIntAttCarDetMCEntity.getStringValueForField("OtherVesselExtra"));

				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherVesselExtraOnDuty")) {
					selectValueFromList(OtherVesselExtraOnDuty, polInsIntAttCarDetMCEntity.getStringValueForField("OtherVesselExtraOnDuty"));

				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessSICC")) {
					selectValueFromList(ExcessSI, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessSICC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessClaimAmountCC")) {
					selectValueFromList(ExcessClaimAmount, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessClaimAmountCC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExcessOthersCC")) {
					selectValueFromList(ExcessOthers, polInsIntAttCarDetMCEntity.getStringValueForField("ExcessOthersCC"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigOtherTermsAndConditions")) {
					selectValueFromList(OtherTermsAndConditions	, polInsIntAttCarDetMCEntity.getStringValueForField("OtherTermsAndConditions"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigUnderInsurancePercent")) {
					clearAndSendKeys(UnderInsurancePercent, polInsIntAttCarDetMCEntity.getStringValueForField("UnderInsurancePercent"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigForeignCurrencyRequiredCC")) {
					selectValueFromList(ForeignCurrencyRequired, polInsIntAttCarDetMCEntity.getStringValueForField("ForeignCurrencyRequiredCC"));
				}

			}
		}
	}

	public void fillTCDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException{
		if((polInsIntAttCarDetMCEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttCarDetMCEntity.getStringValueForField("Product").equalsIgnoreCase("TC"))) {
			if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("add") || polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("edit")){

				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCinclusionofToandFroJourneyfromestatetoanothergardenGreenLeaf")) {
					selectValueFromList(inclusionofToandFroJourneyfromestatetoanothergardenGreenLeaf, polInsIntAttCarDetMCEntity.getStringValueForField("inclusionofToandFroJourneyfromestatetoanothergardenGreenLeaf"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCinclusionofsinglejourneyfromestatetoanothergardenorviceversa")) {
					selectValueFromList(inclusionofsinglejourneyfromestatetoanothergardenorviceversa, polInsIntAttCarDetMCEntity.getStringValueForField("inclusionofsinglejourneyfromestatetoanothergardenorviceversa"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCcarriersLegalLiabilitycoverrequired")) {
					selectValueFromList(carriersLegalLiabilitycoverrequired, polInsIntAttCarDetMCEntity.getStringValueForField("carriersLegalLiabilitycoverrequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCinclusionofSurpluscoverRequired")) {
					selectValueFromList(inclusionofSurpluscoverRequired, polInsIntAttCarDetMCEntity.getStringValueForField("inclusionofSurpluscoverRequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCwhetherFOBextensionisrequired")) {
					selectValueFromList(whetherFOBextensionisrequired, polInsIntAttCarDetMCEntity.getStringValueForField("whetherFOBextensionisrequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCextensionofstorageinFOBisRequired")) {
					selectValueFromList(extensionofstorageinFOBisRequired, polInsIntAttCarDetMCEntity.getStringValueForField("extensionofstorageinFOBisRequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCadditionalStorageinexcessofsevendays")) {
					selectValueFromList(additionalStorageinexcessofsevendays, polInsIntAttCarDetMCEntity.getStringValueForField("additionalStorageinexcessofsevendays"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTChailExtensionRequired")) {
					selectValueFromList(hailExtensionRequired, polInsIntAttCarDetMCEntity.getStringValueForField("hailExtensionRequired"));
				}

				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCrateforToandFrojourneyfromestatetoanothergardenGreenLeaf")){
					clearAndSendKeys(rateforToandFrojourneyfromestatetoanothergardenGreenLeaf,polInsIntAttCarDetMCEntity.getStringValueForField("rateforToandFrojourneyfromestatetoanothergardenGreenLeaf"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCsingleJourneyRate")){
					clearAndSendKeys(singleJourneyRate,polInsIntAttCarDetMCEntity.getStringValueForField("singleJourneyRate"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCquantityofTeaWaste")){
					clearAndSendKeys(quantityofTeaWaste,polInsIntAttCarDetMCEntity.getStringValueForField("quantityofTeaWaste"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCagreedValueperKg")){
					clearAndSendKeys(agreedValueperKg,polInsIntAttCarDetMCEntity.getStringValueForField("agreedValueperKg"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCrateforTeaWaste")){
					clearAndSendKeys(rateforTeaWaste,polInsIntAttCarDetMCEntity.getStringValueForField("rateforTeaWaste"));
					click(forwardButton);
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCrateforcarrierslegalliability")){
					clearAndSendKeys(rateforcarrierslegalliability,polInsIntAttCarDetMCEntity.getStringValueForField("rateforcarrierslegalliability"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCsurplusQuantity")){
					clearAndSendKeys(surplusQuantity,polInsIntAttCarDetMCEntity.getStringValueForField("surplusQuantity"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCrateforSurplusQuantity")){
					clearAndSendKeys(rateforSurplusQuantity,polInsIntAttCarDetMCEntity.getStringValueForField("rateforSurplusQuantity"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCFOBRate")){
					clearAndSendKeys(FOBRate,polInsIntAttCarDetMCEntity.getStringValueForField("FOBRate"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCextensionofstoragerate")){
					clearAndSendKeys(extensionofstoragerate,polInsIntAttCarDetMCEntity.getStringValueForField("extensionofstoragerate"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCrateforadditionalStorage")){
					clearAndSendKeys(rateforadditionalStorage,polInsIntAttCarDetMCEntity.getStringValueForField("rateforadditionalStorage"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCexcessAmount")){
					clearAndSendKeys(excessAmount,polInsIntAttCarDetMCEntity.getStringValueForField("excessAmount"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTChailExtensionQuantityofstandingcrop")){
					clearAndSendKeys(hailExtensionQuantityofstandingcrop,polInsIntAttCarDetMCEntity.getStringValueForField("hailExtensionQuantityofstandingcrop"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCagreedvalueforhailextensions")){
					clearAndSendKeys(agreedvalueforhailextensions,polInsIntAttCarDetMCEntity.getStringValueForField("agreedvalueforhailextensions"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCrateforHailExtension")){
					clearAndSendKeys(rateforHailExtension,polInsIntAttCarDetMCEntity.getStringValueForField("rateforHailExtension"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCpreviousPolicyNumber")){
					clearAndSendKeys(previousPolicyNumber,polInsIntAttCarDetMCEntity.getStringValueForField("previousPolicyNumber"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCpreviousInsuranceFromDate")){
					clearAndSendKeys(previousInsuranceFromDate,polInsIntAttCarDetMCEntity.getStringValueForField("previousInsuranceFromDate"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCpreviousInsuranceToDate")){
					clearAndSendKeys(previousInsuranceToDate,polInsIntAttCarDetMCEntity.getStringValueForField("previousInsuranceToDate"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTClimitofLiabilityforHailExtension")) {
					selectValueFromList(limitofLiabilityforHailExtension, polInsIntAttCarDetMCEntity.getStringValueForField("limitofLiabilityforHailExtension"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCisICCAirRequired")) {
					selectValueFromList(isICCAirRequired, polInsIntAttCarDetMCEntity.getStringValueForField("isICCAirRequired"));
				}

				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCisITCARequired")) {
					selectValueFromList(isITCARequired, polInsIntAttCarDetMCEntity.getStringValueForField("isITCARequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCisITCBRequired")) {
					selectValueFromList(isITCBRequired, polInsIntAttCarDetMCEntity.getStringValueForField("isITCBRequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCisITCCRequired")) {
					selectValueFromList(isITCCRequired, polInsIntAttCarDetMCEntity.getStringValueForField("isITCCRequired"));
				}
				if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCunderinsurancepercent")){
					clearAndSendKeys(underinsurancepercent,polInsIntAttCarDetMCEntity.getStringValueForField("underinsurancepercent"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCICCAirclauseapplicable")) {
					selectValueFromList(ICCAirclauseapplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ICCAirclauseapplicable"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCITCAclauseapplicable")) {
					selectValueFromList(ITCAclauseapplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ITCAclauseapplicable"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCITCBclauseapplicable")) {
					selectValueFromList(ITCBclauseapplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ITCBclauseapplicable"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTCITCCclauseapplicable")) {
					selectValueFromList(ITCCclauseapplicable, polInsIntAttCarDetMCEntity.getStringValueForField("ITCCclauseapplicable"));
				}

			}
		}
	}

	public void fillTransportDetails(PolInsIntAttCarDetMCEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		clickTransportOpenButton(polInsIntAttrMCargoEntity);
		Thread.sleep(3000);

		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigModeOfTransportCC")){
			selectValueFromList(ModeOfTransportCC,polInsIntAttrMCargoEntity.getStringValueForField("ModeOfTransportCC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigFromPlaceTextAreaCC")){
			clearAndSendKeys(FromPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("FromPlaceTextAreaCC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigToPlaceTextAreaCC")){
			clearAndSendKeys(ToPlaceTextArea,polInsIntAttrMCargoEntity.getStringValueForField("ToPlaceTextAreaCC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigserialNoTextFieldOfNextWindowCC")){
			clearAndSendKeys(serialNoTextFieldOfNextWindow,polInsIntAttrMCargoEntity.getStringValueForField("serialNoTextFieldOfNextWindowCC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigLandConveyanceCodeCDropDownCC")){
			selectValueFromList(LandConveyanceCodeCDropDown,polInsIntAttrMCargoEntity.getStringValueForField("LandConveyanceCodeCDropDownCC"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigVia")) {
			clearAndSendKeys(Via,polInsIntAttrMCargoEntity.getStringValueForField("Via"));
		}
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindowCC")){
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

	public void fillPolicyInsuredInrestAttributeSVMarineCargoDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException{
		if((polInsIntAttCarDetMCEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttCarDetMCEntity.getStringValueForField("Product").equalsIgnoreCase("SV"))) {
			if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("add") || polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("edit")){
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigForeignCurrencyRequired")) {
					selectValueFromList(LimitPerLocationClause, polInsIntAttCarDetMCEntity.getStringValueForField("ForeignCurrencyRequired"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCurrency")) {
					selectValueFromList(LimitPerLocationClause, polInsIntAttCarDetMCEntity.getStringValueForField("Currency"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigForeignCurrencyRate")) {
					selectValueFromList(LimitPerLocationClause, polInsIntAttCarDetMCEntity.getStringValueForField("ForeignCurrencyRate"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSumInsuredInForeignCurrency")) {
					selectValueFromList(LimitPerLocationClause, polInsIntAttCarDetMCEntity.getStringValueForField("SumInsuredInForeignCurrency"));
				}

			}
		}
	}
	public void fillOPLimitTransitDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException{
		if((polInsIntAttCarDetMCEntity.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")) && (polInsIntAttCarDetMCEntity.getStringValueForField("Product").equalsIgnoreCase("OP"))) {
			if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("add") || polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("edit")){
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWhetherOverDimensionalCargoToBeCovered")) {
					selectValueFromList(WhetherOverDimensionalCargoToBeCovered, polInsIntAttCarDetMCEntity.getStringValueForField("WhetherOverDimensionalCargoToBeCovered"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachineryOP")) {
					selectValueFromList(Machinery, polInsIntAttCarDetMCEntity.getStringValueForField("MachineryOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSecondHandOP")) {
					selectValueFromList(SecondHand, polInsIntAttCarDetMCEntity.getStringValueForField("SecondHandOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForOpenPolicy")) {
					selectValueFromList(BasisOfValuationForOpenPolicy, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForOpenPolicy"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtraForBasisOfValuation")) {
					clearAndSendKeys(ExtraForBasisOfValuation, polInsIntAttCarDetMCEntity.getStringValueForField("ExtraForBasisOfValuation"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSellersContingencyApplicable")) {
					selectValueFromList(SellersContingencyApplicable, polInsIntAttCarDetMCEntity.getStringValueForField("SellersContingencyApplicable"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBasisOfValuationForSellersContingencyOP")) {
					selectValueFromList(BasisOfValuationForSellersContingency, polInsIntAttCarDetMCEntity.getStringValueForField("BasisOfValuationForSellersContingencyOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExtraForBasisOfValuationForSellersOntingency")) {
					selectValueFromList(ExtraForBasisOfValuationForSellersOntingency, polInsIntAttCarDetMCEntity.getStringValueForField("ExtraForBasisOfValuationForSellersOntingency"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSingleCarryingLimit")) {
					clearAndSendKeys(SingleCarryingLimit, polInsIntAttCarDetMCEntity.getStringValueForField("SingleCarryingLimit"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneAircraftOP")) {
					clearAndSendKeys(LimitPerAnyOneAircraft, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneAircraftOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerAnyOneVesselOP")) {
					clearAndSendKeys(LimitPerAnyOneVesselOP, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerAnyOneVesselOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerRegisteredPost")) {
					clearAndSendKeys(LimitPerRegisteredPost, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerRegisteredPost"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocationOP")) {
					clearAndSendKeys(LimitPerLocation, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocationOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigContainerizedCargo")) {
					selectValueFromList(ContainerizedCargo, polInsIntAttCarDetMCEntity.getStringValueForField("ContainerizedCargo"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTypeOfCarrierOP")) {
					selectValueFromList(TypeOfCarrier, polInsIntAttCarDetMCEntity.getStringValueForField("TypeOfCarrierOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCarrierLimitedLiabilityOP")) {
					selectValueFromList(CarrierLimitedLiability, polInsIntAttCarDetMCEntity.getStringValueForField("CarrierLimitedLiabilityOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMachinerySubjectToClauseOP")) {
					selectValueFromList(MachinerySubjectToClause, polInsIntAttCarDetMCEntity.getStringValueForField("MachinerySubjectToClauseOP"));
				}
				if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLimitPerLocationClauseOP")) {
					selectValueFromList(LimitPerLocationClause, polInsIntAttCarDetMCEntity.getStringValueForField("LimitPerLocationClauseOP"));
				}	
			}
		}
	}
	public void clickTransportOpenButton(PolInsIntAttCarDetMCEntity polInsIntAttrMCargoEntity) throws InterruptedException{
		if(polInsIntAttrMCargoEntity.getBooleanValueForField("ConfigTransportOpenButton")){
			click(TransportDetailsOpenButton);

			try{
				switchToWindow("'Transport Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Transport Details' Details");

			}
			click(AddButton);
		}
	}

	public void clickToInvoiceDetailsOpenButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		//DIGVIJAY  prod AT transit details button
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInvoiceDetailsCC")){
			click(invoiceDetailsOpenButton);
			try{
				switchToWindow("'Invoice Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Invoice Details' Details");
			}
			click(AddButton);
		}
	}
	public void clickToOpenButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		//DIGVIJAY  prod AT transit details button
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitDetailsAT")){
			click(transitDetailsOpenButton);
			try{
				switchToWindow("'Transit Details' Details");
			}
			catch(Exception e){
				switchToWindow("'Transit Details' Details");
			}
			click(AddButton);
		}
	}
	//DIGVIJAY  prod AT DetailsOfClausesApplicable button
	public void clickToDetailsOfClausesOpenButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicable")){
			click(detailsOfClausesApplicableOpenButton);
			try{
				switchToWindow("'Details of Clauses Applicable' Details");
			}
			catch(Exception e){
				switchToWindow("'Details of Clauses Applicable' Details");
			}
			click(AddButton);
		}
	}
	//**
	public void fillTransitDetailsButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigModeOfTransports")){
			clearAndSendKeys(modeOfTransportsDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("ModeOfTransports"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLandConveyanceCodeC")){
			clearAndSendKeys(landConveyanceCodeCDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("LandConveyanceCodeC"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFromPlace")){
			clearAndSendKeys(fromPlaceTextArea,polInsIntAttCarDetMCEntity.getStringValueForField("FromPlace"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigToPlace")){
			clearAndSendKeys(toPlaceTextArea,polInsIntAttCarDetMCEntity.getStringValueForField("ToPlace"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void fillTransitDetailsATButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigModeOfTransportsAT")){
			selectValueFromList(modeOfTransportsATDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("ModeOfTransportsAT"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLandConveyanceCodeAT")){
			selectValueFromList(LandConveyanceCodeATropDown,polInsIntAttCarDetMCEntity.getStringValueForField("LandConveyanceCodeAT"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFromPlaceAT")){
			clearAndSendKeys(FromPlaceATTextArea,polInsIntAttCarDetMCEntity.getStringValueForField("FromPlaceAT"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigToPlaceAT")){
			clearAndSendKeys(ToPlaceATTextArea,polInsIntAttCarDetMCEntity.getStringValueForField("ToPlaceAT"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindowAT")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButtonAT")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void fillInvoiceDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToInvoiceDetailsOpenButton(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);
		switchToWindow("'Invoice Details' Details");
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInvoiceNumberCC")) {
			clearAndSendKeys(InvoiceNumber, polInsIntAttCarDetMCEntity.getStringValueForField("InvoiceNumberCC"));
		}
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInvoiceDateCC")) {
			String InvoiceCCDate=RandomCodeGenerator.dateGenerator(polInsIntAttCarDetMCEntity.getStringValueForField("InvoiceDateCC"));
			clearAndEnterDate(InvoiceDate, InvoiceCCDate);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindowCC")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButtonCC")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}

	//**************************
	//DIGVIJAY PROD-AT
	public void fillDetailsOfClausesApplicableForAT(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToDetailsOfClausesOpenButton(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicableOfNextWindowAT")){
			selectValueFromList(cargoClauseApplicableDropDownOfNextWindow, polInsIntAttCarDetMCEntity.getStringValueForField("CargoClauseApplicableOfNextWindowAT"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicableOfNextWindowAT")){
			selectValueFromList(wARSRCCClauseApplicableDropDownOfNextWindow, polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicableOfNextWindowAT"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindowAT")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}


	public void navigateToPolicy(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPolicyTab")){			
			click(policyTab);
			switchToFrame("display");
			isElementDisplayed(policyTabTitle);
		}
	}
	public void navigateToAttribute(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigAttributeTab")){			
			click(attributeTab);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}
	public void navigateToInsuredInterest(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestTab")){			
			click(insuredInterestTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestTabTitle);
		}
	}
	public void navigateToCoverage(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCoverageTab")){			
			click(coverageTab);
			switchToFrame("display");
			isElementDisplayed(coverageTabTitle);
		}
	}
	public void navigateToClientDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigClientDetailsTab")){			
			click(clientDetailsTab);
			switchToFrame("display");
			isElementDisplayed(clientDetailsTabTitle);
		}
	}
	public void navigateToRelation(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRelationTab")){			
			click(relationsTab);
			switchToFrame("display");
			isElementDisplayed(relationsTabTitle);
		}
	}
	public void navigateToPayment(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPaymentsTab")){			
			click(paymentsTab);
			switchToFrame("display");
			isElementDisplayed(paymentsTabTitle);
		}
	}
	public void navigateToFollowup(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigFollowupTab")){			
			click(followupTab);
			switchToFrame("display");
			isElementDisplayed(followupTabTitle);
		}
	}
	public void navigateToDocument(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDocumentTab")){			
			click(documentTab);
			switchToFrame("display");
			isElementDisplayed(documentTabTitle);
		}
	}
	public void navigateToLoan(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigLoanTab")){		
			click(loanTab);
			switchToFrame("display");
			isElementDisplayed(loanTabTitle);
		}
	}
	public void navigateToInsuredInterestDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberDetail")) {
			click(insuredInterestDetailTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestDetailsPageTitle);
		}
	}
	public void navigateToInsuredInterestAttributes(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberAttributes")) {
			click(insuredInterestAttributesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttributesPageTitle);
		}
	}
	public void navigateToInsuredInterestAttachCoverages(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberAttachCoverages")) {
			click(insuredInterestAttachCoveragesTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestAttachCoveragePageTitle);
		}
	}
	public void navigateToInsuredInterestRelations(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberRelations")) {
			click(insuredInterestRelationsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestRelationsPageTitle);
		}
	}
	public void navigateToInsuredInterestPayments(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigMemberPayments")) {
			click(insuredInterestPaymentsTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateToinsuredInterestScheduleTab(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigInsuredInterestScheduleTab")) {
			click(insuredInterestScheduleTab);
			switchToFrame("display");
			isElementDisplayed(insuredInterestPaymentPageTitle);
		}
	}
	public void navigateTobackAttributePage(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBackButton")){			
			click(backButton);
			switchToFrame("display");
			isElementDisplayed(attributeTabTitle);
		}
	}

	public void clickToOpenButtonForOC(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDetailsOfClausesApplicableOpenButtonForOC")){
			click(detailsOfClausesApplicableOpenButtonForOC);
			try{
				switchToWindow("Details of Clauses Applicable");
			}
			catch(Exception e){
				switchToWindow("Details of Clauses Applicable");

			}
			click(AddButton);
		}
	}

	public void FillDetailsOfClausesApplicableOpenButtonForOC(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickToOpenButtonForOC(polInsIntAttCarDetMCEntity);
		Thread.sleep(3000);
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOCNext")){
			selectValueFromList(transitTypeforOCNextDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("TransitTypeforOCNext"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityTypeNext")){
			selectValueFromList(commodityTypeNextDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("CommodityTypeNext"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingNext")){
			selectValueFromList(packagingNextDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("PackagingNext"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRiskCoveredforOC")){
			selectValueFromList(riskCoveredforOCDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("RiskCoveredforOC"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicable")){
			selectValueFromList(cargoClauseApplicableDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("CargoClauseApplicable"));
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicable")){
			selectValueFromList(wARSRCCClauseApplicableDropDown,polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicable"));
		}

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigDeleteButtonOfNextWindow")){
			click(deleteButtonOfNextWindow);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
			Thread.sleep(3000);
			click(saveButtonOfNextWindow);
			try {
				acceptAlertAndReturnConfirmationMessage();
			} catch (Exception e) {
			}
			click(closeButtonOfNextWindow);
			Thread.sleep(3000);
			switchToWindow("Integrated Insurance Management System");
			switchToFrame("display");
		}
	}
	public void verifyDetailsOfClausesApplicableOpenButtonForOC(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity ,CustomAssert assertReference) throws InterruptedException{
		clickToOpenButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getAction().equalsIgnoreCase("verify")){

			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigTransitTypeforOCNext")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("TransitTypeforOCNext"), fetchValueFromList(transitTypeforOCNextDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCommodityTypeNext")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("CommodityTypeNext"), fetchValueFromList(commodityTypeNextDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigPackagingNext")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("PackagingNext"), fetchValueFromList(packagingNextDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigRiskCoveredforOC")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("RiskCoveredforOC"), fetchValueFromList(riskCoveredforOCDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCargoClauseApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("cargoClauseApplicable"), fetchValueFromList(cargoClauseApplicableDropDown), AssertionType.WARNING);
			}
			if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigWARSRCCClauseApplicable")) {
				assertReference.assertEquals(polInsIntAttCarDetMCEntity.getStringValueForField("WARSRCCClauseApplicable"), fetchValueFromList(wARSRCCClauseApplicableDropDown), AssertionType.WARNING);
			}
			
			if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveNewWindowButton")){
				click(closeButtonOfNextWindow);
				Thread.sleep(3000);
				switchToWindow("Integrated Insurance Management System");
				switchToFrame("display");
			}
		} 
	}
	public void	clickNextButtonPolicyAttributeCDPolicyDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigForwordButton")){			
			click(forwardButton);
			click(SaveButtonOfNextWindow);
			switchToFrame("display");
			//isElementDisplayed(policyTabTitle);
		}
	}
	public void	clickSaveButtonPolicyAttributeCDPolicyDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSaveButton")){			
			click(saveButton);
			click(SaveButtonOfNextWindow);
			switchToFrame("display");
			//isElementDisplayed(policyTabTitle);
		}
	}
	public void	clickCCSaveInsAttrDetails(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity){
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCCForwordButton")){			
			click(forwardButton);
			click(previousButton);
			click(forwardButton);
			click(forwardButton);
			click(SaveButtonOfNextWindow);
			switchToFrame("display");
			//isElementDisplayed(policyTabTitle);
		}
	}
	public void clickOnVesselCodeFindButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigEstateCodeClickButton")){
			click(vesselCodeClickButton);
			try{
				//Thread.sleep(3000);
				switchToWindow("Vessel List");
			}catch(Exception e){
				switchToWindow("Vessel List");
			}
		}
	}
	public void fillVesselCodeSearch(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickOnVesselCodeFindButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselCode")){
			Thread.sleep(3000);
			clearAndSendKeys(vesselCodeTextField,polInsIntAttCarDetMCEntity.getStringValueForField("VesselCode") );	
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigVesselName")){
			Thread.sleep(3000);
			clearAndSendKeys(vesselNameTextField,polInsIntAttCarDetMCEntity.getStringValueForField("VesselName") );	
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigBackButtons")){
			click(backButtons);
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigSearchButton")){
			Thread.sleep(3000);
			click(searchButton);
			selectVesselCode(polInsIntAttCarDetMCEntity);
		}
	}
	public void selectVesselCode(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		vesselCodeToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("VesselCode")+"')]"),"Vessel Code to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(vesselCodeToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}

	public void clickOnExportToCountryFindButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCountryClickButton")){
			click(exportToCountryClickButton);
			switchToWindow();
		}
	}
	public void fillExportToCountry(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickOnExportToCountryFindButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCountrySearch")){
			Thread.sleep(3000);
			clearAndSendKeys(countrySearchTextField,polInsIntAttCarDetMCEntity.getStringValueForField("countrySearch") );	
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigContrySearchFindButton")){
			Thread.sleep(3000);
			click(contrySearchFindButton);
			selectCountrySearch(polInsIntAttCarDetMCEntity);
		}
	}
	public void selectCountrySearch(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		countrySearchToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("countrySearchText")+"')]"),"Country Search to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(countrySearchToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void clickOnExportToCityFindButton(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		if (polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigExportToCityClickButton")){
			click(exportToCityClickButton);
			switchToWindow();
		}
	}
	public void fillExportToCity(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		clickOnExportToCityFindButton(polInsIntAttCarDetMCEntity);

		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCitySearch")){
			Thread.sleep(3000);
			clearAndSendKeys(citySearchTextField,polInsIntAttCarDetMCEntity.getStringValueForField("CitySearch") );	
		}
		if(polInsIntAttCarDetMCEntity.getBooleanValueForField("ConfigCitySearchFindButton")){
			Thread.sleep(3000);
			click(citySearchFindButton);
			selectCitySearch(polInsIntAttCarDetMCEntity);
		}
	}
	public void selectCitySearch(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		citySearchToBeSelectedLink=new PageElement(By.xpath("//a[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("countrySearchText")+"')]"),"City Search to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(citySearchToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");	
	}	

	public void selectAPDAccNO(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity) throws InterruptedException{
		APDAccNOToBeSelectedLink=new PageElement(By.xpath("//font[contains(text(),'"+polInsIntAttCarDetMCEntity.getStringValueForField("APDAccNO")+"')]"),"APD acc no to be Selected", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		click(APDAccNOToBeSelectedLink);
		Thread.sleep(3000);
		switchToWindow();
		switchToFrame("display");
	}
	public void fillandSubmitPolicyInsuredInrestAttributeForMarineCargo(PolInsIntAttCarDetMCEntity polInsIntAttCarDetMCEntity, CustomAssert assertReference) throws InterruptedException {
		if(isConfigTrue(polInsIntAttCarDetMCEntity.getConfigExecute())){
			switchToFrame("display");
			fillTCDetails(polInsIntAttCarDetMCEntity, assertReference);
			fillPolicyInsuredInrestAttributeCargoDetailsMarineCargo(polInsIntAttCarDetMCEntity, assertReference);
			fillPolicyInsuredInrestAttributeSVMarineCargoDetails(polInsIntAttCarDetMCEntity, assertReference);
			fillStorageAndForeignCur(polInsIntAttCarDetMCEntity, assertReference);
			fillOPLimitTransitDetails(polInsIntAttCarDetMCEntity, assertReference);
			clickNextButtonPolicyAttributeCDPolicyDetails(polInsIntAttCarDetMCEntity);
			clickSaveButtonPolicyAttributeCDPolicyDetails(polInsIntAttCarDetMCEntity);
			clickCCSaveInsAttrDetails(polInsIntAttCarDetMCEntity);
			navigateToPolicy(polInsIntAttCarDetMCEntity);
			navigateToAttribute(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterest(polInsIntAttCarDetMCEntity);
			navigateToCoverage(polInsIntAttCarDetMCEntity);
			navigateToLoan(polInsIntAttCarDetMCEntity);
			navigateToClientDetails(polInsIntAttCarDetMCEntity);
			navigateToRelation(polInsIntAttCarDetMCEntity);
			navigateToPayment(polInsIntAttCarDetMCEntity);
			navigateToFollowup(polInsIntAttCarDetMCEntity);
			navigateToDocument(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestAttributes(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestAttachCoverages(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestRelations(polInsIntAttCarDetMCEntity);
			navigateToInsuredInterestPayments(polInsIntAttCarDetMCEntity);
		}
	}

}
