package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterAccounInformationPage {
	
	private WebDriver driver;
	  By mrradiobutton=By.id("id_gender1");
	  
	  By mrsradiobutton=By.id("id_gender2");
	  
	  By password =By.id("password");
	  
	  By day =By.id("days");
	  By month =By.id("months");
	  By year=By.id("years");

	  By newslettercheckbox=By.id("newsletter");
	  
	  By firstname =By.id("first_name");

	  By lastname=By.id("last_name");
	  By address=By.id("address1");
	  By dropdown=By.tagName("select");
	  By state=By.id("state");
	  By city=By.id("city");
	  By zipcode=By.id("zipcode");
	 By createaccount=By.xpath("//button[.='Create Account']");
		
	 By mobileno=By.id("mobile_number");
	  public EnterAccounInformationPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to select Mr. radio button
	    public void selectMr() {
	        driver.findElement(mrradiobutton).click();
	    }

	    // Method to select Mrs. radio button
	    public void selectMrs() {
	        driver.findElement(mrsradiobutton).click();
	    }

	    // Method to enter password
	    public void enterPassword(String pass) {
	        driver.findElement(password).sendKeys(pass);
	    }

	    // Method to select a day from dropdown
	    public void selectDay(String dayValue) {
	        driver.findElement(day).sendKeys(dayValue);
	    }

	    // Method to select a month from dropdown
	    public void selectMonth(String monthValue) {
	        driver.findElement(month).sendKeys(monthValue);
	    }

	    // Method to select a year from dropdown
	    public void selectYear(String yearValue) {
	        driver.findElement(year).sendKeys(yearValue);
	    }

	    // Method to check the newsletter checkbox
	    public void checkNewsletter() {
	        WebElement checkbox = driver.findElement(newslettercheckbox);
	        if (!checkbox.isSelected()) {
	            checkbox.click();
	        }
	    }
	    // Method to enter first name
	    public void enterFirstName(String firstName) {
	        WebElement firstNameField = driver.findElement(By.id("first_name"));
	        firstNameField.clear();
	        firstNameField.sendKeys(firstName);
	    }

	    // Method to enter last name
	    public void enterLastName(String lastName) {
	        WebElement lastNameField = driver.findElement(By.id("last_name"));
	        lastNameField.clear();
	        lastNameField.sendKeys(lastName);
	    }

	    // Method to enter address
	    public void enterAddress(String address) {
	        WebElement addressField = driver.findElement(By.id("address1"));
	        addressField.clear();
	        addressField.sendKeys(address);
	    }

	    // Method to select from dropdown
	    public void selectFromDropdown(String option) {
	        WebElement dropdownElement = driver.findElement(By.tagName("select"));
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByVisibleText(option);
	    }

	    // Method to enter state
	    public void enterState(String state) {
	        WebElement stateField = driver.findElement(By.id("state"));
	        stateField.clear();
	        stateField.sendKeys(state);
	    }

	    // Method to enter city
	    public void enterCity(String city) {
	        WebElement cityField = driver.findElement(By.id("city"));
	        cityField.clear();
	        cityField.sendKeys(city);
	    }

	    // Method to enter zipcode
	    public void enterZipcode(String zipcode) {
	        WebElement zipcodeField = driver.findElement(By.id("zipcode"));
	        zipcodeField.clear();
	        zipcodeField.sendKeys(zipcode);
	    }

	    // Method to click on create account button
	    public void clickCreateAccount() {
	        WebElement createAccountButton = driver.findElement(By.xpath("//button[.='Create Account']"));
	        createAccountButton.click();
	    }

}
