package testng;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToverifyTheresposeWithAssertion {

	  WebDriver driver;
	  @Test(priority =1)
	 public void Login() {
		 
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[.=' Login ']")).click();
		 WebElement ad = driver.findElement(By.xpath("//span[.='Admin']"));
		 
		 
		   String expectedtext="Admin";
		   
		String ActaulText = ad.getText();
		
		Assert.assertEquals(expectedtext, ActaulText);
		System.out.println("Login is successful");
		
		Assert.assertTrue(ad.isDisplayed(),"Element is displayed");
		
		System.out.println("element is displayed successfully");
		
		   
	 }
	 
	 
	 @Test(priority = 2)
	 public void logout() {
		 
		 
	 }
}
