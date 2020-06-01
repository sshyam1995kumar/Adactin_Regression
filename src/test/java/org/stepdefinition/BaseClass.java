package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sshya\\eclipse-workspace111\\Cucumber_Adactin\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void url(String s) {
		driver.get(s);
	}

	public static void textBox(String s, WebElement e) {
		e.sendKeys(s);
	}

	public static void clickButton(WebElement e) {
		e.click();
	}

	public static void dropdown(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void print(WebElement e) {
		String orderno = e.getAttribute("value");
		System.out.println("The Order number is: " + orderno);
	}
}
