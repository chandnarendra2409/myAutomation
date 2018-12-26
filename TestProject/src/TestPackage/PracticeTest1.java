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

public class PracticeTest1 extends PracticeJavaclass{
	
	PracticeJavaclass jc=new PracticeJavaclass();
	WebDriver driver;
	@BeforeTest
	public void setup(){
	
	
		
	}
  @Test
  @Parameters({"browser"})
  public void f1(String browser) {
	  			if(browser.equals("chrome")){
	  				String chromepath = "D:\\nc00338002\\TECHM\\Automatics\\AutoMaTics\\com.automatics\\automatics\\external\\tools\\chromedriver.exe";
	  				System.setProperty("webdriver.chrome.driver", chromepath);
	  					driver=new ChromeDriver();
	  					driver.get("https://letskodeit.teachable.com/");
	  					System.out.println("Chrome opened");
	  					driver.manage().window().maximize();
	  					driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  					jc.userid.click();
	  					jc.loginbtn.sendKeys("naren");
	  					jc.password.sendKeys("naren");
	  					jc.commitbtn.click();
	  			}
	  }
  
  @AfterTest
  public void cleanup(){
	  driver.quit();
	
	  }
}
