package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasssertionexample {
   
	WebDriver driver;
	 SoftAssert soft;
	@BeforeClass
	public void setup() {
		
		driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void navigate_to_url() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority = 2)
	public void enter_login_credentials() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		
		  String expected="ogin";
		  
		 String actual = driver.findElement(By.xpath("//button[.=' Login ']")).getText();
		 
		 // hardassertion
		// Assert.assertEquals(expected, actual);
		 
		 //
		   soft=new SoftAssert();
		  soft.assertEquals(expected, actual);
		  
		  
		  
		  driver.findElement(By.xpath("//button[.=' Login ']")).click();
		  
		 soft.assertAll();
		  
	}
	
	
	
	
	@AfterClass
	public void browser_close() throws InterruptedException {
		
		 String title = driver.getCurrentUrl();
		 
		soft= new SoftAssert();
		
		soft.assertTrue(title.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
		  System.out.println("Url is successfully matched");
		Thread.sleep(5000);
		soft.assertAll();
		driver.quit();
	}
}
