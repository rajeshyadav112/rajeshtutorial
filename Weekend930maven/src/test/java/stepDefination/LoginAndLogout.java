package stepDefination;




import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAndLogout {

static	WebDriver driver;
	
@Before
public void setup() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
}
@After
public void shutdown_browser() {
	
	driver.quit();
}

@Given("User is at loginpage")
public void user_is_at_loginpage() {
    
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@When("Enter the valid login credentials")
public void enter_the_valid_login_credentials() {
   driver.findElement(By.name("username")).sendKeys("Admin");
   driver.findElement(By.name("password")).sendKeys("admin123");
}

@And("Click on login button")
public void click_on_login_button() {
  
	driver.findElement(By.xpath("//button[.=' Login ']")).click();
}

@Then("Login should successful")
public void login_should_successful() {
   
	boolean admin = driver.findElement(By.xpath("//span[.='Admin']")).isDisplayed();
assertTrue(admin);

}

@And("verify the login successful")
public void verify_the_login_successful() {
    
	String text = driver.findElement(By.xpath("//span[.='Admin']")).getText();
	
	assertEquals(text, "Admin");
	System.out.println("login is verified succesfully");
}

@Given("user is present on the Homepage")
public void user_is_present_on_the_homepage() {
    
	
	String title = driver.getTitle();
	System.out.println(title);
	
}

@When("click on the profile")
public void click_on_the_profile() {
  

	driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
	
}

@And("click on the logout button")
public void click_on_the_logout_button() {
    driver.findElement(By.xpath("//a[.='Logout']")).click();
}

@Then("logout should successful")
public void logout_should_successful() {
    
	boolean loginbutton = driver.findElement(By.xpath("//button[.=' Login ']")).isDisplayed();
	
	assertTrue(loginbutton,"logout is successfully veriofied");
}
}
