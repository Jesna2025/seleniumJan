package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.HomePage;
import Pages.LoginPageObjectClass;
import Utilities.ExcelUtility;
//above recommendation while creating object of LoginPageObjectClass????


public class LoginTest extends Base{
	//creating HomePage globally declaring
	HomePage home;
  @Test(groups = "Smoke Test")

  @Parameters({"username","password"})
  public void verifyUserCanLogin(String username,String password) {
	  
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username, password);
	  home=log.button(); 
	  boolean dashboarddisplayed=log.isDashboardISDisplayed();
	  Assert.assertTrue(dashboarddisplayed,Constant.ERRORMESSAGEFORLOGIN); //first argument for True condition and second part is for indicating LOgin error 
  }
  @Test(groups="Smoke Test")
  
  public void verifyIncorrectUsernameCorrectpassword()
  {
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox("ad", "admin");
	  log.button();
	  boolean nodashboard=log.isDashboardISDisplayed();
	  Assert.assertTrue(nodashboard, Constant.ERRORLOGININCORECTCREDENTIALS);
  }
  //Reading from the excel file stored in Src/main/resource
  @Test

  public void verifyuserCanLoginCorrectUsernameAndInCorrectPassword() throws IOException {
	  
	  
	  String username=ExcelUtility.getStringData(1,0,"Sheet1");
	  String password=ExcelUtility.getStringData(1,1,"Sheet1");
	  
	  //create object of mainjava LoginPage VERYIMPORTANT 
	  LoginPageObjectClass loginpage=new LoginPageObjectClass(driver);
	  loginpage.enterValuesintoTextbox(username,password);
	  loginpage.button();
  }
  @Test(dataProvider="credentials")
  public void verifyuserCanLoginIncorrectUsernameAndInCorrectPassword(String username,String password) {
	  
	  
	  //create object of mainjava LoginPage VERYIMPORTANT 
	  LoginPageObjectClass loginpage=new LoginPageObjectClass(driver);
	  loginpage.enterValuesintoTextbox("admn","adin");
	  loginpage.button();
  }

  @Test (dataProvider="inputs")
  

  public void verifyUserCanLoginDataProviderInputthrough(String username,String password)
  {
	  LoginPageObjectClass log=new  LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username, password);
	  log.button();
  }
  @DataProvider(name="inputs")
  public Object[][]testData()
  {
	  Object data[][]= {{"admin","admin"},{"sert","admin"},{"admin","234d"},{"dff","regc"}};
	  return data;
  }
 
  
}
