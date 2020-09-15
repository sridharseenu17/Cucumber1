package org.stepdef1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3Locator extends StepDefBaseClass1{
	
	public Page3Locator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	

}
