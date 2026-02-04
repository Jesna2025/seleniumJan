package testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPageObjectClass;
import Pages.ManageProductPage;

public class ManageProductTest extends Base {
	ManageProductPage manageproduct;
	HomePage home;
  @Test
  @Parameters({"username","password"})
  public void verifyUserCanManageAddProduct(String username,String password) {
	  LoginPageObjectClass log=new LoginPageObjectClass(driver);
	  log.enterValuesintoTextbox(username, password);
	  home=log.button();
	  manageproduct.clickOnNewButton().entertitle("Scissors").productTypeRadioVeg().listCategory().subCategory()
	  .groupfromlist().priceTyperadioPiece().weightValue_txt("45").weightUnitkg().maxQuantitytxt("60")
	  .entertheprice("45").stockAvail("60").chooseFile_img().featuredRadio().comboRadio().savebtn();
	  
  }
}
