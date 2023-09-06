package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import io.cucumber.junit.CucumberOptions;



   @RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDefinition",
//		plugin={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml","html:target/cucumber_html_report.html","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		dryRun=false,
		monochrome=true,
		tags="@TC_03"
	
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	   
}

   
   