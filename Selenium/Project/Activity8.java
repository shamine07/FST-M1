package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 extends BrowserSetup{
	
	private String fromDate = "2021-12-01";
	private String toDate = "2021-12-07";
	
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
		//Navigate to the Dashboard page and click on the Apply Leave option.
		driver.findElement(By.linkText("Dashboard")).click();
		driver.findElement(By.linkText("Apply Leave")).click();
		
		//Select leave type and duration of the leave.
		Select leaveTypeDrpDwn = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		leaveTypeDrpDwn.selectByValue("1");
		driver.findElement(By.id("applyleave_txtFromDate")).clear();
		driver.findElement(By.id("applyleave_txtFromDate")).sendKeys(fromDate);
		driver.findElement(By.id("applyleave_txtToDate")).clear();
		driver.findElement(By.id("applyleave_txtToDate")).sendKeys(toDate);
		Thread.sleep(3000);
		driver.findElement(By.id("applyBtn")).click();
		
		//Navigate to the My Leave page to check the status of the leave application
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		String leaveStatus = driver.findElement(By.xpath("//tr//td[6]/a[contains(text(), 'Pending')]")).getText();
		System.out.println("The leave status is: "+leaveStatus);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
