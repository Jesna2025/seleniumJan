package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//new site direction in to https://demo.guru99.com/test/guru99home/
public class IframeExample{
	WebDriver driver;
	//tag name always iframe 
	public void iframe()
	{
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement jframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));//identify the frame and the switch
		driver.switchTo().frame(jframe);
		WebElement frame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IframeExample iframe=new IframeExample();
		iframe.iframe();
	}

}
