package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver); 
	}
	
	@FindBy(name ="email")
    public WebElement email;
	
	@FindBy(name ="password")
	public WebElement pass;
	
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement login;
	
	public void email(String name) {
		email.sendKeys(name);
	}
	
	public void pass(String name) {
		pass.sendKeys(name);
	}
	
	public void login() {
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
