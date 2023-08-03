package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) {
		
	       WebDriverManager.chromedriver().setup(); // driver variable
	       WebDriver driver= new ChromeDriver();  // browser launch
	       driver.get("https://www.flipkart.com/"); // url launch
	       driver.manage().window().maximize();  // screen maximise

	}

}
