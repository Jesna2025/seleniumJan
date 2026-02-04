package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.PageUtility;

//Constructor +WbDriver+ this+PageFactory.initelements
public class AdminUserPage {
	WebDriver driver;
	PageUtility page=new PageUtility();
	
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

//locate elements on Adminuser

@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement btn_new;
@FindBy(xpath="//input[@name='username']")WebElement txt_usernameAddUser;
@FindBy(xpath="//input[@name='password']")WebElement txt_passwordAdduser;
@FindBy(xpath="//select[@name='user_type']")WebElement dd_selectuser;
@FindBy(xpath="//button[contains(text(),'Save')]")WebElement btn_save;
	


public AdminUserPage clickOnNewButton()
{
	btn_new.click();
	return this;
}
public AdminUserPage enterValuesAdduserUsernamePassword(String usernameadduser,String passwordadduser)
{
	txt_usernameAddUser.sendKeys(usernameadduser);
	txt_passwordAdduser.sendKeys(passwordadduser);
	return this;

}
public AdminUserPage dropdownenterStaffTypeAddUser()
{
//Select select=new Select(dd_selectuser);
//select.selectByVisibleText("Staff");
	
	//using page uitlity
	page.selectByVisibleText(dd_selectuser, "Staff");
	return this;
	
}
public AdminUserPage clickOnSaveForAddUser()
{
	btn_save.click();
	return this;
}

//locate alert message to check AddminAddNewUser is working or not
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertForSuccessAddAdminUser;
public boolean isDispalyedAlertAdminUser()
{
	return alertForSuccessAddAdminUser.isDisplayed();
}
}

