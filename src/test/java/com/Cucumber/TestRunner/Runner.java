package com.Cucumber.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * This Runner is for LoginTest.feature
 */
@RunWith(Cucumber.class)

@CucumberOptions(features="Features",glue= {"com.Cucumber.StepDefinition.LoginSteps"},

		plugin= {
				"pretty","html:target/CucumberHTMLReport.html"
		}		
		)


public class Runner {

}
