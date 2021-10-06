package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 extends BrowserSetup{
	
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
	public void applyLeave() throws InterruptedException {
		
		//Navigate to the “My Info” page.
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.linkText("Emergency Contacts")).click();
		WebElement tableHeaders = driver.findElement(By.xpath("//table/thead/tr[1]"));
		System.out.println("Headers: "+tableHeaders.getText());
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table/tbody/tr"));
		//System.out.println(tableRows.size());
		
		for(int i=1; i<=tableRows.size(); i++) {
			WebElement row = driver.findElement(By.xpath("//table/tbody/tr["+i+"]"));
			System.out.println("Row "+i+": "+row.getText());
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
