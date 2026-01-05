package testweek1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadioButton extends Base{

	
	public void checkboxDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlecheckbox=driver.findElement(By.id("gridCheck"));
		singlecheckbox.click();
		
	}
	//multiple fields --check box selection
	public void findElementsEx()
	{
		//more than one elements - Use FindElements
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multiplebox=driver.findElements(By.className("check-box-list"));
		for (WebElement boxes:multiplebox)
		{
			boxes.click();
		}
	}
	public void radioButtonDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton=driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		System.out.println(radiobutton.isEnabled());
		System.out.println(radiobutton.isSelected());
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		//isDisplayed :: to check the alert 
		//System.out.println(radiobutton.isDisplayed());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxAndRadioButton cb=new CheckboxAndRadioButton();
		cb.browserInitialization();
		//cb.checkboxDemo();
		//cb.findElementsEx();
		cb.radioButtonDemo();
		
	}

}
