package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.AdminUserPage;
import Pages.HomePage;
import Pages.LoginPageObjectClass;
import Utilities.FakerUtility;

public class AdminUserTest extends Base{
	
	FakerUtility faker=new FakerUtility ();//calling Faker to input values in the username and password txt
	AdminUserPage admin;
	HomePage homepage;
  @Test(description ="Adding new user to Admin Page" )
  @Parameters({"username","password"})
  public void verifyUsercanAddNewUser(String username1,String password1)
  {
	  //login page object creation
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username1, password1);
	  
	  homepage=log.button();
	  admin=homepage.clickOnMoreInfo();
	  String username=faker.getFirstName();
	  String password=faker.getPassword();
	  admin.clickOnNewButton().enterValuesAdduserUsernamePassword(username, password).
	  dropdownenterStaffTypeAddUser().clickOnSaveForAddUser();
	  
	  boolean valuefromalert=admin.isDispalyedAlertAdminUser();
	  Assert.assertTrue(valuefromalert,Constant.ERRORMESSAGEFORADDADMINUSER);
	  /*log.button();
	  //clicking on new user
	  AdminUserPage admin=new AdminUserPage(driver);
	  admin.clickOnMoreInfo();
	  admin.clickOnNewButton();
	  admin.enterValuesAdduserUsernamePassword("Nainu", "Nainu");
	  admin.dropdownenterStaffTypeAddUser();
	  admin.clickOnSaveForAddUser();*/
	  
	  
  }
}
