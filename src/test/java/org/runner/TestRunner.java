package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse\\Cucumber\\src\\test\\resources\\FeatureFile\\login.feature",glue="org.stepdefinition",strict=false,dryRun=false,monochrome=true,
plugin= {"html:D:\\eclipse\\Cucumber\\AllReports\\htmlreport",
          "junit:D:\\eclipse\\Cucumber\\AllReports\\junitreport\\fb.xml",
          "json:D:\\eclipse\\Cucumber\\AllReports\\jsonreport\\facebook.json"})
public class TestRunner {

}
