package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderLogin {

	 @Test(dataProvider="logindata",dataProviderClass = DataProvidertoStoreLogindata.class) 
	public   void test_Login(String username,String password) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		
		  driver.findElement(By.xpath("//button[.=' Login ']")).click();
		  
		  String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		  SoftAssert soft=new SoftAssert();
		  
		  soft.assertTrue(url.equals(driver.getCurrentUrl()));
		  soft.assertAll();
		  Thread.sleep(3000);
		  driver.quit();
		  
		  
	}
}
