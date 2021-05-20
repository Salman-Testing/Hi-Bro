package org.rerun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions (features="@failedCases\\Failures.txt",glue="org.steps",dryRun=false
,monochrome=true
,strict=true,snippets=SnippetType.CAMELCASE)



public class RerunnerClass {

}
