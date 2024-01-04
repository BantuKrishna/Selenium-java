package InclinicStepDefiniations_File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import genericLib.PropertyFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestStpes_Inclinic {
	
	WebDriver driver=null;
	PropertyFile p=new PropertyFile();
 
	@Before(order=0)
	public void openApp() throws IOException  {

		System.out.println(" I am inside brower setup");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);

		System.setProperty("webdriver.chrome.driver",
				projectPath+"/src/test/resources/drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);

		//		WebDriverManager.operadriver().setup();	
		//		driver=new OperaDriver();

		//	WebDriverManager.firefoxdriver().setup();		
		//	driver=new FirefoxDriver();

		//	WebDriverManager.edgedriver().setup();	
		//	driver=new EdgeDriver();

		driver.manage().window().maximize();
		driver.get(p.getPropertyFiledata("url"));
		//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//		driver.findElement(By.xpath("//button[@type='button']")).click();


	}
	@After(order=0)
	public void closeApp() {
		System.out.println(" I am Closing the browser");
		driver.close();
		driver.quit();
	}
	
	
	@Given("Inclinic Url Enter")
	public void inclinic_url_enter() {
	   
		
	}

	@Then("Click on Login Page")
	public void click_on_login_page() {
	    
	}

	@Then("^user enter (*) and (*)$")
	public void enter_valid_username_and_password(String UserName, String Password) {
	   driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys(UserName);
	   driver.findElement(By.xpath("//input[@placeholder='Please Enter Password']")).sendKeys(Password);	
	}

	@Then("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("Verify the Login Page Dashboard")
	public void verify_the_login_page_dashboard() {
	   
	}


}
