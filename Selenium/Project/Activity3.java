package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 extends BrowserSetup{
	
	@BeforeTest
	public void setUp() {
		useChromeBrowser();
		driver.get("http://alchemy.hguy.co/orangehrm");	
	}
	
	@Test (priority = 0)
	public void loginToOrangeHRM() throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		Thread.sleep(3000);
		loginBtn.submit();
		
	}
	
	@Test (priority = 1)
	public void verifyDashboardPage() {
	//Verify that the homepage has opened
			Boolean labelDashboard = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).isDisplayed();
			System.out.println(labelDashboard);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
