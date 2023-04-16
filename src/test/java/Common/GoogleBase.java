package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleBase {
	
	public WebDriver driver;
	
 public void Launchbrowser () {
	
	 WebDriverManager.chromedriver().setup();
	    
	    driver = new ChromeDriver ();
	    
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  

}
 public void closebrowser() {
	 
	 
	 driver.close();
 }
 
 
}