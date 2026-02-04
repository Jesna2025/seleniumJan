package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPageObjectClass;
import Pages.ManageCategoryPage;

public class ManageCategoryTest extends Base {
	ManageCategoryPage managecategory;
	HomePage home;
  @Test//(retryAnalyzer = retry.Retry.class)//screenshotUtility class- refer
  @Parameters({"username","password"})
  public void VerifyUserCanAddCategory_Manage(String username,String password)  {
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username, password);
	  home=log.button();
	  managecategory=home.clickOnMoreInfo_ManageCategory();
	  managecategory.clickonNewbutton().EnterCategory("Animals").clickonDiscount()
	  .clickonImageupload().clickonradiobuttonYesTop().clickonradiobuttonYesLeft().clickonSavebtn();
	  
	  boolean success_alert=managecategory.isDisplayed_manageCategory_Success();
	  Assert.assertTrue(success_alert, "Alert message not shown and AddNewCategory is unsuccessful");
	  
  }
}
