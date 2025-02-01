package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Weekend930maven\\src\\test\\resources\\FeatureFile\\Registration.feature",
glue="stepDefination",
plugin= {"pretty","html:target/cucumber-reports/register.html"},
tags ="@signup or @login",
monochrome = true)

public class TestRunner {

}
