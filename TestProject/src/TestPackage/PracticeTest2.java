package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTest2 extends PracticeJavaclass{
	
	PracticeJavaclass jc=new PracticeJavaclass();
	WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	public void setup(String browser){
		if(browser.equals("firefox")){
				String geckopath="D:\\nc00338002\\ATT\\my downloads\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", geckopath);
	  			driver=new FirefoxDriver();
				driver.get("https://letskodeit.teachable.com/");
				System.out.println("Firefox opened");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				}
	}
	@Test
			public void f2() {
	  	  			jc.userid.click();
  					jc.loginbtn.sendKeys("naren");
  					jc.password.sendKeys("naren");
  					jc.commitbtn.click();
	  		}
  
  @AfterTest
  public void cleanup(){
	  driver.close();
	  }
}
