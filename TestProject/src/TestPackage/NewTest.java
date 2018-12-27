package TestPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f2() {
	  	String geckopath="D:\\nc00338002\\ATT\\my downloads\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckopath);
		driver=new FirefoxDriver();
	  	PracticeQPageFactory jc=new PracticeQPageFactory(driver);
		driver.get("https://letskodeit.teachable.com/");
		driver.manage().window().maximize();
		System.out.println("Firefox opened");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		jc.clickloginbtn();
		jc.enterusername();
		jc.enterpassword();
		jc.clickcommitbtn();
  }
  
}
