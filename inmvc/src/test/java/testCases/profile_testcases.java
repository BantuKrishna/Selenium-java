package testCases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import pageObjects.ProfilePage;

public class profile_testcases extends BaseClass {
	@Test
	public void ProfilePageTC_01() throws Exception {
		
		
		
		ProfilePage Pp= new ProfilePage (driver);
		Pp.set.click();
		Thread.sleep(3000);
		Pp.img.click();
		Thread.sleep(3000);
		Pp.pro.click();
		
		Thread.sleep(3000);
		String filePath = "C:\\Users\\peoplelink\\Downloads\\peoplelink2.jfif";
        
        Robot robot = new Robot();

        // Clear the clipboard (if needed)
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), null);

        // Copy the file path to the clipboard
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate pressing Ctrl+V (paste)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

     
		
		Thread.sleep(3000);
		Pp.up.click();
		Thread.sleep(3000);
	}
	@Test
	public void ProfilePageTC_02() throws Exception {
		
		
		
		ProfilePage Pp= new ProfilePage (driver);
		Pp.set.click();
		Thread.sleep(3000);
		Pp.img.click();
		Thread.sleep(3000);
		Pp.pro.click();
		
		Thread.sleep(3000);
		String filePath = "C:\\Users\\peoplelink\\Downloads\\peoplelink2.jfif";
        
        Robot robot = new Robot();

        // Clear the clipboard (if needed)
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), null);

        // Copy the file path to the clipboard
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate pressing Ctrl+V (paste)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

     
		
		Thread.sleep(3000);
		Pp.can.click();
		Thread.sleep(3000);
		Pp.canc.click();
		Thread.sleep(3000);
		
	}
	@Test
	public void ProfilePageTC_03() throws Exception {
		
		
		
		ProfilePage Pp= new ProfilePage (driver);
		Pp.set.click();
		Thread.sleep(3000);
		Pp.img.click();
		Thread.sleep(3000);
		Pp.del.click();
		Thread.sleep(3000);
		

}
}