package testweek1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Base {
	public void idLocator()
	{
		//Identify (inspect),check Id is Unique or not ,paste in the id field below
		//webelement is an Interface used to store elements(datatype) from the website
		
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		WebElement messagefield1=driver.findElement(By.id("value-a"));
		WebElement messagefield2=driver.findElement(By.id("value-b"));
		
	}
public void classLocator()
{
	WebElement message=driver.findElement(By.className("form-control"));
	
}
public void nameLocator()
{
	//metatag 
	WebElement name=driver.findElement(By.name("description"));
}

public void linkedText()
{
	WebElement ltext=driver.findElement(By.linkText("Simple Form Demo"));
}
public void partialLinkedText()
{
	WebElement partial=driver.findElement(By.partialLinkText("Simple F"));
}
//combination of 2 elements
public void cssselector()
{
	//tag and Id use #
	WebElement tagid=driver.findElement(By.cssSelector("input#single-input-field"));
	//tagatribute use []
	WebElement tagattribute=driver.findElement(By.cssSelector("input[placeholder=Message]"));
	//tagclass and attribute
	WebElement tagclassattribute=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
	//tag class
	WebElement tagcl=driver.findElement(By.cssSelector("input.formcontrol"));
}
//Absolute  
//we can access till root node ;; disadv is if attribute values changes it will be difficult at later time.
public void xpath()
{
	
	WebElement absolutexpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	//tagname[@attributetype='value']
    WebElement relativexpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    //important is relativexpath
    //Dynamic xpath a)text() In this case only Text like 'Show Message' is only available
    WebElement text1=driver.findElement(By.xpath("//button[text()='Show Message']"));
    //Dynamic contains():: use in the situation where the attribute value can change at later times,and also part(any part can add) of the attribute value is enough to identify
    WebElement con1=driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
    //Dynamic starts-with ::IN the situation where id=msg1,refresh makes id =msg2 here we can use first half of the attribute value to identify
    WebElement start1=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
    //or :: note or included in the string ,if next value is an attirbute use @ after or
    WebElement or1=driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
   //and :: NOTE and included in the below string 
    WebElement and1=driver.findElement(By.xpath("//button[@id='button-one' and  text()='Show Message']"));
    
}

public void axesMethod()//show Message 
{
	WebElement child=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));
	WebElement parent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
	WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::label[@for='inputEmail4']"));
	WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='row']"));
	WebElement descend=driver.findElement(By.xpath("//form[@method='POST']//descendant::div[@id='message-one']"));
	WebElement index=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
