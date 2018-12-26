package TestPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeJavaclass {
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginbtn;
	
	@FindBy(name="user[email]")
	WebElement userid;
	
	@FindBy(name="user[password]")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement commitbtn;
}
