package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base {

	
	public void dragandDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		//Drag use Actions class ,since it is mouse actions like click double click and drag use 'driver' as parameter
		
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();//mouse over and click
		actions.doubleClick(drag).perform(); 
		WebElement drop=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(drag, drop).build().perform();//build : it is sequence of actions will be executed
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop dropandDrop=new DragandDrop();
		dropandDrop.browserInitialization();
		dropandDrop.dragandDrop();
		

	}

}
