package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class login_testcases extends BaseClass {
	
	
	
	@Test(priority=3)
	
	public void loginpageTC1() throws Exception {
	
		LoginPage lp=new LoginPage(driver);
		lp.email.sendKeys("harish@yopmail.com");
		lp.pass.sendKeys("Inmvc@123");
		lp.login.click();
		Thread.sleep(3000);

}
	
	@Test(priority=1)
public void loginpageTC2() throws Exception {
	
	LoginPage lp=new LoginPage(driver);
	lp.email.sendKeys("apurupinstavc.com");
	lp.pass.sendKeys("Apurup@12345");
	lp.login.click();
	//validate error
	WebElement text = driver.findElement(By.xpath("//p[@id='filled-error-helper-text-helper-text']"));
	String Actual_Text = text.getText();
	Assert.assertEquals(Actual_Text, "Invalid Email ID");
	Thread.sleep(3000);

}

	@Test(priority=2)
	public void loginpageTC3() throws Exception {
		
		LoginPage lp=new LoginPage(driver);
		lp.email.sendKeys("apurup@instavc.com");
		lp.pass.sendKeys("Apurup12345");
		lp.login.click();
		Thread.sleep(3000);
		//validate error
		WebElement text = driver.findElement(By.xpath("//div[text()='Incorrect username or password']"));
		String Actual_Text = text.getText();
		Assert.assertEquals(Actual_Text, "Incorrect username or password");
		Thread.sleep(3000);

}
}
