package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constants.Constant;
import Utilities.FileUploadUtility;

public class ManageProductPage {
	
	WebDriver driver;
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate elements from New button
	@FindBy(xpath="//a[contains(@class,'btn btn-rounded btn-danger') and contains(@href,'add')]")WebElement btn_New_ManageProduct;
	@FindBy(xpath="//input[contains(@class,'form-control') and contains(@name,'title')]")WebElement txt_title;
	@FindBy(xpath="//input[contains(@value,'Veg') and contains(@name,'type')]")WebElement radio_producttype_veg;
	@FindBy(xpath="//select[contains(@class,'form-control selectpicker') and contains(@name,'cat_id')]")WebElement list_category;
	@FindBy(xpath="//select[contains(@class,'form-control selectpicker') and contains(@name,'sub_id')]")WebElement list_subCategory;
	@FindBy(xpath="//select[@id='grp_id']/option[normalize-space()='discount']")WebElement list_grougp_discount;
	//select then option xpath above
	@FindBy(xpath="//label[@onclick='myFunction_piece()']//input[@name='price_type']")WebElement radio_pricetype_piece;
	//weight
	//label then input above
	@FindBy(xpath="//input[contains(@placeholder,'Enter the Weight Value') and contains(@name,'m_weight')]")WebElement txt_weightValue;
	@FindBy(xpath="//select[@id='w_unit']/option[@value='kg']")WebElement list_WeightUnit_kg;
	@FindBy(xpath="//input[@placeholder='Enter the Maximum Quantity']")WebElement txt_MaxQuantity;
	@FindBy(xpath="//input[@placeholder='Enter the Price']")WebElement txt_Price_EnterthePrice;
	//DO NOT HAVE MRP LOCATOR
	@FindBy(xpath="//input[contains(@placeholder,'Stock Availability') and contains(@id,'w_stock') ]")WebElement txt_StockAvail;
	//DO NOT HAVE Description 
	@FindBy(xpath="//input[@type='radio' and @name='stock' and @value='yes']")WebElement radio_Stock_Yes;
	@FindBy(xpath="//input[@type='file' and @name='main_img' and @id='main_img']")WebElement btn_chooseFile;
	//@FindBy(xpath="//input[@type='file' and @name='subfile[]' and @id='main_imgs']")WebElement btn_subimg;
	@FindBy(xpath="//input[@type='radio' and @name='featured' and @value='no']")WebElement radio_featured_No;
	@FindBy(xpath="//input[@type='radio' and @name='combo' and @value='no']")WebElement radio_combo_No;
	@FindBy(xpath="//button[@type='submit' and @name='create' and @class='btn btn-danger']")WebElement btn_Save;
	//Action Methods
	public ManageProductPage clickOnNewButton()
	{
		btn_New_ManageProduct.click();
		return this;
	}
	public ManageProductPage entertitle(String title)
	{
		txt_title.sendKeys(title);
		return this;
	}
	public ManageProductPage  productTypeRadioVeg()
	{
		radio_producttype_veg.click();
		return this;
	}
	public ManageProductPage listCategory()
	{
		list_category.click();
		return this;
	}
	public ManageProductPage subCategory()
	{
		list_subCategory.click();
		return this;
	}
	public ManageProductPage groupfromlist()
	{
		list_grougp_discount.click();
		return this;
	}
	public ManageProductPage priceTyperadioPiece() 
	{
		radio_pricetype_piece.click();
		return this;
	}
	
	public ManageProductPage weightValue_txt(String weight)
	{
	txt_weightValue.sendKeys(weight);
	return this;
	}
	public ManageProductPage weightUnitkg()
	{
		list_WeightUnit_kg.click();
		return this;
	}
	public ManageProductPage maxQuantitytxt(String quantity)
	{
		txt_MaxQuantity.sendKeys(quantity);
		return this;
	}
	public ManageProductPage entertheprice(String price)
	{
		txt_Price_EnterthePrice.sendKeys(price);
		return this;
	}
	public ManageProductPage stockAvail(String stock)
	{
		txt_StockAvail.sendKeys(stock);
		return this;
	}
	public ManageProductPage chooseFile_img()
	{
		fileuploadutility.sendkeysForFileUpload(btn_chooseFile,Constant.IMPATH_MANAGEPRODUCT);
		btn_chooseFile.sendKeys(Constant.IMPATH_MANAGEPRODUCT);
		return this;
	}
	
	public ManageProductPage featuredRadio()
	{
		radio_Stock_Yes.click();
		return this;
	}
	public ManageProductPage comboRadio()
	{
		radio_combo_No.click();
		return this;
	}
	public ManageProductPage savebtn()
	{
		btn_Save.click();
		JavascriptExecutor script=(JavascriptExecutor) driver;
		script.executeScript("arguments[0].click();",btn_Save);
		script.executeScript("arguments[0].scrollIntoView(true);", btn_Save);
		return this;
	}
	//locate alert and implement assertion for success_ManageProductPage
		/*@FindBy(xpath="")WebElement alert_manageproductSucess;
		public boolean isDisplayed_manageCategory_Success()
		{
			return alert_managecategorySucess.isDisplayed();
		}*/
	
}
