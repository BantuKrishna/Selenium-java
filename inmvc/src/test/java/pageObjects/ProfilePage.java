package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Settings']")
    public WebElement set;
    
	@FindBy(xpath="//span[@class='flexInline pointer editIconAvatar pointer ']")
	public WebElement img;
	
	@FindBy(xpath="//div[@class='flexAutoCol positionRelative alignCntr']")
	public WebElement pro;
	
	@FindBy(xpath="//button[text()='Upload']")
	public WebElement up;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement can;
	
	@FindBy(xpath="//div[@role='presentation']//span[2]//*[name()='svg']")
	public WebElement canc;
	
	@FindBy(xpath="//span[normalize-space()='Delete']")
	public WebElement del;
}
