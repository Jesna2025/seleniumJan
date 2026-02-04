 package testscript;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

//right click the test package and TestNG the create TestNGClass select the annotations needed
//TEST OBJECT CLASS ::Test methods validations ,only 20%work
public class LoginPageTest extends Base{
	
  @Test
  //Value pass only through xml file @Parametrs,if Parameter annotation is present the method below will not run with out paramenter xml file 
  @Parameters({"username","password"})
  public void verifyUserCanLogin(String username,String password) {
	  //driver.navigate().to("");
	  /*WebElement username=driver.findElement(By.xpath("//input[@name='LoginForm[usename]']"));
	  username.sendKeys("carol");
	  //password
	  WebElement password=driver.findElement(By.xpath("//input[@name='LoginForm[password]']"));
	  password.sendKeys("1q2w3e4r");
	  //Login
	  WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
	  login.click();*/
	  //Above code is not required since we connect with child class below
	  //
	  
	  //create object of mainjava LoginPage VERYIMPORTANT ,that is object of PageObjectClass ,ie LoginPage here
	  LoginPage loginpage=new LoginPage(driver);
	  
	  loginpage.enterUsernameAndPassword(username, password);
	  loginpage.clickOnLoginButton();
  }
  @Test
  public void verifyuserCanLoginIncorrectUsernameAndCorrectPassword() {
	  
	  
	  //create object of mainjava LoginPage VERYIMPORTANT 
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("caro", "1q2w3e4r");
	  loginpage.clickOnLoginButton();
  }
  @Test
  public void verifyuserCanLoginCorrectUsernameAndInCorrectPassword() {
	  
	  
	  //create object of mainjava LoginPage VERYIMPORTANT 
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("carol", "12w3e4r");
	  loginpage.clickOnLoginButton();
  }
  @Test(dataProvider="credentials")
  public void verifyuserCanLoginIncorrectUsernameAndInCorrectPassword(String username,String password) {
	  
	  
	  //create object of mainjava LoginPage VERYIMPORTANT 
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsernameAndPassword(username, password);
	  loginpage.clickOnLoginButton();
  }
  //Dataprovider learn this first down 
  
  @Test
@DataProvider(name="credentials")
  public Object[][]testData()//Object predefind class and values stored in data which needs a return type
  {
	  Object data[][]= {{"carol","1q2w3e4r"},{"dref","3455"},{"carol","65479"}};
	  return data;
	  
	  
  }
  
  //parameterson the top with creating xml file creation ,run xml file only rightclick and runtestng suite
  
}
