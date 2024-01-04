package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath= "//button[normalize-space()='sign up']")
	WebElement signup;
	
	@FindBy(xpath= "//b[normalize-space()='COMPANY SIGNUP']")
	WebElement companysignup;
	
	@FindBy(xpath= "//input[@name='companyName']")
	WebElement companyname;
	
	@FindBy(xpath= "//input[@placeholder='Search industries type']")
	WebElement search;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/div/form/div/div[3]")
	WebElement indus;
	
	@FindBy(xpath ="//input[@name='contactName']")
	WebElement contactname;
	
	@FindBy(xpath ="//input[@name='email']")
	WebElement email;
	
	@FindBy (xpath="(//div[@id='country'])[1]")
	public WebElement countryDD;
	
	@FindBy(xpath ="/html/body/div/div/div[1]/div[2]/div/form/div/div[6]/div[1]/div/div/ul/li[2]")
	public WebElement India;
	
	@FindBy(xpath ="//div[@id='state']")
	public WebElement stateDD;
	
	@FindBy(xpath ="//li[normalize-space()='Telangana']")
	public WebElement Telangana;
	
	@FindBy(id ="city")
	public WebElement cityDD;
	
	@FindBy(xpath ="//li[normalize-space()='Hyderabad']")
	public WebElement Hyderabad;
	
	@FindBy (xpath ="//input[@type='tel']")
	public  WebElement phno; 
	
	@FindBy (name ="password")
	public WebElement pass;
	
	@FindBy (xpath ="(//button[@type='button'])[4]")
	public WebElement eye;
	
	@FindBy (name ="confirmpassword")
	public WebElement confirm;
	
	@FindBy (xpath ="(//button[@type='button'])[5]")
	public WebElement eyes;
	
	@FindBy (xpath ="//input[@aria-label='Checkbox demo']")
	public WebElement chbox;
	
	@FindBy (xpath ="//button[text()='Sign up now!']")
	public WebElement signupnow;
	public void clicksignup() {
		signup.click();
	}
	
	public void companysignup() {
		companysignup.click();
	}
	 public void companyname(String name) {
		 companyname.sendKeys(name); 
	 }
	 
	 public void search(String name) {
		 search.sendKeys(name);
	 }
	 
	 public void indus() {
		 indus.click();
		 
	 }
	 
	 public void contactname(String name) {
		 contactname.sendKeys(name); 
	 }
	
	 public void email(String name) {
		 email.sendKeys(name);
	 }
	 
	 public void countryDD() {
	    	countryDD.click();
	    }
	    
	    public void India() {
	    	India.click();
	    }
	    
	    public void stateDD() {
	    	stateDD.click();
	    }
	    
	    public void Telangana() {
	    	Telangana.click();
	    }
	    
	    public void cityDD() {
	    	cityDD.click();
	    }
	    
	    public void Hyderabad() {
	    	Hyderabad.click();
	    }
	    
	    public void phno(String name) {
	    	phno.sendKeys(name);
	    }
	    
	    public void pass(String name) {
	    	pass.sendKeys(name);
	    }
	    
	    public void eye() {
	    	eye.click();
	    }
	    
	    public void confirm(String name) {
	    	confirm.sendKeys(name);
	    }
	    
	    public void eyes() {
	    	eyes.click();
	    }
	    
	    public void chbox() {
	    	chbox.click();
	    }
	    
	    public void signupnow() {
	    	signupnow.click();
	    }

}
