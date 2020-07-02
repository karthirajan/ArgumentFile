package com.centric.stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="null",glue = "com.centric.stepdefinition",plugin = {"html:target","json:target/reports.json"},tags = {"null"})


public class TestRunner {


}