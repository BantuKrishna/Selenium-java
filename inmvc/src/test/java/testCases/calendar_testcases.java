package testCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.CalendarPage;

public class calendar_testcases extends BaseClass {
	
	@Test(priority=0)
	public void CalendarPageTC_01() throws Exception {
		CalendarPage Cp= new CalendarPage(driver);
		Thread.sleep(3000);
		Cp.cal.click();
		Thread.sleep(3000);
		Cp.next.click();
		Thread.sleep(3000);
		Cp.room.click();
		Thread.sleep(3000);
		Cp.filter.click();
		Thread.sleep(3000);
		Cp.app.click();
		Thread.sleep(3000);
		Cp.mname.sendKeys("Developers Project Meeting");
		Thread.sleep(3000);
		Cp.mdesc.sendKeys("Developers Project Meeting1");
		Thread.sleep(3000);
		Cp.date.click();
		Thread.sleep(3000);
		Cp.date1.click();
		Thread.sleep(3000);
		Cp.time.click();
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time1);
		WebElement time1 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time1));
		Cp.time1.click();
		Thread.sleep(3000);
		Cp.time2.click();
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time3);
		WebElement time3 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time3));
		Cp.time3.click();
		Thread.sleep(3000);
		Cp.vc.click();
		Thread.sleep(3000);
		Cp.mail.sendKeys("badhrinath@instavc.com");
		Thread.sleep(3000);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Cp.can.click();
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	public void CalendarPageTC_02() throws Exception {
		CalendarPage Cp= new CalendarPage(driver);
		Thread.sleep(3000);
		Cp.cal.click();
		Thread.sleep(3000);
		Cp.next.click();
		Thread.sleep(3000);
		Cp.room.click();
		Thread.sleep(3000);
		Cp.filter.click();
		Thread.sleep(3000);
		Cp.app.click();
		Thread.sleep(3000);
		Cp.mname.sendKeys("Developers Project Meeting");
		Thread.sleep(3000);
		Cp.mdesc.sendKeys("Developers Project Meeting1");
		Thread.sleep(3000);
		Cp.date.click();
		Thread.sleep(3000);
		Cp.date1.click();
		Thread.sleep(3000);
		//Cp.time.click();
		//Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time1);
//		WebElement time1 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time1));
//		Cp.time1.click();
		Thread.sleep(3000);
		//Cp.time2.click();
		//Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//JavascriptExecutor js1 = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time3);
//		WebElement time3 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time3));
//		Cp.time3.click();
		//Thread.sleep(3000);
		Cp.vc.click();
		Thread.sleep(3000);
		Cp.mail.sendKeys("badhrinath@instavc.com");
		Thread.sleep(3000);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Cp.save.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void CalendarPageTC_03() throws Exception {
		CalendarPage Cp= new CalendarPage(driver);
		Thread.sleep(3000);
		Cp.cal.click();
		Thread.sleep(3000);
		Cp.next.click();
		Thread.sleep(3000);
		Cp.room.click();
		Thread.sleep(3000);
		Cp.filter.click();
		Thread.sleep(3000);
		Cp.app.click();
		Thread.sleep(3000);
		Cp.mname.sendKeys("Developers Project Meeting");
		Thread.sleep(3000);
		Cp.mdesc.sendKeys("Developers Project Meeting1");
		Thread.sleep(3000);
		Cp.date.click();
		Thread.sleep(3000);
		Cp.date1.click();
		Thread.sleep(3000);
		//Cp.time.click();
		//Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		JavascriptExecutor js = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time1);
//		WebElement time1 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time1));
//		Cp.time1.click();
		Thread.sleep(3000);
		//Cp.time2.click();
		//Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//JavascriptExecutor js1 = (JavascriptExecutor) driver; 
//		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time3);
//		WebElement time3 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time3));
//		Cp.time3.click();
		//Thread.sleep(3000);
		Cp.vc.click();
		Thread.sleep(3000);
//		Cp.mail.sendKeys("badhrinath@instavc.com");
//		Thread.sleep(3000);
//		Robot robot= new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Cp.save.click();
		Thread.sleep(3000);
		
	}
	@Test(priority=3)
	public void CalendarPageTC_04() throws Exception {
		CalendarPage Cp= new CalendarPage(driver);
		Thread.sleep(3000);
		Cp.cal.click();
		Thread.sleep(3000);
		Cp.next.click();
		Thread.sleep(3000);
		Cp.room.click();
		
		Thread.sleep(3000);
		Cp.filter.click();
		Thread.sleep(3000);
		Cp.app.click();
		Thread.sleep(3000);
		Cp.mname.sendKeys("Developers Project Meeting");
		Thread.sleep(3000);
		Cp.mdesc.sendKeys("Developers Project Meeting1");
		Thread.sleep(3000);
		Cp.date.click();
		Thread.sleep(3000);
		Cp.date1.click();
		Thread.sleep(3000);
		Cp.time.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time1);
		WebElement time1 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time1));
		Cp.time1.click();
		Thread.sleep(3000);
		Cp.time2.click();
		Thread.sleep(3000);
		///WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", Cp.time3);
		WebElement time3 = wait.until(ExpectedConditions.elementToBeClickable(Cp.time3));
		Cp.time3.click();
		Thread.sleep(3000);
		Cp.vc.click();
		Thread.sleep(3000);
		Cp.mail.sendKeys("badhrinath@instavc.com");
		Thread.sleep(3000);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Cp.save.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=4)
	public void CalendarPageTC_05() throws Exception {
		CalendarPage Cp= new CalendarPage(driver);
		Thread.sleep(3000);
		Cp.cal.click();
		Thread.sleep(3000);
		Cp.next.click();
		Thread.sleep(3000);
		Cp.room.click();
		Thread.sleep(3000);
		Cp.filter.click();
		Thread.sleep(3000);
		Cp.app.click();
		Thread.sleep(3000);
		Cp.mname.sendKeys("Developers Project Meeting");
		Thread.sleep(3000);
		Cp.mdesc.sendKeys("Developers Project Meeting1");
		Thread.sleep(3000);
		Cp.date.click();
		Thread.sleep(3000);
		Cp.date1.click();
		Thread.sleep(3000);
		Cp.pub.click();
		Thread.sleep(3000);
		Cp.save.click();
		Thread.sleep(3000);
		

}
}