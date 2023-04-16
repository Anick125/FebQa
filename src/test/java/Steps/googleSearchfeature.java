package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Common.GoogleBase;
import Pages.GoogleHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchfeature extends GoogleBase {
	//we initialize this class
	GoogleHome g1;
//WebDriver driver;


@Given("I am one the google homepage")
public void i_am_one_the_google_homepage() {
	// calling the webdriver called chrome.
	Launchbrowser ();
    /*WebDriverManager.chromedriver().setup();
    
    driver = new ChromeDriver ();
    
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();*/
}

@When("I enter search {string}")
public void i_enter_search(String string) {
	//searchbox is a webelement. thats why we have to call webelement 
	// then we introduce searchbox with webelement cause searchbox is a name 
	// which webelement/java doesnt know.
		
	/*WebElement  searchbox;
	searchbox = driver.findElement(By.name("q"));

	searchbox.sendKeys(string);*/
	
	g1 = new GoogleHome (driver);
	g1.entersearch(string);
}

@When("I click on google search")
public void i_click_on_google_search() {
    WebElement Clickbox; 
	Clickbox = driver.findElement(By.name("btnK"));
	Clickbox.click();
}

@Then("I recieve related search result")
public void i_recieve_related_search_result() {
	
	
    	WebElement 	resultstats;
	resultstats = driver.findElement(By.id("result-stats"));
	// since gettext is a String, we have to name a string 
	
	String result = resultstats.getText();
		
	
	
		System.out.println( result);
		
		
		 
// or if we want to run this way we dont have to write string = result
		//write this resultstats.getText();
		//after that - System.out.println(results)
	
	//driver.close();
		closebrowser ();
}


	
	
	
	
	

}
