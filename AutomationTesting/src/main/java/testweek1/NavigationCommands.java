package testweek1;

public class NavigationCommands extends Base {

	
	public void navigationCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//child class --navigate 
		//paste the webpage to open after base link
		//??IF BrowserIntitialzation method is not called in main method does this navigate method works??
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigation=new NavigationCommands();
		navigation.browserInitialization();
		navigation.navigationCommands();
		//navigation.quitandClose();
	}

}
