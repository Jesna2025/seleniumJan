package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Pages.HomePage;
import Pages.LoginPageObjectClass;
import Pages.ManageNewsPage;

public class ManageNewsTest extends Base {
	
	ManageNewsPage managenews;
	HomePage homepage;
  @Test
  @Parameters({"username","password"})
  public void verifyUserCanManageNews(String username,String password)
  {
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username, password);
	  homepage=log.button();
	  managenews=homepage.clickOnManageNewsMoreInfo();
	  managenews.clickNewButtonManageNews().clickonEnterNewsCommentbox("It can rain in some parts of India")
	  .clickon_Save_ManageNews();
	  boolean valuefromMethodisDispalyedSuccessNewsalert=managenews.isDispalyedSuccessNewsalert();
	  Assert.assertTrue(valuefromMethodisDispalyedSuccessNewsalert, "Alert is not displayed and Managenews not working");
	  
	  
	  /*3 classes are chained log,homepage,managenews  
	  //Magange News page object creation
	 /*commented while using chaining of methods and classes: ManageNewsPage manage=new ManageNewsPage(driver);
	  manage.clickOnManageNewsMoreInfo();
	  manage.clickNewButtonManageNews();
	  manage.clickonEnterNewsCommentbox();
	  manage.clickon_Save_ManageNews();*/
  }
}