package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import Constants.Constant;
import Utilities.FileUploadUtility;
import Utilities.WaitUtility;

public class ManageCategoryPage {
	WaitUtility waitUtilility=new WaitUtility();
	FileUploadUtility fileupload=new FileUploadUtility();
	WebDriver driver;
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	//locate elements for ManageCategory
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement btn_NewManageCategory;
	@FindBy(xpath=("//input[@name='category']"))WebElement txt_category;
	@FindBy(xpath=("//li[contains(@class,'ms-elem-selectable')]/span[text()='discount']"))WebElement selectgroup_discout;
	@FindBy(xpath="//input[@name='main_img']")WebElement choosefile;
	@FindBy(xpath="//input[contains(@value,'yes') and contains(@name,'top_menu')]")WebElement radiobutton_yes_top;
	@FindBy(xpath="//input[contains(@value,'yes') and contains(@name,'show_home')]")WebElement radiobutton_yes_left;
	@FindBy(xpath="//button[contains(@type,'submit') and contains(text(),'Save')]")WebElement btn_saveManageCategory;
	//Action Methods
	public ManageCategoryPage  clickonNewbutton()
	{
		btn_NewManageCategory.click();
		return this;
	}
	public ManageCategoryPage EnterCategory(String category)
	{
		txt_category.sendKeys(category);
		return this;
	}
	public ManageCategoryPage clickonDiscount()
	{
		selectgroup_discout.click();
		return this;
	}
	public ManageCategoryPage clickonImageupload()
	{
		fileupload.sendkeysForFileUpload(choosefile, Constant.IMGPATH);
		choosefile.sendKeys(Constant.IMGPATH);
		return this;
	}
	public ManageCategoryPage clickonradiobuttonYesTop()
	{
		radiobutton_yes_top.click();
		return this;
	}
	public ManageCategoryPage clickonradiobuttonYesLeft()
	{
		radiobutton_yes_left.click();
		return this;
	}
	public ManageCategoryPage clickonSavebtn() 
	{
		JavascriptExecutor script=(JavascriptExecutor) driver;
		script.executeScript("window.scrollBy(0,6000)");
		waitUtilility.waitForElementToClick(driver, btn_saveManageCategory);
		btn_saveManageCategory.click();
		return this;
	}
	//locate alert and implement assertion for success_ManageCategory
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert_managecategorySucess;
	public boolean isDisplayed_manageCategory_Success()
	{
		return alert_managecategorySucess.isDisplayed();
	}

}
