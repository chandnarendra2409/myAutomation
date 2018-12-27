package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParallelTest {

	WebDriver driver;
	PracticeQPageFactory jc;

	@BeforeTest
	@Parameters({"browser"})
	public void setup(String browser){
		if(browser.equals("firefox")){
			String geckopath="D:\\nc00338002\\ATT\\my downloads\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", geckopath);
			driver=new FirefoxDriver();
			jc=new PracticeQPageFactory(driver);
			driver.get("https://letskodeit.teachable.com/");
			System.out.println("Firefox opened");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}

		else if(browser.equals("chrome")){
			String chromepath = "D:\\nc00338002\\TECHM\\Automatics\\AutoMaTics\\com.automatics\\automatics\\external\\tools\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver=new ChromeDriver();
			jc=new PracticeQPageFactory(driver);
			driver.get("https://letskodeit.teachable.com/");
			System.out.println("Chrome opened");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}

	}
	@Test
	public void f2() {
		jc.clickloginbtn();
		jc.enterusername();
		jc.enterpassword();
		jc.clickcommitbtn();
	}

	@AfterTest
	@Parameters({"browser"})
	public void cleanup(String browser){
		if(browser.equals("chrome")){
			System.out.println("Closing chrome");
			}
		else if(browser.equals("firefox")){
			System.out.println("Closing firefox");
		}
		
		driver.close();
	}
}
