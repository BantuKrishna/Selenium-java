package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePage extends BasePage {
	
	public ChangePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//span[text()='Settings']")
    public WebElement set;
    
	@FindBy(xpath="//span[text()='Change Password']")
	public WebElement change;
	
	
	@FindBy(id="currentPassword")
	public WebElement cur;
	
	@FindBy(xpath="//div[@class='width']//button[@aria-label='toggle password visibility']//*[name()='svg']")
	public WebElement eye;
	
	@FindBy(id="newPassword")
	public WebElement newpass;
	
	@FindBy(xpath="//div[@role='presentation']//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]")
	public WebElement eye1;
	
	@FindBy(id="confirmPassword")
	public WebElement confirm;
	
	@FindBy(xpath="//body//div[@role='presentation']//div[@role='presentation']//div[3]//div[1]//div[1]//div[1]//div[1]//button[1]")
	public WebElement eye2;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement can;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement save;
	
	@FindBy(xpath="//p[text()='Current Password and New Password should not same']")
	public WebElement error;
	
	@FindBy(xpath="//p[text()='New Password and Confirm Password both should be same']")
	public WebElement error1;
}
