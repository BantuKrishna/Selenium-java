package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePage;

public class change_testcases extends BaseClass{
	@Test(priority=0)
	public void ChangePageTC_01() throws Exception {
		ChangePage Cp = new ChangePage(driver);
		Cp.set.click();
		Thread.sleep(2000);
		Cp.change.click();
		Thread.sleep(2000);
		Cp.cur.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye.click();
		Thread.sleep(2000);
		Cp.newpass.sendKeys("Inmvc@1234");
		Thread.sleep(2000);
		Cp.eye1.click();
		Thread.sleep(2000);
		Cp.confirm.sendKeys("Inmvc@1234");
		Thread.sleep(2000);
		Cp.eye2.click();
		Thread.sleep(2000);
		Cp.can.click();
		Thread.sleep(2000);
				
	}
	@Test(priority=1)
	public void ChangePageTC_02() throws Exception {
		ChangePage Cp = new ChangePage(driver);
		Cp.set.click();
		Thread.sleep(2000);
		Cp.change.click();
		Thread.sleep(2000);
		Cp.cur.sendKeys("Inmvc@12");
		Thread.sleep(2000);
		Cp.eye.click();
		Thread.sleep(2000);
		Cp.newpass.sendKeys("Inmvc@1234");
		Thread.sleep(2000);
		Cp.eye1.click();
		Thread.sleep(2000);
		Cp.confirm.sendKeys("Inmvc@1234");
		Thread.sleep(2000);
		Cp.eye2.click();
		Thread.sleep(2000);
		Cp.save.click();
		Thread.sleep(2000);
				
	}
	@Test(priority=2)
	public void ChangePageTC_03() throws Exception {
		ChangePage Cp = new ChangePage(driver);
		Cp.set.click();
		Thread.sleep(2000);
		Cp.change.click();
		Thread.sleep(2000);
		Cp.cur.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye.click();
		Thread.sleep(2000);
		Cp.newpass.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye1.click();
		Thread.sleep(2000);
		Cp.confirm.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye2.click();
		Thread.sleep(2000);
		Cp.save.click();
		Thread.sleep(2000);
		WebElement text = Cp.error;
		String Actual_Text = text.getText();
		Assert.assertEquals(Actual_Text, "Current Password and New Password should not same");
		Thread.sleep(2000);
		
	}
	@Test(priority=3)
	public void ChangePageTC_04() throws Exception {
		ChangePage Cp = new ChangePage(driver);
		Cp.set.click();
		Thread.sleep(2000);
		Cp.change.click();
		Thread.sleep(2000);
		Cp.cur.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye.click();
		Thread.sleep(2000);
		Cp.newpass.sendKeys("Inmvc@1234");
		Thread.sleep(2000);
		Cp.eye1.click();
		Thread.sleep(2000);
		Cp.confirm.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye2.click();
		Thread.sleep(2000);
		Cp.save.click();
		Thread.sleep(2000);
		WebElement text = Cp.error1;
		String Actual_Text = text.getText();
		Assert.assertEquals(Actual_Text, "New Password and Confirm Password both should be same");
		Thread.sleep(2000);
		
	}
	@Test(priority=4)
	public void ChangePageTC_05() throws Exception {
		ChangePage Cp = new ChangePage(driver);
		Cp.set.click();
		Thread.sleep(2000);
		Cp.change.click();
		Thread.sleep(2000);
		Cp.cur.sendKeys("Inmvc@123");
		Thread.sleep(2000);
		Cp.eye.click();
		Thread.sleep(2000);
		Cp.newpass.sendKeys("InMvc@123");
		Thread.sleep(2000);
		Cp.eye1.click();
		Thread.sleep(2000);
		Cp.confirm.sendKeys("InMvc@12345");
		Thread.sleep(2000);
		Cp.eye2.click();
		Thread.sleep(2000);
		Cp.save.click();
		Thread.sleep(2000);
		
		
	}
}
