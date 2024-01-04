package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditMeetingPage extends BasePage {
	
	public EditMeetingPage(WebDriver driver) {
		super(driver); 
	}
		@FindBy(xpath="//span[text()='Unit Testing Room']")
		public WebElement Meet;
	
	    @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[3]/button[2]")
	    public WebElement Edit;
	    
	    @FindBy(name="meetName")
	    public WebElement Title;
	    
	    @FindBy(xpath="//button[text()='UPDATE MEETING']")
	    public WebElement update;
	    
	    @FindBy(xpath="//button[text()='Update']")
	    public WebElement up;
	    
	    
	    @FindBy(name="meetDescription")
	    public WebElement Desc;
	    
	    @FindBy(xpath="/html/body/div/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[2]/div[7]/div/div[1]/div/div/div/div/div/input")
	    public WebElement Add;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[2]/div[7]/div/div[2]/div/div/svg")
	    public WebElement svg;
	   
	

}
