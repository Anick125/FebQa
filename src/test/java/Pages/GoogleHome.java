package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	WebDriver driver;
	
public  GoogleHome(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(name="q")

WebElement searchbox;

public void entersearch (String bx) {
	
	
	searchbox.sendKeys(bx);
	
}

@FindBy (name= "btnK")
WebElement Clickbox;

public void click () {
	
	
	Clickbox.click();
}





}
