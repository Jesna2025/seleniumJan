package testannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations1 {
  @Test
  public void print() {
	  System.out.println("AAAA method/class/test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before AAAA method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After AAAA method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE AAAA CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After AAAA CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before AAAA Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After AAAA TEST");
  }

}
