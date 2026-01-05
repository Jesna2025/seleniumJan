package AssignmentHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
	
	public void dropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dd=driver.findElement(By.id("dropdowm-menu-1"));
		Select sel=new Select(dd);
		sel.selectByVisibleText("C#");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown dropdown=new DropDown();
		dropdown.browsercalling();
		dropdown.dropDown();
	}

}
