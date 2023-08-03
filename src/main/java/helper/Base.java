package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Base {
	 
	public static WebDriver driver;
	 public static Properties prop;
	static {
	try {
		FileInputStream file = new FileInputStream("TestData/TestData.properties");
		prop= new Properties();
		prop.load(file);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

	

	public WebElement WaitforExpectedElment(WebElement ele, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public void waitforalert(int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.alertIsPresent());
}
	public void WaitforElmenttoClickable(WebElement ele,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
}
	public void mouseover( WebElement ele) {
		Actions a= new Actions(driver);
		a.moveToElement(ele).build().perform();
		
		
	}
	public void selectAlertPopUp(int timeout) {
		waitforalert(timeout);
	   Alert a= driver.switchTo().alert();
		a.accept();
		
	}
    public void selectDropDownvisibleText(WebElement ele, String value) {
	
		Select s= new Select(ele);
		s.selectByVisibleText(value);
	
	}	
	public void selectDropDownbyvalueText(WebElement ele, String value) {
		
		Select s= new Select(ele);
		s.selectByValue(value);	
	}
	public void selectDropDownbyindexText(WebElement ele, int value) {
		Select s= new Select(ele);
		 s.selectByIndex(value);	
	}
	
	public void takeScreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrfile=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrfile, new File("Screenshot/"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@After
	public void tearDown(Scenario s) {
		if(s.isFailed()) {
			takeScreenshot();
		}
		driver.quit();
	}
	
	}
