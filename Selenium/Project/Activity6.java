package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 extends BrowserSetup{
	
	@BeforeMethod
	public void setUp() {
		useChromeBrowser();
		
		//Login to OrangeHRM
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
	}
	
	@Test
	public void verifyDirectoryMenu() {
		String directoryMenuText = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
		System.out.println(directoryMenuText);
		driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement clickableDirectory = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_directory_viewDirectory")));
		
		clickableDirectory.click();
		String pageHeading = driver.findElement(By.tagName("h1")).getText();
		if(pageHeading.equals("Search Directory"))
			driver.close();
	}
	
	

}
