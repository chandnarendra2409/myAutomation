package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name="inputs")
	public Object[][] getdata(){
		return new Object[][]{
			{"BMW", "A3"},
			{"AUDI","A6"},
			{"benz","c300"}
		};
	}
	
	@Test(dataProvider="inputs")
		public void f(String input1, String input2) {
			System.out.println("Input 1: "+input1);
			System.out.println("Input 2: "+input2);
		}
}