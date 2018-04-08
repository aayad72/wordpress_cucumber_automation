package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report"
		},
		tags = "@beans",
		features="src/test/resources/com/app/features/",
		glue="com/app/step_definitions/",
		dryRun=false
)
public class CukesRunner extends AbstractTestNGCucumberTests {
	

}
