package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitUtility;
//constructor+locator+actionmethods

public class LoginPageObjectClass {
	
WebDriver driver;
//constructors ;;;this and PageFactory

//globaly declaring wait utility for explicit wait(for click) created in WaitUtility ""Utility Package 
WaitUtility wait=new WaitUtility();


public LoginPageObjectClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//locate elements for login
@FindBy(xpath="//input[@placeholder='Username']")WebElement txt_username;
@FindBy(xpath="//input[@placeholder='Password']")WebElement txt_password;
@FindBy(xpath="//button[text()='Sign In']")WebElement btn_signin;

//locating Dashboard for Assertion-loginPage: to verify login is success or not 
@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;

//Action Methods for entering values to textbox and clicking button

//Chaining of methods in below 2 methods ,removed void and wrote class name 
//since enterValuesintoTextbox stays in same page wrote same class name and return this

public LoginPageObjectClass enterValuesintoTextbox(String username,String password)
{
	txt_username.sendKeys(username);
	txt_password.sendKeys(password);
	return this;//creating connection to the method 

}
//since button click direct to home page wrote homepage instead of void, since it is another class return new homePage(driver)
public HomePage button()
{
	//calling explicit wait 
	wait.waitForElementToClick(driver, btn_signin);
	
	btn_signin.click();
	return new HomePage(driver);//since it is direct to the new class Homapage used new
}
//boolean return type always starts with isDispalyed return type
public boolean isDashboardISDisplayed()
{
	return dashboard.isDisplayed();
}
}
