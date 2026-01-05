package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFromPage extends Base{
	
	public void entermessage()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		//inputting values to the field --SendKeys
		messagefield.sendKeys("Hello World");
		//clicking on the button
		WebElement m1click=driver.findElement(By.id("button-one"));
		m1click.click();
	}
	//giving input to the field A and B and finding sum
	public void sum()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement ina=driver.findElement(By.id("value-a"));
		ina.sendKeys("1");
		WebElement inb=driver.findElement(By.id("value-b"));
		inb.sendKeys("2");
		WebElement m2click=driver.findElement(By.id("button-two"));
		m2click.click();
	}
	public void helloWorld()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement hello=driver.findElement(By.id("single-input-field"));
		hello.sendKeys("HelloWorld");
		WebElement hell=driver.findElement(By.id("value-a"));
		hell.sendKeys("HelloWorld");
		WebElement he=driver.findElement(By.id("value-b"));
		he.sendKeys("HelloWorld");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputFromPage ifp= new InputFromPage();
		ifp.browserInitialization();
		//ifp.entermessage();
		//ifp.sum();
		ifp.helloWorld();
		
	}
	

}
