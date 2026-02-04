package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locate
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement btn_New_ManageNews;
	@FindBy(xpath="//textarea[@name='news']")WebElement commentbox_Enternews;
	@FindBy(xpath="//button[@name='create']")WebElement button_save_Managenews;
	

	public ManageNewsPage clickNewButtonManageNews()
	{
		btn_New_ManageNews.click();
		return this;
	}
	public ManageNewsPage clickonEnterNewsCommentbox(String news)
	{
		commentbox_Enternews.sendKeys(news);
		//pass string value when passing in test class
		return this;
	}
	public ManageNewsPage clickon_Save_ManageNews()
	{
		 button_save_Managenews.click();
		 return this;
	}
	//Locate alert for succeful news entry -Assertion
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successalert;
	public boolean isDispalyedSuccessNewsalert()
	{
		return successalert.isDisplayed();
	}
}
