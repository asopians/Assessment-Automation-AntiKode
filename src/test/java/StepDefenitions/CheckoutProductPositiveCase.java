package StepDefenitions;

import org.openqa.selenium.WebDriver;

import CallTestCase.LoginCall;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CheckoutProductPositiveCase {
	
	WebDriver driver = null;
	LoginCall login;
	
	@Given("browser is open")
	public void browser_is_open() {
		// Open Browser and maximaze
		System.setProperty("webdriver.chrome.driver","C:/Users/Asep Sopian Sauri/eclipse-workspace/AssesmentAntiKode/src/test/resources/drivers/chromedriver.exe");
		driver.get("https://sepatucompass.com/login");
		driver.manage().window().maximize();
	}
	
	@And("I am on login page")
	public void i_am_on_login_page() {
	   login = new LoginCall(driver);
	   login.ClickProfile();  
	   
	}

	@When("I am enter username and password valid")
	public void i_am_enter_username_and_password_valid() {
	    // Enter valid credential
		login.enterUsername("asopians98@gmail.com");
		login.enterPassword("Admin1234");
	}

	@And("I click button login")
	public void i_click_button_login() {
	    // Click Button Login
	    login.ClickLogin();
	}

	@And("I adds product to bag")
	public void i_adds_product_to_bag() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("I Process to Checkout Success")
	public void i_process_to_checkout_success() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I see order complete")
	public void i_see_order_complete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
