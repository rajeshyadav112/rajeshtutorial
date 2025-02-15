package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registeruser {

private	WebDriver driver;
	By namefield =By.name("name");
	By emailfield =By.xpath("(//input[@placeholder=\"Email Address\"])[2]");
	By singnupbutton=By.xpath("//button[text()='Signup']");
	
	
	public Registeruser(WebDriver driver){
		this.driver=driver;
	}
	  public void username(String name) {
		  
		  driver.findElement(namefield).sendKeys(name);
	  }
	  
 public void useremail(String email) {
		  
		  driver.findElement(emailfield).sendKeys(email);
	  }
 
 public void signupbutton() {
	  
	  driver.findElement(singnupbutton).click();
	  
	  
 }
 
 
	
	
}
