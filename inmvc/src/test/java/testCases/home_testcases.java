package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class home_testcases extends login_testcases {
	@Test
	
	public void HomepageTC1() throws Exception {
	
		
	HomePage hp =new HomePage (driver);	
//	WebElement text = 
	hp.No.isDisplayed();
//	String Actual_Text = text.getText();
//	Assert.assertEquals(Actual_Text, "No meetings…");
//	Thread.sleep(3000);
//	 WebElement actualTitle = hp.No;
//	 String expectedTitle = "No meetings…";
//	 if(actualTitle.equals(expectedTitle)) {
//
//		 System.out.println("Title Matched");
//	 }
//
//		 else {
//
//		 System.out.println("Title didn't match");
//	 
//	

//	String expectedTitle = "No meetings…";
//	String Actual_Text = text.getText();
//	Assert.assertEquals(Actual_Text, expectedTitle);
//	
//	 if(Actual_Text.equals(expectedTitle)) {
//		 
//	 		 System.out.println("Title Matched");
//		 	 }
//		 
//	 		 else {
//		 
//		 		 System.out.println("Title didn't match");
//	
//}

	
	if(driver.getPageSource().contains("No meetings…"))
	{
		System.out.println("Text present");
	}
	else {
		System.out.println("Text not present");
	}

		
	}
}

