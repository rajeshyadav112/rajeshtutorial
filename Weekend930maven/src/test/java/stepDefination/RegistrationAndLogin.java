package stepDefination;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationAndLogin {

	 WebDriver driver;
	 

	 
@Given("i am on the registration page")
public void i_am_on_the_registration_page() {
    
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://blazedemo.com/register");
}

@When("user fill all the details")
public void user_fill_all_the_details(io.cucumber.datatable.DataTable dataTable) {
   
	List<Map<String, String>> regdetail=dataTable.asMaps(String.class,String.class);
	WebElement username = driver.findElement(By.id("name"));
	WebElement usercompany= driver.findElement(By.name("company"));
	WebElement useremail = driver.findElement(By.name("email"));
	WebElement userpassword= driver.findElement(By.name("password"));
	WebElement confpassword = driver.findElement(By.name("password_confirmation"));
	
	String name = regdetail.get(0).get("name");
	            
	String com = regdetail.get(0).get("company");
	
	String em = regdetail.get(0).get("email");
	
	String pass = regdetail.get(0).get("password");
	
	String cp = regdetail.get(0).get("confirm_password");
	
	username.sendKeys(name);
	usercompany.sendKeys(com);
	useremail.sendKeys(em);
	userpassword.sendKeys(pass);
	confpassword.sendKeys(cp);
	
}

@And("click on the register button")
public void click_on_the_register_button() {
    WebElement registerbutton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
    registerbutton.click();
}

@Then("user get the success message")
public void user_get_the_success_message() {
   assertTrue(false, null);
}

@Given("user is on the loginpage")
public void user_is_on_the_loginpage() {
    
	driver.navigate().to("https://blazedemo.com/login");
	driver.manage().window().maximize();
	
}

@When("fill the correct(.*)and(.*)$")
public void fill_the_correct_username_and_password(String username,String password) {
   
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	
}

@And("press the login button")
public void press_the_login_button() {
   
	driver.findElement(By.xpath("https://blazedemo.com/login")).click();
}

@Then("user should see the home page")
public void user_should_see_the_home_page() {
    
	System.out.println("login sucessful");
}

}
