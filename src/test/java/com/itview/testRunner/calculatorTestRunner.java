package com.itview.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Features"},
		glue= {"com.itview.basictestcases"},
		plugin= {"pretty","html:tagret/cucumber-report.html"},
		monochrome=true
		
		)

public class calculatorTestRunner {

}
