package genericlibraries;
 import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	 public static WebDriver driver;

@BeforeClass

public void openApp() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testapp.inlink.pro/");
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
	

//@Test
//public void login() throws InterruptedException  {
//	
//
//	driver.findElement(By.xpath("//*[@id=\"outlined-basic1\"]")).sendKeys("myntra@yopmail.com");
//	driver.findElement(By.xpath("(//input[@name='password'])")).sendKeys("Inlink@123");
//	driver.findElement(By.xpath("(//button[@type='submit'])")).click();
//    Thread.sleep(2000);
//
//		}

@AfterClass
public void tearup() {
	driver.quit();
}
}