package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public propertyfile p=new propertyfile();
	
   @BeforeMethod
 //  @BeforeClass
	public void Setup() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://inmvc-uat.instavc.net/");
		driver.manage().window().maximize();
		//public void loginpageTC1() throws Exception {
			
			LoginPage lp=new LoginPage(driver);
			lp.email.sendKeys("krishna1bantu1@gmail.com");
			lp.pass.sendKeys("Inmvc@1234");
			lp.login.click();
			Thread.sleep(6000);

	}

	
	


	
//	@AfterClass
//	public void closeApp()   {
////		public void closeApp(ITestResult result) throws IOException {
////		int status = result.getStatus();
////        String name = result.getName();
////	if(status==2) {
////		screenshot s=new screenshot();
////		s.getScreenshot(driver, name);
////	}
//		driver.quit();
//	}

	
	


@AfterMethod
//@AfterClass
public void closeApp(ITestResult result) throws IOException {
	int status = result.getStatus();
    String name = result.getName();
if(status==2) {
	screenshot s=new screenshot();
	s.getScreenshot(driver, name);
}

driver.quit();
}
}
