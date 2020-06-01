package org.stepdefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {

	// Login Page
	@Given("User enter into Adactin application")
	public void user_enter_into_Adactin_application() {
		browserLaunch();
		url("http://adactinhotelapp.com/");
	}

	@When("User enter Username ,Password and clicks Login button")
	public void user_enter_Username_Password_and_clicks_Login_button(io.cucumber.datatable.DataTable d) {
		Map<String, String> m = d.asMap(String.class, String.class);
		Login_POJO_Class p1 = new Login_POJO_Class();
		textBox(m.get("Username"), p1.getUserName());
		textBox(m.get("Password"), p1.getPassword());
		clickButton(p1.getLogin());
	}

	@Then("User navigated to Search Hotel page")
	public void user_navigated_to_Search_Hotel_page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("SearchHotel"));
	}

	// Search Hotel Page
	@Given("User has to be there in Search Hotel page")
	public void user_has_to_be_there_in_Search_Hotel_page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("SearchHotel"));
	}

	@When("User selects the Location,Hotel,Room Type,No of Rooms,Check In Date,Check Out Date,Adults per Room,Children per Room and clicks Search Button")
	public void user_selects_the_Location_Hotel_Room_Type_No_of_Rooms_Check_In_Date_Check_Out_Date_Adults_per_Room_Children_per_Room_and_clicks_Search_Button(
			io.cucumber.datatable.DataTable d) {
		Map<String, String> m = d.asMap(String.class, String.class);
		Search_Hotel_POJO_Class p2 = new Search_Hotel_POJO_Class();
		dropdown(p2.getLocation(), m.get("Location"));
		dropdown(p2.getHotels(), m.get("Hotel"));
		dropdown(p2.getRoomType(), m.get("Room_Type"));
		dropdown(p2.getNoOfRooms(), m.get("No_of_Rooms"));
		textBox(m.get("Check_In_Date"), p2.getCheckInDate());
		textBox(m.get("Check_Out_Date"), p2.getCheckOutDate());
		dropdown(p2.getAdults(), m.get("Adults_per_Room"));
		dropdown(p2.getChildren(), m.get("Children_per_Room"));
		clickButton(p2.getSubmit());
	}

	@Then("User navigated to Select Hotel page")
	public void user_navigated_to_Select_Hotel_page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("SelectHotel"));
	}

	// Select Hotel Page
	@Given("User has to be there in Select Hotel page")
	public void user_has_to_be_there_in_Select_Hotel_page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("SelectHotel"));
	}

	@When("User selects the hotel and click continue")
	public void user_selects_the_hotel_and_click_continue() {
		Select_Hotel_POJO_Class p3 = new Select_Hotel_POJO_Class();
		clickButton(p3.getRadio());
		clickButton(p3.getContinueButton());
	}

	@Then("User navigated to Book A Hotel Page")
	public void user_navigated_to_Book_A_Hotel_Page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("BookHotel"));
	}

	// Book A Hotel Page
	@Given("User has to be there in Book A Hotel Page")
	public void user_has_to_be_there_in_Book_A_Hotel_Page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("BookHotel"));

	}

	@When("User enter Firstname,Lastname,BillingAddress,CreditCardNo,CreditCardType,ExpiryDate,CVVNo and click BookNow button")
	public void user_enter_Firstname_Lastname_BillingAddress_CreditCardNo_CreditCardType_ExpiryDate_CVVNo_and_click_BookNow_button(
			io.cucumber.datatable.DataTable d) throws InterruptedException {
		Map<String, String> m = d.asMap(String.class, String.class);
		Book_A_Hotel_POJO_Class p4 = new Book_A_Hotel_POJO_Class();
		textBox(m.get("Firstname"), p4.getFirstname());
		textBox(m.get("Lastname"), p4.getLastname());
		textBox(m.get("BillingAddress"), p4.getAddress());
		textBox(m.get("CreditCardNo"), p4.getCcno());
		dropdown(p4.getCctype(), m.get("CreditCardType"));
		dropdown(p4.getMon(), m.get("ExpiryMon"));
		dropdown(p4.getYear(), m.get("ExpiryYr"));
		textBox(m.get("CVVNo"), p4.getCvv());
		clickButton(p4.getBook());
		Thread.sleep(5000);
	}

	@Then("User navigated to Booking Confirm Page")
	public void user_navigated_to_Booking_Confirm_Page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("BookingConfirm"));
	}

	// Booking Confirm Page
	@Given("User has to be there in Booking Confirm Page")
	public void user_has_to_be_there_in_Booking_Confirm_Page() {
		Assert.assertTrue("invalid page", driver.getCurrentUrl().contains("BookingConfirm"));

	}

	@When("User Prints OrderNo and clicks MyItinerary")
	public void user_Prints_OrderNo_and_clicks_MyItinerary() {
		Booking_Confirmation_POJO_Class p5 = new Booking_Confirmation_POJO_Class();
		print(p5.getOrderno());
		clickButton(p5.getItinerary());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("User navigated to Booked Itinerary")
	public void user_navigated_to_Booked_Itinerary() {
		Assert.assertTrue("Invalid Page", driver.getCurrentUrl().contains("BookedItinerary"));
	}

	// Booked Itinerary Page
	@Given("User has to be there in Booked Itinerary page")
	public void user_has_to_be_there_in_Booked_Itinerary_page() {
		Assert.assertTrue("Invalid Page", driver.getCurrentUrl().contains("BookedItinerary"));

	}

	@When("User checks the booked hotel and click Logout")
	public void user_checks_the_booked_hotel_and_click_Logout() {
		Booked_Itinerary_POJO_Class p6 = new Booked_Itinerary_POJO_Class();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickButton(p6.getLogout());
	}

	@Then("User navigates to Logout Page")
	public void user_navigates_to_Logout_Page() {
		Assert.assertTrue("Invalid Page", driver.getCurrentUrl().contains("Logout"));
		System.out.println("Succesfully Booked a room in a Hotel");
	}

}
