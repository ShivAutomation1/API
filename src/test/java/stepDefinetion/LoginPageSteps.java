package stepDefinetion;



import static org.junit.Assert.assertTrue;

import Page.loginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginPageSteps  {
	
	 loginPage login= new loginPage();
	


@When("click on login button")
public void click_on_login_button() {
login.click_on_login_button();	
}


@Then("Validate success login")
public void validate_success_login() {
  assertTrue(login.validate_success_login());
}


@When("user enter {string} and {string}")
public void user_enter_and(String username, String pass){
login.user_enter_username_and_pasword(username, pass);	
}
}
