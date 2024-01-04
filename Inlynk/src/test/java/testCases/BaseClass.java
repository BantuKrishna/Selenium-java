package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public propertyfile p=new propertyfile();
	
	@BeforeClass
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testapp.inlink.pro/");
		driver.manage().window().maximize();
	
	}


	
	@AfterClass
	public void tearup() {
//	public void closeApp(ITestResult result) throws IOException {
//		int status = result.getStatus();
//        String name = result.getName();
//	if(status==2) {
//		screenshot s=new screenshot();
//		s.getScreenshot(driver, name);
//	}
		driver.quit();
	}

	
	}

