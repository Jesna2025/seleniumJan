package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	

	//SendKey for File
	public void sendkeysForFileUpload(WebElement element,String path)
	{
		element.sendKeys(path);
	}
	public void robotClassForFileUpload(WebElement element,String path) throws AWTException, InterruptedException
	{
		StringSelection selection=new StringSelection(path);
		//StringSelection is for getting path
		//copy to clipboard use toolkit ,setcontents is to copy and paste here paste is null
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		//WebElement robot=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		//robot.click();
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

}
