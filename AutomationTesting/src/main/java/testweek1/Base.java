package testweek1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	WebDriver driver;//declaring webdriver globally where WebDriver is a Interface and driver is the object
	
	public void browserInitialization()
	{
		driver=new ChromeDriver();//calling Chrome driver 
		driver.get("https://selenium.qabible.in/index.php");//get is the abstract method in Webdriver interface
		//use any link you want to do test automation above
		driver.manage().window().maximize();//methods in interface -WebDriver 
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		//driver=new SafariDriver();
	}
	public void quitandClose()
	{
		//close method --it will close only single window
		//Quit method --it will close multiple windows or tab in the browser-- Everything
		driver.close();
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.browserInitialization();
		base.quitandClose();
	}

}
