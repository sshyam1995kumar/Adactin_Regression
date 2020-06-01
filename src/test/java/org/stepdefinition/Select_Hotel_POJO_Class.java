package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_POJO_Class extends BaseClass {

	public Select_Hotel_POJO_Class() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	@FindBy(id = "continue")
	private WebElement continueButton;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
