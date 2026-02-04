package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//PAGE OBJECT CLASS :: 1.Constructor + 2.Locators+3.Action Methods
//80% work is performed here

public class LoginPage {
	//Constructor
	public WebDriver driver; //to access in all other pages use public
	
  public LoginPage(WebDriver driver)//login page constructor
  {
	this.driver=driver;  //local
	PageFactory.initElements(driver, this);//Initialize Elements ---for Reuse --connecting with test java classes
	
  }
  //Locators
  @FindBy(xpath="//input[@name='LoginForm[username]']")WebElement usernamefield;
  //we can give WebElement user name in below also
  
  @FindBy(xpath="//input[@name='LoginForm[password]']")WebElement passwordfield;
  
  @FindBy(xpath="//button[text()='Login']")WebElement button;
  
  //Action Methods
  public void enterUsernameAndPassword(String username,String password)
  {
	  usernamefield.sendKeys(username);
	  passwordfield.sendKeys(password);
	  
  }
  public void clickOnLoginButton()
  {
	  button.click();
  }
  
}
