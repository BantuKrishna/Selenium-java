package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFile p=new PropertyFile();
	public WebDriverUtilies driverutilies=new WebDriverUtilies();
	
	
	@BeforeMethod
	public void openApp() throws IOException {
	WebDriverManager.chromedriver().setup();	
	driver=new ChromeDriver();
	System.out.println(" I am inside brower setup");
	String projectPath = System.getProperty("user.dir");
	System.out.println("Project path is: "+projectPath);

	System.setProperty("webdriver.chrome.driver",
			projectPath+"/src/test/resources/drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--no-sandbox");
	driver = new ChromeDriver(options);

	
//	WebDriverManager.operadriver().setup();	
//	driver=new OperaDriver();
	
	WebDriverManager.firefoxdriver().setup();	
	driver=new FirefoxDriver();
	
//	WebDriverManager.edgedriver().setup();	
//	driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get(p.getPropertyFiledata("https://inmvc-uat.instavc.net"));
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException {
		int status = result.getStatus();
        String name = result.getName();
	if(status==2) {
		Sceenshot s=new Sceenshot();
		s.getScreenshot(driver, name);
		
	}
	driver.quit();
		
		
		
	}
	}
	
