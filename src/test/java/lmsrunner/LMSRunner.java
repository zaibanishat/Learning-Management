package lmsrunner;

//public class LMSRunner {
	//package org.gic.lms;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\yasee\\eclipse-workspace\\learning-management1\\src\\test\\java\\lmsrunner\\courses1.feature"
			,glue= {"stepDefination1"}
	)
			//format= {"pretty","html:reports/test-report"})
	public class LMSRunner {

	}


