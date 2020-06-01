package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary_POJO_Class extends BaseClass {
	public Booked_Itinerary_POJO_Class() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
