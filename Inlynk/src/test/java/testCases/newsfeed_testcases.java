package testCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.NewsfeedPage;

public class newsfeed_testcases extends login_testcases {
	@Test
	
	public void newsfeedpage() throws Exception {
		NewsfeedPage np=new NewsfeedPage(driver);
		Thread.sleep(3000);
		np.what.click();
		Thread.sleep(3000);
		np.whats("hiii gud morning all");
		Thread.sleep(3000);
		np.pub.click();
		Thread.sleep(3000);
		np.img.sendKeys("C:\\Users\\peoplelink\\Downloads\\IMG20230919182149.jpg");
		Thread.sleep(5000);
		np.img.sendKeys("C:\\Users\\peoplelink\\Downloads\\Best Employee of the Year.jpg");
		Thread.sleep(5000);
		np.img.sendKeys("C:\\Users\\peoplelink\\Downloads\\signaturee.png");
	    Thread.sleep(5000);
	    np.img.sendKeys("C:\\Users\\peoplelink\\Downloads\\Screenshot 26.png");
	    Thread.sleep(5000);
	    np.img.sendKeys("C:\\Users\\peoplelink\\Downloads\\space.jpg");
	    Thread.sleep(5000);
	    np.post.click();
	    Thread.sleep(6000);
	    	    JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", np.like);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement like = wait.until(ExpectedConditions.elementToBeClickable(np.like));

		
	   
	    np.like.click();
	    Thread.sleep(3000);
	}

}
