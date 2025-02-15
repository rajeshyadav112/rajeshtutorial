package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
  protected	WebDriver driver;
    @BeforeClass
	public void setup() {
		
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBroswer() {
		
		 if (driver!= null) {
	            driver.quit();
		
		
	}
	}
}
