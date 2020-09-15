package org.stepdef1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass1 extends StepDefBaseClass1{

	Page1Locator p1;
	Page2Locator p2;
	Page3Locator p3;
	Page4Locator p4;
	Page5Locator p5;
	
	@Given("User is in the Adactin login page")
	public void user_is_in_the_Adactin_login_page() {
	    launch("http://adactinhotelapp.com/");
	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) {
		p1 = new Page1Locator();
		fill(p1.getUn(), string);
		fill(p1.getPass(), string2);
	}

	@Then("User can click the Login button")
	public void user_can_click_the_Login_button() {
	    p1 = new Page1Locator();
	    c(p1.getLogin());
	}

	@Given("User is in the Search hotel page and user should select the location, hotel, room type and number of rooms")
	public void user_is_in_the_Search_hotel_page_and_user_should_select_the_location_hotel_room_type_and_number_of_rooms() {
		p2 = new Page2Locator();
		dd(p2.getLocationDD(), "Sydney");
		dd(p2.getHotelsDD(), "Hotel Sunshine");
		dd(p2.getRoomtypeDD(), "Super Deluxe");
		dd(p2.getRoomnosDD(), "1 - One");		
	}

	@When("User enter the {string} and {string} date")
	public void user_enter_the_and_date(String string, String string2) {
	   p2 = new Page2Locator();
	   fill(p2.getCheckinDate(), string);
	   fill(p2.getCheckoutDate(), string2);
	}

	@When("User select the Adult and Children per room")
	public void user_select_the_Adult_and_Children_per_room() {
	   p2 = new Page2Locator();
	   dd(p2.getAdults(), "1 - One");
	   dd(p2.getChildren(), "0 - None");
	}

	@Then("User can click the Search button")
	public void user_can_click_the_Search_button() {
	    p2 = new  Page2Locator();
	    c(p2.getSubmitbtn());
	}

	@Given("User is in select hotel page and user should select the hotel and click Continue button")
	public void user_is_in_select_hotel_page_and_user_should_select_the_hotel_and_click_Continue_button() {
	    p3 = new Page3Locator();
	    c(p3.getRadiobtn());
	    c(p3.getContinuebtn());
	}

	@Given("User is in Book hotel page and user should enter the {string}, {string}, {string} and {string}")
	public void user_is_in_Book_hotel_page_and_user_should_enter_the_and(String string, String string2, String string3, String string4) {
		p4 = new Page4Locator();
		fill(p4.getFirstName(), string);
		fill(p4.getLastName(), string2);
		fill(p4.getAddress(), string3);
		js("arguments[0].setAttribute('value','1234567891234567')", p4.getCc());
	}

	@Given("User should select credit card type and expiry date")
	public void user_should_select_credit_card_type_and_expiry_date() {
	    p4 = new Page4Locator();
	    dd(p4.getCcType(), "American Express");
	    dd(p4.getExpMonth(), "December");
	    dd(p4.getExpYear(), "2022");
	}

	@When("User should enter the {string}")
	public void user_should_enter_the(String string) {
	    p4 = new Page4Locator();
	    fill(p4.getCvv(), string);
	}

	@Then("User can click the Book Now button")
	public void user_can_click_the_Book_Now_button() {
	    p4 = new Page4Locator();
	    c(p4.getBook());
	}

	@When("User is in booking confirmation page, User should get the orderId")
	public void user_is_in_booking_confirmation_page_User_should_get_the_orderId() throws InterruptedException {
	    p5 = new Page5Locator();
	    getOId(p5.getId());
	    Thread.sleep(3000);
	}
	
	@Then("User should click the search hotel option")
	public void user_should_click_the_search_hotel_option() {
	    p5 = new Page5Locator();
	    c(p5.getSearchH());
	}
	
	@Then("User should logout the application")
	public void user_should_logout_the_application() {
	    p5 = new Page5Locator();
	    c(p5.getlOut());
	    kill();
	}
}
