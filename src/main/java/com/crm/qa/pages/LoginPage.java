package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.baseUDF.TestBase;

public class LoginPage extends TestBase{

	//Page Factory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/input[3]")
	WebElement LoginBtn;
	
	public LoginPage() {
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public String validatingPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new HomePage();
	}
}
