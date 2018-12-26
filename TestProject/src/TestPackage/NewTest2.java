package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
	
	
  @Test(dataProvider="inputs", dataProviderClass=testData.class)
  public void f(String a, String b) 
  	{
	  System.out.println("String a: "+a);
	  System.out.println("String b: "+b);
  	}
}
