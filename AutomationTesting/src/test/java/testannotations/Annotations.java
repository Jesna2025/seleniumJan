package testannotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations {
  @Test
  public void print() {
	  System.out.println(" Methodddddddd");
  }
  @BeforeMethod
  
  public void beforeMethod() { //annotation which controls the flow ;it execute first before each method
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");//execute after each method
  }
  @Test
  public void test()
  {
	  System.out.println("Jesna");
  }

}
