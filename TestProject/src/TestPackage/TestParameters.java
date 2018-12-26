package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestParameters {

	@BeforeClass
	@Parameters({"browser", "platform"})
		public void setup(String browser,String platform ){
			System.out.println("Setup Method");
			System.out.println("1. parameter from xml file : "+browser);
			System.out.println("2. parameter from xml file : "+platform);
		}
	
	@Test
	@Parameters({"response"})
		public void f1(String response) {
			System.out.println("f1 method : "+response);
		}
}
