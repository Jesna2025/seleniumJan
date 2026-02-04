package testannotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

//can run indvudually methods without main method ,runAll runs in alphabetical order 
//we can give priority to methods ,

public class FirstAnnotation {
  @Test (priority=1)
  //it runs without main method
  public void print() {
	  System.out.println("WELCOME TO ANOOTATIONS IN TEST NG");
  }
  @Test(priority=2)
	  public void atext()
	  {
		  System.out.println("JESNA is a good girl");
		  
	  }
  @Test
  
  public void ztext()
  {
	  System.out.println("Priority");
  }                       
  @Test
  public void xtext()
  {
	  System.out.println("Priority"); 
  }
	  
  }

