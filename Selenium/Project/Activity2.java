package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 extends BrowserSetup{
	
//	BrowserSetup browserSetup = new BrowserSetup();
	
	@BeforeTest
	public void setUp() throws InterruptedException {
//		browserSetup.
		useChromeBrowser();
		driver.get("http://alchemy.hguy.co/orangehrm");
		Thread.sleep(3000);
	}
	
	@Test
	void printImageURL() {
		WebElement headerImg = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		System.out.println(headerImg.getAttribute("src"));
	}
	
	@AfterTest
	public void tearUp() {
		driver.close();
		
	}

}
