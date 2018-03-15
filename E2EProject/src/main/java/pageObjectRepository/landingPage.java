package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public landingPage(WebDriver driver){
		this.driver= driver;
	}
	
	WebDriver driver;
	By username = By.id("login1");
	By password = By.name("passwd");
	By home = By.linkText("Home");
	By logo = By.linkText("Forgot Password?");
	By go = By.xpath("//input[@name='proceed']");

	public WebElement Username() {

		return driver.findElement(username);
	}

	public WebElement Password() {

		return driver.findElement(password);
	}

	public WebElement Home() {

		return driver.findElement(home);
	}
	
	public WebElement Logo() {

		return driver.findElement(logo);
	}
	
	public WebElement Go() {

		return driver.findElement(go);
	}

}
