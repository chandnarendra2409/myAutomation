package TestPackage;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f1() {
	  System.out.println("F1 method running");
	  Assert.assertTrue(false);
	  System.out.println("after failing");
  }
  @Test
  public void f2() {
	  System.out.println("F2 method running");
	  Assert.assertTrue(true);
  }
  @AfterMethod
  public void f3(ITestResult testResult) {
	 System.out.println(testResult.getMethod().getMethodName());
	 System.out.println(testResult.isSuccess());
	 System.out.println(testResult.getStatus());

  }
}
