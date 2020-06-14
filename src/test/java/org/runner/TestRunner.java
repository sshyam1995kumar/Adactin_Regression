package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_Files", glue = "org.stepdefinition", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:src\\test\\resources\\Reports\\HTML Reports",
		"json:src\\test\\resources\\Reports\\JSON Reports\\login.json",
		"junit:src\\test\\resources\\Reports\\JUnit xml Reports\\login.xml",
		"rerun:src\\test\\resources\\Failed_Scenarios\\failed.txt" })
public class TestRunner {
	@AfterClass
	public static void jvmReportGeneration() {

		JVMReports.generateJVMReport("src\\test\\resources\\Reports\\Json Reports\\login.json");
	}
}
