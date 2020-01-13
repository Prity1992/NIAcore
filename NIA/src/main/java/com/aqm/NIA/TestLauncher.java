package com.aqm.NIA;

import java.io.File;

import com.aqm.framework.constant.Database;
import com.aqm.framework.core.FrameworkServices;
import com.aqm.framework.entities.TestPlan;
import com.aqm.staf.library.FunctionalKeywords;
import com.aqm.staf.library.ScenarioTestData;

public class TestLauncher {
	 
	@SuppressWarnings("static-access")
	public static void main (String[] args) throws Exception {
		FrameworkServices frameworkServices= null;
		try {
			frameworkServices = new FrameworkServices(false, Database.SQLSERVER);
			
			frameworkServices.uploadData("D:\\NIATestAutomationSuitesAndTestData\\0000_MasterTestSuite.xlsx");
			TestPlan testPlan = frameworkServices.createExecutionRecords(null);
			frameworkServices.launchExecution(testPlan, new FunctionalKeywords(), ScenarioTestData.class);
			System.out.println("Execution Completed.");
		}
		catch(Exception e) {
			e.printStackTrace();
			}
}
}