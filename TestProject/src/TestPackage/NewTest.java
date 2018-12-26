package TestPackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f2() {
	  
	  	FirefoxOptions options = new FirefoxOptions();
		//options.setBinary("C\\Users\\nc00338002\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	  	String geckopath="D:\\nc00338002\\ATT\\my downloads\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckopath);
		driver=new FirefoxDriver();
		
		driver.get("https://letskodeit.teachable.com/");
		System.out.println("Firefox opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  
}
