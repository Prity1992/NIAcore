package com.aqm.staf.library.PageKeyWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aqm.framework.entities.ExecutionTestSteps;
import com.aqm.framework.core.TestData;
import com.aqm.framework.core.CustomAssert;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.pages.common.PartyAgentPartyRule;
import com.aqm.staf.library.pages.common.PartyContactsPage;
import com.aqm.staf.library.pages.common.PartyContactsPageDetailsPage;
import com.aqm.staf.library.pages.common.PartyDetailsCreateEditPage;
import com.aqm.staf.library.pages.common.PartyFollowupDetails;
import com.aqm.staf.library.pages.common.PartyFollowupListPage;
import com.aqm.staf.library.pages.common.PartyPartyRolesBrokerageCommission;
import com.aqm.staf.library.pages.common.PartyPartyRolesBuyerMasterIND;
import com.aqm.staf.library.pages.common.PartyPartyRolesMemberDOB;
import com.aqm.staf.library.pages.common.PartyPartyRolesPartyFunctionDetails;
import com.aqm.staf.library.pages.common.PartyPartyRolesPartyFunctions;
import com.aqm.staf.library.pages.common.PartyRelatedPartyDetailsPage;
import com.aqm.staf.library.pages.common.PartySearchPage;
import com.aqm.staf.library.pages.common.Party_PartyRole_Claimant;
import com.aqm.staf.library.pages.common.Party_PartyRolesPartyFunctions;
import com.aqm.staf.library.pages.common.Party_Relations;
import com.aqm.testing.testDataEntity.AccoScrollEntryEntity;
import com.aqm.testing.testDataEntity.AccountingBGOrCDSearchEntity;
import com.aqm.testing.testDataEntity.AccountingDistributionTable;
import com.aqm.testing.testDataEntity.AccountingEntity;
import com.aqm.testing.testDataEntity.ClaimPaymentEntity;
import com.aqm.testing.testDataEntity.ClaimTransferToAPEntity;
import com.aqm.testing.testDataEntity.ClientDetailsEntity;
import com.aqm.testing.testDataEntity.MembAtachCovrgPremSchdEntity;
import com.aqm.testing.testDataEntity.PartyAgentPartyRuleEntity;
import com.aqm.testing.testDataEntity.PartyContactsDetailsEntity;
import com.aqm.testing.testDataEntity.PartyEntity;
import com.aqm.testing.testDataEntity.PartyFollowupDetailsEntity;
import com.aqm.testing.testDataEntity.PartyPartyRoleClaimantEntity;
import com.aqm.testing.testDataEntity.PartyRolBrokerCommiEntity;
import com.aqm.testing.testDataEntity.PartyRoleBuyerMastINDEntity;
import com.aqm.testing.testDataEntity.PartyRolesFunctDetailsEntity;
import com.aqm.testing.testDataEntity.PartyRolesFunctionsEntity;
import com.aqm.testing.testDataEntity.PartyRolesMemberDetailEntity;
import com.aqm.testing.testDataEntity.PolicyEntity;
import com.aqm.testing.testDataEntity.PolicyMemberAttributeEntity;
import com.aqm.testing.testDataEntity.PolicyMemberDetailsEntity;
import com.aqm.testing.testDataEntity.PolicyPaymDetailsCycleEntity;
import com.aqm.testing.testDataEntity.PolicyPremCollectionEntity;
import com.aqm.testing.testDataEntity.PolicyPremiumScheduleEntity;
import com.aqm.testing.testDataEntity.PolicyRelationDetailEntity;
import com.aqm.testing.testDataEntity.PolicyShowVersionPageEntity;
import com.aqm.testing.testDataEntity.RelatedPartyRelationsEntity;
import com.aqm.testing.testDataEntity.SecurityPartyEntity;

public class PartyKeyWord{
	public void createParty(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		/*keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();*/
		List<PartyEntity> partyEntitiesList=testData.getData().get(PartyEntity.class);
		for(PartyEntity partyEntity:partyEntitiesList){
			if(partyEntity.getAction().equalsIgnoreCase("add") && partyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				partySearchPage.navigateToPartyCreatePage();
				PartyDetailsCreateEditPage partyDetailsCreatePage = new PartyDetailsCreateEditPage(driver, "Party Details Create Page");
				partyDetailsCreatePage.fillandSubmitPartyDetails(partyEntity, assertReference);
				partySearchPage.fetchPartyCode(partyEntity);
				testData.updateRecordsForCriteria(partyEntity);
				setEditPartyDependency(partyEntity, testData);
				
			}
		}
	}

	public void verifyParty(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PartyEntity> partyEntitiesList = testData.getData().get(PartyEntity.class);
		for(PartyEntity partyEntity:partyEntitiesList){
			if(partyEntity.getAction().equalsIgnoreCase("verify")&& partyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				partySearchPage.fillAndSearchPartyDetails(partyEntity);
				partySearchPage.selectSearchPartyCode(partyEntity);
				partySearchPage.navigateToPartyDetailsPage();

				PartyDetailsCreateEditPage partyDetailsViewPage=new PartyDetailsCreateEditPage(driver, "Party Details Create Page");
				partyDetailsViewPage.fillandSubmitPartyDetails(partyEntity, assertReference);

				if(partyEntity.getBooleanValueForField("ConfigPartyRoles")) {
					List<PartyRolesFunctDetailsEntity> partyRolesFunctionsEntityList=testData.getData().get(PartyRolesFunctDetailsEntity.class);
					for(PartyRolesFunctDetailsEntity partyRolesFunctDetailsData:partyRolesFunctionsEntityList){
						if(partyEntity.getParentKey().equalsIgnoreCase(partyRolesFunctDetailsData.getChildKey())){
							if(partyRolesFunctDetailsData.getAction().equalsIgnoreCase("verify")&& partyRolesFunctDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
								partyDetailsViewPage.navigateToPartyRoles(partyEntity); 
								/*List<PartyRolesFunctionsEntity> partyRolesFunctionsEntityList=testData.get*/
								PartyPartyRolesPartyFunctions partyPartyRolesPartyFunctions=new PartyPartyRolesPartyFunctions(driver, "Party_Party Function");
								partyPartyRolesPartyFunctions.selectFunctionCodeFromSearchPage(partyRolesFunctDetailsData);
								/******************Click On Function Code and Open Record in View Mode*****************/
								PartyPartyRolesPartyFunctionDetails partyPartyRolesPartyFunctionDetails=new PartyPartyRolesPartyFunctionDetails(driver, "Party Function Details");
								partyPartyRolesPartyFunctionDetails.fillAndSubmitPartyFunctionDetails(partyRolesFunctDetailsData, assertReference);

								/******************Verify Party Function Details Page and Click on Next Button*******************/
								if(partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("MEMBER") || partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("POLICY-HOL")){
									List<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityList = testData.getData().get(PartyRolesMemberDetailEntity.class);
									for(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity :partyRolesMemberDetailEntityList){
										if(partyEntity.getParentKey().equalsIgnoreCase(partyRolesMemberDetailEntity.getChildKey())){
											if(partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("verify") && partyRolesMemberDetailEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
												PartyPartyRolesMemberDOB partyPartyRolesMemberDOB=new PartyPartyRolesMemberDOB(driver, "Member DOB ");
												if(!(partyRolesMemberDetailEntity.getStringValueForField("Product").equalsIgnoreCase("LP")||partyRolesMemberDetailEntity.getStringValueForField("Product").equalsIgnoreCase("CX")))
													partyPartyRolesMemberDOB.navigateToMemberDOBPage();
												partyPartyRolesMemberDOB.fillAndSubmitPartyRolesMemberDetails(partyRolesMemberDetailEntity, assertReference);
												/************************fill Member DOB Data Then Proceed then Save in 1 callCount***********************/
											}
										}
									}
								}

								else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("CLAIMANT")) {
									List<PartyPartyRoleClaimantEntity> partyRoleClaimantEntitieList=testData.getData().get(PartyPartyRoleClaimantEntity.class);
									for(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntityData:partyRoleClaimantEntitieList){
										if(partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("verify")){
											Party_PartyRole_Claimant partyPartyRoleClaimant=new  Party_PartyRole_Claimant(driver, "Claimant Party Rule ");
											//partyPartyRoleClaimant.navigateToClaimantRulePage();
											partyPartyRoleClaimant.navigateTosurveyorOrganizationdetailsPage();
											partyPartyRoleClaimant.fillPartyDetails(partyPartyRoleClaimantEntityData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
								else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("BROKER")) {
									List<PartyRolBrokerCommiEntity> partyRolesBrokerageCommiEntityList=testData.getData().get(PartyRolBrokerCommiEntity.class);
									for(PartyRolBrokerCommiEntity partyRolesBrokerageCommiEntityListData:partyRolesBrokerageCommiEntityList){
										if(partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("verify") && partyRolesBrokerageCommiEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){	
											PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Brokerage Commission");
											//PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Claimant Party Rule ");
											//partyPartyRoleClaimant.navigateToClaimantRulePage();
											partyPartyRolesBrokerageCommission.navigateToBrokerCommission();
											partyPartyRolesBrokerageCommission.fillandSubmitPartyPartyRolesBrokerageCommission(partyRolesBrokerageCommiEntityListData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
								else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("DEVLP-OFF")) {
									List<PartyRolBrokerCommiEntity> partyRolesBrokerageCommiEntityList=testData.getData().get(PartyRolBrokerCommiEntity.class);
									for(PartyRolBrokerCommiEntity partyRolesBrokerageCommiEntityListData:partyRolesBrokerageCommiEntityList){
										if(partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("verify") && partyRolesBrokerageCommiEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){	
											//if(partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("verify")){
											PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Claimant Party Rule ");
											//partyPartyRoleClaimant.navigateToClaimantRulePage();
											partyPartyRolesBrokerageCommission.navigateToDevelopmentOfficer();
											partyPartyRolesBrokerageCommission.fillandSubmitPartyPartyRolesBrokerageCommission(partyRolesBrokerageCommiEntityListData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
								else if ((partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("PAGENT")) || (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("AGENT"))) {
									List<PartyAgentPartyRuleEntity> PartyAgentPartyRuleEntityList=testData.getData().get(PartyAgentPartyRuleEntity.class);
									for(PartyAgentPartyRuleEntity partyAgentPartyRuleEntityListData:PartyAgentPartyRuleEntityList){
										if(partyAgentPartyRuleEntityListData.getAction().equalsIgnoreCase("verify") && partyAgentPartyRuleEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){	
											PartyAgentPartyRule partyAgentPartyRule=new  PartyAgentPartyRule(driver, "Prospective Agent Party Rule");
											//PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Claimant Party Rule ");
											//partyPartyRoleClaimant.navigateToClaimantRulePage();
											partyAgentPartyRule.navigateToAgentPartyRule();
											partyAgentPartyRule.fillandSubmitPartyAgentPartyRuleEntity(partyAgentPartyRuleEntityListData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
								else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("SURVEYOR")) {
									List<PartyPartyRoleClaimantEntity> partyRoleClaimantEntitieList=testData.getData().get(PartyPartyRoleClaimantEntity.class);
									for(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntityData:partyRoleClaimantEntitieList){
										if(partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("verify")  && partyPartyRoleClaimantEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
											Party_PartyRole_Claimant partyPartyRoleClaimant=new  Party_PartyRole_Claimant(driver, "SURVEYOR DETAILS Page");
											partyPartyRoleClaimant.fillPartyDetails(partyPartyRoleClaimantEntityData, assertReference);
											/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
										}
									}
								}
							}
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigContacts")){
					List<PartyContactsDetailsEntity> partyContactsDetailsEntityList= testData.getData().get(PartyContactsDetailsEntity.class);
					for(PartyContactsDetailsEntity partyContactsDetailsEntityData:partyContactsDetailsEntityList){
						if(partyContactsDetailsEntityData.getAction().equalsIgnoreCase("verify")){
							PartyContactsPage partyContactsPage=new PartyContactsPage(driver, "Party Contacts");
							partyContactsPage.navigateToContacts(partyContactsDetailsEntityData);
							partyContactsPage.selectConatctTypeAndnavigatePartyContactDeatail(partyContactsDetailsEntityData);
							PartyContactsPageDetailsPage partyContactsPageDetailsPage=new PartyContactsPageDetailsPage(driver, "PartyContactsPageDetailsPage");
							partyContactsPageDetailsPage.navigateContactDetails();
							partyContactsPageDetailsPage.fillandSubmitPartyContactDetails(partyContactsDetailsEntityData, assertReference);
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigRelatedParties")){
					List<RelatedPartyRelationsEntity> relatedPartyRelationsEntities=testData.getData().get(RelatedPartyRelationsEntity.class);
					for(RelatedPartyRelationsEntity relatedPartyRelationsEntityData:relatedPartyRelationsEntities){
						if(relatedPartyRelationsEntityData.getAction().equalsIgnoreCase("verify")){
							Party_Relations party_RelationsSearchPage=new Party_Relations(driver, "Party Relation Search Page");
							party_RelationsSearchPage.selectRealtionFromSearchPage(relatedPartyRelationsEntityData);


							//TODO - Check why the above search Page Object is not different than the details Page -NBS
							Party_Relations party_RelationsCreatePage=new Party_Relations(driver, "Party Relation Create Page");
							party_RelationsCreatePage.fillPartyRelations(relatedPartyRelationsEntityData, assertReference);
						}
					}
				}
				else if(partyEntity.getBooleanValueForField("ConfigFollowup")){
					List<PartyFollowupDetailsEntity> partyFollowupDetailsEntitiesList=testData.getData().get(PartyFollowupDetailsEntity.class);
					for(PartyFollowupDetailsEntity partyFollowupDetailsEntityData:partyFollowupDetailsEntitiesList){
						if(partyFollowupDetailsEntityData.getAction().equalsIgnoreCase("verify") && partyFollowupDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
							PartyFollowupDetails partyFollowupDetailsCreate=new PartyFollowupDetails(driver, "Party follow up Cretae New Page");
							partyFollowupDetailsCreate.fillandSubmitFollowupDetails(partyFollowupDetailsEntityData, assertReference);
						}
					}
				}
			}
		}

	}

	private void setEditPartyDependency(PartyEntity partyEntity, TestData testData) {
		if(partyEntity.getStringValueForField("DependencyForPartyCode")!=null){
			ArrayList<PartyEntity> partyEntityList = testData.getObjectByReference(testData.getData().get(PartyEntity.class), partyEntity.getStringValueForField("DependencyForPartyCode"));

			for (PartyEntity partyEntityData : partyEntityList) {
				partyEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				partyEntityData.setStringValueForField("FirstName", partyEntity.getStringValueForField("FirstName"));
				partyEntityData.setStringValueForField("MiddleName", partyEntity.getStringValueForField("MiddleName"));
				partyEntityData.setStringValueForField("LastName", partyEntity.getStringValueForField("LastName"));
				partyEntityData.setStringValueForField("OtherName", partyEntity.getStringValueForField("OtherName"));
				partyEntityData.setStringValueForField("ContactType", partyEntity.getStringValueForField("ContactType"));
				testData.updateRecordsForCriteria(partyEntityData);
				//for party-->followup
				//for party--> Contacts	 
				//for pARTY rOLES
				// FOR4 RELATED pARTY   
			}
		}
		

		if(partyEntity.getStringValueForField("DependencyForPolicy")!=null){
			ArrayList<PolicyEntity> policyEntityList=testData.getObjectByReference(testData.getData().get(PolicyEntity.class), partyEntity.getStringValueForField("DependencyForPolicy"));

			for(PolicyEntity policyEntityData:policyEntityList){
				policyEntityData.setStringValueForField("PolicyHolderCode",partyEntity.getStringValueForField("PartyCode"));
				//GH Abhijit
				if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyEntityData.setStringValueForField("PolicyHolderName",partyName);
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyEntityData.setStringValueForField("PolicyHolderName",partyName);
				}
				testData.updateRecordsForCriteria(policyEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicyMember")!=null){
			ArrayList<PolicyMemberDetailsEntity> policyMemberDetailsEntityList=testData.getObjectByReference(testData.getData().get(PolicyMemberDetailsEntity.class), partyEntity.getStringValueForField("DependencyForPolicyMember"));

			for(PolicyMemberDetailsEntity policyMemberDetailsEntityData:policyMemberDetailsEntityList){
				policyMemberDetailsEntityData.setStringValueForField("MemberCode",partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				policyMemberDetailsEntityData.setStringValueForField("PartyName",partyName);
				testData.updateRecordsForCriteria(policyMemberDetailsEntityData);
			}
		}
		
		if(partyEntity.getStringValueForField("DependencyForPolicyBuyer")!=null){
			ArrayList<PolicyMemberDetailsEntity> policyMemberDetailsEntityList = testData.getObjectByReference(testData.getData().get(PolicyMemberDetailsEntity.class), partyEntity.getStringValueForField("DependencyForPolicyMember"));

			for(PolicyMemberDetailsEntity policyMemberDetailsEntityData:policyMemberDetailsEntityList){
				policyMemberDetailsEntityData.setStringValueForField("BuyerCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(policyMemberDetailsEntityData);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForPolicyMemberPremium")!=null){
			ArrayList<MembAtachCovrgPremSchdEntity> membAtachCovrgPremSchdEntityList=testData.getObjectByReference(testData.getData().get(MembAtachCovrgPremSchdEntity.class), partyEntity.getStringValueForField("DependencyForPolicyMemberPremium"));

			for(MembAtachCovrgPremSchdEntity membAtachCovrgPremSchdEntityData:membAtachCovrgPremSchdEntityList){
				membAtachCovrgPremSchdEntityData.setStringValueForField("MemberCoode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(membAtachCovrgPremSchdEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForContacts")!=null){
			ArrayList<PartyContactsDetailsEntity>partyContactsDetailsEntityList=testData.getObjectByReference(testData.getData().get(PartyContactsDetailsEntity.class),partyEntity.getStringValueForField("DependencyForContacts") );

			for(PartyContactsDetailsEntity partyContactsDetailsEntityData:partyContactsDetailsEntityList){
				partyContactsDetailsEntityData.setStringValueForField("ContactType", partyEntity.getStringValueForField("ContactType"));
				partyContactsDetailsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName") + " " + partyEntity.getStringValueForField("LastName");
				partyContactsDetailsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyContactsDetailsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPartyRoles")!=null){
			ArrayList<PartyRolesFunctDetailsEntity> partyRolesFunctDetailsEntityList=testData.getObjectByReference(testData.getData().get(PartyRolesFunctDetailsEntity.class),partyEntity.getStringValueForField("DependencyForPartyRoles"));

			for(PartyRolesFunctDetailsEntity partyRolesFunctDetailsEntityData:partyRolesFunctDetailsEntityList){
				partyRolesFunctDetailsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				partyRolesFunctDetailsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyRolesFunctDetailsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPartyRoleMember")!=null){
			ArrayList<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityList=testData.getObjectByReference(testData.getData().get(PartyRolesMemberDetailEntity.class),partyEntity.getStringValueForField("DependencyForPartyRoleMember"));

			for(PartyRolesMemberDetailEntity partyRolesMemberDetailEntityData:partyRolesMemberDetailEntityList){
				partyRolesMemberDetailEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				partyRolesMemberDetailEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(partyRolesMemberDetailEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForRelatedParties")!=null){
			ArrayList<RelatedPartyRelationsEntity> relatedPartyRelationsEntityList=testData.getObjectByReference(testData.getData().get(RelatedPartyRelationsEntity.class), partyEntity.getStringValueForField("DependencyForRelatedParties"));

			for(RelatedPartyRelationsEntity relatedPartyRelationsEntityData:relatedPartyRelationsEntityList){
				relatedPartyRelationsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				relatedPartyRelationsEntityData.setStringValueForField("PartyName", partyName);
				testData.updateRecordsForCriteria(relatedPartyRelationsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForFollowup")!=null){
			ArrayList<PartyFollowupDetailsEntity> partyFollowupDetailsEntityList=testData.getObjectByReference(testData.getData().get(PartyFollowupDetailsEntity.class), partyEntity.getStringValueForField("DependencyForFollowup"));

			for(PartyFollowupDetailsEntity partyFollowupDetailsEntityData:partyFollowupDetailsEntityList){
				partyFollowupDetailsEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				partyFollowupDetailsEntityData.setStringValueForField("PartyName", partyName);
				partyFollowupDetailsEntityData.setStringValueForField("AssignedTo", partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(partyFollowupDetailsEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicyRelation")!=null){
			ArrayList<PolicyRelationDetailEntity> policyRelationDetailEntityList=testData.getObjectByReference(testData.getData().get(PolicyRelationDetailEntity.class), partyEntity.getStringValueForField("DependencyForPolicyRelation"));

			for(PolicyRelationDetailEntity policyRelationDetailEntityData:policyRelationDetailEntityList){
				if(partyEntity.getStringValueForField("BusinessName")!=null){
					String partyCode=partyEntity.getStringValueForField("PartyCode");
					policyRelationDetailEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				}
				else if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyRelationDetailEntityData.setStringValueForField("PolicyHolder",partyName);
				}
				else if(partyEntity.getStringValueForField("BusinessName")!=null){

					String partyCode=partyEntity.getStringValueForField("PartyCode");
					policyRelationDetailEntityData.setStringValueForField("PartyCode",partyCode);

					policyRelationDetailEntityData.setStringValueForField("PartyCode", partyEntity.getStringValueForField("PartyCode"));
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyRelationDetailEntityData.setStringValueForField("PolicyHolder",partyName);
				}
				/*String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				policyRelationDetailEntityData.setStringValueForField("PolicyHolder",partyName);*/
				testData.updateRecordsForCriteria(policyRelationDetailEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForPolicyMemberPayments")!=null){
			ArrayList<PolicyPaymDetailsCycleEntity> policyPaymDetailsCycleEntityList=testData.getObjectByReference(testData.getData().get(PolicyPaymDetailsCycleEntity.class), partyEntity.getStringValueForField("DependencyForPolicyMemberPayments"));

			for(PolicyPaymDetailsCycleEntity policyPaymDetailsCycleEntityData:policyPaymDetailsCycleEntityList){
				policyPaymDetailsCycleEntityData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(policyPaymDetailsCycleEntityData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForSuperUserUserCode")!=null){
			ArrayList<SecurityPartyEntity> securityPartyEntityList=testData.getObjectByReference(testData.getData().get(SecurityPartyEntity.class), partyEntity.getStringValueForField("DependencyForSuperUserUserCode"));

			for(SecurityPartyEntity securityPartyEntityListData:securityPartyEntityList){
				securityPartyEntityListData.setStringValueForField("UserCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(securityPartyEntityListData);
			}
		}

		if(partyEntity.getStringValueForField("DependencyForScrollPartyName")!=null){
			ArrayList<AccoScrollEntryEntity> accoScrollEntryEntityList=testData.getObjectByReference(testData.getData().get(AccoScrollEntryEntity.class), partyEntity.getStringValueForField("DependencyForScrollPartyName"));
			for(AccoScrollEntryEntity accoScrollEntryEntityData:accoScrollEntryEntityList){
				String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				accoScrollEntryEntityData.setStringValueForField("ReceivedFrom",partyName);
				testData.updateRecordsForCriteria(accoScrollEntryEntityData);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForAccountingPartyCode")!=null){
			ArrayList<AccountingBGOrCDSearchEntity> accountingBGOrCDSearchEntityList=testData.getObjectByReference(testData.getData().get(AccountingBGOrCDSearchEntity.class), partyEntity.getStringValueForField("DependencyForAccountingPartyCode"));

			for(AccountingBGOrCDSearchEntity accountingBGOrCDSearchEntityData:accountingBGOrCDSearchEntityList){
				accountingBGOrCDSearchEntityData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(accountingBGOrCDSearchEntityData);
			}
		}
		//Abhijit

		if(partyEntity.getStringValueForField("DependencyForPolicyPremiumSchedule")!=null){
			ArrayList<PolicyPremiumScheduleEntity> policyPremiumScheduleEntityList=testData.getObjectByReference(testData.getData().get(PolicyPremiumScheduleEntity.class), partyEntity.getStringValueForField("DependencyForPolicyPremiumSchedule"));
			for(PolicyPremiumScheduleEntity policyPremiumScheduleEntityData:policyPremiumScheduleEntityList){
				policyPremiumScheduleEntityData.setStringValueForField("MemberCode",partyEntity.getStringValueForField("PartyCode"));
				if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyPremiumScheduleEntityData.setStringValueForField("Policyholder",partyName);
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyPremiumScheduleEntityData.setStringValueForField("Policyholder",partyName);
				}
				testData.updateRecordsForCriteria(policyPremiumScheduleEntityData);
			}
		}

		//Added by PKP
		if(partyEntity.getStringValueForField("DependencyForClaimPayment")!=null){
			ArrayList<ClaimPaymentEntity> claimPaymentEntityList=testData.getObjectByReference(testData.getData().get(ClaimPaymentEntity.class), partyEntity.getStringValueForField("DependencyForClaimPayment"));
			for(ClaimPaymentEntity claimPaymentEntityData :claimPaymentEntityList){
				claimPaymentEntityData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				//String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
				//claimPaymentEntityData.setStringValueForField("Policyholder",partyName);
				testData.updateRecordsForCriteria(claimPaymentEntityData);
			}
		}
		//Abhijit
		if(partyEntity.getStringValueForField("DependencyForAccountingDistributionTable")!=null){
			ArrayList<AccountingDistributionTable>accountingDistributionTableList=testData.getObjectByReference(testData.getData().get(AccountingDistributionTable.class), partyEntity.getStringValueForField("DependencyForAccountingDistributionTable"));
			for(AccountingDistributionTable accountingDistributionTableData:accountingDistributionTableList){
				accountingDistributionTableData.setStringValueForField("GLDescription",partyEntity.getStringValueForField("PartyCode") );
				testData.updateRecordsForCriteria(accountingDistributionTableData);
			}
		}
		//Mangesh
		if(partyEntity.getStringValueForField("DependencyForShowVersion")!=null){
			ArrayList<PolicyShowVersionPageEntity>policyShowVersionPageEntityList=testData.getObjectByReference(testData.getData().get(PolicyShowVersionPageEntity.class), partyEntity.getStringValueForField("DependencyForShowVersion"));
			for(PolicyShowVersionPageEntity policyShowVersionPageEntityData:policyShowVersionPageEntityList){
				policyShowVersionPageEntityData.setStringValueForField("PolicyHolder",(partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("MiddleName")+" "+partyEntity.getStringValueForField("LastName")));
				testData.updateRecordsForCriteria(policyShowVersionPageEntityData);
			}
		}

		//Abhijit
		if(partyEntity.getStringValueForField("DependencyForClaimTransferToAPEntity")!=null){
			ArrayList<ClaimTransferToAPEntity> claimTransferToAPEntityList=testData.getObjectByReference(testData.getData().get(ClaimTransferToAPEntity.class), partyEntity.getStringValueForField("DependencyForClaimTransferToAPEntity"));
			
			for(ClaimTransferToAPEntity claimTransferToAPEntityListData:claimTransferToAPEntityList){
				claimTransferToAPEntityListData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(claimTransferToAPEntityListData);
			}

		}
		//Abhijit
		if(partyEntity.getStringValueForField("DependencyForPolicyPremiumCollection")!=null){
			ArrayList<PolicyPremCollectionEntity> policyPremCollectionEntityList=testData.getObjectByReference(testData.getData().get(PolicyPremCollectionEntity.class), partyEntity.getStringValueForField("DependencyForPolicyPremiumCollection"));

			for(PolicyPremCollectionEntity policyPremCollectionEntityListData:policyPremCollectionEntityList){
				policyPremCollectionEntityListData.setStringValueForField("PartyCode",partyEntity.getStringValueForField("PartyCode"));
				testData.updateRecordsForCriteria(policyPremCollectionEntityListData);
			}

		}

		//Abhijit

		if(partyEntity.getStringValueForField("DependencyForMemberName")!=null){
			ArrayList<PolicyMemberAttributeEntity> policyMemberAttributeEntityList = testData.getObjectByReference(testData.getData().get(PolicyMemberAttributeEntity.class), partyEntity.getStringValueForField("DependencyForMemberName"));

			for (PolicyMemberAttributeEntity policyMemberAttributeEntityListData : policyMemberAttributeEntityList) {
				String name= partyEntity.getStringValueForField("FirstName") + " " + partyEntity.getStringValueForField("MiddleName") +  " " +partyEntity.getStringValueForField("LastName");
				policyMemberAttributeEntityListData.setStringValueForField("NameofMember", name);
			}
		}
		if(partyEntity.getStringValueForField("DependencyForParentCode")!=null){
			ArrayList<PartyEntity> partyEntityList = testData.getObjectByReference(testData.getData().get(PartyEntity.class), partyEntity.getStringValueForField("DependencyForParentCode"));

			for (PartyEntity partyEntityData : partyEntityList) {
				partyEntityData.setStringValueForField("ParentCode", partyEntity.getStringValueForField("PartyCode"));
			}
		}
		//Client Detail
		if(partyEntity.getStringValueForField("DependencyForClientDetail")!=null){
			ArrayList<ClientDetailsEntity> clientDetailList=testData.getObjectByReference(testData.getData().get(ClientDetailsEntity.class), partyEntity.getStringValueForField("DependencyForClientDetail"));

			for(ClientDetailsEntity clientDetailEntityData:clientDetailList){
				clientDetailEntityData.setStringValueForField("PolicyHolderStateName",partyEntity.getStringValueForField("StateName"));
				clientDetailEntityData.setStringValueForField("PolicyHolderPinCode",partyEntity.getStringValueForField("PinCode"));
				clientDetailEntityData.setStringValueForField("PolicyHolderCityName",partyEntity.getStringValueForField("CityName"));
				
				
				//GH Abhijit
				/*if(partyEntity.getStringValueForField("BusinessName").isEmpty()){
					String partyName=partyEntity.getStringValueForField("FirstName")+" "+partyEntity.getStringValueForField("LastName");
					policyEntityData.setStringValueForField("PolicyHolderName",partyName);
				}
				else{
					String partyName=partyEntity.getStringValueForField("BusinessName") ;
					policyEntityData.setStringValueForField("PolicyHolderName",partyName);
				}*/
				testData.updateRecordsForCriteria(clientDetailEntityData);
			}
		}
		
		
		
		
		
		
	}


	public void  editParty (TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<PartyEntity> partyEntitiesList=testData.getData().get(PartyEntity.class);
		for(PartyEntity partyEntity:partyEntitiesList){
			if(partyEntity.getAction().equalsIgnoreCase("edit") && partyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				PartySearchPage partySearchPage=new PartySearchPage(driver, "Party Search Page");
				partySearchPage.navigateToPartySearchPage();
				partySearchPage.fillAndSearchPartyDetails(partyEntity);
				partySearchPage.selectSearchPartyCode(partyEntity);
				partySearchPage.navigateToPartyDetailsPage();

				PartyDetailsCreateEditPage partyDetailsEditPage=new PartyDetailsCreateEditPage(driver, "Party Details Create Page");
				partyDetailsEditPage.fillandSubmitPartyDetails(partyEntity, assertReference);

				/**************For Editing Party Click on Edit button*****************/
				testData.updateRecordsForCriteria(partyEntity);
				if(partyEntity.getBooleanValueForField("ConfigPartyRoles")) {
					/************************Edit and configParty Role in same line*************/
					List<PartyRolesFunctDetailsEntity> partyRolesFunctionsEntityList = testData.getData().get(PartyRolesFunctDetailsEntity.class);
					for(PartyRolesFunctDetailsEntity partyRolesFunctDetailsData:partyRolesFunctionsEntityList){
						if((partyRolesFunctDetailsData.getAction().equalsIgnoreCase("add") || partyRolesFunctDetailsData.getAction().equalsIgnoreCase("edit")) && partyRolesFunctDetailsData.getStepGroup().equalsIgnoreCase(stepGroup)){
							//partyDetailsEditPage.navigateToPartyRoles(partyEntity);
							/*List<PartyRolesFunctionsEntity> partyRolesFunctionsEntityList=testData.get*/
							PartyPartyRolesPartyFunctions partyPartyRolesPartyFunctions=new PartyPartyRolesPartyFunctions(driver, "Party_Party Function");
							/********************For Creating New Member*********************/
							partyPartyRolesPartyFunctions.createNewPartyRole(partyRolesFunctDetailsData);
							/********************For Editing Created Member*********************/
							partyPartyRolesPartyFunctions.selectFunctionCodeFromSearchPage(partyRolesFunctDetailsData);

							/********************For Editing Created Member*********************/
							PartyPartyRolesPartyFunctionDetails partyPartyRolesPartyFunctionDetails=new PartyPartyRolesPartyFunctionDetails(driver, "Party Function Details");
							partyPartyRolesPartyFunctionDetails.fillAndSubmitPartyFunctionDetails(partyRolesFunctDetailsData, assertReference);

							/******************Click on Proceed then select Role then Click on Next*******************/
							if(partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("MEMBER")){
								List<PartyRolesMemberDetailEntity> partyRolesMemberDetailEntityList=testData.getData().get(PartyRolesMemberDetailEntity.class);
								for(PartyRolesMemberDetailEntity partyRolesMemberDetailEntity :partyRolesMemberDetailEntityList){
									if((partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("add")||partyRolesMemberDetailEntity.getAction().equalsIgnoreCase("edit")) && partyRolesMemberDetailEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
										PartyPartyRolesMemberDOB partyPartyRolesMemberDOB=new PartyPartyRolesMemberDOB(driver, "Member DOB ");
										partyPartyRolesMemberDOB.navigateToMemberDOBPage();
										partyPartyRolesMemberDOB.fillAndSubmitPartyRolesMemberDetails(partyRolesMemberDetailEntity, assertReference);
										/************************fill Member DOB Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("CLAIMANT")) {
								List<PartyPartyRoleClaimantEntity> partyRoleClaimantEntitieList=testData.getData().get(PartyPartyRoleClaimantEntity.class);
								for(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntityData:partyRoleClaimantEntitieList){
									if((partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("add")||partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("edit")) && partyPartyRoleClaimantEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										Party_PartyRole_Claimant partyPartyRoleClaimant=new  Party_PartyRole_Claimant(driver, "Claimant Party Rule ");
										partyPartyRoleClaimant.navigateToClaimantRulePage();
										partyPartyRoleClaimant.fillandSearchPartyDetails(partyPartyRoleClaimantEntityData, assertReference);
										/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("BUYER")) {
								List<PartyRoleBuyerMastINDEntity> partyRoleBuyerMastINDEntityList=testData.getData().get(PartyRoleBuyerMastINDEntity.class);
								for(PartyRoleBuyerMastINDEntity partyRoleBuyerMastINDEntityListData:partyRoleBuyerMastINDEntityList){
									if((partyRoleBuyerMastINDEntityListData.getAction().equalsIgnoreCase("add")||partyRoleBuyerMastINDEntityListData.getAction().equalsIgnoreCase("edit")) && partyRoleBuyerMastINDEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PartyPartyRolesBuyerMasterIND partyPartyRolesBuyerMasterIND=new  PartyPartyRolesBuyerMasterIND(driver, "Buyer Master IND");
										partyPartyRolesBuyerMasterIND.navigateToBuyerMasterIND();
										partyPartyRolesBuyerMasterIND.fillandSubmitPartyPartyRolesBuyerMasterIND(partyRoleBuyerMastINDEntityListData, assertReference);
										/************************fill Buyer Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("BROKER")||partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("DEVLP-OFF")) {
								List<PartyRolBrokerCommiEntity> partyRolesBrokerageCommiEntityList=testData.getData().get(PartyRolBrokerCommiEntity.class);
								for(PartyRolBrokerCommiEntity partyRolesBrokerageCommiEntityListData:partyRolesBrokerageCommiEntityList){
									if((partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("add")||partyRolesBrokerageCommiEntityListData.getAction().equalsIgnoreCase("edit")) && partyRolesBrokerageCommiEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){
										PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Brokerage Commission");
										partyPartyRolesBrokerageCommission.navigateToBrokerCommission();
										partyPartyRolesBrokerageCommission.fillandSubmitPartyPartyRolesBrokerageCommission(partyRolesBrokerageCommiEntityListData, assertReference);
										/************************fill Buyer Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
							else if (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("SURVEYOR")) {
								List<PartyPartyRoleClaimantEntity> partyRoleClaimantEntitieList=testData.getData().get(PartyPartyRoleClaimantEntity.class);
								for(PartyPartyRoleClaimantEntity partyPartyRoleClaimantEntityData:partyRoleClaimantEntitieList){
									if((partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("add")||partyPartyRoleClaimantEntityData.getAction().equalsIgnoreCase("edit")) && partyPartyRoleClaimantEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
										Party_PartyRole_Claimant partyPartyRoleClaimant=new  Party_PartyRole_Claimant(driver, "SURVEYOR DETAILS");
										partyPartyRoleClaimant.fillandSearchPartyDetails(partyPartyRoleClaimantEntityData, assertReference);
									}
								}
							}
							else if ((partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("PAGENT")) || (partyRolesFunctDetailsData.getStringValueForField("FunctionTextField").equalsIgnoreCase("AGENT"))) {
								List<PartyAgentPartyRuleEntity> PartyAgentPartyRuleEntityList=testData.getData().get(PartyAgentPartyRuleEntity.class);
								for(PartyAgentPartyRuleEntity partyAgentPartyRuleEntityListData:PartyAgentPartyRuleEntityList){
									if((partyAgentPartyRuleEntityListData.getAction().equalsIgnoreCase("add")||partyAgentPartyRuleEntityListData.getAction().equalsIgnoreCase("edit"))  && partyAgentPartyRuleEntityListData.getStepGroup().equalsIgnoreCase(stepGroup)){	
										PartyAgentPartyRule partyAgentPartyRule=new  PartyAgentPartyRule(driver, "Prospective Agent Party Rule");
										//PartyPartyRolesBrokerageCommission partyPartyRolesBrokerageCommission=new  PartyPartyRolesBrokerageCommission(driver, "Claimant Party Rule ");
										//partyPartyRoleClaimant.navigateToClaimantRulePage();
										partyAgentPartyRule.navigateToAgentPartyRule();
										partyAgentPartyRule.fillandSubmitPartyAgentPartyRuleEntity(partyAgentPartyRuleEntityListData, assertReference);
										/************************fill Claimant Data Then Proceed then Save in 1 callCount***********************/
									}
								}
							}
						}
					}
				}
		//	}
			else if(partyEntity.getBooleanValueForField("ConfigContacts")){
				List<PartyContactsDetailsEntity> partyContactsDetailsEntityList= testData.getData().get(PartyContactsDetailsEntity.class);
				for(PartyContactsDetailsEntity partyContactsDetailsEntityData:partyContactsDetailsEntityList){
					if((partyContactsDetailsEntityData.getAction().equalsIgnoreCase("add")||partyContactsDetailsEntityData.getAction().equalsIgnoreCase("edit"))&& partyContactsDetailsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
						PartyContactsPage partyContactsPage=new PartyContactsPage(driver, "Party Contacts");
						partyContactsPage.navigateToContacts(partyContactsDetailsEntityData);
						partyContactsPage.selectConatctTypeAndnavigatePartyContactDeatail(partyContactsDetailsEntityData);
						PartyContactsPageDetailsPage partyContactsPageDetailsPage=new PartyContactsPageDetailsPage(driver, "PartyContactsPageDetailsPage");
						partyContactsPageDetailsPage.navigateContactDetails();
						partyContactsPageDetailsPage.fillandSubmitPartyContactDetails(partyContactsDetailsEntityData, assertReference);
					}
				}
			}
			else if(partyEntity.getBooleanValueForField("ConfigRelatedParties")){
				List<RelatedPartyRelationsEntity> relatedPartyRelationsEntities=testData.getData().get(RelatedPartyRelationsEntity.class);
				for(RelatedPartyRelationsEntity relatedPartyRelationsEntityData:relatedPartyRelationsEntities){
					if((relatedPartyRelationsEntityData.getAction().equalsIgnoreCase("add")||relatedPartyRelationsEntityData.getAction().equalsIgnoreCase("edit"))&& relatedPartyRelationsEntityData.getStepGroup().equalsIgnoreCase(stepGroup)){
						Party_Relations party_RelationsSearchPage=new Party_Relations(driver, "Party Relation Search Page");
						party_RelationsSearchPage.createNewPartyRelation(relatedPartyRelationsEntityData);
						party_RelationsSearchPage.selectRealtionFromSearchPage(relatedPartyRelationsEntityData);
						Party_Relations party_RelationsCreatePage=new Party_Relations(driver, "Party Relation Create Page");
						party_RelationsCreatePage.fillandSearchPartyDetails(relatedPartyRelationsEntityData, assertReference);
					}
				}
			}
			else if(partyEntity.getBooleanValueForField("ConfigFollowup")){
				List<PartyFollowupDetailsEntity> partyFollowupDetailsEntitiesList=testData.getData().get(PartyFollowupDetailsEntity.class);
				for(PartyFollowupDetailsEntity partyFollowupDetailsEntityData:partyFollowupDetailsEntitiesList){
					if(partyFollowupDetailsEntityData.getAction().equalsIgnoreCase("add")||partyFollowupDetailsEntityData.getAction().equalsIgnoreCase("edit")){
						PartyFollowupListPage partyFollowupSearchPage=new PartyFollowupListPage(driver, "Party follow Page");
						partyFollowupSearchPage.createNewFollowupForParty(partyFollowupDetailsEntityData);
						PartyFollowupDetails partyFollowupDetailsCreate=new PartyFollowupDetails(driver, "Party follow up Cretae New Page");
						partyFollowupDetailsCreate.fillandSubmitFollowupDetails(partyFollowupDetailsEntityData, assertReference);
					}
				}
			}
		}
	}
}
}
