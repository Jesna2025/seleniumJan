package testweek1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowhandling {
 
	WebDriver driver;
	//open multiple windows and multiple actions --use 
	public void multiplewindow()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		//getwindowhandle:: for handling single window method
		//getwindowhandles :: for handling multiple windows
		
		
		//first window CONTACT US
		WebElement multiple=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		multiple.click();
		//second window Login 
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		//Multiple window handling method is getWindowHandle method ,get method always have return type so declare it as String
		//
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent"+parent);
		//to print Id of link cliked on the console
		//Set will not take duplicate values so use Set
		
		Set<String> allwindows=driver.getWindowHandles();
		//System.out.println(allwindows);
		
		String title="";
		
		
		for(String childs:allwindows)
		{
			if(!childs.equals(parent))//removing parent window
			{
				System.out.println("Printing olnly child windows"+childs);
				//switch in to each windows
				driver.switchTo().window(childs);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
				
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				//actions to perform in contact us page
				WebElement first=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				first.sendKeys("Jesna");
				
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement last=driver.findElement(By.xpath("//input[@id='text']"));
				last.sendKeys("Kana MeethalJ");
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowhandling multiplewindow=new MultipleWindowhandling();
		multiplewindow.multiplewindow();

	}

}
