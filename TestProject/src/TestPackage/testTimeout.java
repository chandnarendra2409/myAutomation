package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testTimeout {
	
	@BeforeClass
		public void setup(){
			System.out.println("before class");
		}
	@AfterClass
		public void cleanup(){
			System.out.println("after class");
		}
	@Test(enabled=false)
		public void f1() {
			System.out.println("f1 method");
		}
	@Test(enabled=true, timeOut=3000)
		public void f2() throws InterruptedException {
			System.out.println("f2 method");
			Thread.sleep(2000);
	}
}
