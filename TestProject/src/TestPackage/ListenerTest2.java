package TestPackage;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenersPackage.CustomListners2;

@Listeners(CustomListners2.class)
public class ListenerTest2 {
	@BeforeClass
	public void setup()
	{
		System.out.println("Before class method");
	}
	@AfterClass
	public void cleanup()
	{
		System.out.println("After class method");
	}
	@Test
  public void f1() {
		System.out.println("Test method 1");
		AssertJUnit.assertTrue(true);
  }
	@Test
	  public void f2() {
			System.out.println("Test method 2");
			AssertJUnit.assertTrue(false);
	  }
}
