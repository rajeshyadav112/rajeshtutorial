package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.EnterAccounInformationPage;
import pages.Registeruser;

public class RegTest  extends BaseTest{

	Registeruser reg;
	EnterAccounInformationPage info;
	@Test
	public void regestrationTest() {
	  reg=new Registeruser(driver);
	 
	reg.username("rajesh");
	reg.useremail("rajesh001@gmail.com");
	reg.signupbutton();
	   
	  info=new EnterAccounInformationPage(driver);
	 info.selectMr();
	 info.selectMrs();
	 info.enterPassword("13666");
	 info.selectDay("20");
	 info.selectMonth("April");
	 info.selectYear("1995");
	 
	 
}
}
