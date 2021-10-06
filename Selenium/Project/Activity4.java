package OrangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 extends BrowserSetup{
	
	String firstNameValue = "Dolly";
	String lastNameValue = "Singh";
	
	@BeforeMethod
	public void setUp() {
		useChromeBrowser();
		driver.get("http://alchemy.hguy.co/orangehrm");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
	
	}
	
	@Test (priority = 0)
	public void addEmployee() throws InterruptedException {
		//Click on PIM from menu options
		driver.findElement(By.linkText("PIM")).click();
		
		//Click the Add button to add a new Employee
		driver.findElement(By.id("btnAdd")).click();
		
		//Fill in the required fields and click Save.
		driver.findElement(By.id("firstName")).sendKeys(firstNameValue);
		driver.findElement(By.id("lastName")).sendKeys(lastNameValue);
		driver.findElement(By.id("btnSave")).submit();

	}
	
	@Test (priority = 1)
	public void searchEmployee() throws InterruptedException {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(firstNameValue+" "+lastNameValue);
		driver.findElement(By.id("searchBtn")).click();
		System.out.println(driver.findElement(By.linkText(firstNameValue)).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
