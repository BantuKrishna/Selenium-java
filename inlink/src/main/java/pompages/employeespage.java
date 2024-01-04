package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeespage {
	
	@FindBy (xpath="//button[normalize-space()='New']")
	private WebElement New;
	
	@FindBy (name="fullname")
	private WebElement fname;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement  email;
	
	@FindBy (name="personalEmail")
	private WebElement pemail;
	
	@FindBy (xpath="//input[@type='tel']")
	private WebElement phno;
	
	@FindBy (name="series")
	private WebElement code;
	
	
	@FindBy (xpath="//div[@id='demo-simple-select']")
	private WebElement dept;
	
	@FindBy (xpath= "(//div[@role='button'])[3]")
	private WebElement divi;
	
	@FindBy (xpath="(//div[@role='button'])[4]")
	private WebElement desg;
	
	@FindBy (xpath="(//div[@id='country'])[1]")
	public WebElement countryDD;
	
	@FindBy(xpath ="/html/body/div[2]/div[3]/div/div[1]/div/div/div/div[12]/div/div/ul/li[2]/span")
	public WebElement India;
	
	@FindBy(xpath ="//div[@id='state']")
	public WebElement stateDD;
	
	@FindBy(xpath ="//li[normalize-space()='Telangana']")
	public WebElement Telangana;
	
	@FindBy(id ="city")
	public WebElement cityDD;
	
	@FindBy(xpath ="//li[normalize-space()='Hyderabad']")
	public WebElement Hyderabad;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	public WebElement Button;
	
	public employeespage (WebDriver driver){
	    PageFactory.initElements(driver, this);
	}
	
	public void New() {
		New.click();
	}
    public void fname(String name) {
    fname.sendKeys(name);
    }
    
    public void email(String emailid) {
    email.sendKeys(emailid);
}
    public void pemail(String pemailid) {
    pemail.sendKeys(pemailid);
    }
    
   // public void phno() {
   // phno.click();
  //  }
    
    public void phno(String phnoid) {
    phno.sendKeys(phnoid);
   
   }
    
//    public void code() {
//    code.click();
//    }
    public void code(String codeid) {
    code.sendKeys(codeid);
    }
    
    public void dept() {
    dept.click();
    }
    
    public void divi() {
    divi.click();
    }
    
    public void desg() {
    desg.click();
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
    
    public void Button() {
    	Button.click();
    }
    
}