package stepdefs;

import java.util.List;
import page.LoginPage;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMloginstepdef extends TestBase {
	
	private LoginPage login;
	
      @Before
	public void openBrowser() {
		initialize();
		   
	}

	@Given("Admin is on login page")
	public void admin_is_on_login_page() {
		login=new LoginPage();
	    boolean b=login.checkLogin();
	    Assert.assertTrue(b);
	}
	@Given("Admin enter login credentials")
	public void admin_enter_login_credentials(DataTable userCred) {
		login=new LoginPage();
		List<Map<String, String>> data = userCred.asMaps();
		login.setUsername(data.get(0).get("Username"));
		login.setPassword(data.get(0).get("Password"));
		login.setLoginBtn();
		
	}

	@Then("Should display home page")
	public void should_display_home_page() {
		login=new LoginPage();
		 boolean b=login.displayAdmin();
		    Assert.assertTrue(b);
	}

	@When("Admin enters valid username and invalid password")
	public void admin_enters_valid_username_and_invalid_password() {
		login=new LoginPage();
	   login.setUsername("Admin");
	   login.setPassword("admin12");
	   login.setLoginBtn();
	}

	@Then("should display error message")
	public void should_display_error_message() {
		login=new LoginPage();
		boolean b=login.invcred();
	    Assert.assertTrue(b);
	}

	@When("Admin enters invalid username and valid password")
	public void admin_enters_invalid_username_and_valid_password() {
		 login.setUsername("Admi");
		   login.setPassword("admin123");
		   login.setLoginBtn();
	}

	@When("Admin enters invalid username and invalid password")
	public void admin_enters_invalid_username_and_invalid_password() {
		login.setUsername("Admi");
		   login.setPassword("admin12");
		   login.setLoginBtn();
	}

	

	@When("Admin enters valid username and don't enter password")
	public void admin_enters_valid_username_and_don_t_enter_password() {
		login=new LoginPage();
		login.setUsername("Admin");
		   login.setPassword("");
		   login.setLoginBtn();
	}

	@Then("should display empty password error message")
	public void should_display_empty_password_error_message() {
		login=new LoginPage();
		 boolean b=login.emppwd();
		    Assert.assertTrue(b);
	}

	@When("Admin don't enters valid username and  enter password")
	public void admin_don_t_enters_valid_username_and_enter_password() {
		login=new LoginPage();
		login.setUsername("");
		   login.setPassword("admin123");
		   login.setLoginBtn();
	}

	@Then("should display empty username error message")
	public void should_display_empty_username_error_message() {
		login=new LoginPage();
		boolean b=login.empuser();
	    Assert.assertTrue(b);
	}

	@When("Admin clicks on forgot your password")
	public void admin_clicks_on_forgot_your_password() {
		login=new LoginPage();
	    login.setForgetpwd();
	}

	@Then("should display reset password page")
	public void should_display_reset_password_page() {
		login=new LoginPage();
		boolean b=login.resBtn();
	    Assert.assertTrue(b);
	}

	@Given("Admin clicks on Forget your password")
	public void admin_clicks_on_Forget_your_password() {
		login=new LoginPage();
	    login.setForgetpwd();
	}

	@When("Admin enters valid username")
	public void admin_enters_valid_username() {
		login=new LoginPage();
	    login.setForgetuser("aliya");
	    login.setReset();
	}

	@Then("should display password change success message")
	public void should_display_password_change_success_message() {
		login=new LoginPage();
		}

	@When("Admin enters invalid username")
	public void admin_enters_invalid_username() {
		login=new LoginPage();
		login.setForgetuser("ali");
	    login.setReset();
	}

	@Then("should display invalid username error message")
	public void should_display_invalid_username_error_message() {
		login=new LoginPage();
	}

	@When("Admin clicks on cancel")
	public void admin_clicks_on_cancel() {
		login=new LoginPage();
	    login.setCancel();
	}

	@Then("should display login page")
	public void should_display_login_page() {
		login=new LoginPage();
		boolean b=login.checkLogin();
	    Assert.assertTrue(b);
	}
	@After
	public void teardown() {
		driver.close();
	}
	
}
