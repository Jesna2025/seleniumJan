package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void alerthandling1oK()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement greenclick=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		greenclick.click();
		// Handling alert after clicking
		driver.switchTo().alert().accept();//here OK button - accept method	
	}
	public void alerthandlingCancel()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement cancelclick=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		cancelclick.click();
		//Handling alert after clicking CLICK ME button then it is having 2 buttons on the alert message
		driver.switchTo().alert().dismiss(); //dismiss means cancel button
	}
	public void alertEnteringMessage()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement entermessagealert=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		entermessagealert.click();
		//Entering message on alert box
		driver.switchTo().alert().sendKeys("HeLLOGRRRR");
		//I couldnot see HeLLOGRRRR message on the alert ??
		//driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert=new AlertHandling();
		alert.browserInitialization();
		//alert.alerthandling1oK();
		//alert.alerthandlingCancel();
		alert.alertEnteringMessage();
	}

}
