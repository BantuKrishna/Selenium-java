package Testing;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

import genericlibraries.Baseclass;
import pompages.homepage;
import pompages.loginpage;

public class login extends Baseclass {
	
	private static final org.openqa.selenium.support.ui.WebDriverWait New = null;

	@Test (priority=0)
	public void loginpages() throws InterruptedException, AWTException {
		loginpage l= new loginpage(driver);
		l.email("suresha@yopmail.com");
		l.password("Inlink@123");
		l.xpath();
		Thread.sleep(3000);
		homepage h= new homepage(driver);
		h.EmployeesModule();
		Thread.sleep(3000);
		pompages.employeespage e= new pompages.employeespage(driver);
		e.New();
//		WebElement text = driver.findElement(By.xpath("//span[normalize-space()='Add employee']"));
//		String Actual_Text = text.getText();
//		Assert.assertEquals(Actual_Text, "Add employee");
		Thread.sleep(3000);
		e.fname("Krishna");
		e.email("ishna@yopmail.com");
		e.pemail("ishna@gmail.com");
		Thread.sleep(2000);
		//e.phno();
		e.phno("8979758888");
		Thread.sleep(2000);
		//e.code();
		e.code("3015");
		e.dept();
		Thread.sleep(1000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		e.divi();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		e.desg();
		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		
	//	e.countryDD.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement countryDD = wait.until(ExpectedConditions.elementToBeClickable(e.countryDD));
		e.countryDD.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", e.India);
		WebElement India = wait.until(ExpectedConditions.elementToBeClickable(e.India));
	    e.India.click();
	    
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement stateDD = wait.until(ExpectedConditions.elementToBeClickable(e.stateDD));
		e.stateDD.click();
		
		Thread.sleep(10000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js1.executeScript("arguments[0].scrollIntoView(true);", e.Telangana);
		WebElement Telangana = wait.until(ExpectedConditions.elementToBeClickable(e.Telangana));
		e.Telangana.click();
		
		
		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			Thread.sleep(3000);
			WebElement cityDD = wait.until(ExpectedConditions.elementToBeClickable(e.cityDD));
			e.cityDD.click();
			
			Thread.sleep(10000);
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver; 
			js2.executeScript("arguments[0].scrollIntoView(true);", e.Hyderabad);
			WebElement Hyderabad = wait.until(ExpectedConditions.elementToBeClickable(e.Hyderabad));
			e.Hyderabad.click();
			
			Thread.sleep(2000);
			
			e.Button.click();
		
	    
	   
		
//		Robot r3= new Robot();
//		r3.keyPress(KeyEvent.VK_DOWN);
//		r3.keyRelease(KeyEvent.VK_DOWN);
//		r3.keyPress(KeyEvent.VK_DOWN);
//		r3.keyRelease(KeyEvent.VK_DOWN);
//		r2.keyPress(KeyEvent.VK_ENTER);
//		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		
		
	}

	
		
	}


