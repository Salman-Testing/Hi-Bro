package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JVMReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions (features="src\\test\\resources",glue="org.steps",dryRun=false
,monochrome=true
,strict=true,snippets=SnippetType.CAMELCASE, 
plugin= {"html:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\REPORTS\\HTMLFolder",
		"json:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\REPORTS\\JSONFolder\\JsonReport.json",
		"junit:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\REPORTS\\JUNITFolder\\JunitReport.xml",
		"rerun:C:\\Users\\salma\\eclipse-workspace\\CucumberProject8AM\\failedCases\\Failures.txt"})
public class RunnerClass {
	
	@AfterClass
	public static void reportNew() {
		
		JVMReportGeneration.jvmReportNew(System.getProperty("user.dir")+"\\REPORTS\\JSONFolder\\JsonReport.json");

	}

}
