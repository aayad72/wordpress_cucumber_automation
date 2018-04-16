package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@regression",
		features="src/test/resources/com/app/features/",
		glue="com/app/step_definitions/",
		dryRun=false 
)
public class RegressionRunner extends AbstractTestNGCucumberTests {

}
