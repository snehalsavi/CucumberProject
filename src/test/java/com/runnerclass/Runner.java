package com.runnerclass;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="FeatureFolder",
		glue="com.stepdefination",
		tags= {"@Test","~@donot"},
		plugin  = {"pretty:STDOUT","html:target/HTMLCucumberReport","json:target/Cucumber.json"},
		monochrome= true
)

public class Runner extends AbstractTestNGCucumberTests{

	@Test
	public void f()
	{
		
	}
}
