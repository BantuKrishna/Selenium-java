package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsfeedPage extends BasePage {
	

	public NewsfeedPage(WebDriver driver) {
		super(driver); 
		
	}
	
	@FindBy(xpath= "/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]/div[2]/span")
	public WebElement what;
	
	@FindBy(xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/div/div[1]")
	public WebElement whats;
	
	@FindBy(id ="public")
	public WebElement pub;
	
	@FindBy(id="imageType")
	public WebElement img;
	
	@FindBy(xpath="//button[text()='Post']")
	public WebElement post;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[4]/div[1]/div/span")
	public WebElement like;
	
	
	public void what() {
		what.click();
	}
	
    public void whats(String name) {
    	whats.sendKeys(name);
    }
    
    public void pub() {
    	pub.click();
    }
    
//    public void img() {
//    	img.click();
//    }
}