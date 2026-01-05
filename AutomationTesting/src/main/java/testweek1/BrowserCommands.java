package testweek1;

public class BrowserCommands extends Base{
	
	public void browserCommands()
	{
		//getting title
		String title=driver.getTitle();
		System.out.println("The title is "+title);
		//getting URL
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		//PageSource-return HTML code
		String pagesource=driver.getPageSource();
		System.out.println("PageSource is "+pagesource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser=new BrowserCommands ();
		browser.browserInitialization();
		browser.browserCommands();
	}
}
