package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUp() {
		String projectPath = System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
	}
	
	@Test
	void verifyTitle() throws InterruptedException {
		
        driver.get("http://alchemy.hguy.co/orangehrm");
        Boolean titleMatch = driver.getTitle().equals("OrangeHRM");
        
        if (titleMatch)
        	driver.close();
  
	}
	

}
