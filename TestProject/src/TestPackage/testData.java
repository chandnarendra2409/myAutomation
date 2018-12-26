package TestPackage;

import org.testng.annotations.DataProvider;

public class testData {
	@DataProvider(name="inputs")
	public Object[][] getdata(){
		return new Object[][]{{"naren","chand"},{"ganesh","chand"},{"devaki","chand"}};		
	}
	
}
