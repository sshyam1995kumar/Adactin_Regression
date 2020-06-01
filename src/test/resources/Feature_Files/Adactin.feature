Feature: To validate Booking functionality of Adactin

  Scenario: To verify Login functionality of Adactin Hotel with Valid credentials
    Given User enter into Adactin application
    When User enter Username ,Password and clicks Login button
      | Username | samsamsam |
      | Password | samsamsam |
    Then User navigated to Search Hotel page

  Scenario: To verify user can search a hotel with given credentials
    Given User has to be there in Search Hotel page
    When User selects the Location,Hotel,Room Type,No of Rooms,Check In Date,Check Out Date,Adults per Room,Children per Room and clicks Search Button
      | Location          | Los Angeles    |
      | Hotel             | Hotel Sunshine |
      | Room_Type         | Super Deluxe   |
      | No_of_Rooms       | 2 - Two        |
      | Check_In_Date     | 01/08/2020     |
      | Check_Out_Date    | 02/08/2020     |
      | Adults_per_Room   | 3 - Three      |
      | Children_per_Room | 4 - Four       |
    Then User navigated to Select Hotel page

  Scenario: To verify user can select the hotel
    Given User has to be there in Select Hotel page
    When User selects the hotel and click continue
    Then User navigated to Book A Hotel Page

  Scenario: To verify user can book a hotel
    Given User has to be there in Book A Hotel Page
    When User enter Firstname,Lastname,BillingAddress,CreditCardNo,CreditCardType,ExpiryDate,CVVNo and click BookNow button
      | Firstname      | Shyam            |
      | Lastname       | Kumar            |
      | BillingAddress | Chennai-100      |
      | CreditCardNo   | 1234567890123456 |
      | CreditCardType | American Express |
      | ExpiryMon      | December         |
      | ExpiryYr       |             2022 |
      | CVVNo          |              121 |
    Then User navigated to Booking Confirm Page

  Scenario: To verify user get Booking Confirmation Details
    Given User has to be there in Booking Confirm Page
    When User Prints OrderNo and clicks MyItinerary
    Then User navigated to Booked Itinerary
    
    Scenario: To verify user can see booked Hotels
    Given User has to be there in Booked Itinerary page
    When User checks the booked hotel and click Logout
    Then User navigates to Logout Page
