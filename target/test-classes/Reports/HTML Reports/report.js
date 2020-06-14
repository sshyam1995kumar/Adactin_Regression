$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature_Files/Adactin.feature");
formatter.feature({
  "name": "To validate Booking functionality of Adactin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify Login functionality of Adactin Hotel with Valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter into Adactin application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_enter_into_Adactin_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Username ,Password and clicks Login button",
  "rows": [
    {
      "cells": [
        "Username",
        "shyam1995"
      ]
    },
    {
      "cells": [
        "Password",
        "shyam@1995"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_Username_Password_and_clicks_Login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to Search Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_navigated_to_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user can search a hotel with given credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to be there in Search Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_has_to_be_there_in_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the Location,Hotel,Room Type,No of Rooms,Check In Date,Check Out Date,Adults per Room,Children per Room and clicks Search Button",
  "rows": [
    {
      "cells": [
        "Location",
        "Los Angeles"
      ]
    },
    {
      "cells": [
        "Hotel",
        "Hotel Sunshine"
      ]
    },
    {
      "cells": [
        "Room_Type",
        "Super Deluxe"
      ]
    },
    {
      "cells": [
        "No_of_Rooms",
        "2 - Two"
      ]
    },
    {
      "cells": [
        "Check_In_Date",
        "01/08/2020"
      ]
    },
    {
      "cells": [
        "Check_Out_Date",
        "02/08/2020"
      ]
    },
    {
      "cells": [
        "Adults_per_Room",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "Children_per_Room",
        "4 - Four"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_selects_the_Location_Hotel_Room_Type_No_of_Rooms_Check_In_Date_Check_Out_Date_Adults_per_Room_Children_per_Room_and_clicks_Search_Button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_navigated_to_Select_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user can select the hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to be there in Select Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_has_to_be_there_in_Select_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the hotel and click continue",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_selects_the_hotel_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_navigated_to_Book_A_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user can book a hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to be there in Book A Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_has_to_be_there_in_Book_A_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Firstname,Lastname,BillingAddress,CreditCardNo,CreditCardType,ExpiryDate,CVVNo and click BookNow button",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Shyam"
      ]
    },
    {
      "cells": [
        "Lastname",
        "Kumar"
      ]
    },
    {
      "cells": [
        "BillingAddress",
        "Chennai-100"
      ]
    },
    {
      "cells": [
        "CreditCardNo",
        "1234567890123456"
      ]
    },
    {
      "cells": [
        "CreditCardType",
        "American Express"
      ]
    },
    {
      "cells": [
        "ExpiryMon",
        "December"
      ]
    },
    {
      "cells": [
        "ExpiryYr",
        "2022"
      ]
    },
    {
      "cells": [
        "CVVNo",
        "121"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_Firstname_Lastname_BillingAddress_CreditCardNo_CreditCardType_ExpiryDate_CVVNo_and_click_BookNow_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to Booking Confirm Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_navigated_to_Booking_Confirm_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user get Booking Confirmation Details",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to be there in Booking Confirm Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_has_to_be_there_in_Booking_Confirm_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Prints OrderNo and clicks MyItinerary",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_Prints_OrderNo_and_clicks_MyItinerary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_navigated_to_Booked_Itinerary()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user can see booked Hotels",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to be there in Booked Itinerary page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_has_to_be_there_in_Booked_Itinerary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks the booked hotel and click Logout",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_checks_the_booked_hotel_and_click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_navigates_to_Logout_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});