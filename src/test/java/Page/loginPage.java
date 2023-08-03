package Page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

   


public class loginPage extends Base {

	
	
	 
	
	 
	 
	public void user_enter_username_and_pasword(String username, String password) {
		WebElement heading= driver.findElement(By.xpath("//div[@class='login_login']"));
		String headingText= heading.getText();
		assertEquals("shiv", headingText);
		
		
		
		WebElement userName= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		   WaitforExpectedElment(userName,10);
		   userName.sendKeys(username);
		   WebElement pass= driver.findElement(By.xpath("//input[@type='password']")); 
		   WaitforExpectedElment(pass, 10);
		   pass.sendKeys(password);
		   
		   
		   
		   
		      
}
	
	public void click_on_login_button() {
		WebElement loginbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		loginbtn.click();
		}
	public boolean validate_success_login() {
	return driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
	
		
	
	}
}