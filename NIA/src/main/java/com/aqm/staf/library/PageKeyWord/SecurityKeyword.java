package com.aqm.staf.library.PageKeyWord;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.aqm.framework.entities.ExecutionTestSteps;
import com.aqm.framework.core.TestData;
import com.aqm.framework.core.CustomAssert;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.pages.common.AssignUserToRole;
import com.aqm.staf.library.pages.common.UserSearch;
import com.aqm.testing.testDataEntity.SecurityPartyEntity;


public class SecurityKeyword extends FunctionalKeywords {
	private static  String keyword;
	private static 	String configData;
	private static String stepGroup;

	public void createSuperuser(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		keyword = executionTestStep.getExecutionTestStepMasterAutomationScriptStepKeyword();
		configData = executionTestStep.getExecutionTestStepMasterAutomationScriptStepConfigData();
		stepGroup = executionTestStep.getExecutionTestStepMasterAutomationScriptStepStepGroup();
		List<SecurityPartyEntity> securityPartyEntityList=testData.getData().get(SecurityPartyEntity.class);
		for(SecurityPartyEntity securityPartyEntity:securityPartyEntityList){
			if(securityPartyEntity.getAction().equalsIgnoreCase("add")&& securityPartyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				UserSearch userSearch=new UserSearch(driver, "User Search");
				userSearch.navigateToUserSearchPage(securityPartyEntity);
				userSearch.navigateToAssignUserToRole(securityPartyEntity);
				AssignUserToRole assignUserToRole=new AssignUserToRole(driver, "Assign User To Role");
				assignUserToRole.fillandSubmitAssignUserToRoleDetails(securityPartyEntity, assertReference);
				userSearch.fetchUserCode(securityPartyEntity);
				testData.updateRecordsForCriteria(securityPartyEntity);
				setEditUserCodeDependency(securityPartyEntity, testData);
			}
		}
	}
	private void setEditUserCodeDependency(SecurityPartyEntity securityPartyEntity, TestData testData) {
		if(securityPartyEntity.getStringValueForField("DependencyForSuperUserUserCode")!=null){
			ArrayList<SecurityPartyEntity> securityPartyEntityList = testData.getObjectByReference(testData.getData().get(SecurityPartyEntity.class), securityPartyEntity.getStringValueForField("DependencyForSuperUserUserCode"));
			for (SecurityPartyEntity securityPartyEntityData : securityPartyEntityList) {
				securityPartyEntityData.setStringValueForField("UserCode", securityPartyEntity.getStringValueForField("UserCode"));
			}
		}
	}
	public void  editSuperuser(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<SecurityPartyEntity> securityPartyEntityList=testData.getData().get(SecurityPartyEntity.class);
		for(SecurityPartyEntity securityPartyEntity:securityPartyEntityList){
			if(securityPartyEntity.getAction().equalsIgnoreCase("edit")&& securityPartyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				UserSearch userSearch=new UserSearch(driver, "User Search");
				userSearch.navigateToUserSearchPage(securityPartyEntity);
				userSearch.fillAndSearchSecurityDetails(securityPartyEntity);
				userSearch.selectSearchSuperuserPartyCode(securityPartyEntity);
				userSearch.navigateToAssignUserToRole(securityPartyEntity);
				AssignUserToRole assignUserToRole=new AssignUserToRole(driver, "Assign User To Role");
				assignUserToRole.fillandSubmitAssignUserToRoleDetails(securityPartyEntity, assertReference);
			}
		}
	}

	public void  verifySuperuser(TestData testData,ExecutionTestSteps executionTestStep,CustomAssert assertReference,WebDriver driver,String stepGroup) throws InterruptedException{
		List<SecurityPartyEntity> securityPartyEntityList=testData.getData().get(SecurityPartyEntity.class);
		for(SecurityPartyEntity securityPartyEntity:securityPartyEntityList){
			if(securityPartyEntity.getAction().equalsIgnoreCase("verify")&& securityPartyEntity.getStepGroup().equalsIgnoreCase(stepGroup)){
				UserSearch userSearch=new UserSearch(driver, "User Search");
				userSearch.navigateToUserSearchPage(securityPartyEntity);
				userSearch.fillAndSearchSecurityDetails(securityPartyEntity);
				userSearch.selectSearchSuperuserPartyCode(securityPartyEntity);
				userSearch.navigateToAssignUserToRole(securityPartyEntity);
				AssignUserToRole assignUserToRole=new AssignUserToRole(driver, "Assign User To Role");
				assignUserToRole.fillandSubmitAssignUserToRoleDetails(securityPartyEntity, assertReference);
			}
		}
	}
}


