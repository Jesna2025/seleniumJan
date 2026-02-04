package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterExample {

	
	WebDriver driver;
	//If normal coding is working do not use JavaScriptExecuter -it will not work,test normal 
	public void javascriptExecuterEg()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		//Since WebDriver cannot perform scroll up and scroll up operations we use JavaScriptExecuter Interface
		//JavaScriptExecuter for scroll up and scroll down
		
		JavascriptExecutor script=(JavascriptExecutor) driver;//upcast 
		script.executeScript("window.scrollBy(0,1000)");//for moving down give 0,1000 
		script.executeScript("window.scrollBy(0,-500)");//for moving up from the above position 
		//click
		WebElement multiple=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		script.executeScript("arguments[0].click();", multiple);//In javaScript Executer 
		//multiple.click(); In some case this will not work use javascript executer as above
		
		//Sendkeys
		WebElement first=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		script.executeScript("arguments[1].value='HELLO';",first);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecuterExample javascript=new JavaScriptExecuterExample();
		javascript.javascriptExecuterEg();
	}

}
