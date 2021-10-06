package OrangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 extends BrowserSetup {
	
	private String companyName = "IBM";
	private String jobTitle = "Test Engineer";
	
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
	public void addEmpQualification() throws InterruptedException {
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.linkText("Qualifications")).click();
		
		//Add Work Experience and click Save
		driver.findElement(By.id("addWorkExperience")).click();
		driver.findElement(By.id("experience_employer")).sendKeys(companyName);
		driver.findElement(By.id("experience_jobtitle")).sendKeys(jobTitle);
		Thread.sleep(3000);
		driver.findElement(By.id("btnWorkExpSave")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	

}
