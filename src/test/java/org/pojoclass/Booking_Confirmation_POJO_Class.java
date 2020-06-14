package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_POJO_Class extends BaseClass {
	public Booking_Confirmation_POJO_Class() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

}
