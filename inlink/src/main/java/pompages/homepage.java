package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy (xpath=" //span[normalize-space()='Employees']")
	private WebElement EmployeesModule;
	
	public homepage (WebDriver driver){
	    PageFactory.initElements(driver, this);
	}
	
	public void EmployeesModule() {
		EmployeesModule.click();
		}

}
