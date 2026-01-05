package AssignmentHW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	
	public void browsercalling()
	{
		driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}
		public void checkbox()
		{
	
		List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ck:check)
		{
			ck.click();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Base base=new Base();
       base.browsercalling();
       base.checkbox();
	}

}
