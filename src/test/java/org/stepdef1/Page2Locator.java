package org.stepdef1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2Locator extends StepDefBaseClass1{

	public Page2Locator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement locationDD;
	
	@FindBy(id="hotels")
	private WebElement hotelsDD;
	
	@FindBy(id="room_type")
	private WebElement roomtypeDD;
	
	@FindBy(id="room_nos")
	private WebElement roomnosDD;
	
	@FindBy(id="datepick_in")
	private WebElement checkinDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutDate;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement submitbtn;

	public WebElement getLocationDD() {
		return locationDD;
	}

	public WebElement getHotelsDD() {
		return hotelsDD;
	}

	public WebElement getRoomtypeDD() {
		return roomtypeDD;
	}

	public WebElement getRoomnosDD() {
		return roomnosDD;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
}
