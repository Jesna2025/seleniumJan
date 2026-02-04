package testweek1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TableHandling extends Base{
	
	public void readfullTablehanding()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());//returns table data on  the console
		
	
	}
	//getting row data only
	public void readRowTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));//includes tbody and tr with / symbol
		System.out.println(row.getText());//returns 3rd row as specified above
		
	}
	public void readspecificData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//here 3 row and 3rd column data will be displayed on the console
		WebElement specific=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
		System.out.println(specific.getText());
	}
	//table[@id='dtBasicExample']/tbody/tr/td[3]
	public void columndata()
	{
		//the mentioned whole column will be displayed on the console
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement col:column)
		{
			System.out.println(col.getText());
		}
	}
	public void checkingelement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Tokyo";
		List<WebElement> check=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement ch:check)
		{
			if(ch.getText().equals(input))
			{
				System.out.println(ch.getText());
			}
				
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehand= new TableHandling();
		tablehand.browserInitialization();
		tablehand.readfullTablehanding();
		System.out.println("*********");
		tablehand.readRowTable();
		System.out.println("*********");
		tablehand.readspecificData();
		System.out.println("*********");
		tablehand.columndata();
		System.out.println("*********");
		tablehand.checkingelement();
	}

}
