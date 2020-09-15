package org.stepdef1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StepDefBaseClass1 {
	static WebDriver driver;	
	public static void launch(String s) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\div\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
     	driver.get(s);
     	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static void fill(WebElement w, String s) {
		w.sendKeys(s);
	}
	public static void dd(WebElement w, String s) {
		Select se = new Select(w);
		se.selectByVisibleText(s);
	}
	public static void kill() {
		driver.quit();
	}
	public static void getOId(WebElement w) {
		String orderId = w.getAttribute("value");
		System.out.println(" ");
		System.out.println(orderId);
		System.out.println(" ");
	}
	public static void c(WebElement w) {
		w.click();
	}
	public static void js(String s, WebElement w) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript(s,w);
	}
	public String opt(WebElement w) {
		Select se = new Select(w);
		List<WebElement> options = se.getOptions();
		for(WebElement x: options) {
			String text = x.getText();
		}
		String text = null;
		return text;
	}
}
