package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	void handlingDD()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		//use 'select class' to locate elements in the dropdown .It is a inbuilt class
		WebElement selectcolor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectcolor);//pass webeleemnt 
		//3 methods
		//1)selectByVisibleText : copy paste the text in the DD
		select.selectByVisibleText("Yellow");
		//2)In Index : normally count from 0 
		select.selectByIndex(3);
		//3)selectByValue: copy the Value filed in DOM 
		select.selectByValue("Red");   
		//use any of the method you prefer
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown hand=new HandlingDropdown();
		hand.browserInitialization();
		hand.handlingDD();
	
	}

}
