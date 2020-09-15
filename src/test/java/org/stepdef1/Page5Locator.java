package org.stepdef1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5Locator extends StepDefBaseClass1 {

	public Page5Locator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement id;
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement searchH;
	
	@FindBy(id="logout")
	private WebElement lOut;

	public WebElement getlOut() {
		return lOut;
	}

	public WebElement getId() {
		return id;
	}

	public WebElement getSearchH() {
		return searchH;
	}
	
}
