package testweek1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	/*Keyboard actions :: use inbuilt class ::: robot
how to upload a file ? image ,documents etc
2 types: send keys ,robot class*/

	WebDriver driver;
	//1.
	public void sendKeysFileUpload() 
	{
	driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().window().maximize();
	
	WebElement file=driver.findElement(By.xpath("//input[@id='file-upload']"));
	file.sendKeys("/Users/jesnakanameethal/Desktop/Confirmation _ Checkout _ Saint-Constant Aquatic Complex.pdf");//copy as path :
	
	}
	
	//2.robotclass 
	
	public void robotclassfileupload() throws AWTException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		
		
		
		StringSelection selection=new StringSelection("/Users/jesnakanameethal/Desktop/Confirmation _ Checkout _ Saint-Constant Aquatic Complex.pdf");
		//StringSelection is for getting path
		//copy to clipboard use toolkit ,setcontents is to copy and paste here paste is null
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		WebElement robot=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		robot.click();
		Thread.sleep(2000);
		Robot ro=new Robot();
		
		ro.setAutoDelay(500);
		//ro.delay(2000);
		//command shift G In Mac for copy 
		ro.keyPress(KeyEvent.VK_META);
		ro.keyPress(KeyEvent.VK_SHIFT);
		ro.keyPress(KeyEvent.VK_G);

		ro.keyRelease(KeyEvent.VK_G);
		ro.keyRelease(KeyEvent.VK_SHIFT);
		ro.keyRelease(KeyEvent.VK_META);
		
		//ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyPress(KeyEvent.VK_META);//Virtual Key
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_META);
		ro.keyRelease(KeyEvent.VK_V);
		// Enter
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		FileUpload file=new FileUpload();
		//file.sendKeysFileUpload();
		file.robotclassfileupload();
	}

}
