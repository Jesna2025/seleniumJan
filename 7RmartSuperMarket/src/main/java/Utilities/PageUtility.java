package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	//DropDown methods value selection by value ,visible text ,index can be generalized accessed anywhere in the code for the we use page Utility 
	
	public void selectByVisibleText(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);	
	}
	
	public void selectByindex(WebElement element,int  index)
	{
		Select select=new Select(element);
		select.selectByIndex(0);
	}
	
	public void selectbyValue(WebElement element,String df)
	{
		Select select=new Select(element);
		select.selectByValue(df);
	}
	public void selectbyContainsVisibleText(WebElement element,String fg)
	{
		Select select=new Select(element);
		select.selectByContainsVisibleText(fg);
	}
	
    public void scrollIntoView(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

   
	
}
