package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 extends BrowserSetup{
	
	private String newFnameValue = "Sam";
	private String newLnameValue = "Smith";
	private String newDobValue = "1993-12-31";
	
	
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
	public void editUserInfo() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Finding the “My Info” menu item and click it.
		driver.findElement(By.linkText("My Info")).click();
		
		//On the new page, click the Edit button.
		driver.findElement(By.id("btnSave")).click();
		
		//Fill in the Name, Gender, Nationality, and the DOB fields.
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys(newFnameValue);
		
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys(newLnameValue);
		
		driver.findElement(By.id("personal_optGender_1")).click();
		
		Select nationalityDrpdwn = new Select(driver.findElement(By.id("personal_cmbNation")));
		nationalityDrpdwn.selectByVisibleText("Canadian");
		
		driver.findElement(By.id("personal_DOB")).clear();
		driver.findElement(By.id("personal_DOB")).sendKeys(newDobValue);
		
		//Click Save.
		driver.findElement(By.id("btnSave")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
