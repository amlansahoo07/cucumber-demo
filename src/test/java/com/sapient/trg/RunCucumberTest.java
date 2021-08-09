package com.sapient.trg;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
		features = "src/test/resources",
		glue = "com.sapient.trg",
		plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
		)
public class RunCucumberTest {

}
