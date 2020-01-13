package com.aqm.staf.library.PageKeyWord;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.framework.core.FrameworkServices;
import com.aqm.framework.entities.ExecutionTestSteps;
import com.aqm.framework.core.TestData;
import com.aqm.framework.core.CustomAssert;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.pages.aviation.ClaimRiskPropertyT1CLRAviation;
import com.aqm.staf.library.pages.aviation.ClaimRiskPropertyT2CLRAviation;
import com.aqm.staf.library.pages.aviation.ClaimRiskPropertyT3CLRAviation;
import com.aqm.staf.library.pages.common.ClaimAddClaimLitigationDetailsPage;
import com.aqm.staf.library.pages.common.ClaimAttributes;
import com.aqm.staf.library.pages.common.ClaimAttributesProceedCourtMasterForAllProductPage;
import com.aqm.staf.library.pages.common.ClaimCreatePage;
import com.aqm.staf.library.pages.common.ClaimDocument;
import com.aqm.staf.library.pages.common.ClaimInsuredInterestMemberDamageDetail;
import com.aqm.staf.library.pages.common.ClaimInsuredItemMemberAttributesClaimInsuredProperty;
import com.aqm.staf.library.pages.common.ClaimInsuredItemMemberDamagePage;
import com.aqm.staf.library.pages.common.ClaimPartiesClaimAssociatedParties;
import com.aqm.staf.library.pages.common.ClaimPartiesClaimPartyDetails;
import com.aqm.staf.library.pages.common.ClaimPaymentDetails;
import com.aqm.staf.library.pages.common.ClaimPayments;
import com.aqm.staf.library.pages.common.ClaimReservePageAfterSaveClaim;
import com.aqm.staf.library.pages.common.ClaimReserveSummaryPage;
import com.aqm.staf.library.pages.common.ClaimSearchPage;
import com.aqm.staf.library.pages.common.ClaimReservePage;
import com.aqm.staf.library.pages.common.PolicyAttribute;
import com.aqm.staf.library.pages.common.PolicyPremiumCollectionPage;
import com.aqm.staf.library.pages.common.PreviousPolicyHistoryPage;
import com.aqm.staf.library.pages.creditShield.ClaimInsuredItemClaimRiskDetails1CreditShield;
import com.aqm.staf.library.pages.creditShield.ClaimInsuredItemClaimRiskDetails2CreditShield;
import com.aqm.staf.library.pages.creditShield.ClaimPartiesClaimPartyFinancialSummary;
import com.aqm.staf.library.pages.creditShield.ClaimTransferToAPPage;
import com.aqm.staf.library.pages.engineering.ClaimAttributeOtherDetailsOfClaimEngineering;
import com.aqm.staf.library.pages.engineering.ClaimDetailsEngineering;
import com.aqm.staf.library.pages.engineering.ClaimExcessEngineering;
import com.aqm.staf.library.pages.fire.ClaimInterruptionPeriodInDays;
import com.aqm.staf.library.pages.fire.ClaimLossFire;
import com.aqm.staf.library.pages.fire.ClaimPropertyFire;
import com.aqm.staf.library.pages.fire.ClaimRiskPropFire;
import com.aqm.staf.library.pages.fire.ClaimSpecialFeildsFire;
import com.aqm.staf.library.pages.fire.FireReinstatementPremiumFire;
import com.aqm.staf.library.pages.health.ClaimMemberAttributePageT1Health;
import com.aqm.staf.library.pages.health.ClaimMemberPropertyProceedT2CLRHealth;
import com.aqm.staf.library.pages.health.PolicyMemberPreviousPolicyDataBH;
import com.aqm.staf.library.pages.health.PreviousClaimsHistoryForGH;
import com.aqm.staf.library.pages.marineCargo.ClaimRiskDetailsMarineCargo;
import com.aqm.staf.library.pages.miscLiability.ClaimRiskDetailsAndPropertiesMIS;
import com.aqm.staf.library.pages.miscLiability.T3ClaimPropertyForMIS;
import com.aqm.staf.library.pages.miscLiability.T4ClaimPropertyForLiab1MIS;
import com.aqm.staf.library.pages.miscLiability.T4ClaimPropertyForMIS;
import com.aqm.staf.library.pages.miscLiability.T5ClaimPropertyForLiab1MIS;
import com.aqm.staf.library.pages.miscNonLiability.ClaimCommonClaimRiskPropertyForMiscNonLiability;
import com.aqm.staf.library.pages.miscNonLiability.ClaimMiscNonT1CLRForMiscNonLiability;
import com.aqm.staf.library.pages.miscNonLiability.ClaimRiskProperty2ForMiscNonLiability;
import com.aqm.staf.library.pages.miscNonLiability.ClaimRiskProperty3ForMiscNonLiability;
import com.aqm.staf.library.pages.miscNonLiability.CommonClaimRiskProperty2ForMiscNL;
import com.aqm.staf.library.pages.motor.ClaimDocumentMotor;
import com.aqm.staf.library.pages.motor.ClaimPropertyMotor;
import com.aqm.staf.library.pages.motor.ClaimRiskPropertyMotor;
import com.aqm.staf.library.pages.personalAccident.ClaimAttrPolicyPropertyT1CLMPage;
import com.aqm.staf.library.pages.personalAccident.ClaimInsuredItemClaimRiskDetail2GRPersonalAccident;
import com.aqm.staf.library.pages.personalAccident.ClaimInsuredItemClaimRiskDetails2PersonalAccident;
import com.aqm.staf.library.pages.personalAccident.ClaimInsuredItemClaimRiskDetailsPersonalAccident;
import com.aqm.staf.library.pages.rural.ClaimChargesSubLimitsRural;
import com.aqm.staf.library.pages.rural.PreviousClaimHistforCartRural;
import com.aqm.testing.testDataEntity.AccMaintainTransactionEntity;
import com.aqm.testing.testDataEntity.AccountingEntity;
import com.aqm.testing.testDataEntity.CLInsItClaimRiskDet1CSEntity;
import com.aqm.testing.testDataEntity.ClaimAssociatedPartiesEntity;
import com.aqm.testing.testDataEntity.ClaimAttrOtherDetailsEntity;
import com.aqm.testing.testDataEntity.ClaimAttriCourtMasterEntity;
import com.aqm.testing.testDataEntity.ClaimAttributesEntity;
import com.aqm.testing.testDataEntity.ClaimChrgSubLimitREntity;
import com.aqm.testing.testDataEntity.ClaimDamageDetailsEntity;
import com.aqm.testing.testDataEntity.ClaimDetailsEngEntity;
import com.aqm.testing.testDataEntity.ClaimDocumentEntity;
import com.aqm.testing.testDataEntity.ClaimDocumentMotorEntity;
import com.aqm.testing.testDataEntity.ClaimEntity;
import com.aqm.testing.testDataEntity.ClaimExcessEngEntity;
import com.aqm.testing.testDataEntity.ClaimInsItAttRiskDetPAEntity;
import com.aqm.testing.testDataEntity.ClaimInsrRiskDetils2CSEntity;
import com.aqm.testing.testDataEntity.ClaimInsrRiskDetl2GrPAEntity;
import com.aqm.testing.testDataEntity.ClaimInsrRskDetails2PAEntity;
import com.aqm.testing.testDataEntity.ClaimLitigationEntity;
import com.aqm.testing.testDataEntity.ClaimLossFireEntity;
import com.aqm.testing.testDataEntity.ClaimMNT1CLRMNLEntity;
import com.aqm.testing.testDataEntity.ClaimMemberAttributesEntity;
import com.aqm.testing.testDataEntity.ClaimMemberDamageEntity;
import com.aqm.testing.testDataEntity.ClaimMemberT1T2CLRAttEntity;
import com.aqm.testing.testDataEntity.ClaimPartiesFinanSumayEntity;
import com.aqm.testing.testDataEntity.ClaimPartyDetailsEntity;
import com.aqm.testing.testDataEntity.ClaimPaymentEntity;
import com.aqm.testing.testDataEntity.ClaimPolPropertyTCLMEntity;
import com.aqm.testing.testDataEntity.ClaimPropertyFireEntity;
import com.aqm.testing.testDataEntity.ClaimPropertyMotorEntity;
import com.aqm.testing.testDataEntity.ClaimReservePageEntity;
import com.aqm.testing.testDataEntity.ClaimRiskDetMISEntity;
import com.aqm.testing.testDataEntity.ClaimRiskProMotorEntity;
import com.aqm.testing.testDataEntity.ClaimRiskProT1CLRAviEntity;
import com.aqm.testing.testDataEntity.ClaimRiskProT2CLRAviEntity;
import com.aqm.testing.testDataEntity.ClaimRiskProT3CLRAviEntity;
import com.aqm.testing.testDataEntity.ClaimRiskProp2MNLEntity;
import com.aqm.testing.testDataEntity.ClaimRiskProp3MNLEntity;
import com.aqm.testing.testDataEntity.ClaimRiskPropFireEntity;
import com.aqm.testing.testDataEntity.ClaimSpeFeildFireEntity;
import com.aqm.testing.testDataEntity.ClaimSynopsisEntity;
import com.aqm.testing.testDataEntity.ClaimT2CLRForHealthProEntity;
import com.aqm.testing.testDataEntity.ClaimTransferToAPEntity;
import com.aqm.testing.testDataEntity.ComClRiskProp2MNLEntity;
import com.aqm.testing.testDataEntity.ComClaimRiskPropMNLEntity;
import com.aqm.testing.testDataEntity.FireReinstatmntPremiumEntity;
import com.aqm.testing.testDataEntity.InterPeriodInDaysEntity;
import com.aqm.testing.testDataEntity.PartyEntity;
import com.aqm.testing.testDataEntity.PartyRolesFunctDetailsEntity;
import com.aqm.testing.testDataEntity.PolicyAttributeEntity;
import com.aqm.testing.testDataEntity.PolicyAttributeHealthEntity;
import com.aqm.testing.testDataEntity.PolicyEntity;
import com.aqm.testing.testDataEntity.PolicyMemAttrSTDRiskEntity;
import com.aqm.testing.testDataEntity.PolicyPremCollectionEntity;
import com.aqm.testing.testDataEntity.PreClaimHistCartRuralEntity;
import com.aqm.testing.testDataEntity.PrevClaimHistoryForGHEntity;
import com.aqm.testing.testDataEntity.PreviousPolicyDataEntity;
import com.aqm.testing.testDataEntity.PreviousPolicyHistoryEntity;
import com.aqm.testing.testDataEntity.RiskDetailsMCEntity;
import com.aqm.testing.testDataEntity.T3ClaimPropForMISEntity;
import com.aqm.testing.testDataEntity.T4ClaimPropLiab1MISEntity;
import com.aqm.testing.testDataEntity.T4ClaimPropMISEntity;
import com.aqm.testing.testDataEntity.T5ClaimPropLiab1MISEntity;
import com.aqm.staf.library.pages.health.PolicyMemAttrRiskDetailsForSTDRiskPage;

public class ClaimKeyWord {
	private static  String keyword;
	private static 	String configData;
	private static String stepGroup;
	public void createClaim(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws Exception{
		keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		List<ClaimEntity> claimEntitiesList=testData.getData().get(ClaimEntity.class);
		for(ClaimEntity claimEntityListData:claimEntitiesList){
			if(claimEntityListData.getAction().equalsIgnoreCase("add")&& claimEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
				ClaimSearchPage claimSearchPage=new ClaimSearchPage(driver, "Claim Search Page");
				claimSearchPage.navigateToClaimSearchPage();
				claimSearchPage.navigateToClaimCreatePage(claimEntityListData);
				ClaimCreatePage claimCreatePage= new ClaimCreatePage(driver, "Claim Details");
				claimCreatePage.fillandSubmitClaimDetails(claimEntityListData, assertReference, testData);
				testData.updateRecordsForCriteria(claimEntityListData);
				setEditClaimNumberDependancy(claimEntityListData, testData);
			}
		}
	}

	public void  editClaim(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException, IOException, AWTException, ParseException{
		List<ClaimEntity> claimEntityList=testData.getData().get(ClaimEntity.class);
		for(ClaimEntity claimEntityListData:claimEntityList){
			if(claimEntityListData.getAction().equalsIgnoreCase("edit")&& claimEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
				ClaimSearchPage claimSearchPage=new ClaimSearchPage(driver, "Claim Search Page");
				claimSearchPage.navigateToClaimSearchPage();
				claimSearchPage.fillandSearchClaimDetails(claimEntityListData);
				claimSearchPage.selectSearchClaimNumber(claimEntityListData);
				ClaimCreatePage claimCreatePage= new ClaimCreatePage(driver, "Claim Details");
				claimCreatePage.fillandSubmitClaimDetails(claimEntityListData, assertReference, testData);
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Health")){
					/**************** Claim Member***************************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimMemberEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************ Claim Document**********************/

					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						// claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/******************* Claim Attributes**********************/



					/*	*//************** Claim Document**********************//*
					if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					 *//************** Claim Member**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					  *//************** Claim Parties**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Reserve**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Payment**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					//************** Claim Attributes**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}*/



				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Credit Shield")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}

				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimPersonalAccidentInsuredItemEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMisEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMisEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMiscEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemRuralEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/

					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);

					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesRuralEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMicroInsuranceEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/

					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMicroInsuranceEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMicroInsuranceEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				//fire
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemFireEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesFireEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesFireEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				//Engineering
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemEngineeringEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesFireEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesEngineeringEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMiscNonLiabilityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/

					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}

					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMiscNonLiabilityEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}

					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);

					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMiscNonliabilityEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);

					}
				}
				
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Motor")){

					/************** Claim Document**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Member**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Reserve**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Payment**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigCloneClaimButton")){
						cloneClaimEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					//************** Claim Attributes**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){
					/************** Claim Document**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemAviationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesAviationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesAviationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
				}

				/************** Marinhull**********************/
				// written by vikash
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("MarineHull")){

					/************** Claim InsuredItem**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMarineHullEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}

					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMarineHullEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Reserve**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveMarineHullEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					//************** Claim Attributes**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab"))
					{
						claimAttributesMarineHullEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/*else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab"))
					{
						claimAttributesMarineHullEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}*/
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);

					}
				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){

					/************** Claim InsuredItem**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMarineCargoEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMarineCargoEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Reserve**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveMarineCargoEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					//************** Claim Attributes**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab"))
					{
						claimAttributesMarineCargoEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationEditHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);

					}

				}

			}
		}
	}



	public void verifyClaim(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException, ParseException{
		List<ClaimEntity> claimEntitiesList=testData.getData().get(ClaimEntity.class);
		for(ClaimEntity claimEntityListData:claimEntitiesList){
			if(claimEntityListData.getAction().equalsIgnoreCase("verify")&& claimEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
				ClaimSearchPage claimSearchPage=new ClaimSearchPage(driver, "Claim Search Page");
				claimSearchPage.navigateToClaimSearchPage();
				claimSearchPage.fillandSearchClaimDetails(claimEntityListData);
				claimSearchPage.selectSearchClaimNumber(claimEntityListData);
				ClaimCreatePage claimCreatePage= new ClaimCreatePage(driver, "Claim Details");
				claimCreatePage.fillandSubmitClaimDetails(claimEntityListData, assertReference, testData);
				ClaimReservePageAfterSaveClaim claimReservePageAfterSaveClaim= new ClaimReservePageAfterSaveClaim(driver, "Claim Reserve Page After Save Claim");
				claimReservePageAfterSaveClaim.fillSubmitClaimReserveDetailsBeforeIntimate(claimEntityListData, assertReference);
				/************** Claim Insured Item**********************/
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Health")){
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimMemberVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Credit Shield")){
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
				}

				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")){
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimPersonalAccidentInsuredItemVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}

				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Rural")){
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemRuralVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						////claimDocumentVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesRuralVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Misc Liability")){
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMiscVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMisVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMiscVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}

				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Micro Insurance")){
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMicroInsuranceVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						////claimDocumentVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMicroInsuranceVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMicroInsuranceVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
				}

				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Fire")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemFireVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesFireVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesFireVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				//Engineering
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Engineering")){
					/************** Claim Member**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentEditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesFireVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesEngineeringVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Motor")){
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMotorVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMotorVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesVerifyMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				/************** MarineHull**********************/
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("MarineHull")){
					if(claimEntityListData.getBooleanValueForField("ConfigMemberTab") || claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMarineHullVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						//claimDocumentVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMarineHullVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesVerifyMotorEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("MiscNonLiability")){
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMiscNonLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					/************** Claim Document**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigDocumentTab")){
						////claimDocumentVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
					}
					/************** Claim Parties**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMiscNonLiabilityVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					/************** Claim Reserve**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Payment**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					/************** Claim Attributes**********************/
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesMiscNonliabilityVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}				
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigClaimLitigationButton")){
						claimLitigationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Aviation")){

					/************** Claim Document**********************/
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemAviationVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesAviationVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}

				}
				if(claimEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Marine Cargo")){

					//************** Claim Member**********************//*
					if(claimEntityListData.getBooleanValueForField("ConfigInsuredItemTab")){
						claimInsuredItemMarineCargoVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
					}
					//************** Claim Reserve**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigReserveTab")){
						claimReserveVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					//************** Claim Parties**********************//*
					else if(claimEntityListData.getBooleanValueForField("ConfigPartiesTab")){
						claimPartiesMarineCargoVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigPaymentTab")){
						claimPaymentVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigTransferToAPButton")){
						claimTransferToAPVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup, claimEntityListData);
					}
					else if(claimEntityListData.getBooleanValueForField("ConfigAttributesTab")){
						claimAttributesVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
					}


				}
			}
		}
	}



	private void setEditClaimNumberDependancy(ClaimEntity claimEntity,TestData testData){
		if(claimEntity.getStringValueForField("DependencyForClaimNumber")!=null){
			ArrayList<ClaimEntity> claimEntityList =testData.getObjectByReference(testData.getData().get(ClaimEntity.class),claimEntity.getStringValueForField("DependencyForClaimNumber"));
			for (ClaimEntity claimEntityData : claimEntityList) {
				claimEntityData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimEntityData);
			}
		}
		if(claimEntity.getStringValueForField("DependencyForClaimNumberT1T2CLRAttEntity")!=null){
			ArrayList<ClaimMemberT1T2CLRAttEntity> claimMemberT1T2CLRAttEntityList =testData.getObjectByReference(testData.getData().get(ClaimMemberT1T2CLRAttEntity.class),claimEntity.getStringValueForField("DependencyForClaimNumberT1T2CLRAttEntity"));
			for (ClaimMemberT1T2CLRAttEntity claimMemberT1T2CLRAttEntityData : claimMemberT1T2CLRAttEntityList) {
				claimMemberT1T2CLRAttEntityData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimMemberT1T2CLRAttEntityData);
			}
		}

		if(claimEntity.getStringValueForField("DependencyForClaimNumberT2CLRAttEntity")!=null){
			ArrayList<ClaimT2CLRForHealthProEntity> claimT2CLRForHealthProEntityList =testData.getObjectByReference(testData.getData().get(ClaimT2CLRForHealthProEntity.class),claimEntity.getStringValueForField("DependencyForClaimNumberT2CLRAttEntity"));
			for (ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityData : claimT2CLRForHealthProEntityList) {
				claimT2CLRForHealthProEntityData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimT2CLRForHealthProEntityData);
			}
		}

		if(claimEntity.getStringValueForField("DependencyForClaimNumberPartyDetails")!=null){
			ArrayList<ClaimPartyDetailsEntity> claimPartyDetailsEntityList =testData.getObjectByReference(testData.getData().get(ClaimPartyDetailsEntity.class),claimEntity.getStringValueForField("DependencyForClaimNumberPartyDetails"));
			for (ClaimPartyDetailsEntity claimPartyDetailsEntityData : claimPartyDetailsEntityList) {
				claimPartyDetailsEntityData.setStringValueForField("ClaimNo", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimPartyDetailsEntityData);
			}
		}

		if(claimEntity.getStringValueForField("DependencyForClaimNumberPayment")!=null){
			ArrayList<ClaimPaymentEntity> claimPaymentEntityList =testData.getObjectByReference(testData.getData().get(ClaimPaymentEntity.class),claimEntity.getStringValueForField("DependencyForClaimNumberPayment"));
			for (ClaimPaymentEntity claimPaymentEntityData : claimPaymentEntityList) {
				claimPaymentEntityData.setStringValueForField("ClaimNo", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimPaymentEntityData);
			}
		}



		//private void setAccountingMaintainTransactionDependency(ClaimEntity claimEntity,TestData testData){
		if(claimEntity.getStringValueForField("DependencyForAccMaintainTransaction")!=null){
			ArrayList<AccMaintainTransactionEntity>accMaintainTransactionEntityList=testData.getObjectByReference(testData.getData().get(AccMaintainTransactionEntity.class), claimEntity.getStringValueForField("DependencyForAccMaintainTransaction"));
			for(AccMaintainTransactionEntity accMaintainTransactionEntityData:accMaintainTransactionEntityList){
				accMaintainTransactionEntityData.setStringValueForField("ReferenceNo",claimEntity.getStringValueForField("ClaimNumber") );
				testData.updateRecordsForCriteria(accMaintainTransactionEntityData);
			}
		}

		// Abhijit
		if(claimEntity.getStringValueForField("DependencyForClaimAttributesEntity")!=null){
			ArrayList<ClaimAttriCourtMasterEntity> claimAttriCourtMasterEntityList =testData.getObjectByReference(testData.getData().get(ClaimAttriCourtMasterEntity.class),claimEntity.getStringValueForField("DependencyForClaimAttributesEntity"));
			for (ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData : claimAttriCourtMasterEntityList) {
				claimAttriCourtMasterEntityListData.setStringValueForField("ClaimNo", claimEntity.getStringValueForField("ClaimNumber"));
				claimAttriCourtMasterEntityListData.setStringValueForField("ClaimSubStatus", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimAttriCourtMasterEntityListData);
			}
		}



		if(claimEntity.getStringValueForField("DependencyForClaimSynopsis")!=null){
			ArrayList<ClaimSynopsisEntity> claimSynopsisEntityList =testData.getObjectByReference(testData.getData().get(ClaimSynopsisEntity.class),claimEntity.getStringValueForField("DependencyForClaimSynopsis"));
			for (ClaimSynopsisEntity claimSynopsisEntityListData : claimSynopsisEntityList) {
				claimSynopsisEntityListData.setStringValueForField("ClaimNo", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimSynopsisEntityListData);
			}
		}

		//Abhijit

		if(claimEntity.getStringValueForField("DependencyForT4ClaimPropLiab1MISEntity")!=null){
			ArrayList<T4ClaimPropLiab1MISEntity> t4ClaimPropLiab1MISEntityList =testData.getObjectByReference(testData.getData().get(T4ClaimPropLiab1MISEntity.class),claimEntity.getStringValueForField("DependencyForT4ClaimPropLiab1MISEntity"));
			for (T4ClaimPropLiab1MISEntity t4ClaimPropLiab1MISEntityListData : t4ClaimPropLiab1MISEntityList) {
				t4ClaimPropLiab1MISEntityListData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(t4ClaimPropLiab1MISEntityListData);
			}
		}

		//Abhijit

		if(claimEntity.getStringValueForField("DependencyForT5ClaimPropLiab1MISEntity")!=null){
			ArrayList<T5ClaimPropLiab1MISEntity> t5ClaimPropLiab1MISEntityList =testData.getObjectByReference(testData.getData().get(T5ClaimPropLiab1MISEntity.class),claimEntity.getStringValueForField("DependencyForT5ClaimPropLiab1MISEntity"));
			for (T5ClaimPropLiab1MISEntity t5ClaimPropLiab1MISEntityListData : t5ClaimPropLiab1MISEntityList) {
				t5ClaimPropLiab1MISEntityListData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(t5ClaimPropLiab1MISEntityListData);
			}
		}

		////Abhijit

		if(claimEntity.getStringValueForField("DependencyForClaimPartiesFinanSumayEntity")!=null){
			ArrayList<ClaimPartiesFinanSumayEntity> claimPartiesFinanSumayEntityList =testData.getObjectByReference(testData.getData().get(ClaimPartiesFinanSumayEntity.class),claimEntity.getStringValueForField("DependencyForClaimPartiesFinanSumayEntity"));
			for (ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData : claimPartiesFinanSumayEntityList) {
				claimPartiesFinanSumayEntityListData.setStringValueForField("ClaimNo", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimPartiesFinanSumayEntityListData);
			}
		}

		//Abhijit

		if(claimEntity.getStringValueForField("DependencyForClaimTransferToAPEntity")!=null){
			ArrayList<ClaimTransferToAPEntity> claimTransferToAPEntityList =testData.getObjectByReference(testData.getData().get(ClaimTransferToAPEntity.class),claimEntity.getStringValueForField("DependencyForClaimTransferToAPEntity"));
			for (ClaimTransferToAPEntity claimTransferToAPEntityListData : claimTransferToAPEntityList) {
				claimTransferToAPEntityListData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(claimTransferToAPEntityListData);
			}
		}

		//KAMLESH
		if(claimEntity.getStringValueForField("DependencyForPreClaimHistCartRuralEntity")!=null){
			ArrayList<PreClaimHistCartRuralEntity> preClaimHistCartRuralEntityList =testData.getObjectByReference(testData.getData().get(PreClaimHistCartRuralEntity.class),claimEntity.getStringValueForField("DependencyForPreClaimHistCartRuralEntity"));
			for (PreClaimHistCartRuralEntity preClaimHistCartRuralEntityListData : preClaimHistCartRuralEntityList) {
				preClaimHistCartRuralEntityListData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(preClaimHistCartRuralEntityListData);
			}
		}

		//Abhijit

		if(claimEntity.getStringValueForField("DependencyForClaimNoInuredItemMiscNonLiab")!=null){
			ArrayList<ComClRiskProp2MNLEntity> comClRiskProp2MNLEntityList =testData.getObjectByReference(testData.getData().get(ComClRiskProp2MNLEntity.class),claimEntity.getStringValueForField("DependencyForClaimNoInuredItemMiscNonLiab"));
			for (ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData : comClRiskProp2MNLEntityList) {
				comClRiskProp2MNLEntityListData.setStringValueForField("ClaimNumber", claimEntity.getStringValueForField("ClaimNumber"));
				testData.updateRecordsForCriteria(comClRiskProp2MNLEntityListData);
			}
		}

	}	



	/*public void claimDocumentEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver) throws InterruptedException{
		List<ClaimDocumentEntity>ClaimDocumentEntityList=testData.getClaimDocumentEntity();
		for(ClaimDocumentEntity ClaimDocumentEntityListData :ClaimDocumentEntityList ){
			if(ClaimDocumentEntityListData.getAction().equalsIgnoreCase("add")||ClaimDocumentEntityListData.getAction().equalsIgnoreCase("edit")){
				ClaimDocument claimDocument =new ClaimDocument(driver, "ClaimDocument");
				if(ClaimDocumentEntityListData.getBooleanValueForField("ConfigNewButton")){
					claimDocument.createNewDoc(ClaimDocumentEntityListData);				
					claimDocument.fillandSubmitDocumentDetails(ClaimDocumentEntityListData, assertReference);
				}
			}
		}
	}
	 */
	public void claimPartiesEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))
						&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")
										||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))
										&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									//Sachin
									if(claimPartyDetailsEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Health") && !(claimPartyDetailsEntityListData.getStringValueForField("Stake").equalsIgnoreCase("Lawyer"))){
										claimPartiesClaimPartyDetails.afterClickOnSaveButtonHandlePopup(claimPartyDetailsEntityListData);
									}
									//Rupali
									if(claimPartyDetailsEntityListData.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident") && claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										claimPartiesClaimPartyDetails.afterClickOnSaveButtonHandlePopup(claimPartyDetailsEntityListData);
									}
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}
		}
	}
	public void claimReserveEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Reserve Helper </i></B>");
		int rowcount=0;
		List<ClaimReservePageEntity>claimReservePageEntityList=testData.getData().get(ClaimReservePageEntity.class);
		for(ClaimReservePageEntity claimReservePageEntityListData :claimReservePageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimReservePageEntityListData.getChildKey())){
				if((claimReservePageEntityListData.getAction().equalsIgnoreCase("add")||claimReservePageEntityListData.getAction().equalsIgnoreCase("edit"))&& claimReservePageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimReserveSummaryPage claimReserveSummaryPage=new ClaimReserveSummaryPage(driver, "Claim Reserve",rowcount);
					claimReserveSummaryPage.fillAndSubmitClaimReserveSummaryDetails(claimReservePageEntityListData, assertReference);
					claimReserveSummaryPage.createNewReservePage(claimReservePageEntityListData);
					if(claimReservePageEntityListData.getBooleanValueForField("ConfigNewButton")){
						ClaimReservePage claimReservePage=new ClaimReservePage(driver, "Claim Reserve Details");
						claimReservePage.fillandSubmitClaimReserveDetails(claimReservePageEntityListData, assertReference);

					}


				}

			}
		}
	}
	//Shwetha(30/06/2018)
	public void claimPaymentMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Payment Helper </i></B>");
		List<ClaimPaymentEntity>claimPaymentEntityList=testData.getData().get(ClaimPaymentEntity.class);
		for(ClaimPaymentEntity claimPaymentEntityListData :claimPaymentEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPaymentEntityListData.getChildKey())){
				if((claimPaymentEntityListData.getAction().equalsIgnoreCase("add")||claimPaymentEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPaymentEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPayments claimPayments =new ClaimPayments(driver, "Claim Payments");
					claimPayments.fillAndSubmitPaymentDetails(claimPaymentEntityListData, assertReference);
					if(claimPaymentEntityListData.getBooleanValueForField("ConfigNewButton")||claimPaymentEntityListData.getBooleanValueForField("ConfigSearchPartyCode")){
						ClaimPaymentDetails claimPaymentDetails =new ClaimPaymentDetails(driver, "Claim Payment Details");
						claimPaymentDetails.fillandSubmitClaimPaymentDetail(claimPaymentEntityListData, assertReference);
					}
				}
			}
		}
	}
	//Shwetha(30/06/2018)
	public void claimLitigationMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Litigation </i></B>");
		List<ClaimLitigationEntity> claimLitigationEntityList=testData.getData().get(ClaimLitigationEntity.class);
		for(ClaimLitigationEntity claimLitigationEntityListdata:claimLitigationEntityList){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimLitigationEntityListdata.getChildKey())){
				if(claimLitigationEntityListdata.getAction().equalsIgnoreCase("edit")||claimLitigationEntityListdata.getAction().equalsIgnoreCase("add")){
					ClaimAddClaimLitigationDetailsPage claimAddClaimLitigationDetailsPage=new ClaimAddClaimLitigationDetailsPage(driver, "Claim Litigation page");
					claimAddClaimLitigationDetailsPage.fillAndSubmitClaimLitigationDetails(claimLitigationEntityListdata, assertReference, testData);
					testData.updateRecordsForCriteria(claimLitigationEntityListdata);
					setClaimSerialNoandPetitionNoDependancy(claimLitigationEntityListdata,testData);
				}
			}
		}
	}
	//Shwetha(30/06/2018)
	public void cloneClaimMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		if((claimEntityListData.getAction().equalsIgnoreCase("add")||claimEntityListData.getAction().equalsIgnoreCase("edit")) && claimEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
			ClaimSearchPage claimSearchPage=new ClaimSearchPage(driver, "Claim Search Page");
			claimSearchPage.fetchClonedClaimNo(claimEntityListData);
			testData.updateRecordsForCriteria(claimEntityListData);
			setEditClaimNumberDependancy(claimEntityListData, testData);
		}
	}
	//Shweta(30/06/2018)
	public void claimTransferToAPMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Transfer To AP </i></B>");
		List<ClaimTransferToAPEntity> claimTransferToAPEntityList=testData.getData().get(ClaimTransferToAPEntity.class);
		for(ClaimTransferToAPEntity claimTransferToAPEntityListdata:claimTransferToAPEntityList){
			if(claimTransferToAPEntityListdata.getParentKey().equalsIgnoreCase(claimTransferToAPEntityListdata.getChildKey())){
				if(claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("edit")||claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("add")){
					ClaimTransferToAPPage claimTransferToAPPage = new ClaimTransferToAPPage(driver, "Claim Transfer To AP page");
					claimTransferToAPPage.fillAndSubmitClaimTransferToAP(claimTransferToAPEntityListdata,assertReference);
					testData.updateRecordsForCriteria(claimTransferToAPEntityListdata);
				}
			}
		}
	}
	public void claimPaymentEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Payment Helper </i></B>");
		List<ClaimPaymentEntity>claimPaymentEntityList=testData.getData().get(ClaimPaymentEntity.class);
		for(ClaimPaymentEntity claimPaymentEntityListData :claimPaymentEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPaymentEntityListData.getChildKey())){
				if((claimPaymentEntityListData.getAction().equalsIgnoreCase("add")||claimPaymentEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPaymentEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPayments claimPayments =new ClaimPayments(driver, "Claim Payments");
					claimPayments.fillAndSubmitPaymentDetails(claimPaymentEntityListData, assertReference);
					if(claimPaymentEntityListData.getBooleanValueForField("ConfigNewButton")||claimPaymentEntityListData.getBooleanValueForField("ConfigSearchPartyCode")){
						ClaimPaymentDetails claimPaymentDetails =new ClaimPaymentDetails(driver, "Claim Payment Details");
						claimPaymentDetails.fillandSubmitClaimPaymentDetail(claimPaymentEntityListData, assertReference);
					}
				}
			}
		}
	}
	public void claimDocumentEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, IOException, AWTException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Document Helper </i></B>");
		List<ClaimDocumentMotorEntity>claimDocumentMotorEntityList=testData.getData().get(ClaimDocumentMotorEntity.class);
		for(ClaimDocumentMotorEntity claimDocumentMotorEntityListData :claimDocumentMotorEntityList ){
			if(claimDocumentMotorEntityListData.getParentKey().equalsIgnoreCase(claimDocumentMotorEntityListData.getChildKey())){
				if((claimDocumentMotorEntityListData.getAction().equalsIgnoreCase("add")||claimDocumentMotorEntityListData.getAction().equalsIgnoreCase("edit"))&& claimDocumentMotorEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimDocumentMotor claimDocumentMotor =new ClaimDocumentMotor(driver, "Claim Document Motor");

					claimDocumentMotor.fillandSubmitClaimDocumentsMotorDetails(claimDocumentMotorEntityListData, assertReference);
				}
			}
		}
	}
	//**************************Verify*************************************//
	public void claimMemberVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Verify Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Page");
					claimInsuredItemMemberDamagePage.navigateToClaimMemberDamagePageTitle(claimMemberDamageEntityListData);
					claimInsuredItemMemberDamagePage.fillClaimMemberDamageDetails(claimMemberDamageEntityListData, assertReference);
					//*********MEMBER BUTTON*************
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					//********CLAIM MEMBER DETAILS VERIFY*********************
					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify") && claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								//**********Claim member details attribute sublink verify*****************
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												//****************************Proceed Button**********//
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													if(claimMemberAttributesEntityListData.getStringValueForField("Product").equalsIgnoreCase("GH")){
														previousClaimsHistoryForGHVerifyHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
													}
													List<ClaimMemberT1T2CLRAttEntity>claimMemberT1T2CLRAttEntityList=testData.getData().get(ClaimMemberT1T2CLRAttEntity.class);
													for(ClaimMemberT1T2CLRAttEntity claimMemberT1T2CLRAttEntityListData :claimMemberT1T2CLRAttEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberT1T2CLRAttEntityListData.getChildKey())){
															if(claimMemberT1T2CLRAttEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberT1T2CLRAttEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimMemberAttributePageT1Health claimMemberAttributePageT1Health=new ClaimMemberAttributePageT1Health(driver, "T1-CLR for Health Products");
																claimMemberAttributePageT1Health.fillandSubmitClaimMemberT1CLRAttibutesHealth(claimMemberT1T2CLRAttEntityListData, assertReference);
																//******************************Proceed Button**********//
																//if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
																List<ClaimT2CLRForHealthProEntity>claimT2CLRForHealthProEntityList=testData.getData().get(ClaimT2CLRForHealthProEntity.class);
																for(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData :claimT2CLRForHealthProEntityList ){
																	if(claimEntityListData.getParentKey().equalsIgnoreCase(claimT2CLRForHealthProEntityListData.getChildKey())){
																		if(claimT2CLRForHealthProEntityListData.getAction().equalsIgnoreCase("verify") && claimT2CLRForHealthProEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																			ClaimMemberPropertyProceedT2CLRHealth claimMemberPropertyProceedT2CLRHealth=new ClaimMemberPropertyProceedT2CLRHealth(driver, "T2-CLR for Health Products");
																			claimMemberPropertyProceedT2CLRHealth.fillandSubmitClaimMemberT2CLRAttibutesHealth(claimT2CLRForHealthProEntityListData, assertReference);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void claimPartiesVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//Sachin
					if(claimAssociatedPartiesListData.getStringValueForField("LOB").equalsIgnoreCase("Health")){
						claimPartiesClaimAssociatedParties.afterClickOnSelectButtonHandlePopup(claimAssociatedPartiesListData);
					}
					if(claimAssociatedPartiesListData.getStringValueForField("LOB").equalsIgnoreCase("Personal Accident")){
						claimPartiesClaimAssociatedParties.afterClickOnSelectButtonHandlePopup(claimAssociatedPartiesListData);
					}
					//*********************************Claim Party Details********************************//
					List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
					for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
							if(claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
								claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
								//Sachin
								List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
								for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
									if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
										if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
											ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
											claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

										}
									}
								}

							}
						}
					}
				}
			}
		}
	}


	public void claimReserveVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Reserve  Helper </i></B>");
		int rowcount=1;
		List<ClaimReservePageEntity>claimReservePageEntityList=testData.getData().get(ClaimReservePageEntity.class);
		for(ClaimReservePageEntity claimReservePageEntityListData :claimReservePageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimReservePageEntityListData.getChildKey())){
				if(claimReservePageEntityListData.getAction().equalsIgnoreCase("verify") && claimReservePageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimReserveSummaryPage claimReserveSummaryPage=new ClaimReserveSummaryPage(driver, "Claim Reserve",rowcount);
					claimReserveSummaryPage.fillAndSubmitClaimReserveSummaryDetails(claimReservePageEntityListData, assertReference);	
					testData.updateRecordsForCriteria(claimReservePageEntityListData);
					rowcount++;
				}
				testData.updateRecordsForCriteria(claimReservePageEntityListData);
			}
		}
	}


	public void claimPaymentVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException {
		FrameworkServices.logMessage("<B><i> Executing:: Claim Payment Helper </i></B>");
		List<ClaimPaymentEntity>claimPaymentEntityList=testData.getData().get(ClaimPaymentEntity.class);
		for(ClaimPaymentEntity claimPaymentEntityListData :claimPaymentEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPaymentEntityListData.getChildKey())){
				if(claimPaymentEntityListData.getAction().equalsIgnoreCase("verify") && claimPaymentEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPayments claimPayments =new ClaimPayments(driver, "Claim Payments");
					//***************************Select Party Code************************************//
					claimPayments.selectSearchPartyCode(claimPaymentEntityListData);
					//*********************************Claim Payment Details********************************//
					if(claimPaymentEntityListData.getAction().equalsIgnoreCase("verify") && claimPaymentEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						ClaimPaymentDetails claimPaymentDetails =new ClaimPaymentDetails(driver, "Claim Payment Details");
						claimPaymentDetails.fillandSubmitClaimPaymentDetail(claimPaymentEntityListData, assertReference);
					}
				}
			}
		}
	}


	public void claimLitigationEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Litigation </i></B>");
		List<ClaimLitigationEntity> claimLitigationEntityList=testData.getData().get(ClaimLitigationEntity.class);
		for(ClaimLitigationEntity claimLitigationEntityListdata:claimLitigationEntityList){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimLitigationEntityListdata.getChildKey())){
				if(claimLitigationEntityListdata.getAction().equalsIgnoreCase("edit")||claimLitigationEntityListdata.getAction().equalsIgnoreCase("add")){
					ClaimAddClaimLitigationDetailsPage claimAddClaimLitigationDetailsPage=new ClaimAddClaimLitigationDetailsPage(driver, "Claim Litigation page");
					claimAddClaimLitigationDetailsPage.fillAndSubmitClaimLitigationDetails(claimLitigationEntityListdata, assertReference, testData);
					testData.updateRecordsForCriteria(claimLitigationEntityListdata);
					setClaimSerialNoandPetitionNoDependancy(claimLitigationEntityListdata,testData);
				}
			}
		}
	}


	public void claimTransferToAPEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Transfer To AP </i></B>");
		List<ClaimTransferToAPEntity> claimTransferToAPEntityList=testData.getData().get(ClaimTransferToAPEntity.class);
		for(ClaimTransferToAPEntity claimTransferToAPEntityListdata:claimTransferToAPEntityList){
			if(claimTransferToAPEntityListdata.getParentKey().equalsIgnoreCase(claimTransferToAPEntityListdata.getChildKey())){
				if(claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("edit")||claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("add")){
					ClaimTransferToAPPage claimTransferToAPPage = new ClaimTransferToAPPage(driver, "Claim Transfer To AP page");
					claimTransferToAPPage.fillAndSubmitClaimTransferToAP(claimTransferToAPEntityListdata,assertReference);
					testData.updateRecordsForCriteria(claimTransferToAPEntityListdata);
				}
			}
		}
	}


	public void claimMemberEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Page");
					/***********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								//claimInsuredInterestMemberDamageDetail.navigateToClaimMemberDamageDetailPageTitle();
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													if(claimMemberAttributesEntityListData.getStringValueForField("Product").equalsIgnoreCase("GH")){
														previousClaimsHistoryForGHEditHelper(testData, executionTestStep, assertReference, driver,stepGroup,claimEntityListData);
													}
													List<ClaimMemberT1T2CLRAttEntity>claimMemberT1T2CLRAttEntityList=testData.getData().get(ClaimMemberT1T2CLRAttEntity.class);
													for(ClaimMemberT1T2CLRAttEntity claimMemberT1T2CLRAttEntityListData :claimMemberT1T2CLRAttEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberT1T2CLRAttEntityListData.getChildKey())){
															if((claimMemberT1T2CLRAttEntityListData.getAction().equalsIgnoreCase("add")||claimMemberT1T2CLRAttEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberT1T2CLRAttEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimMemberAttributePageT1Health claimMemberAttributePageT1Health=new ClaimMemberAttributePageT1Health(driver, "T1-CLR for Health Products");
																claimMemberAttributePageT1Health.fillandSubmitClaimMemberT1CLRAttibutesHealth(claimMemberT1T2CLRAttEntityListData, assertReference);
																//if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
																List<ClaimT2CLRForHealthProEntity>claimT2CLRForHealthProEntityList=testData.getData().get(ClaimT2CLRForHealthProEntity.class);
																for(ClaimT2CLRForHealthProEntity claimT2CLRForHealthProEntityListData :claimT2CLRForHealthProEntityList ){
																	if(claimEntityListData.getParentKey().equalsIgnoreCase(claimT2CLRForHealthProEntityListData.getChildKey())){
																		if((claimT2CLRForHealthProEntityListData.getAction().equalsIgnoreCase("add")||claimT2CLRForHealthProEntityListData.getAction().equalsIgnoreCase("edit"))&& claimT2CLRForHealthProEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																			ClaimMemberPropertyProceedT2CLRHealth claimMemberPropertyProceedT2CLRHealth=new ClaimMemberPropertyProceedT2CLRHealth(driver, "T2-CLR for Health Products");
																			claimMemberPropertyProceedT2CLRHealth.fillandSubmitClaimMemberT2CLRAttibutesHealth(claimT2CLRForHealthProEntityListData, assertReference);

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}

							}
						}
					}
				}
			}
		}
	}

	public void claimInsuredItemEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured InterestDamage");
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								//claimInsuredInterestMemberDamageDetail.navigateToClaimMemberDamageDetailPageTitle();
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<CLInsItClaimRiskDet1CSEntity>cLInsItClaimRiskDet1CSEntityList=testData.getData().get(CLInsItClaimRiskDet1CSEntity.class);
													for(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntityListData :cLInsItClaimRiskDet1CSEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(cLInsItClaimRiskDet1CSEntityListData.getChildKey())){
															if((cLInsItClaimRiskDet1CSEntityListData.getAction().equalsIgnoreCase("add")||cLInsItClaimRiskDet1CSEntityListData.getAction().equalsIgnoreCase("edit"))&& cLInsItClaimRiskDet1CSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimInsuredItemClaimRiskDetails1CreditShield claimInsuredItemClaimRiskDetails1CreditShield=new ClaimInsuredItemClaimRiskDetails1CreditShield(driver, "Claim Risk Details 1");
																claimInsuredItemClaimRiskDetails1CreditShield.fillandSubmitInsuredIntClaimRiskDetails1(cLInsItClaimRiskDet1CSEntityListData, assertReference);
																if(cLInsItClaimRiskDet1CSEntityListData.getBooleanValueForField("ConfigNextButton")){
																	List<ClaimInsrRiskDetils2CSEntity>claimInsrRiskDetils2CSEntityList=testData.getData().get(ClaimInsrRiskDetils2CSEntity.class);
																	for(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntityListData :claimInsrRiskDetils2CSEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimInsrRiskDetils2CSEntityListData.getChildKey())){
																			if((claimInsrRiskDetils2CSEntityListData.getAction().equalsIgnoreCase("add")||claimInsrRiskDetils2CSEntityListData.getAction().equalsIgnoreCase("edit"))&& claimInsrRiskDetils2CSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimInsuredItemClaimRiskDetails2CreditShield claimInsuredItemClaimRiskDetails2CreditShield=new ClaimInsuredItemClaimRiskDetails2CreditShield(driver, "CD Claim Risk Details 2");
																				claimInsuredItemClaimRiskDetails2CreditShield.fillAndSubmitClaimInsuredItemClaimRiskDetails2CreditShield(claimInsrRiskDetils2CSEntityListData, assertReference);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}

								}
							}
						}
					}
				}
			}
		}
	}

	public void claimInsuredItemVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Verify Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Page");
					claimInsuredItemMemberDamagePage.fillClaimMemberDamageDetails(claimMemberDamageEntityListData, assertReference);
					//*********MEMBER BUTTON*************
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					//**********CLAIM MEMBER DETAILS VERIFY*********************
					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify") && claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								//**************Claim member details attribute sublink verify*****************
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												//****************************Proceed Button**********//
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<CLInsItClaimRiskDet1CSEntity>cLInsItClaimRiskDet1CSEntityList=testData.getData().get(CLInsItClaimRiskDet1CSEntity.class);
													for(CLInsItClaimRiskDet1CSEntity cLInsItClaimRiskDet1CSEntityListData :cLInsItClaimRiskDet1CSEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(cLInsItClaimRiskDet1CSEntityListData.getChildKey())){
															if((cLInsItClaimRiskDet1CSEntityListData.getAction().equalsIgnoreCase("verify"))&& cLInsItClaimRiskDet1CSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimInsuredItemClaimRiskDetails1CreditShield claimInsuredItemClaimRiskDetails1CreditShield=new ClaimInsuredItemClaimRiskDetails1CreditShield(driver, "Claim Risk Details 1");
																claimInsuredItemClaimRiskDetails1CreditShield.fillandSubmitInsuredIntClaimRiskDetails1(cLInsItClaimRiskDet1CSEntityListData, assertReference);
																if(cLInsItClaimRiskDet1CSEntityListData.getBooleanValueForField("ConfigNextButton")){
																	List<ClaimInsrRiskDetils2CSEntity>claimInsrRiskDetils2CSEntityList=testData.getData().get(ClaimInsrRiskDetils2CSEntity.class);
																	for(ClaimInsrRiskDetils2CSEntity claimInsrRiskDetils2CSEntityListData :claimInsrRiskDetils2CSEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimInsrRiskDetils2CSEntityListData.getChildKey())){
																			if((claimInsrRiskDetils2CSEntityListData.getAction().equalsIgnoreCase("verify"))&& claimInsrRiskDetils2CSEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimInsuredItemClaimRiskDetails2CreditShield claimInsuredItemClaimRiskDetails2CreditShield=new ClaimInsuredItemClaimRiskDetails2CreditShield(driver, "CD Claim Risk Details 2");
																				claimInsuredItemClaimRiskDetails2CreditShield.fillAndSubmitClaimInsuredItemClaimRiskDetails2CreditShield(claimInsrRiskDetils2CSEntityListData, assertReference);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	//Abhijit
	public void cloneClaimEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		if((claimEntityListData.getAction().equalsIgnoreCase("add")||claimEntityListData.getAction().equalsIgnoreCase("edit")) && claimEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
			ClaimSearchPage claimSearchPage=new ClaimSearchPage(driver, "Claim Search Page");
			claimSearchPage.fetchClonedClaimNo(claimEntityListData);
			testData.updateRecordsForCriteria(claimEntityListData);
			setEditClaimNumberDependancy(claimEntityListData, testData);
		}
	}
	public void claimTransferToAPVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Transfer To AP </i></B>");
		List<ClaimTransferToAPEntity> claimTransferToAPEntityList=testData.getData().get(ClaimTransferToAPEntity.class);
		for(ClaimTransferToAPEntity claimTransferToAPEntityListdata:claimTransferToAPEntityList){
			if(claimTransferToAPEntityListdata.getParentKey().equalsIgnoreCase(claimTransferToAPEntityListdata.getChildKey())){
				if(claimTransferToAPEntityListdata.getAction().equalsIgnoreCase("verify") && claimTransferToAPEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)) {
					ClaimTransferToAPPage claimTransferToAPPage = new ClaimTransferToAPPage(driver, "Claim Transfer To AP page");
					claimTransferToAPPage.fillAndSubmitClaimTransferToAP(claimTransferToAPEntityListdata,assertReference);
					testData.updateRecordsForCriteria(claimTransferToAPEntityListdata);
				}
			}
		}
	}



	public void claimPersonalAccidentInsuredItemEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured InterestDamage");
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								//claimInsuredInterestMemberDamageDetail.navigateToClaimMemberDamageDetailPageTitle();
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimInsItAttRiskDetPAEntity>claimInsItAttRiskDetPAEntityList=testData.getData().get(ClaimInsItAttRiskDetPAEntity.class);
													for(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntityListData :claimInsItAttRiskDetPAEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimInsItAttRiskDetPAEntityListData.getChildKey())){
															if((claimInsItAttRiskDetPAEntityListData.getAction().equalsIgnoreCase("add")||claimInsItAttRiskDetPAEntityListData.getAction().equalsIgnoreCase("edit"))&& claimInsItAttRiskDetPAEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimInsuredItemClaimRiskDetailsPersonalAccident claimInsuredItemClaimRiskDetailsPersonalAccident=new ClaimInsuredItemClaimRiskDetailsPersonalAccident(driver, "Claim Risk Details 1");
																claimInsuredItemClaimRiskDetailsPersonalAccident.fillandSubmitInsuredIntClaimRiskDetails1PA(claimInsItAttRiskDetPAEntityListData, assertReference);
																if(claimInsItAttRiskDetPAEntityListData.getBooleanValueForField("ConfigNextButton")){
																	if(claimInsItAttRiskDetPAEntityListData.getBooleanValueForField("ConfigClaimRiskDetail2GR")){
																		claimRiskDetail2GREditHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
																	}
																	List<ClaimInsrRskDetails2PAEntity>claimInsrRskDetails2PAEntityList=testData.getData().get(ClaimInsrRskDetails2PAEntity.class);
																	for(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntityListData :claimInsrRskDetails2PAEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimInsrRskDetails2PAEntityListData.getChildKey())){
																			if((claimInsrRskDetails2PAEntityListData.getAction().equalsIgnoreCase("add")||claimInsrRskDetails2PAEntityListData.getAction().equalsIgnoreCase("edit"))&& claimInsrRskDetails2PAEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimInsuredItemClaimRiskDetails2PersonalAccident claimInsuredItemClaimRiskDetails2PersonalAccident=new ClaimInsuredItemClaimRiskDetails2PersonalAccident(driver, "CD Claim Risk Details 2");
																				claimInsuredItemClaimRiskDetails2PersonalAccident.fillAndSubmitClaimInsuredItemClaimRiskDetails2PersonalAccident(claimInsrRskDetails2PAEntityListData, assertReference);
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
										}
									}

								}

							}
						}
					}
				}
			}
		}
	}
	public void claimPersonalAccidentInsuredItemVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Verify Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Page");
					claimInsuredItemMemberDamagePage.fillClaimMemberDamageDetails(claimMemberDamageEntityListData, assertReference);
					//*********MEMBER BUTTON*************
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					//**********CLAIM MEMBER DETAILS VERIFY*********************
					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify") && claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								//**********Claim member details attribute sublink verify*****************
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimInsItAttRiskDetPAEntity>claimInsItAttRiskDetPAEntityList=testData.getData().get(ClaimInsItAttRiskDetPAEntity.class);
													for(ClaimInsItAttRiskDetPAEntity claimInsItAttRiskDetPAEntityListData :claimInsItAttRiskDetPAEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimInsItAttRiskDetPAEntityListData.getChildKey())){
															if(claimInsItAttRiskDetPAEntityListData.getAction().equalsIgnoreCase("verify") && claimInsItAttRiskDetPAEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimInsuredItemClaimRiskDetailsPersonalAccident claimInsuredItemClaimRiskDetailsPersonalAccident=new ClaimInsuredItemClaimRiskDetailsPersonalAccident(driver, "Claim Risk Details 1");
																claimInsuredItemClaimRiskDetailsPersonalAccident.fillandSubmitInsuredIntClaimRiskDetails1PA(claimInsItAttRiskDetPAEntityListData, assertReference);
																if(claimInsItAttRiskDetPAEntityListData.getBooleanValueForField("ConfigNextButton")){
																	if(claimInsItAttRiskDetPAEntityListData.getBooleanValueForField("ConfigClaimRiskDetail2GR")){
																		claimRiskDetail2GRVerifyHelper(testData, executionTestStep, assertReference, driver,claimEntityListData);
																	}
																	List<ClaimInsrRskDetails2PAEntity>claimInsrRskDetails2PAEntityList=testData.getData().get(ClaimInsrRskDetails2PAEntity.class);
																	for(ClaimInsrRskDetails2PAEntity claimInsrRskDetails2PAEntityListData :claimInsrRskDetails2PAEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimInsrRskDetails2PAEntityListData.getChildKey())){
																			if(claimInsrRskDetails2PAEntityListData.getAction().equalsIgnoreCase("verify") && claimInsrRskDetails2PAEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimInsuredItemClaimRiskDetails2PersonalAccident claimInsuredItemClaimRiskDetails2PersonalAccident=new ClaimInsuredItemClaimRiskDetails2PersonalAccident(driver, "CD Claim Risk Details 2");
																				claimInsuredItemClaimRiskDetails2PersonalAccident.fillAndSubmitClaimInsuredItemClaimRiskDetails2PersonalAccident(claimInsrRskDetails2PAEntityListData, assertReference);
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}

								}
							}
						}
					}
				}
			}
		}
	}

	//Abhijit
	public void claimAttributesVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimPolPropertyTCLMEntity>claimPolPropertyTCLMEntityList=testData.getData().get(ClaimPolPropertyTCLMEntity.class);
						for(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntityListData :claimPolPropertyTCLMEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPolPropertyTCLMEntityListData.getChildKey())){
								if(claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("verify") && claimPolPropertyTCLMEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttrPolicyPropertyT1CLMPage claimAttrPolicyPropertyT1CLMPage=new ClaimAttrPolicyPropertyT1CLMPage(driver, "Claim Policy Property T1CLM Page");
									claimAttrPolicyPropertyT1CLMPage.fillAndSubmitCourtMasterForAllProductDetails(claimPolPropertyTCLMEntityListData, assertReference);
								}

							}
						}

						List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
						for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
								if(claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify")&& claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
									claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
								}
							}
						}
					}
				}

			}
		}

	}

	// Rupali
	public void claimAttributesEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<ClaimPolPropertyTCLMEntity>claimPolPropertyTCLMEntityList=testData.getData().get(ClaimPolPropertyTCLMEntity.class);
						for(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntityListData :claimPolPropertyTCLMEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPolPropertyTCLMEntityListData.getChildKey())){
								if((claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("add")||claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("edit")) && claimPolPropertyTCLMEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttrPolicyPropertyT1CLMPage claimAttrPolicyPropertyT1CLMPage=new ClaimAttrPolicyPropertyT1CLMPage(driver, "Claim Policy Property T1CLM Page");
									claimAttrPolicyPropertyT1CLMPage.fillAndSubmitCourtMasterForAllProductDetails(claimPolPropertyTCLMEntityListData, assertReference);

								}
							}
						}
						List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
						for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
								if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
									claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
								}
							}
						}
					}
				}

			}
		}
	}

	//Abhijit GH
	public void previousClaimsHistoryForGHEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Previous Claims History For GH Edit Helper </i></B>");
		List<PrevClaimHistoryForGHEntity> prevClaimHistoryForGHEntityList=testData.getData().get(PrevClaimHistoryForGHEntity.class);
		for(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntityListdata:prevClaimHistoryForGHEntityList){
			if((prevClaimHistoryForGHEntityListdata.getAction().equalsIgnoreCase("edit")||prevClaimHistoryForGHEntityListdata.getAction().equalsIgnoreCase("add"))&& prevClaimHistoryForGHEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PreviousClaimsHistoryForGH previousClaimsHistoryForGH=new PreviousClaimsHistoryForGH(driver,"Previous Claims History For GH");
				previousClaimsHistoryForGH.fillAndSubmitPreviousClaimsHistoryForGH(prevClaimHistoryForGHEntityListdata, assertReference);
				testData.updateRecordsForCriteria(prevClaimHistoryForGHEntityListdata);
			}
		}
	}

	public void claimRiskDetail2GREditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,ClaimEntity claimEntityData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Risk Detail 2 GR</i></B>");
		List<ClaimInsrRiskDetl2GrPAEntity> claimInsrRiskDetl2GrPAEntityList=testData.getData().get(ClaimInsrRiskDetl2GrPAEntity.class);
		for(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntitydata:claimInsrRiskDetl2GrPAEntityList){
			if(claimEntityData.getParentKey().equalsIgnoreCase(claimInsrRiskDetl2GrPAEntitydata.getChildKey())){
				if(claimInsrRiskDetl2GrPAEntitydata.getAction().equalsIgnoreCase("add")){
					ClaimInsuredItemClaimRiskDetail2GRPersonalAccident claimInsuredItemClaimRiskDetail2GRPersonalAccident=new ClaimInsuredItemClaimRiskDetail2GRPersonalAccident(driver, "Risk Details for STD Risk Page");
					claimInsuredItemClaimRiskDetail2GRPersonalAccident.fillAndSubmitClaimInsuredItemClaimRiskDetail2GRPersonalAccident(claimInsrRiskDetl2GrPAEntitydata, assertReference);
					testData.updateRecordsForCriteria(claimInsrRiskDetl2GrPAEntitydata);
				}
			}
		}
	}
	public void claimRiskDetail2GRVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,ClaimEntity claimEntityData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Risk Detail 2 GR</i></B>");
		List<ClaimInsrRiskDetl2GrPAEntity> claimInsrRiskDetl2GrPAEntityList=testData.getData().get(ClaimInsrRiskDetl2GrPAEntity.class);
		for(ClaimInsrRiskDetl2GrPAEntity claimInsrRiskDetl2GrPAEntitydata:claimInsrRiskDetl2GrPAEntityList){
			if(claimEntityData.getParentKey().equalsIgnoreCase(claimInsrRiskDetl2GrPAEntitydata.getChildKey())){
				if(claimInsrRiskDetl2GrPAEntitydata.getAction().equalsIgnoreCase("verify")){
					ClaimInsuredItemClaimRiskDetail2GRPersonalAccident claimInsuredItemClaimRiskDetail2GRPersonalAccident=new ClaimInsuredItemClaimRiskDetail2GRPersonalAccident(driver, "Risk Details for STD Risk Page");
					claimInsuredItemClaimRiskDetail2GRPersonalAccident.fillAndSubmitClaimInsuredItemClaimRiskDetail2GRPersonalAccident(claimInsrRiskDetl2GrPAEntitydata, assertReference);
					testData.updateRecordsForCriteria(claimInsrRiskDetl2GrPAEntitydata);
				}
			}
		}
	}

	//GH Abhijit
	public void previousClaimsHistoryForGHVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Previous Claims History For GH Edit Helper </i></B>");
		List<PrevClaimHistoryForGHEntity> prevClaimHistoryForGHEntityList=testData.getData().get(PrevClaimHistoryForGHEntity.class);
		for(PrevClaimHistoryForGHEntity prevClaimHistoryForGHEntityListdata:prevClaimHistoryForGHEntityList){
			if(prevClaimHistoryForGHEntityListdata.getAction().equalsIgnoreCase("verify") && prevClaimHistoryForGHEntityListdata.getStepGroup().equalsIgnoreCase(stepGroup)){
				PreviousClaimsHistoryForGH previousClaimsHistoryForGH=new PreviousClaimsHistoryForGH(driver,"Previous Claims History For GH");
				previousClaimsHistoryForGH.fillAndSubmitPreviousClaimsHistoryForGH(prevClaimHistoryForGHEntityListdata, assertReference);
				testData.updateRecordsForCriteria(prevClaimHistoryForGHEntityListdata);
			}
		}
	}


	//Nilesh Misc Liablity

	public void claimInsuredItemMisEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured InterestDamage");
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								//claimInsuredInterestMemberDamageDetail.navigateToClaimMemberDamageDetailPageTitle();
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskDetMISEntity>claimRiskDetMISEntityList=testData.getData().get(ClaimRiskDetMISEntity.class);
													for(ClaimRiskDetMISEntity ClaimRiskDetMISEntityListData :claimRiskDetMISEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(ClaimRiskDetMISEntityListData.getChildKey())){
															if((ClaimRiskDetMISEntityListData.getAction().equalsIgnoreCase("add")||ClaimRiskDetMISEntityListData.getAction().equalsIgnoreCase("edit"))&& ClaimRiskDetMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskDetailsAndPropertiesMIS cClaimRiskDetailsAndPropertiesMIS=new ClaimRiskDetailsAndPropertiesMIS(driver, "Claim Risk Details 1");
																cClaimRiskDetailsAndPropertiesMIS.fillandSubmitClaimRiskDetailsMISLDetails(ClaimRiskDetMISEntityListData, assertReference);
																if(ClaimRiskDetMISEntityListData.getBooleanValueForField("ConfigNextButton")){

																	//*****FOR CT PRODUCT**********//

																	if(ClaimRiskDetMISEntityListData.getStringValueForField("Product").equalsIgnoreCase("CT")){
																		t4ClaimPropLiab1CTMisEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																		if(ClaimRiskDetMISEntityListData.getBooleanValueForField("ConfigProceedButton")){
																			t5ClaimPropLiab1CTMisEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																		}
																	}

																	List<T3ClaimPropForMISEntity>t3ClaimPropForMISEntityList=testData.getData().get(T3ClaimPropForMISEntity.class);
																	for(T3ClaimPropForMISEntity t3ClaimPropForMISEntityListData :t3ClaimPropForMISEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(t3ClaimPropForMISEntityListData.getChildKey())){
																			if((t3ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("add")||t3ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("edit"))&& t3ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				T3ClaimPropertyForMIS tT3ClaimPropertyForMIS=new T3ClaimPropertyForMIS(driver, "CD Claim Risk Details 2");
																				tT3ClaimPropertyForMIS.fillandSubmitT3ClaimPropertyForCOMIS(t3ClaimPropForMISEntityListData, assertReference);
																				//Sachin
																				if(t3ClaimPropForMISEntityListData.getStringValueForField("Product").equalsIgnoreCase("IT")){
																					claimInsuredItemT4ClaimPropertyforITMisHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																				}//Sachin

																				if(t3ClaimPropForMISEntityListData.getBooleanValueForField("ConfigNextArrowButton")||t3ClaimPropForMISEntityListData.getBooleanValueForField("ConfigNavigateToT4Page")){

																					List<T4ClaimPropLiab1MISEntity>t4ClaimPropLiab1MISEntityList=testData.getData().get(T4ClaimPropLiab1MISEntity.class);
																					for(T4ClaimPropLiab1MISEntity t4ClaimPropForMISEntityListData :t4ClaimPropLiab1MISEntityList ){	
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(t4ClaimPropForMISEntityListData.getChildKey())){
																							if((t4ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("add")||t4ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("edit"))&& t4ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								T4ClaimPropertyForLiab1MIS tT4ClaimPropertyForLiab1MIS=new T4ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
																								tT4ClaimPropertyForLiab1MIS.fillandSubmitT4ClaimPropertyForLiabMISLDetails(t4ClaimPropForMISEntityListData, assertReference);
																								if (t4ClaimPropForMISEntityListData.getBooleanValueForField("ConfigProceedButton")||t4ClaimPropForMISEntityListData.getBooleanValueForField("ConfigNavigateToT5Page")){

																									List<T5ClaimPropLiab1MISEntity>t5ClaimPropLiab1MISEntityList=testData.getData().get(T5ClaimPropLiab1MISEntity.class);
																									for(T5ClaimPropLiab1MISEntity t5ClaimPropForMISEntityListData :t5ClaimPropLiab1MISEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(t5ClaimPropForMISEntityListData.getChildKey())){
																											if((t5ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("add")||t5ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("edit"))&& t5ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												T5ClaimPropertyForLiab1MIS tT5ClaimPropertyForLiab1MIS=new T5ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
																												tT5ClaimPropertyForLiab1MIS.fillandSubmitT5ClaimPropertyForLiabyForLiabMISLDetails(t5ClaimPropForMISEntityListData, assertReference);
																											}
																										}

																									}
																								}
																							}
																						}
																					}
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}

							}
						}
					}
				}
			}
		}
	}


	public void claimInsuredItemMiscVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){					
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured InterestDamage");
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify") && claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim MemberDamage");
								//claimInsuredInterestMemberDamageDetail.navigateToClaimMemberDamageDetailPageTitle();
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimRiskDetMISEntity>claimRiskDetMISEntityList=testData.getData().get(ClaimRiskDetMISEntity.class);
													for(ClaimRiskDetMISEntity ClaimRiskDetMISEntityListData :claimRiskDetMISEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(ClaimRiskDetMISEntityListData.getChildKey())){
															if((ClaimRiskDetMISEntityListData.getAction().equalsIgnoreCase("verify") && ClaimRiskDetMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																ClaimRiskDetailsAndPropertiesMIS cClaimRiskDetailsAndPropertiesMIS=new ClaimRiskDetailsAndPropertiesMIS(driver, "Claim Risk Details 1");
																cClaimRiskDetailsAndPropertiesMIS.fillandSubmitClaimRiskDetailsMISLDetails(ClaimRiskDetMISEntityListData, assertReference);
																if(ClaimRiskDetMISEntityListData.getBooleanValueForField("ConfigNextButton")){

																	//**** FOR CT PRODUCT*******//
																	if(ClaimRiskDetMISEntityListData.getStringValueForField("Product").equalsIgnoreCase("CT")){
																		t4ClaimPropLiab1CTMisVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																		if(ClaimRiskDetMISEntityListData.getBooleanValueForField("ConfigProceedButton")){
																			t5ClaimPropLiab1CTMisVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																		}
																	}
																	List<T3ClaimPropForMISEntity>t3ClaimPropForMISEntityList=testData.getData().get(T3ClaimPropForMISEntity.class);
																	for(T3ClaimPropForMISEntity t3ClaimPropForMISEntityListData :t3ClaimPropForMISEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(t3ClaimPropForMISEntityListData.getChildKey())){
																			if((t3ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("verify")&& t3ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																				T3ClaimPropertyForMIS tT3ClaimPropertyForMIS=new T3ClaimPropertyForMIS(driver, "CD Claim Risk Details 2");
																				tT3ClaimPropertyForMIS.fillandSubmitT3ClaimPropertyForCOMIS(t3ClaimPropForMISEntityListData, assertReference);
																				//Sachin
																				if(t3ClaimPropForMISEntityListData.getStringValueForField("Product").equalsIgnoreCase("IT")){
																					claimInsuredItemT4ClaimPropertyforITMisVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																				}//Sachin
																				if(t3ClaimPropForMISEntityListData.getBooleanValueForField("ConfigNextArrowButton")||t3ClaimPropForMISEntityListData.getBooleanValueForField("ConfigNavigateToT4Page")){
																					List<T4ClaimPropLiab1MISEntity>t4ClaimPropLiab1MISEntityList=testData.getData().get(T4ClaimPropLiab1MISEntity.class);
																					for(T4ClaimPropLiab1MISEntity t4ClaimPropForMISEntityListData :t4ClaimPropLiab1MISEntityList ){	
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(t4ClaimPropForMISEntityListData.getChildKey())){
																							if((t4ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("verify")&& t4ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																								T4ClaimPropertyForLiab1MIS tT4ClaimPropertyForLiab1MIS=new T4ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
																								tT4ClaimPropertyForLiab1MIS.fillandSubmitT4ClaimPropertyForLiabMISLDetails(t4ClaimPropForMISEntityListData, assertReference);
																								if (t4ClaimPropForMISEntityListData.getBooleanValueForField("ConfigProceedButton")||t4ClaimPropForMISEntityListData.getBooleanValueForField("ConfigNavigateToT5Page")){
																									List<T5ClaimPropLiab1MISEntity>t5ClaimPropLiab1MISEntityList=testData.getData().get(T5ClaimPropLiab1MISEntity.class);
																									for(T5ClaimPropLiab1MISEntity t5ClaimPropForMISEntityListData :t5ClaimPropLiab1MISEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(t5ClaimPropForMISEntityListData.getChildKey())){
																											if((t5ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("verify")&& t5ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																												T5ClaimPropertyForLiab1MIS tT5ClaimPropertyForLiab1MIS=new T5ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
																												tT5ClaimPropertyForLiab1MIS.fillandSubmitT5ClaimPropertyForLiabyForLiabMISLDetails(t5ClaimPropForMISEntityListData, assertReference);
																											}
																										}

																									}
																								}
																							}


																						}

																					}
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}

							}
						}
					}
				}
			}
		}
	}

	//Abhijit Rural Insured Item Helper

	public void claimInsuredItemRuralEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Rural Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<PreClaimHistCartRuralEntity>preClaimHistCartRuralEntityList=testData.getData().get(PreClaimHistCartRuralEntity.class);
													for(PreClaimHistCartRuralEntity preClaimHistCartRuralEntityListData :preClaimHistCartRuralEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(preClaimHistCartRuralEntityListData.getChildKey())){
															if((preClaimHistCartRuralEntityListData.getAction().equalsIgnoreCase("add")||preClaimHistCartRuralEntityListData.getAction().equalsIgnoreCase("edit"))&& preClaimHistCartRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PreviousClaimHistforCartRural previousClaimHistforCartRural=new PreviousClaimHistforCartRural(driver, "Previous Claim History Rural Page");
																previousClaimHistforCartRural.fillandSubmitPreviousClaimHistoryRural(preClaimHistCartRuralEntityListData, assertReference);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	//Abhijit Insured Item Verify Helper


	public void claimInsuredItemRuralVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Rural Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/******************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<PreClaimHistCartRuralEntity>preClaimHistCartRuralEntityList=testData.getData().get(PreClaimHistCartRuralEntity.class);
													for(PreClaimHistCartRuralEntity preClaimHistCartRuralEntityListData :preClaimHistCartRuralEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(preClaimHistCartRuralEntityListData.getChildKey())){
															if(preClaimHistCartRuralEntityListData.getAction().equalsIgnoreCase("verify")&& preClaimHistCartRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PreviousClaimHistforCartRural previousClaimHistforCartRural=new PreviousClaimHistforCartRural(driver, "Previous Claim History Rural Page");
																previousClaimHistforCartRural.fillandSubmitPreviousClaimHistoryRural(preClaimHistCartRuralEntityListData, assertReference);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//Nilesh Fire Insured Item Helper

	public void claimInsuredItemFireEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Fire Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskPropFireEntity>claimRiskPropFireEntityList=testData.getData().get(ClaimRiskPropFireEntity.class);
													for(ClaimRiskPropFireEntity claimRiskPropFireEntityListData :claimRiskPropFireEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskPropFireEntityListData.getChildKey())){
															if((claimRiskPropFireEntityListData.getAction().equalsIgnoreCase("add")||claimRiskPropFireEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskPropFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskPropFire claimRiskPropFire=new ClaimRiskPropFire(driver, "Claim Risk properties Fire Page");
																claimRiskPropFire.fillandSubmitClaimRiskPropFire(claimRiskPropFireEntityListData, assertReference);
																if(claimRiskPropFireEntityListData.getBooleanValueForField("ConfigNextArrowButton")){
																	//Loss Page
																	if(claimRiskPropFireEntityListData.getBooleanValueForField("ConfigLossPage")){
																		claimLossFireEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																	}
																	//Special Fields Page
																	specialfieldClaimFireEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																}
																//Interruption period in days Page
																if(claimRiskPropFireEntityListData.getBooleanValueForField("ConfigInterruptionPeriodInDaysPage")){
																	interruptionPeriodFireEditHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																}
															}

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//shwetha(07/08/2018)
	public void claimInsuredItemMotorVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Motor Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskProMotorEntity>claimRiskProMotorEntityList=testData.getData().get(ClaimRiskProMotorEntity.class);
													for(ClaimRiskProMotorEntity claimRiskPropMotorEntityListData :claimRiskProMotorEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskPropMotorEntityListData.getChildKey())){
															if(claimRiskPropMotorEntityListData.getAction().equalsIgnoreCase("verify")&& claimRiskPropMotorEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskPropertyMotor claimRiskPropertyMotor=new ClaimRiskPropertyMotor(driver, "Claim Risk properties Motor Page");
																claimRiskPropertyMotor.fillandSubmitClaimRiskPropertyMotor(claimRiskPropMotorEntityListData, assertReference);

															}


														}

													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	//shwetha(30/06/2018)
	public void claimInsuredItemMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Motor Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskProMotorEntity>claimRiskProMotorEntityList=testData.getData().get(ClaimRiskProMotorEntity.class);
													for(ClaimRiskProMotorEntity claimRiskPropMotorEntityListData :claimRiskProMotorEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskPropMotorEntityListData.getChildKey())){
															if((claimRiskPropMotorEntityListData.getAction().equalsIgnoreCase("add")||claimRiskPropMotorEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskPropMotorEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskPropertyMotor claimRiskPropertyMotor=new ClaimRiskPropertyMotor(driver, "Claim Risk properties Motor Page");
																claimRiskPropertyMotor.fillandSubmitClaimRiskPropertyMotor(claimRiskPropMotorEntityListData, assertReference);

															}
															//Interruption period in days Page

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	//shwetha(30/06/2018)
	public void claimPartiesMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}
		}
	}
	public void claimPartiesFireVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigFinancierStakeCode")){
						// To handle Pop-up
						claimPartiesClaimAssociatedParties.afterClickOnSelectButtonHandlePopup(claimAssociatedPartiesListData);
						//To verify Claim Party Details Page
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if(claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);

								}
							}
						}
					}
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}

	//Shwetha(30/06/2018)
	public void claimReserveMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Reserve Helper </i></B>");
		int rowcount=0;
		List<ClaimReservePageEntity>claimReservePageEntityList=testData.getData().get(ClaimReservePageEntity.class);
		for(ClaimReservePageEntity claimReservePageEntityListData :claimReservePageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimReservePageEntityListData.getChildKey())){
				if((claimReservePageEntityListData.getAction().equalsIgnoreCase("add")||claimReservePageEntityListData.getAction().equalsIgnoreCase("edit"))&& claimReservePageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimReserveSummaryPage claimReserveSummaryPage=new ClaimReserveSummaryPage(driver, "Claim Reserve",rowcount);
					claimReserveSummaryPage.fillAndSubmitClaimReserveSummaryDetails(claimReservePageEntityListData, assertReference);
					claimReserveSummaryPage.createNewReservePage(claimReservePageEntityListData);
					if(claimReservePageEntityListData.getBooleanValueForField("ConfigNewButton")){
						ClaimReservePage claimReservePage=new ClaimReservePage(driver, "Claim Reserve Details");
						claimReservePage.fillandSubmitClaimReserveDetails(claimReservePageEntityListData, assertReference);

					}


				}

			}
		}
	}
	//shwetha(06/08/2018)
	public void claimAttributesMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Claim Property Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimPropertyMotorEntity>claimPropertyMotorEntityList=testData.getData().get(ClaimPropertyMotorEntity.class);
							for(ClaimPropertyMotorEntity claimPropertyMotorEntityListData :claimPropertyMotorEntityList ){
								if(claimPropertyMotorEntityListData.getParentKey().equalsIgnoreCase(claimPropertyMotorEntityListData.getChildKey())){
									if((claimPropertyMotorEntityListData.getAction().equalsIgnoreCase("add")||claimPropertyMotorEntityListData.getAction().equalsIgnoreCase("edit")) && claimPropertyMotorEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPropertyMotor claimPropertyMotor=new ClaimPropertyMotor(driver, "Claim Property Motor Page");
										claimPropertyMotor.fillAndSubmitClaimPropertyDetails(claimPropertyMotorEntityListData, assertReference);
									}
								}
							}
						}

					}
				}
			}
		}
	}
	//shwetha(07/08/2018)
	public void claimAttributesVerifyMotorEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Claim Property Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimPropertyMotorEntity>claimPropertyMotorEntityList=testData.getData().get(ClaimPropertyMotorEntity.class);
							for(ClaimPropertyMotorEntity claimPropertyMotorEntityListData :claimPropertyMotorEntityList ){
								if(claimPropertyMotorEntityListData.getParentKey().equalsIgnoreCase(claimPropertyMotorEntityListData.getChildKey())){
									if(claimPropertyMotorEntityListData.getAction().equalsIgnoreCase("verify") && claimPropertyMotorEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPropertyMotor claimPropertyMotor=new ClaimPropertyMotor(driver, "Claim Property Motor Page");
										claimPropertyMotor.fillAndSubmitClaimPropertyDetails(claimPropertyMotorEntityListData, assertReference);
									}
								}
							}
						}

					}
				}
			}
		}
	}
	//Nilesh Fire Insured Item Verify Helper


	public void claimInsuredItemFireVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Fire Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/******************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskPropFireEntity>claimRiskPropFireEntityList=testData.getData().get(ClaimRiskPropFireEntity.class);
													for(ClaimRiskPropFireEntity claimRiskPropFireEntityListData :claimRiskPropFireEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskPropFireEntityListData.getChildKey())){
															if(claimRiskPropFireEntityListData.getAction().equalsIgnoreCase("verify")&& claimRiskPropFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskPropFire claimRiskPropFire=new ClaimRiskPropFire(driver, "Claim Risk properties Fire Page");
																claimRiskPropFire.fillandSubmitClaimRiskPropFire(claimRiskPropFireEntityListData, assertReference);
																if(claimRiskPropFireEntityListData.getBooleanValueForField("ConfigNextArrowButton")){
																	//Loss Page
																	if(claimRiskPropFireEntityListData.getBooleanValueForField("ConfigLossPage")){
																		claimLossFireVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																	}
																	//Special Fields Page
																	specialfieldClaimFireVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																}
																//Interruption period in days Page
																if(claimRiskPropFireEntityListData.getBooleanValueForField("ConfigInterruptionPeriodInDaysPage")){
																	interruptionPeriodFireVerifyHelper(testData, executionTestStep, assertReference, driver, stepGroup, claimEntityListData);
																}
															}

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//nilesh fire parties edit helper
	public void claimPartiesFireEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}
		}
	}
	//Paresh Motor verify helper 
	public void claimPartiesMotorVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigFinancierStakeCode")){
						// To handle Pop-up
						claimPartiesClaimAssociatedParties.afterClickOnSelectButtonHandlePopup(claimAssociatedPartiesListData);
						//To verify Claim Party Details Page
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if(claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);

								}
							}
						}
					}
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}



	//Abhijit

	public void claimAttributesRuralEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimChrgSubLimitREntity>claimChrgSubLimitREntityList=testData.getData().get(ClaimChrgSubLimitREntity.class);
						for(ClaimChrgSubLimitREntity claimChrgSubLimitREntityListData :claimChrgSubLimitREntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimChrgSubLimitREntityListData.getChildKey())){
								if((claimChrgSubLimitREntityListData.getAction().equalsIgnoreCase("add")||claimChrgSubLimitREntityListData.getAction().equalsIgnoreCase("edit")) && claimChrgSubLimitREntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimChargesSubLimitsRural claimChargesSubLimitsRural=new ClaimChargesSubLimitsRural(driver, "Claim Charges Sub Limits Rural Page");
									claimChargesSubLimitsRural.fillandSubmitClaimChargesSubLimitsRural(claimChrgSubLimitREntityListData, assertReference);
									if(claimChrgSubLimitREntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	//Abhijit

	public void claimAttributesRuralVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimChrgSubLimitREntity>claimChrgSubLimitREntityList=testData.getData().get(ClaimChrgSubLimitREntity.class);
						for(ClaimChrgSubLimitREntity claimChrgSubLimitREntityListData :claimChrgSubLimitREntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimChrgSubLimitREntityListData.getChildKey())){
								if(claimChrgSubLimitREntityListData.getAction().equalsIgnoreCase("verify")&& claimChrgSubLimitREntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimChargesSubLimitsRural claimChargesSubLimitsRural=new ClaimChargesSubLimitsRural(driver, "Claim Charges Sub Limits Rural Page");
									claimChargesSubLimitsRural.fillandSubmitClaimChargesSubLimitsRural(claimChrgSubLimitREntityListData, assertReference);
									if(claimChrgSubLimitREntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if(claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify") && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	//Abhijit Misc

	public void claimAttributesMiscEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Misc Edit Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
						for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
								if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
									claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
								}
							}
						}
					}
				}

			}
		}
	}

	//Abhijit 
	public void claimAttributesMiscVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Misc Verify Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
						for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
								if(claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify") && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
									claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
								}
							}
						}
					}
				}

			}
		}
	}
	//Nilesh ST
	public void claimPartiesMisEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}
		}
	}
	public void claimPartiesMisVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}

	// Rasika - Claim Attribute Fire Edit Helper
	public void claimAttributesFireEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Claim Property Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimPropertyFireEntity>claimPropertyFireEntityList=testData.getData().get(ClaimPropertyFireEntity.class);
							for(ClaimPropertyFireEntity claimPropertyFireEntityListData :claimPropertyFireEntityList ){
								if(claimPropertyFireEntityListData.getParentKey().equalsIgnoreCase(claimPropertyFireEntityListData.getChildKey())){
									if((claimPropertyFireEntityListData.getAction().equalsIgnoreCase("add")||claimPropertyFireEntityListData.getAction().equalsIgnoreCase("edit")) && claimPropertyFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPropertyFire claimPropertyFire=new ClaimPropertyFire(driver, "Claim Property Fire Page");
										claimPropertyFire.fillAndSubmitClaimPropertyDetails(claimPropertyFireEntityListData, assertReference);
									}
								}
							}
						}
						//Fire Reinstatement Premium Fire Page
						List<FireReinstatmntPremiumEntity>fireReinstatmntPremiumEntityList=testData.getData().get(FireReinstatmntPremiumEntity.class);
						for(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntityListData :fireReinstatmntPremiumEntityList ){
							if(fireReinstatmntPremiumEntityListData.getParentKey().equalsIgnoreCase(fireReinstatmntPremiumEntityListData.getChildKey())){
								if((fireReinstatmntPremiumEntityListData.getAction().equalsIgnoreCase("add")||fireReinstatmntPremiumEntityListData.getAction().equalsIgnoreCase("edit")) && fireReinstatmntPremiumEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									FireReinstatementPremiumFire fireReinstatementPremiumFire=new FireReinstatementPremiumFire(driver, "Fire Reinstatement Premium Fire Page");
									fireReinstatementPremiumFire.fillAndSubmitClaimPropertyDetails(fireReinstatmntPremiumEntityListData, assertReference);
									//Court Master For All Product Page	
									if(fireReinstatmntPremiumEntityListData.getBooleanValueForField("ConfigProceedButton")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	// Rasika - Claim Attribute Fire Verify Helper
	public void claimAttributesFireVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Claim Property Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimPropertyFireEntity>claimPropertyFireEntityList=testData.getData().get(ClaimPropertyFireEntity.class);
							for(ClaimPropertyFireEntity claimPropertyFireEntityListData :claimPropertyFireEntityList ){
								if(claimPropertyFireEntityListData.getParentKey().equalsIgnoreCase(claimPropertyFireEntityListData.getChildKey())){
									if(claimPropertyFireEntityListData.getAction().equalsIgnoreCase("verify") && claimPropertyFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPropertyFire claimPropertyFire=new ClaimPropertyFire(driver, "Claim Property Fire Page");
										claimPropertyFire.fillAndSubmitClaimPropertyDetails(claimPropertyFireEntityListData, assertReference);
									}
								}
							}
						}
						//Fire Reinstatement Premium Fire Page
						List<FireReinstatmntPremiumEntity>fireReinstatmntPremiumEntityList=testData.getData().get(FireReinstatmntPremiumEntity.class);
						for(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntityListData :fireReinstatmntPremiumEntityList ){
							if(fireReinstatmntPremiumEntityListData.getParentKey().equalsIgnoreCase(fireReinstatmntPremiumEntityListData.getChildKey())){
								if(fireReinstatmntPremiumEntityListData.getAction().equalsIgnoreCase("verify") && fireReinstatmntPremiumEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									FireReinstatementPremiumFire fireReinstatementPremiumFire=new FireReinstatementPremiumFire(driver, "Fire Reinstatement Premium Fire Page");
									fireReinstatementPremiumFire.fillAndSubmitClaimPropertyDetails(fireReinstatmntPremiumEntityListData, assertReference);
									//Court Master For All Product Page	
									if(fireReinstatmntPremiumEntityListData.getBooleanValueForField("ConfigProceedButton")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if(claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify") && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	// Mangesh - Claim Attribute MiscNonliability Edit Helper
	public void claimAttributesMiscNonliabilityEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Claim Property Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimPropertyFireEntity>claimPropertyFireEntityList=testData.getData().get(ClaimPropertyFireEntity.class);
							for(ClaimPropertyFireEntity claimPropertyFireEntityListData :claimPropertyFireEntityList ){
								if(claimPropertyFireEntityListData.getParentKey().equalsIgnoreCase(claimPropertyFireEntityListData.getChildKey())){
									if((claimPropertyFireEntityListData.getAction().equalsIgnoreCase("add")||claimPropertyFireEntityListData.getAction().equalsIgnoreCase("edit")) && claimPropertyFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPropertyFire claimPropertyFire=new ClaimPropertyFire(driver, "Claim Property MiscNonliability Page");
										claimPropertyFire.fillAndSubmitClaimPropertyDetails(claimPropertyFireEntityListData, assertReference);
									}
								}
							}
						}
						//Fire Reinstatement Premium Fire Page
						List<FireReinstatmntPremiumEntity>fireReinstatmntPremiumEntityList=testData.getData().get(FireReinstatmntPremiumEntity.class);
						for(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntityListData :fireReinstatmntPremiumEntityList ){
							if(fireReinstatmntPremiumEntityListData.getParentKey().equalsIgnoreCase(fireReinstatmntPremiumEntityListData.getChildKey())){
								if((fireReinstatmntPremiumEntityListData.getAction().equalsIgnoreCase("add")||fireReinstatmntPremiumEntityListData.getAction().equalsIgnoreCase("edit")) && fireReinstatmntPremiumEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									FireReinstatementPremiumFire fireReinstatementPremiumFire=new FireReinstatementPremiumFire(driver, "Fire Reinstatement Premium MiscNonliability Page");
									fireReinstatementPremiumFire.fillAndSubmitClaimPropertyDetails(fireReinstatmntPremiumEntityListData, assertReference);
									//Court Master For All Product Page	
									if(fireReinstatmntPremiumEntityListData.getBooleanValueForField("ConfigProceedButton")||fireReinstatmntPremiumEntityListData.getBooleanValueForField("ConfigNextPageForRM")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	// Mangesh - Claim Attribute Fire Verify Helper
	public void claimAttributesMiscNonliabilityVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Claim Property Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimPropertyFireEntity>claimPropertyFireEntityList=testData.getData().get(ClaimPropertyFireEntity.class);
							for(ClaimPropertyFireEntity claimPropertyFireEntityListData :claimPropertyFireEntityList ){
								if(claimPropertyFireEntityListData.getParentKey().equalsIgnoreCase(claimPropertyFireEntityListData.getChildKey())){
									if(claimPropertyFireEntityListData.getAction().equalsIgnoreCase("verify") && claimPropertyFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPropertyFire claimPropertyFire=new ClaimPropertyFire(driver, "Claim Property Fire Page");
										claimPropertyFire.fillAndSubmitClaimPropertyDetails(claimPropertyFireEntityListData, assertReference);
									}
								}
							}
						}
						//Fire Reinstatement Premium Fire Page
						List<FireReinstatmntPremiumEntity>fireReinstatmntPremiumEntityList=testData.getData().get(FireReinstatmntPremiumEntity.class);
						for(FireReinstatmntPremiumEntity fireReinstatmntPremiumEntityListData :fireReinstatmntPremiumEntityList ){
							if(fireReinstatmntPremiumEntityListData.getParentKey().equalsIgnoreCase(fireReinstatmntPremiumEntityListData.getChildKey())){
								if(fireReinstatmntPremiumEntityListData.getAction().equalsIgnoreCase("verify") && fireReinstatmntPremiumEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									FireReinstatementPremiumFire fireReinstatementPremiumFire=new FireReinstatementPremiumFire(driver, "Fire Reinstatement Premium Fire Page");
									fireReinstatementPremiumFire.fillAndSubmitClaimPropertyDetails(fireReinstatmntPremiumEntityListData, assertReference);
									//Court Master For All Product Page	
									if(fireReinstatmntPremiumEntityListData.getBooleanValueForField("ConfigProceedButton")||fireReinstatmntPremiumEntityListData.getBooleanValueForField("ConfigNextPageForRM")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if(claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify") && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}	

	//Sachin
	public void claimInsuredItemT4ClaimPropertyforITMisHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for IT Mis Helper </i></B>");
		List<T4ClaimPropMISEntity>T4ClaimPropMISEntityList=testData.getData().get(T4ClaimPropMISEntity.class);
		for(T4ClaimPropMISEntity T4ClaimPropMISEntityListData :T4ClaimPropMISEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(T4ClaimPropMISEntityListData.getChildKey())){
				if((T4ClaimPropMISEntityListData.getAction().equalsIgnoreCase("add")||T4ClaimPropMISEntityListData.getAction().equalsIgnoreCase("edit"))&& T4ClaimPropMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					T4ClaimPropertyForMIS tT4ClaimPropertyForMIS=new T4ClaimPropertyForMIS(driver, "T4 Claim Property for IT");
					tT4ClaimPropertyForMIS.fillandSubmitClaimMemberT1CLRAttibutesHealth(T4ClaimPropMISEntityListData, assertReference);
				}
			}
		}
	}

	//Sachin
	public void claimInsuredItemT4ClaimPropertyforITMisVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for IT Mis Verify Helper </i></B>");
		List<T4ClaimPropMISEntity>T4ClaimPropMISEntityList=testData.getData().get(T4ClaimPropMISEntity.class);
		for(T4ClaimPropMISEntity T4ClaimPropMISEntityListData :T4ClaimPropMISEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(T4ClaimPropMISEntityListData.getChildKey())){
				if((T4ClaimPropMISEntityListData.getAction().equalsIgnoreCase("verify"))&& T4ClaimPropMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					T4ClaimPropertyForMIS tT4ClaimPropertyForMIS=new T4ClaimPropertyForMIS(driver, "T4 Claim Property for IT");
					tT4ClaimPropertyForMIS.fillandSubmitClaimMemberT1CLRAttibutesHealth(T4ClaimPropMISEntityListData, assertReference);
				}
			}
		}
	}

	//CT
	public void t4ClaimPropLiab1CTMisEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for CT Mis Edit Helper </i></B>");
		List<T4ClaimPropLiab1MISEntity>t4ClaimPropLiab1MISEntityList=testData.getData().get(T4ClaimPropLiab1MISEntity.class);
		for(T4ClaimPropLiab1MISEntity t4ClaimPropForMISEntityListData :t4ClaimPropLiab1MISEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(t4ClaimPropForMISEntityListData.getChildKey())){
				if((t4ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("add")||t4ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("edit"))&& t4ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					T4ClaimPropertyForLiab1MIS tT4ClaimPropertyForLiab1MIS=new T4ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
					tT4ClaimPropertyForLiab1MIS.fillandSubmitT4ClaimPropertyForLiabMISLDetails(t4ClaimPropForMISEntityListData, assertReference);
				}
			}
		}
	}

	public void t4ClaimPropLiab1CTMisVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for CT Mis Verify Helper </i></B>");
		List<T4ClaimPropLiab1MISEntity>t4ClaimPropLiab1MISEntityList=testData.getData().get(T4ClaimPropLiab1MISEntity.class);
		for(T4ClaimPropLiab1MISEntity t4ClaimPropForMISEntityListData :t4ClaimPropLiab1MISEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(t4ClaimPropForMISEntityListData.getChildKey())){
				if((t4ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("verify")&& t4ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					T4ClaimPropertyForLiab1MIS tT4ClaimPropertyForLiab1MIS=new T4ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
					tT4ClaimPropertyForLiab1MIS.fillandSubmitT4ClaimPropertyForLiabMISLDetails(t4ClaimPropForMISEntityListData, assertReference);
				}
			}
		}
	}

	public void t5ClaimPropLiab1CTMisEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T5 Claim Property for CT Mis Edit Helper </i></B>");
		List<T5ClaimPropLiab1MISEntity>t5ClaimPropLiab1MISEntityList=testData.getData().get(T5ClaimPropLiab1MISEntity.class);
		for(T5ClaimPropLiab1MISEntity t5ClaimPropForMISEntityListData :t5ClaimPropLiab1MISEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(t5ClaimPropForMISEntityListData.getChildKey())){
				if((t5ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("add")||t5ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("edit"))&& t5ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					T5ClaimPropertyForLiab1MIS tT5ClaimPropertyForLiab1MIS=new T5ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
					tT5ClaimPropertyForLiab1MIS.fillandSubmitT5ClaimPropertyForLiabyForLiabMISLDetails(t5ClaimPropForMISEntityListData, assertReference);
				}
			}
		}
	}

	public void t5ClaimPropLiab1CTMisVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T5 Claim Property for CT Mis Verify Helper </i></B>");
		List<T5ClaimPropLiab1MISEntity>t5ClaimPropLiab1MISEntityList=testData.getData().get(T5ClaimPropLiab1MISEntity.class);
		for(T5ClaimPropLiab1MISEntity t5ClaimPropForMISEntityListData :t5ClaimPropLiab1MISEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(t5ClaimPropForMISEntityListData.getChildKey())){
				if((t5ClaimPropForMISEntityListData.getAction().equalsIgnoreCase("verify")&& t5ClaimPropForMISEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					T5ClaimPropertyForLiab1MIS tT5ClaimPropertyForLiab1MIS=new T5ClaimPropertyForLiab1MIS(driver, "CD Claim Risk Details 2");
					tT5ClaimPropertyForLiab1MIS.fillandSubmitT5ClaimPropertyForLiabyForLiabMISLDetails(t5ClaimPropForMISEntityListData, assertReference);
				}
			}
		}
	}

	//LP
	public void specialfieldClaimFireEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for CT Mis Edit Helper </i></B>");
		List<ClaimSpeFeildFireEntity>claimSpeFeildFireEntityList=testData.getData().get(ClaimSpeFeildFireEntity.class);
		for(ClaimSpeFeildFireEntity claimSpeFeildFireEntityListData :claimSpeFeildFireEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimSpeFeildFireEntityListData.getChildKey())){
				if((claimSpeFeildFireEntityListData.getAction().equalsIgnoreCase("add")||claimSpeFeildFireEntityListData.getAction().equalsIgnoreCase("edit"))&& claimSpeFeildFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimSpecialFeildsFire claimSpecialFeildsFire=new ClaimSpecialFeildsFire(driver, "Claim Risk Details Fire");
					claimSpecialFeildsFire.fillandSubmitCliamSpecialFeildsFireDetails(claimSpeFeildFireEntityListData, assertReference);
				}
			}
		}
	}

	public void specialfieldClaimFireVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for CT Mis Verify Helper </i></B>");
		List<ClaimSpeFeildFireEntity>claimSpeFeildFireEntityList=testData.getData().get(ClaimSpeFeildFireEntity.class);
		for(ClaimSpeFeildFireEntity claimSpeFeildFireEntityListData :claimSpeFeildFireEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimSpeFeildFireEntityListData.getChildKey())){
				if((claimSpeFeildFireEntityListData.getAction().equalsIgnoreCase("verify")&& claimSpeFeildFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					ClaimSpecialFeildsFire claimSpecialFeildsFire=new ClaimSpecialFeildsFire(driver, "Claim Risk Details Fire");
					claimSpecialFeildsFire.fillandSubmitCliamSpecialFeildsFireDetails(claimSpeFeildFireEntityListData, assertReference);
				}
			}
		}
	}

	public void interruptionPeriodFireEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for CT Mis Edit Helper </i></B>");
		List<InterPeriodInDaysEntity>interPeriodInDaysEntityList=testData.getData().get(InterPeriodInDaysEntity.class);
		for(InterPeriodInDaysEntity interPeriodInDaysEntityListData :interPeriodInDaysEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(interPeriodInDaysEntityListData.getChildKey())){
				if((interPeriodInDaysEntityListData.getAction().equalsIgnoreCase("add")||interPeriodInDaysEntityListData.getAction().equalsIgnoreCase("edit"))&& interPeriodInDaysEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInterruptionPeriodInDays claimInterruptionPeriodInDays=new ClaimInterruptionPeriodInDays(driver, "Claim Risk Details Fire");
					claimInterruptionPeriodInDays.fillandSubmitClaimInterruptionPeriodInDaysDetails(interPeriodInDaysEntityListData, assertReference);
				}
			}
		}
	}

	public void interruptionPeriodFireVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Insured Item T4 Claim Property for CT Mis Verify Helper </i></B>");
		List<InterPeriodInDaysEntity>interPeriodInDaysEntityList=testData.getData().get(InterPeriodInDaysEntity.class);
		for(InterPeriodInDaysEntity interPeriodInDaysEntityListData :interPeriodInDaysEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(interPeriodInDaysEntityListData.getChildKey())){
				if((interPeriodInDaysEntityListData.getAction().equalsIgnoreCase("verify")&& interPeriodInDaysEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					ClaimInterruptionPeriodInDays claimInterruptionPeriodInDays=new ClaimInterruptionPeriodInDays(driver, "Claim Risk Details Fire");
					claimInterruptionPeriodInDays.fillandSubmitClaimInterruptionPeriodInDaysDetails(interPeriodInDaysEntityListData, assertReference);
				}
			}
		}
	}

	public void claimLossFireEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Loss fire Edit Helper </i></B>");
		List<ClaimLossFireEntity>claimLossFireEntityList=testData.getData().get(ClaimLossFireEntity.class);
		for(ClaimLossFireEntity claimLossFireEntityListData :claimLossFireEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimLossFireEntityListData.getChildKey())){
				if((claimLossFireEntityListData.getAction().equalsIgnoreCase("add")||claimLossFireEntityListData.getAction().equalsIgnoreCase("edit"))&& claimLossFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimLossFire claimLossFire=new ClaimLossFire(driver, "Claim Risk Details Fire");
					claimLossFire.fillandSubmitClaimMemberT1CLRAttibutesHealth(claimLossFireEntityListData, assertReference);
				}
			}
		}
	}

	public void claimLossFireVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Loss fire Verify Helper </i></B>");
		List<ClaimLossFireEntity>claimLossFireEntityList=testData.getData().get(ClaimLossFireEntity.class);
		for(ClaimLossFireEntity claimLossFireEntityListData :claimLossFireEntityList ){	
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimLossFireEntityListData.getChildKey())){
				if((claimLossFireEntityListData.getAction().equalsIgnoreCase("verify") && claimLossFireEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					ClaimLossFire claimLossFire=new ClaimLossFire(driver, "Claim Risk Details Fire");
					claimLossFire.fillandSubmitClaimMemberT1CLRAttibutesHealth(claimLossFireEntityListData, assertReference);
				}
			}
		}
	}
	//Abhijit Micro Insurance Edit Helper


	public void claimInsuredItemMicroInsuranceEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Micro Insurance Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/******************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<PreClaimHistCartRuralEntity>preClaimHistCartRuralEntityList=testData.getData().get(PreClaimHistCartRuralEntity.class);
													for(PreClaimHistCartRuralEntity preClaimHistCartRuralEntityListData :preClaimHistCartRuralEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(preClaimHistCartRuralEntityListData.getChildKey())){
															if((preClaimHistCartRuralEntityListData.getAction().equalsIgnoreCase("add")||preClaimHistCartRuralEntityListData.getAction().equalsIgnoreCase("edit"))&& preClaimHistCartRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PreviousClaimHistforCartRural previousClaimHistforCartRural=new PreviousClaimHistforCartRural(driver, "Previous Claim History Rural Page");
																previousClaimHistforCartRural.fillandSubmitPreviousClaimHistoryRural(preClaimHistCartRuralEntityListData, assertReference);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	//Abhijit Micro Insurance Claim Parties Edit Helper


	public void claimPartiesMicroInsuranceEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Micro Insurance Edit Helper</i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}
		}
	}



	// Abhijit Claims Attribute Edit Helper

	public void claimAttributesMicroInsuranceEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimChrgSubLimitREntity>claimChrgSubLimitREntityList=testData.getData().get(ClaimChrgSubLimitREntity.class);
						for(ClaimChrgSubLimitREntity claimChrgSubLimitREntityListData :claimChrgSubLimitREntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimChrgSubLimitREntityListData.getChildKey())){
								if((claimChrgSubLimitREntityListData.getAction().equalsIgnoreCase("add")||claimChrgSubLimitREntityListData.getAction().equalsIgnoreCase("edit")) && claimChrgSubLimitREntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimChargesSubLimitsRural claimChargesSubLimitsRural=new ClaimChargesSubLimitsRural(driver, "Claim Charges Sub Limits Rural Page");
									claimChargesSubLimitsRural.fillandSubmitClaimChargesSubLimitsRural(claimChrgSubLimitREntityListData, assertReference);
									if(claimChrgSubLimitREntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


	public void claimInsuredItemMicroInsuranceVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Micro Insurance Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/******************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<PreClaimHistCartRuralEntity>preClaimHistCartRuralEntityList=testData.getData().get(PreClaimHistCartRuralEntity.class);
													for(PreClaimHistCartRuralEntity preClaimHistCartRuralEntityListData :preClaimHistCartRuralEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(preClaimHistCartRuralEntityListData.getChildKey())){
															if(preClaimHistCartRuralEntityListData.getAction().equalsIgnoreCase("verify")&& preClaimHistCartRuralEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																PreviousClaimHistforCartRural previousClaimHistforCartRural=new PreviousClaimHistforCartRural(driver, "Previous Claim History Rural Page");
																previousClaimHistforCartRural.fillandSubmitPreviousClaimHistoryRural(preClaimHistCartRuralEntityListData, assertReference);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//Abhijit
	public void claimPartiesMicroInsuranceVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);
								claimPartiesClaimPartyFinancialSummary.fillClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);
							}
						}
					}
				}
			}
		}
	}


	//Abhijit


	public void claimAttributesMicroInsuranceVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if(claimAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						List<ClaimChrgSubLimitREntity>claimChrgSubLimitREntityList=testData.getData().get(ClaimChrgSubLimitREntity.class);
						for(ClaimChrgSubLimitREntity claimChrgSubLimitREntityListData :claimChrgSubLimitREntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimChrgSubLimitREntityListData.getChildKey())){
								if(claimChrgSubLimitREntityListData.getAction().equalsIgnoreCase("verify")&& claimChrgSubLimitREntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimChargesSubLimitsRural claimChargesSubLimitsRural=new ClaimChargesSubLimitsRural(driver, "Claim Charges Sub Limits Rural Page");
									claimChargesSubLimitsRural.fillandSubmitClaimChargesSubLimitsRural(claimChrgSubLimitREntityListData, assertReference);
									if(claimChrgSubLimitREntityListData.getBooleanValueForField("ConfigForwardButton")){
										List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
										for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
												if(claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify") && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
													claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//Insutred Interest Engineering Helper
	public void claimInsuredItemEngineeringEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Engineering Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimDetailsEngEntity>claimDetailsEngEntityList=testData.getData().get(ClaimDetailsEngEntity.class);
													for(ClaimDetailsEngEntity claimDetailsEngEntityListData :claimDetailsEngEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDetailsEngEntityListData.getChildKey())){
															if((claimDetailsEngEntityListData.getAction().equalsIgnoreCase("add")||claimDetailsEngEntityListData.getAction().equalsIgnoreCase("edit"))&& claimDetailsEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimDetailsEngineering claimDetailsEngineering=new ClaimDetailsEngineering(driver, "Claim Details Engineering Page", 0);
																claimDetailsEngineering.fillandSubmitClaimDetailsEngineering(claimDetailsEngEntityListData, assertReference);
																if(claimDetailsEngEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	//Claim Excess Page
																	List<ClaimExcessEngEntity>claimExcessEngEntityList=testData.getData().get(ClaimExcessEngEntity.class);
																	for(ClaimExcessEngEntity claimExcessEngEntityListData :claimExcessEngEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimExcessEngEntityListData.getChildKey())){
																			if((claimExcessEngEntityListData.getAction().equalsIgnoreCase("add")||claimExcessEngEntityListData.getAction().equalsIgnoreCase("edit"))&& claimExcessEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimExcessEngineering claimExcessEngineering=new ClaimExcessEngineering(driver, "Claim Excess Details Engineering Page", 0);
																				claimExcessEngineering.fillandSubmitClaimExcessEngineering(claimExcessEngEntityListData, assertReference);
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	//Insutred Interest Engineering Helper
	public void claimInsuredItemEngineeringVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Engineering Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimDetailsEngEntity>claimDetailsEngEntityList=testData.getData().get(ClaimDetailsEngEntity.class);
													for(ClaimDetailsEngEntity claimDetailsEngEntityListData :claimDetailsEngEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDetailsEngEntityListData.getChildKey())){
															if((claimDetailsEngEntityListData.getAction().equalsIgnoreCase("verify"))&& claimDetailsEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimDetailsEngineering claimDetailsEngineering=new ClaimDetailsEngineering(driver, "Claim Details Engineering Page", 0);
																claimDetailsEngineering.fillandSubmitClaimDetailsEngineering(claimDetailsEngEntityListData, assertReference);
																if(claimDetailsEngEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	//Claim Excess Page
																	List<ClaimExcessEngEntity>claimExcessEngEntityList=testData.getData().get(ClaimExcessEngEntity.class);
																	for(ClaimExcessEngEntity claimExcessEngEntityListData :claimExcessEngEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimExcessEngEntityListData.getChildKey())){
																			if((claimExcessEngEntityListData.getAction().equalsIgnoreCase("verify"))&& claimExcessEngEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimExcessEngineering claimExcessEngineering=new ClaimExcessEngineering(driver, "Claim Excess Details Engineering Page", 0);
																				claimExcessEngineering.fillandSubmitClaimExcessEngineering(claimExcessEngEntityListData, assertReference);
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	// Rasika - Claim Attribute Engineering Edit Helper
	public void claimAttributesEngineeringEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Other Details of Claim Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimAttrOtherDetailsEntity>claimAttrOtherDetailsEntityList=testData.getData().get(ClaimAttrOtherDetailsEntity.class);
							for(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntityListData :claimAttrOtherDetailsEntityList ){
								if(claimAttrOtherDetailsEntityListData.getParentKey().equalsIgnoreCase(claimAttrOtherDetailsEntityListData.getChildKey())){
									if((claimAttrOtherDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimAttrOtherDetailsEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttrOtherDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimAttributeOtherDetailsOfClaimEngineering claimAttributeOtherDetailsOfClaimEngineering=new ClaimAttributeOtherDetailsOfClaimEngineering(driver, "Claim Other Property Engineering Page");
										claimAttributeOtherDetailsOfClaimEngineering.fillAndSubmitClaimAttributeOtherDetails(claimAttrOtherDetailsEntityListData, assertReference);	
									}
								}
							}
						}
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigCourtMasterForAllProduct")){
							List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
							for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
								if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
									if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("add")||claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
										claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	// Rasika - Claim Attribute Engineering Verify Helper
	public void claimAttributesEngineeringVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("verify")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
						// Other Details of Claim Page
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigClaimProperty")){
							List<ClaimAttrOtherDetailsEntity>claimAttrOtherDetailsEntityList=testData.getData().get(ClaimAttrOtherDetailsEntity.class);
							for(ClaimAttrOtherDetailsEntity claimAttrOtherDetailsEntityListData :claimAttrOtherDetailsEntityList ){
								if(claimAttrOtherDetailsEntityListData.getParentKey().equalsIgnoreCase(claimAttrOtherDetailsEntityListData.getChildKey())){
									if((claimAttrOtherDetailsEntityListData.getAction().equalsIgnoreCase("verify")) && claimAttrOtherDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimAttributeOtherDetailsOfClaimEngineering claimAttributeOtherDetailsOfClaimEngineering=new ClaimAttributeOtherDetailsOfClaimEngineering(driver, "Claim Other Property Engineering Page");
										claimAttributeOtherDetailsOfClaimEngineering.fillAndSubmitClaimAttributeOtherDetails(claimAttrOtherDetailsEntityListData, assertReference);	
									}
								}
							}
						}
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigCourtMasterForAllProduct")){
							List<ClaimAttriCourtMasterEntity>claimAttriCourtMasterEntityList=testData.getData().get(ClaimAttriCourtMasterEntity.class);
							for(ClaimAttriCourtMasterEntity claimAttriCourtMasterEntityListData :claimAttriCourtMasterEntityList ){
								if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttriCourtMasterEntityListData.getChildKey())){
									if((claimAttriCourtMasterEntityListData.getAction().equalsIgnoreCase("verify")) && claimAttriCourtMasterEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimAttributesProceedCourtMasterForAllProductPage claimAttributesProceedCourtMasterForAllProductPage= new ClaimAttributesProceedCourtMasterForAllProductPage(driver, "Claim Attributes Proceed Court Master For All Product Page");
										claimAttributesProceedCourtMasterForAllProductPage.fillAndSubmitCourtMasterForAllProductDetails(claimAttriCourtMasterEntityListData, assertReference);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void claimLitigationVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Litigation </i></B>");
		List<ClaimLitigationEntity> claimLitigationEntityList=testData.getData().get(ClaimLitigationEntity.class);
		for(ClaimLitigationEntity claimLitigationEntityListdata:claimLitigationEntityList){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimLitigationEntityListdata.getChildKey())){
				if(claimLitigationEntityListdata.getAction().equalsIgnoreCase("verify")){
					ClaimAddClaimLitigationDetailsPage claimAddClaimLitigationDetailsPage=new ClaimAddClaimLitigationDetailsPage(driver, "Claim Litigation page");
					claimAddClaimLitigationDetailsPage.selectSerialNo(claimLitigationEntityListdata);
					claimAddClaimLitigationDetailsPage.fillAndSubmitClaimLitigationDetails(claimLitigationEntityListdata, assertReference, testData);
					testData.updateRecordsForCriteria(claimLitigationEntityListdata);
				}
			}
		}
	}

	//Akshata

	private void setClaimSerialNoandPetitionNoDependancy(ClaimLitigationEntity claimLitigationEntity,TestData testData){
		if(claimLitigationEntity.getStringValueForField("DependencyForLitigationSerial")!=null){
			ArrayList<ClaimLitigationEntity> claimLitigationEntityList =testData.getObjectByReference(testData.getData().get(ClaimLitigationEntity.class), claimLitigationEntity.getStringValueForField("DependencyForLitigationSerial"));
			for (ClaimLitigationEntity claimLitigationEntityData : claimLitigationEntityList) {
				claimLitigationEntityData.setStringValueForField("SerialNo", claimLitigationEntity.getStringValueForField("SerialNo"));
				claimLitigationEntityData.setStringValueForField("PetitionNumber", claimLitigationEntity.getStringValueForField("PetitionNumber"));
				testData.updateRecordsForCriteria(claimLitigationEntityData);
			}
		}
	}



	public void claimInsuredItemMiscNonLiabilityEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim MiscNonLiability Insured Item Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage MiscNonLiability Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage MiscNonLiability Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property MiscNonLiability Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimMNT1CLRMNLEntity>claimMNT1CLRMNLEntityList=testData.getData().get(ClaimMNT1CLRMNLEntity.class);
													for(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntityListData :claimMNT1CLRMNLEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMNT1CLRMNLEntityListData.getChildKey())){
															if((claimMNT1CLRMNLEntityListData.getAction().equalsIgnoreCase("add")||claimMNT1CLRMNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMNT1CLRMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimMiscNonT1CLRForMiscNonLiability claimMiscNonT1CLRForMiscNonLiability=new ClaimMiscNonT1CLRForMiscNonLiability(driver, "Misc Non T1-CLR  Page");
																claimMiscNonT1CLRForMiscNonLiability.fillandSubmitClaimMiscNonT1CLRForMiscNonLiabilityDetails(claimMNT1CLRMNLEntityListData, assertReference);
																if(claimMNT1CLRMNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProp2MNLEntity>claimRiskProp2MNLEntityList=testData.getData().get(ClaimRiskProp2MNLEntity.class);
																	for(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntityListData :claimRiskProp2MNLEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp2MNLEntityListData.getChildKey())){
																			if((claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskProperty2ForMiscNonLiability claimRiskProperty2ForMiscNonLiability=new ClaimRiskProperty2ForMiscNonLiability(driver, "Claim Risk Property 2 Page");
																				claimRiskProperty2ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp2MNLEntityListData, assertReference);
																				if(claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																					List<ClaimRiskProp3MNLEntity>claimRiskProp3MNLEntityList=testData.getData().get(ClaimRiskProp3MNLEntity.class);
																					for(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntityListData :claimRiskProp3MNLEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp3MNLEntityListData.getChildKey())){
																							if((claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp3MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskProperty3ForMiscNonLiability claimRiskProperty3ForMiscNonLiability=new ClaimRiskProperty3ForMiscNonLiability(driver, "Claim Risk Property 3 Page ");
																								claimRiskProperty3ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp3MNLEntityListData, assertReference);
																								if(claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																									List<ComClaimRiskPropMNLEntity>comClaimRiskPropMNLEntityList=testData.getData().get(ComClaimRiskPropMNLEntity.class);
																									for(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntityListData :comClaimRiskPropMNLEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(comClaimRiskPropMNLEntityListData.getChildKey())){
																											if((comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("add")||comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClaimRiskPropMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												ClaimCommonClaimRiskPropertyForMiscNonLiability claimCommonClaimRiskPropertyForMiscNonLiability=new ClaimCommonClaimRiskPropertyForMiscNonLiability(driver, "Claim Risk Property 4 Page ");
																												claimCommonClaimRiskPropertyForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntityListData, assertReference);
																												if(comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																													List<ComClRiskProp2MNLEntity>comClRiskProp2MNLEntityList=testData.getData().get(ComClRiskProp2MNLEntity.class);
																													for(ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData :comClRiskProp2MNLEntityList ){
																														if(claimEntityListData.getParentKey().equalsIgnoreCase(comClRiskProp2MNLEntityListData.getChildKey())){
																															if((comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("add")||comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																CommonClaimRiskProperty2ForMiscNL commonClaimRiskProperty2ForMiscNL=new CommonClaimRiskProperty2ForMiscNL(driver, "Claim Risk Property 4 Page ");
																																commonClaimRiskProperty2ForMiscNL.fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRiskProp2MNLEntityListData, assertReference);
																															}
																														}
																													}
																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}




	public void claimInsuredItemMiscNonLiabilityVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim MiscNonLiability Insured Item Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage MiscNonLiability Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage MiscNonLiability Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey()))
										{
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))
											{
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property MiscNonLiability Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimMNT1CLRMNLEntity>claimMNT1CLRMNLEntityList=testData.getData().get(ClaimMNT1CLRMNLEntity.class);
													for(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntityListData :claimMNT1CLRMNLEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMNT1CLRMNLEntityListData.getChildKey())){
															if(claimMNT1CLRMNLEntityListData.getAction().equalsIgnoreCase("verify")&& claimMNT1CLRMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimMiscNonT1CLRForMiscNonLiability claimMiscNonT1CLRForMiscNonLiability=new ClaimMiscNonT1CLRForMiscNonLiability(driver, "Misc Non T1-CLR  Page");
																claimMiscNonT1CLRForMiscNonLiability.fillandSubmitClaimMiscNonT1CLRForMiscNonLiabilityDetails(claimMNT1CLRMNLEntityListData, assertReference);
																if(claimMNT1CLRMNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProp2MNLEntity>claimRiskProp2MNLEntityList=testData.getData().get(ClaimRiskProp2MNLEntity.class);
																	for(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntityListData :claimRiskProp2MNLEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp2MNLEntityListData.getChildKey())){
																			if(claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("verify")&& claimRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskProperty2ForMiscNonLiability claimRiskProperty2ForMiscNonLiability=new ClaimRiskProperty2ForMiscNonLiability(driver, "Claim Risk Property 2 Page");
																				claimRiskProperty2ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp2MNLEntityListData, assertReference);
																				if(claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																					List<ClaimRiskProp3MNLEntity>claimRiskProp3MNLEntityList=testData.getData().get(ClaimRiskProp3MNLEntity.class);
																					for(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntityListData :claimRiskProp3MNLEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp3MNLEntityListData.getChildKey())){
																							if(claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("verify")&& claimRiskProp3MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskProperty3ForMiscNonLiability claimRiskProperty3ForMiscNonLiability=new ClaimRiskProperty3ForMiscNonLiability(driver, "Claim Risk Property 3 Page ");
																								claimRiskProperty3ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp3MNLEntityListData, assertReference);
																								if(claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																									List<ComClaimRiskPropMNLEntity>comClaimRiskPropMNLEntityList=testData.getData().get(ComClaimRiskPropMNLEntity.class);
																									for(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntityListData :comClaimRiskPropMNLEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(comClaimRiskPropMNLEntityListData.getChildKey())){
																											if(comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("verify")&& comClaimRiskPropMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												ClaimCommonClaimRiskPropertyForMiscNonLiability claimCommonClaimRiskPropertyForMiscNonLiability=new ClaimCommonClaimRiskPropertyForMiscNonLiability(driver, "Claim Risk Property 4 Page ");
																												claimCommonClaimRiskPropertyForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntityListData, assertReference);
																												if(comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																													List<ComClRiskProp2MNLEntity>comClRiskProp2MNLEntityList=testData.getData().get(ComClRiskProp2MNLEntity.class);
																													for(ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData :comClRiskProp2MNLEntityList ){
																														if(claimEntityListData.getParentKey().equalsIgnoreCase(comClRiskProp2MNLEntityListData.getChildKey())){
																															if(comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("verify") && comClRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																CommonClaimRiskProperty2ForMiscNL commonClaimRiskProperty2ForMiscNL=new CommonClaimRiskProperty2ForMiscNL(driver, "Claim Risk Property 4 Page ");
																																commonClaimRiskProperty2ForMiscNL.fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRiskProp2MNLEntityListData, assertReference);
																															}
																														}
																													}
																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	public void claimPartiesMiscNonLiabilityEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim MiscNonLiability Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}
		}
	}
	public void claimPartiesMiscNonLiabilityVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim MiscNonLiability Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}
	public void claimInsuredItemAviationEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Avation Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskProT1CLRAviEntity>claimRiskProAviationEntityList=testData.getData().get(ClaimRiskProT1CLRAviEntity.class);
													for(ClaimRiskProT1CLRAviEntity claimRiskProAviationEntityListData :claimRiskProAviationEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProAviationEntityListData.getChildKey())){
															if((claimRiskProAviationEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProAviationEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProAviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskPropertyT1CLRAviation claimRiskPropertyAviation=new ClaimRiskPropertyT1CLRAviation(driver, "Claim Risk properties Aviation T1 Page");
																claimRiskPropertyAviation.fillandSubmitClaimRiskPropertyT1CLRAviation(claimRiskProAviationEntityListData, assertReference);
																if(claimRiskProAviationEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProT2CLRAviEntity>claimRiskProT2AviationEntityList=testData.getData().get(ClaimRiskProT2CLRAviEntity.class);
																	for(ClaimRiskProT2CLRAviEntity claimRiskProT2AviationEntityListData :claimRiskProT2AviationEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProT2AviationEntityListData.getChildKey())){
																			if((claimRiskProT2AviationEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProT2AviationEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProT2AviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskPropertyT2CLRAviation claimRiskPropertyT2CLRAviation=new ClaimRiskPropertyT2CLRAviation(driver, "Claim Risk properties Aviation T2 Page");
																				claimRiskPropertyT2CLRAviation.fillandSubmitClaimRiskPropertyT2CLRAviation(claimRiskProT2AviationEntityListData, assertReference);
																				if(claimRiskProT2AviationEntityListData.getBooleanValueForField("ConfigNextArrowButton")){
																					List<ClaimRiskProT3CLRAviEntity>claimRiskProT3AviationEntityList=testData.getData().get(ClaimRiskProT3CLRAviEntity.class);
																					for(ClaimRiskProT3CLRAviEntity claimRiskProT3AviationEntityListData :claimRiskProT3AviationEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProT3AviationEntityListData.getChildKey())){
																							if((claimRiskProT3AviationEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProT3AviationEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProT3AviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskPropertyT3CLRAviation claimRiskPropertyT3CLRAviation=new ClaimRiskPropertyT3CLRAviation(driver, "Claim Risk properties Aviation T3 Page");
																								claimRiskPropertyT3CLRAviation.fillandSubmitClaimMemberT3CLRAttibutes(claimRiskProT3AviationEntityListData, assertReference);

																							}
																							//Interruption period in days Page
																						}
																					}
																				}

																			}
																			//Interruption period in days Page
																		}

																	}
																	//Interruption period in days Page
																}
															}
														}


													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void claimInsuredItemAviationVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Avation Member Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage Rural Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify") && claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup))){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage Rural Page");

								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);
								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify") && claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property Rural Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

													List<ClaimRiskProT1CLRAviEntity>claimRiskProAviationEntityList=testData.getData().get(ClaimRiskProT1CLRAviEntity.class);
													for(ClaimRiskProT1CLRAviEntity claimRiskProAviationEntityListData :claimRiskProAviationEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProAviationEntityListData.getChildKey())){
															if((claimRiskProAviationEntityListData.getAction().equalsIgnoreCase("verify") && claimRiskProAviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																ClaimRiskPropertyT1CLRAviation claimRiskPropertyAviation=new ClaimRiskPropertyT1CLRAviation(driver, "Claim Risk properties Aviation T1 Page");
																claimRiskPropertyAviation.fillandSubmitClaimRiskPropertyT1CLRAviation(claimRiskProAviationEntityListData, assertReference);
																if(claimRiskProAviationEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProT2CLRAviEntity>claimRiskProT2AviationEntityList=testData.getData().get(ClaimRiskProT2CLRAviEntity.class);
																	for(ClaimRiskProT2CLRAviEntity claimRiskProT2AviationEntityListData :claimRiskProT2AviationEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProT2AviationEntityListData.getChildKey())){
																			if((claimRiskProT2AviationEntityListData.getAction().equalsIgnoreCase("verify") && claimRiskProT2AviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																				ClaimRiskPropertyT2CLRAviation claimRiskPropertyT2CLRAviation=new ClaimRiskPropertyT2CLRAviation(driver, "Claim Risk properties Aviation T2 Page");
																				claimRiskPropertyT2CLRAviation.fillandSubmitClaimRiskPropertyT2CLRAviation(claimRiskProT2AviationEntityListData, assertReference);
																				if(claimRiskProT2AviationEntityListData.getBooleanValueForField("ConfigNextArrowButton")){
																					List<ClaimRiskProT3CLRAviEntity>claimRiskProT3AviationEntityList=testData.getData().get(ClaimRiskProT3CLRAviEntity.class);
																					for(ClaimRiskProT3CLRAviEntity claimRiskProT3AviationEntityListData :claimRiskProT3AviationEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProT3AviationEntityListData.getChildKey())){
																							if((claimRiskProT3AviationEntityListData.getAction().equalsIgnoreCase("verify") && claimRiskProT3AviationEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))){
																								ClaimRiskPropertyT3CLRAviation claimRiskPropertyT3CLRAviation=new ClaimRiskPropertyT3CLRAviation(driver, "Claim Risk properties Aviation T3 Page");
																								claimRiskPropertyT3CLRAviation.fillandSubmitClaimMemberT3CLRAttibutes(claimRiskProT3AviationEntityListData, assertReference);

																							}
																							//Interruption period in days Page
																						}
																					}
																				}

																			}
																			//Interruption period in days Page
																		}

																	}
																	//Interruption period in days Page
																}
															}
														}


													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void claimInsuredItemMarineHullEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Marine Hull Insured Item Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage MiscNonLiability Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage MiscNonLiability Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property MiscNonLiability Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimMNT1CLRMNLEntity>claimMNT1CLRMNLEntityList=testData.getData().get(ClaimMNT1CLRMNLEntity.class);
													for(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntityListData :claimMNT1CLRMNLEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMNT1CLRMNLEntityListData.getChildKey())){
															if((claimMNT1CLRMNLEntityListData.getAction().equalsIgnoreCase("add")||claimMNT1CLRMNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMNT1CLRMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimMiscNonT1CLRForMiscNonLiability claimMiscNonT1CLRForMiscNonLiability=new ClaimMiscNonT1CLRForMiscNonLiability(driver, "Misc Non T1-CLR  Page");
																claimMiscNonT1CLRForMiscNonLiability.fillandSubmitClaimMiscNonT1CLRForMiscNonLiabilityDetails(claimMNT1CLRMNLEntityListData, assertReference);
																if(claimMNT1CLRMNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProp2MNLEntity>claimRiskProp2MNLEntityList=testData.getData().get(ClaimRiskProp2MNLEntity.class);
																	for(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntityListData :claimRiskProp2MNLEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp2MNLEntityListData.getChildKey())){
																			if((claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskProperty2ForMiscNonLiability claimRiskProperty2ForMiscNonLiability=new ClaimRiskProperty2ForMiscNonLiability(driver, "Claim Risk Property 2 Page");
																				claimRiskProperty2ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp2MNLEntityListData, assertReference);
																				if(claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																					List<ClaimRiskProp3MNLEntity>claimRiskProp3MNLEntityList=testData.getData().get(ClaimRiskProp3MNLEntity.class);
																					for(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntityListData :claimRiskProp3MNLEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp3MNLEntityListData.getChildKey())){
																							if((claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp3MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskProperty3ForMiscNonLiability claimRiskProperty3ForMiscNonLiability=new ClaimRiskProperty3ForMiscNonLiability(driver, "Claim Risk Property 3 Page ");
																								claimRiskProperty3ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp3MNLEntityListData, assertReference);
																								if(claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																									List<ComClaimRiskPropMNLEntity>comClaimRiskPropMNLEntityList=testData.getData().get(ComClaimRiskPropMNLEntity.class);
																									for(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntityListData :comClaimRiskPropMNLEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(comClaimRiskPropMNLEntityListData.getChildKey())){
																											if((comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("add")||comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClaimRiskPropMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												ClaimCommonClaimRiskPropertyForMiscNonLiability claimCommonClaimRiskPropertyForMiscNonLiability=new ClaimCommonClaimRiskPropertyForMiscNonLiability(driver, "Claim Risk Property 4 Page ");
																												claimCommonClaimRiskPropertyForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntityListData, assertReference);
																												if(comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																													List<ComClRiskProp2MNLEntity>comClRiskProp2MNLEntityList=testData.getData().get(ComClRiskProp2MNLEntity.class);
																													for(ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData :comClRiskProp2MNLEntityList ){
																														if(claimEntityListData.getParentKey().equalsIgnoreCase(comClRiskProp2MNLEntityListData.getChildKey())){
																															if((comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("add")||comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																CommonClaimRiskProperty2ForMiscNL commonClaimRiskProperty2ForMiscNL=new CommonClaimRiskProperty2ForMiscNL(driver, "Claim Risk Property 4 Page ");
																																commonClaimRiskProperty2ForMiscNL.fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRiskProp2MNLEntityListData, assertReference);
																															}
																														}
																													}
																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void claimPartiesMarineHullEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		{

			FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
			List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
			for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
				if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
					if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
						claimPartiesClaimAssociatedParties.navigatePartiesTitle();
						claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
						if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
							List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
							for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
								if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
									if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
										claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
										if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
											List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
											for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
												if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
													if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
														ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
														claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}







	public void claimReserveMarineHullEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Reserve Helper </i></B>");
		int rowcount=0;
		List<ClaimReservePageEntity>claimReservePageEntityList=testData.getData().get(ClaimReservePageEntity.class);
		for(ClaimReservePageEntity claimReservePageEntityListData :claimReservePageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimReservePageEntityListData.getChildKey())){
				if((claimReservePageEntityListData.getAction().equalsIgnoreCase("add")||claimReservePageEntityListData.getAction().equalsIgnoreCase("edit"))&& claimReservePageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimReserveSummaryPage claimReserveSummaryPage=new ClaimReserveSummaryPage(driver, "Claim Reserve",rowcount);
					claimReserveSummaryPage.fillAndSubmitClaimReserveSummaryDetails(claimReservePageEntityListData, assertReference);
					claimReserveSummaryPage.createNewReservePage(claimReservePageEntityListData);
					if(claimReservePageEntityListData.getBooleanValueForField("ConfigNewButton")){
						ClaimReservePage claimReservePage=new ClaimReservePage(driver, "Claim Reserve Details");
						claimReservePage.fillandSubmitClaimReserveDetails(claimReservePageEntityListData, assertReference);		
					}
				}
			}
		}
	}
	public void claimAttributesMarineHullEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		{
			FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
			List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
			for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
				if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
					if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
						ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
						claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
						if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

							List<ClaimPolPropertyTCLMEntity>claimPolPropertyTCLMEntityList=testData.getData().get(ClaimPolPropertyTCLMEntity.class);
							for(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntityListData :claimPolPropertyTCLMEntityList ){
								if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPolPropertyTCLMEntityListData.getChildKey())){
									if((claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("add")||claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("edit")) && claimPolPropertyTCLMEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										ClaimAttrPolicyPropertyT1CLMPage claimAttrPolicyPropertyT1CLMPage=new ClaimAttrPolicyPropertyT1CLMPage(driver, "Claim Policy Property T1CLM Page");
										claimAttrPolicyPropertyT1CLMPage.fillAndSubmitCourtMasterForAllProductDetails(claimPolPropertyTCLMEntityListData, assertReference);

									}
								}
							}
						}
					}
				}
			}		
		}
	}
	public void claimInsuredItemMarineHullVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim MiscNonLiability Insured Item Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage MiscNonLiability Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage MiscNonLiability Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey()))
										{
											if(claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup))
											{
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property MiscNonLiability Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<ClaimMNT1CLRMNLEntity>claimMNT1CLRMNLEntityList=testData.getData().get(ClaimMNT1CLRMNLEntity.class);
													for(ClaimMNT1CLRMNLEntity claimMNT1CLRMNLEntityListData :claimMNT1CLRMNLEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMNT1CLRMNLEntityListData.getChildKey())){
															if(claimMNT1CLRMNLEntityListData.getAction().equalsIgnoreCase("verify")&& claimMNT1CLRMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimMiscNonT1CLRForMiscNonLiability claimMiscNonT1CLRForMiscNonLiability=new ClaimMiscNonT1CLRForMiscNonLiability(driver, "Misc Non T1-CLR  Page");
																claimMiscNonT1CLRForMiscNonLiability.fillandSubmitClaimMiscNonT1CLRForMiscNonLiabilityDetails(claimMNT1CLRMNLEntityListData, assertReference);
																if(claimMNT1CLRMNLEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProp2MNLEntity>claimRiskProp2MNLEntityList=testData.getData().get(ClaimRiskProp2MNLEntity.class);
																	for(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntityListData :claimRiskProp2MNLEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp2MNLEntityListData.getChildKey())){
																			if(claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("verify")&& claimRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskProperty2ForMiscNonLiability claimRiskProperty2ForMiscNonLiability=new ClaimRiskProperty2ForMiscNonLiability(driver, "Claim Risk Property 2 Page");
																				claimRiskProperty2ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp2MNLEntityListData, assertReference);
																				if(claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																					List<ClaimRiskProp3MNLEntity>claimRiskProp3MNLEntityList=testData.getData().get(ClaimRiskProp3MNLEntity.class);
																					for(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntityListData :claimRiskProp3MNLEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp3MNLEntityListData.getChildKey())){
																							if(claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("verify")&& claimRiskProp3MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskProperty3ForMiscNonLiability claimRiskProperty3ForMiscNonLiability=new ClaimRiskProperty3ForMiscNonLiability(driver, "Claim Risk Property 3 Page ");
																								claimRiskProperty3ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp3MNLEntityListData, assertReference);
																								if(claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																									List<ComClaimRiskPropMNLEntity>comClaimRiskPropMNLEntityList=testData.getData().get(ComClaimRiskPropMNLEntity.class);
																									for(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntityListData :comClaimRiskPropMNLEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(comClaimRiskPropMNLEntityListData.getChildKey())){
																											if(comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("verify")&& comClaimRiskPropMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												ClaimCommonClaimRiskPropertyForMiscNonLiability claimCommonClaimRiskPropertyForMiscNonLiability=new ClaimCommonClaimRiskPropertyForMiscNonLiability(driver, "Claim Risk Property 4 Page ");
																												claimCommonClaimRiskPropertyForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntityListData, assertReference);
																												if(comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																													List<ComClRiskProp2MNLEntity>comClRiskProp2MNLEntityList=testData.getData().get(ComClRiskProp2MNLEntity.class);
																													for(ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData :comClRiskProp2MNLEntityList ){
																														if(claimEntityListData.getParentKey().equalsIgnoreCase(comClRiskProp2MNLEntityListData.getChildKey())){
																															if(comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("verify") && comClRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																CommonClaimRiskProperty2ForMiscNL commonClaimRiskProperty2ForMiscNL=new CommonClaimRiskProperty2ForMiscNL(driver, "Claim Risk Property 4 Page ");
																																commonClaimRiskProperty2ForMiscNL.fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRiskProp2MNLEntityListData, assertReference);
																															}
																														}
																													}
																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void claimInsuredItemMarineCargoEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Marine Hull Insured Item Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if((claimMemberDamageEntityListData.getAction().equalsIgnoreCase("add")||claimMemberDamageEntityListData.getAction().equalsIgnoreCase("edit")) && claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage MiscNonLiability Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if((claimDamageDetailsEntityData.getAction().equalsIgnoreCase("add")||claimDamageDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage MiscNonLiability Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property MiscNonLiability Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")||(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigForwardButton"))){
													List<RiskDetailsMCEntity>RiskDetailsMCEntityList=testData.getData().get(RiskDetailsMCEntity.class);
													for(RiskDetailsMCEntity RiskDetailsMCEntityListData :RiskDetailsMCEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(RiskDetailsMCEntityListData.getChildKey())){
															if((RiskDetailsMCEntityListData.getAction().equalsIgnoreCase("add")||RiskDetailsMCEntityListData.getAction().equalsIgnoreCase("edit"))&& RiskDetailsMCEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskDetailsMarineCargo claimRiskDetailsMarineCargo=new ClaimRiskDetailsMarineCargo(driver, "Claim Risk Details", 1);
																claimRiskDetailsMarineCargo.fillandSubmitClaimRiskDetailsDeclNoMarineCargo(RiskDetailsMCEntityListData, assertReference);
																if(RiskDetailsMCEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProp2MNLEntity>claimRiskProp2MNLEntityList=testData.getData().get(ClaimRiskProp2MNLEntity.class);
																	for(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntityListData :claimRiskProp2MNLEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp2MNLEntityListData.getChildKey())){
																			if((claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskProperty2ForMiscNonLiability claimRiskProperty2ForMiscNonLiability=new ClaimRiskProperty2ForMiscNonLiability(driver, "Claim Risk Property 2 Page");
																				claimRiskProperty2ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp2MNLEntityListData, assertReference);
																				if(claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																					List<ClaimRiskProp3MNLEntity>claimRiskProp3MNLEntityList=testData.getData().get(ClaimRiskProp3MNLEntity.class);
																					for(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntityListData :claimRiskProp3MNLEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp3MNLEntityListData.getChildKey())){
																							if((claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("add")||claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp3MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskProperty3ForMiscNonLiability claimRiskProperty3ForMiscNonLiability=new ClaimRiskProperty3ForMiscNonLiability(driver, "Claim Risk Property 3 Page ");
																								claimRiskProperty3ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp3MNLEntityListData, assertReference);
																								if(claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																									List<ComClaimRiskPropMNLEntity>comClaimRiskPropMNLEntityList=testData.getData().get(ComClaimRiskPropMNLEntity.class);
																									for(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntityListData :comClaimRiskPropMNLEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(comClaimRiskPropMNLEntityListData.getChildKey())){
																											if((comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("add")||comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClaimRiskPropMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												ClaimCommonClaimRiskPropertyForMiscNonLiability claimCommonClaimRiskPropertyForMiscNonLiability=new ClaimCommonClaimRiskPropertyForMiscNonLiability(driver, "Claim Risk Property 4 Page ");
																												claimCommonClaimRiskPropertyForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntityListData, assertReference);
																												if(comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																													List<ComClRiskProp2MNLEntity>comClRiskProp2MNLEntityList=testData.getData().get(ComClRiskProp2MNLEntity.class);
																													for(ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData :comClRiskProp2MNLEntityList ){
																														if(claimEntityListData.getParentKey().equalsIgnoreCase(comClRiskProp2MNLEntityListData.getChildKey())){
																															if((comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("add")||comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																CommonClaimRiskProperty2ForMiscNL commonClaimRiskProperty2ForMiscNL=new CommonClaimRiskProperty2ForMiscNL(driver, "Claim Risk Property 4 Page ");
																																commonClaimRiskProperty2ForMiscNL.fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRiskProp2MNLEntityListData, assertReference);
																															}
																														}
																													}
																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
	public void claimReserveMarineCargoEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Reserve Helper </i></B>");
		int rowcount=0;
		List<ClaimReservePageEntity>claimReservePageEntityList=testData.getData().get(ClaimReservePageEntity.class);
		for(ClaimReservePageEntity claimReservePageEntityListData :claimReservePageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimReservePageEntityListData.getChildKey())){
				if((claimReservePageEntityListData.getAction().equalsIgnoreCase("add")||claimReservePageEntityListData.getAction().equalsIgnoreCase("edit"))&& claimReservePageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimReserveSummaryPage claimReserveSummaryPage=new ClaimReserveSummaryPage(driver, "Claim Reserve",rowcount);
					claimReserveSummaryPage.fillAndSubmitClaimReserveSummaryDetails(claimReservePageEntityListData, assertReference);
					claimReserveSummaryPage.createNewReservePage(claimReservePageEntityListData);
					if(claimReservePageEntityListData.getBooleanValueForField("ConfigNewButton")){
						ClaimReservePage claimReservePage=new ClaimReservePage(driver, "Claim Reserve Details");
						claimReservePage.fillandSubmitClaimReserveDetails(claimReservePageEntityListData, assertReference);		
					}
				}
			}
		}
	}
	
	public void claimPartiesAviationEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}

		}
	}







	public void claimPartiesAviationVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim MiscNonLiability Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}

	public void claimPartiesMarineHullVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigFinancierStakeCode")){
						// To handle Pop-up
						claimPartiesClaimAssociatedParties.afterClickOnSelectButtonHandlePopup(claimAssociatedPartiesListData);
						//To verify Claim Party Details Page
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if(claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
								}
							}
						}
					}
					List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
					for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
							if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("verify"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
								claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

							}
						}
					}
				}
			}
		}
	}
	public void claimAttributesAviationEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<ClaimPolPropertyTCLMEntity>claimPolPropertyTCLMEntityList=testData.getData().get(ClaimPolPropertyTCLMEntity.class);
						for(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntityListData :claimPolPropertyTCLMEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPolPropertyTCLMEntityListData.getChildKey())){
								if((claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("add")||claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("edit")) && claimPolPropertyTCLMEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttrPolicyPropertyT1CLMPage claimAttrPolicyPropertyT1CLMPage=new ClaimAttrPolicyPropertyT1CLMPage(driver, "Claim Policy Property T1CLM Page");
									claimAttrPolicyPropertyT1CLMPage.fillAndSubmitCourtMasterForAllProductDetails(claimPolPropertyTCLMEntityListData, assertReference);

								}
							}
						}
					}
				}
			}
		}
	}
	public void claimPartiesMarineCargoVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Verify Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if(claimAssociatedPartiesListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					//***************************Select Party Code************************************//
					claimPartiesClaimAssociatedParties.	selectSearchPartyCode(claimAssociatedPartiesListData);
					//*********************************Claim Party Details********************************//
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigFinancierStakeCode")){
						// To handle Pop-up
						//claimPartiesClaimAssociatedParties.afterClickOnSelectButtonHandlePopup(claimAssociatedPartiesListData);
						//To verify Claim Party Details Page
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if(claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("verify") && claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
								}
							}
						}
					}
				}
			}
		}
	}
	public void claimPartiesMarineCargoEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException, ParseException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Parties Helper </i></B>");
		List<ClaimAssociatedPartiesEntity>claimAssociatedPartiesEntityList=testData.getData().get(ClaimAssociatedPartiesEntity.class);
		for(ClaimAssociatedPartiesEntity claimAssociatedPartiesListData :claimAssociatedPartiesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAssociatedPartiesListData.getChildKey())){
				if((claimAssociatedPartiesListData.getAction().equalsIgnoreCase("add")||claimAssociatedPartiesListData.getAction().equalsIgnoreCase("edit"))&& claimAssociatedPartiesListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimPartiesClaimAssociatedParties claimPartiesClaimAssociatedParties = new ClaimPartiesClaimAssociatedParties(driver, "Claim Associated Parties");
					claimPartiesClaimAssociatedParties.navigatePartiesTitle();
					claimPartiesClaimAssociatedParties.createNewParty(claimAssociatedPartiesListData);
					if(claimAssociatedPartiesListData.getBooleanValueForField("ConfigNewButton")){
						List<ClaimPartyDetailsEntity>claimPartyDetailsEntityList=testData.getData().get(ClaimPartyDetailsEntity.class);
						for(ClaimPartyDetailsEntity claimPartyDetailsEntityListData :claimPartyDetailsEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartyDetailsEntityListData.getChildKey())){
								if((claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("add")||claimPartyDetailsEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartyDetailsEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimPartiesClaimPartyDetails claimPartiesClaimPartyDetails= new ClaimPartiesClaimPartyDetails(driver, "Claim PartyDetails");
									claimPartiesClaimPartyDetails.fillAndSubmitClaimPartyDetails(claimPartyDetailsEntityListData, assertReference);
									if(claimPartyDetailsEntityListData.getBooleanValueForField("ConfigSaveButton")){
										List<ClaimPartiesFinanSumayEntity>claimPartiesFinanSumayEntityList=testData.getData().get(ClaimPartiesFinanSumayEntity.class);
										for(ClaimPartiesFinanSumayEntity claimPartiesFinanSumayEntityListData :claimPartiesFinanSumayEntityList ){
											if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPartiesFinanSumayEntityListData.getChildKey())){
												if((claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("add")||claimPartiesFinanSumayEntityListData.getAction().equalsIgnoreCase("edit"))&& claimPartiesFinanSumayEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
													ClaimPartiesClaimPartyFinancialSummary claimPartiesClaimPartyFinancialSummary= new ClaimPartiesClaimPartyFinancialSummary(driver, " Claim Party Financial Summary");
													claimPartiesClaimPartyFinancialSummary.fillandSubmitClaimPartiesClaimPartyFinancialSummary(claimPartiesFinanSumayEntityListData, assertReference);

												}
											}
										}

									}
								}
							}
						}
					}
				}

			}

		}
	}
	public void claimAttributesMarineCargoEditHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Attributes Helper </i></B>");
		List<ClaimAttributesEntity>claimAttributesEntityList=testData.getData().get(ClaimAttributesEntity.class);
		for(ClaimAttributesEntity claimAttributesEntityListData :claimAttributesEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimAttributesEntityListData.getChildKey())){
				if((claimAttributesEntityListData.getAction().equalsIgnoreCase("add")||claimAttributesEntityListData.getAction().equalsIgnoreCase("edit")) && claimAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimAttributes claimAttributes = new ClaimAttributes(driver, "Claim Attributes");
					claimAttributes.fillAndSubmitClaimAttributesDetails(claimAttributesEntityListData, assertReference);
					if(claimAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){

						List<ClaimPolPropertyTCLMEntity>claimPolPropertyTCLMEntityList=testData.getData().get(ClaimPolPropertyTCLMEntity.class);
						for(ClaimPolPropertyTCLMEntity claimPolPropertyTCLMEntityListData :claimPolPropertyTCLMEntityList ){
							if(claimEntityListData.getParentKey().equalsIgnoreCase(claimPolPropertyTCLMEntityListData.getChildKey())){
								if((claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("add")||claimPolPropertyTCLMEntityListData.getAction().equalsIgnoreCase("edit")) && claimPolPropertyTCLMEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
									ClaimAttrPolicyPropertyT1CLMPage claimAttrPolicyPropertyT1CLMPage=new ClaimAttrPolicyPropertyT1CLMPage(driver, "Claim Policy Property T1CLM Page");
									claimAttrPolicyPropertyT1CLMPage.fillAndSubmitCourtMasterForAllProductDetails(claimPolPropertyTCLMEntityListData, assertReference);

								}
							}
						}
					}
				}
			}
		}
	}

		
	public void claimInsuredItemMarineCargoVerifyHelper(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup,ClaimEntity claimEntityListData) throws InterruptedException{
		FrameworkServices.logMessage("<B><i> Executing:: Claim Marine CARGO Insured Item Helper </i></B>");
		List<ClaimMemberDamageEntity>claimMemberDamageEntityList=testData.getData().get(ClaimMemberDamageEntity.class);
		for(ClaimMemberDamageEntity claimMemberDamageEntityListData :claimMemberDamageEntityList ){
			if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberDamageEntityListData.getChildKey())){
				if(claimMemberDamageEntityListData.getAction().equalsIgnoreCase("verify")&& claimMemberDamageEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
					ClaimInsuredItemMemberDamagePage claimInsuredItemMemberDamagePage=new ClaimInsuredItemMemberDamagePage(driver, "Claim Insured Item Member Damage MiscNonLiability Page");
					/********************************Select MEMBER Code***************************/
					claimInsuredItemMemberDamagePage.selectClaimMemberCode(claimMemberDamageEntityListData);

					List<ClaimDamageDetailsEntity> claimDamageDetailsEntityList=testData.getData().get(ClaimDamageDetailsEntity.class);
					for(ClaimDamageDetailsEntity claimDamageDetailsEntityData:claimDamageDetailsEntityList){
						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimDamageDetailsEntityData.getChildKey())){
							if(claimDamageDetailsEntityData.getAction().equalsIgnoreCase("verify")&& claimDamageDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
								ClaimInsuredInterestMemberDamageDetail claimInsuredInterestMemberDamageDetail=new ClaimInsuredInterestMemberDamageDetail(driver, "Claim Member Damage MiscNonLiability Page");
								claimInsuredInterestMemberDamageDetail.fillandSubmitDamageDetail(claimDamageDetailsEntityData, assertReference);

								if(claimDamageDetailsEntityData.getBooleanValueForField("ConfigAttributeSubTab")){
									List<ClaimMemberAttributesEntity>claimMemberAttributesEntityList=testData.getData().get(ClaimMemberAttributesEntity.class);
									for(ClaimMemberAttributesEntity claimMemberAttributesEntityListData :claimMemberAttributesEntityList ){
										if(claimEntityListData.getParentKey().equalsIgnoreCase(claimMemberAttributesEntityListData.getChildKey())){
											if((claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("verify")||claimMemberAttributesEntityListData.getAction().equalsIgnoreCase("edit"))&& claimMemberAttributesEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
												ClaimInsuredItemMemberAttributesClaimInsuredProperty claimInsuredItemMemberAttributesClaimInsuredProperty=new ClaimInsuredItemMemberAttributesClaimInsuredProperty(driver, "Claim Insured Property MiscNonLiability Page");
												claimInsuredItemMemberAttributesClaimInsuredProperty.fillAndSubmitClaimMemberAttributeDetails(claimMemberAttributesEntityListData, assertReference);
												if(claimMemberAttributesEntityListData.getBooleanValueForField("ConfigProceedButton")){
													List<RiskDetailsMCEntity>RiskDetailsMCEntityList=testData.getData().get(RiskDetailsMCEntity.class);
													for(RiskDetailsMCEntity RiskDetailsMCEntityListData :RiskDetailsMCEntityList ){
														if(claimEntityListData.getParentKey().equalsIgnoreCase(RiskDetailsMCEntityListData.getChildKey())){
															if((RiskDetailsMCEntityListData.getAction().equalsIgnoreCase("verify")||RiskDetailsMCEntityListData.getAction().equalsIgnoreCase("edit"))&& RiskDetailsMCEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																ClaimRiskDetailsMarineCargo claimRiskDetailsMarineCargo=new ClaimRiskDetailsMarineCargo(driver, "Claim Risk Details", 1);
																claimRiskDetailsMarineCargo.fillandSubmitClaimRiskDetailsDeclNoMarineCargo(RiskDetailsMCEntityListData, assertReference);
																if(RiskDetailsMCEntityListData.getBooleanValueForField("ConfigForwardButton")){
																	List<ClaimRiskProp2MNLEntity>claimRiskProp2MNLEntityList=testData.getData().get(ClaimRiskProp2MNLEntity.class);
																	for(ClaimRiskProp2MNLEntity claimRiskProp2MNLEntityListData :claimRiskProp2MNLEntityList ){
																		if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp2MNLEntityListData.getChildKey())){
																			if((claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("verify")||claimRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																				ClaimRiskProperty2ForMiscNonLiability claimRiskProperty2ForMiscNonLiability=new ClaimRiskProperty2ForMiscNonLiability(driver, "Claim Risk Property 2 Page");
																				claimRiskProperty2ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp2MNLEntityListData, assertReference);
																				if(claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp2MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																					List<ClaimRiskProp3MNLEntity>claimRiskProp3MNLEntityList=testData.getData().get(ClaimRiskProp3MNLEntity.class);
																					for(ClaimRiskProp3MNLEntity claimRiskProp3MNLEntityListData :claimRiskProp3MNLEntityList ){
																						if(claimEntityListData.getParentKey().equalsIgnoreCase(claimRiskProp3MNLEntityListData.getChildKey())){
																							if((claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("verify")||claimRiskProp3MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& claimRiskProp3MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																								ClaimRiskProperty3ForMiscNonLiability claimRiskProperty3ForMiscNonLiability=new ClaimRiskProperty3ForMiscNonLiability(driver, "Claim Risk Property 3 Page ");
																								claimRiskProperty3ForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(claimRiskProp3MNLEntityListData, assertReference);
																								if(claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigForwardButton")||claimRiskProp3MNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																									List<ComClaimRiskPropMNLEntity>comClaimRiskPropMNLEntityList=testData.getData().get(ComClaimRiskPropMNLEntity.class);
																									for(ComClaimRiskPropMNLEntity comClaimRiskPropMNLEntityListData :comClaimRiskPropMNLEntityList ){
																										if(claimEntityListData.getParentKey().equalsIgnoreCase(comClaimRiskPropMNLEntityListData.getChildKey())){
																											if((comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("verify")||comClaimRiskPropMNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClaimRiskPropMNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																												ClaimCommonClaimRiskPropertyForMiscNonLiability claimCommonClaimRiskPropertyForMiscNonLiability=new ClaimCommonClaimRiskPropertyForMiscNonLiability(driver, "Claim Risk Property 4 Page ");
																												claimCommonClaimRiskPropertyForMiscNonLiability.fillandSubmitClaimCommonClaimRiskPropertyForMiscNonLiabilityDetails(comClaimRiskPropMNLEntityListData, assertReference);
																												if(comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigForwardButton")||comClaimRiskPropMNLEntityListData.getBooleanValueForField("ConfigRedirectNextPage")){
																													List<ComClRiskProp2MNLEntity>comClRiskProp2MNLEntityList=testData.getData().get(ComClRiskProp2MNLEntity.class);
																													for(ComClRiskProp2MNLEntity comClRiskProp2MNLEntityListData :comClRiskProp2MNLEntityList ){
																														if(claimEntityListData.getParentKey().equalsIgnoreCase(comClRiskProp2MNLEntityListData.getChildKey())){
																															if((comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("verify")||comClRiskProp2MNLEntityListData.getAction().equalsIgnoreCase("edit"))&& comClRiskProp2MNLEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
																																CommonClaimRiskProperty2ForMiscNL commonClaimRiskProperty2ForMiscNL=new CommonClaimRiskProperty2ForMiscNL(driver, "Claim Risk Property 4 Page ");
																																commonClaimRiskProperty2ForMiscNL.fillandSubmitCommonClaimRiskProperty2ForMiscNLDetails(comClRiskProp2MNLEntityListData, assertReference);
																															}
																														}
																													}
																												}

																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}	
