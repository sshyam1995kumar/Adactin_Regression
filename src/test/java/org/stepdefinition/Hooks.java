package org.stepdefinition;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before(order = 1)
	public void startTime() {
		System.out.println(new Date());
	}

	@After(order = 1)
	public void endTime() {
		System.out.println(new Date());
	}

	@Before(order = 2)
	public void beforescenario() {
		System.out.println("Launching browser");
	}

	@After(order = 2)
	public void afterscenario(Scenario scenario) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");

	}

}
