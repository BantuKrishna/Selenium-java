package testCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class login_testcases extends BaseClass {

	
	@Test
	
	public void loginpage() throws Exception {
	
		LoginPage lp=new LoginPage(driver);
		lp.email("zoom@yopmail.com");
		lp.pass("Inlink@123");
		lp.login.click();
		Thread.sleep(5000);
		WebElement text = driver.findElement(By.xpath("//span[text()='News Feed']"));
		String Actual_Text = text.getText();
		Assert.assertEquals(Actual_Text, "News Feed");
		Thread.sleep(3000);
	
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://yopmail.com/en/wm");
}
}