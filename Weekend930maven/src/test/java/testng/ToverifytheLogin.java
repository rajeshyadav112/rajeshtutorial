package testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ToverifytheLogin {
	
	 WebDriver driver;
	
	WebDriverWait wait; 
	
	
	  @BeforeClass(groups="smoke")
	  @Parameters("browser")
	  public void setup(String browser) {
		
		  if(browser.equalsIgnoreCase("chrome")) {
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  }
		  
		 
			  
		  else if  (browser.equalsIgnoreCase("Edge")) {
				   driver= new EdgeDriver();
				   driver.manage().window().maximize();
				   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				  }
			  
		  }
	  
	  
	  @Test(groups="smoke",priority = 1)
	  public void navigate_to_web() {
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  
	  @Test(groups="smoke",priority = 2)
	  public void usercredentials() {
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  
	  }
	  
	  @Test(groups="regression",priority = 3)
	  public void click_on_login_button() {
		  
		  
		  driver.findElement(By.xpath("//button[.=' Login ']")).click();
	  }
	  
	  @Test(groups="regression",priority = 4)
	  
	  public void logout() {
		  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  driver.findElement(By.xpath("(//*[@alt=\"profile picture\"])[1]")).click();
		WebElement logout = driver.findElement(By.xpath("//a[.='Logout']"));
		
		 wait.until(ExpectedConditions.visibilityOf(logout));

		System.out.println(logout.getText());
		logout.click();
		
		
		
		  
		  
	  }
	 @AfterClass(groups="smoke")
	  public void teardown() {
		  
		  //driver.close();
		  driver.quit();
		  
	  }
 
}
