package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	@FindBy (name="email")
	private WebElement email;
	
	@FindBy (name="password")
	private WebElement password;
	
	@FindBy (xpath=" //button[normalize-space()='Login']")
	private WebElement  xpath;
	
	
	
	
	
	public loginpage (WebDriver driver){
    PageFactory.initElements(driver, this);
	}
	public void email(String emailid) {
	email.sendKeys(emailid);
	}
	
	
	public void password(String pass) {
	password.sendKeys(pass);
	
	}
	public void xpath() {
	xpath.click();
	}
	
	
	
}
