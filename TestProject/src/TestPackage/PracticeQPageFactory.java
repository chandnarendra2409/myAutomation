package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PracticeQPageFactory {
	
	WebDriver driver;

	@FindBy(xpath="//a[contains(@href,'/sign_in')]")
	WebElement loginbtn;
	
	@FindBy(name="user[email]")
	WebElement userid;
	
	@FindBy(name="user[password]")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement commitbtn;

public PracticeQPageFactory(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickloginbtn(){
	loginbtn.click();
}

public void enterusername(){
	userid.sendKeys("naren@att.com");
}

public void enterpassword(){
	password.sendKeys("naren");
}

public void clickcommitbtn(){
	commitbtn.click();
}

}
