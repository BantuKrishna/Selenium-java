package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {
	
	public SettingsPage (WebDriver driver) {
		super(driver);
	}
	
	
     @FindBy(xpath="//span[text()='Settings']")
     public WebElement set;
     
     @FindBy(xpath="//div[@class='baseBlockCntnr']//div[1]//div[1]//div[2]//div[2]//div[1]//span[2]//*[name()='svg']")
     public WebElement edi;
     
     @FindBy(id="standard-adornment-password")
     public WebElement name;
     
     @FindBy(xpath ="//div[@class='flexCol scheduleBg height']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//span[1]//*[name()='svg']")
     public WebElement save;
     
     @FindBy(xpath="//span[text()='Your name updated successfully']")
     public WebElement toast;
     
     @FindBy(xpath="//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//span[2]//*[name()='svg']")
     public WebElement cancel;
}

	
