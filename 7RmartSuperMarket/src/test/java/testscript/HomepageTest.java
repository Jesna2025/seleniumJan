package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.HomePage;
import Pages.LoginPageObjectClass;

public class HomepageTest extends Base{
	
	HomePage home;
  @Test 
  @Parameters({"username","password"})
  public void verifyUserCanLogout(String username,String password)
  {
	 
	  
	  //create LoginPage object to call to enter usernaME AND PASSWORD
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username,password);
	  home=log.button();
	  home.clickingOnAdmin().logout();
	  //Assertion: checking title is displayed after logout  using equals
	  String expected="Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected,Constant.ERRORMESSAGEFORHOMEPAGE);
	  /*log.button();
	  
	  //Create HomePage Object to call admin then logout
	  
	  HomePage home=new HomePage(driver);
	  home.clickingOnAdmin();
	  home.logout();*/
  }
}
