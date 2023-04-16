package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		WebDriver driver; // its an interface
		
		WebDriverManager.chromedriver().setup(); //setting up the browser
		
		driver = new ChromeDriver(); // make an object of the browser

	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("quality assuarance");
	driver.findElement(By.name("btnK")).click();
	
	
	
	
	
	}

}
