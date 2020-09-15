package org.stepdef1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1Locator extends StepDefBaseClass1{

	public Page1Locator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
