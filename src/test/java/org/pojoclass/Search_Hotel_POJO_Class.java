package org.pojoclass;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_POJO_Class extends BaseClass {

	public Search_Hotel_POJO_Class() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement noOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement adults;
	@FindBy(id = "child_room")
	private WebElement children;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
