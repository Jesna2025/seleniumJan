package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Constructor::with parameter WebDriver driver ,this+pagefactory::
import org.openqa.selenium.support.ui.Select;
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Locating login elements 
	@FindBy(xpath="//a[@class='nav-link']/img ")WebElement admin;
	@FindBy(css="i[class='ace-icon fa fa-power-off']")WebElement logout;
	//xpath of Moreinfo and clickonMoreInfo methods are pasted here  from AdminUserPage for chaining of methods ,homepage and adminuserpage
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and contains(@class,'small-box-footer')]")WebElement link_moreinfo;
	
	//Action methods  
	public AdminUserPage clickOnMoreInfo()
	{
		link_moreinfo.click();
		return new AdminUserPage(driver);
	}
	//xpath of More inf Managenews action methods
	@FindBy(xpath="//a[contains(@class, 'small-box-footer') and contains(@href, 'list-news')]")WebElement link_Moreinfo_Managenews;
	public ManageNewsPage clickOnManageNewsMoreInfo()
	{
		link_Moreinfo_Managenews.click();
		return new ManageNewsPage(driver);
	}
	//xpath and ManageCategory Chaining of class
	
	@FindBy(xpath="//a[contains(@class, 'small-box-footer') and contains(@href, 'list-category')]")WebElement link_moreinfo_managectegory;
	 public ManageCategoryPage clickOnMoreInfo_ManageCategory()
		{
		 link_moreinfo_managectegory.click();
		 return new ManageCategoryPage(driver);
		}
	 
	 //xpath and ManageProduct Chaining of classes
	@FindBy(xpath="//a[contains(@class,'small-box-footer') and contains(@href,'list-product')]")WebElement link_Moreinfo_manageproduct;
	public ManageProductPage clickonMoreinfoManageProduct()
	{
		link_Moreinfo_manageproduct.click();
		return new ManageProductPage(driver);
	}
	
	
	//Admin on the right side logout starts here
	public HomePage clickingOnAdmin()
	{
		admin.click();
		return this;
	}
	//clicking logout direct to loginPage , there is no further execution  ,so change void intp HomePage
   public HomePage logout()
   {
	   logout.click();
	   return this;
   }


}
