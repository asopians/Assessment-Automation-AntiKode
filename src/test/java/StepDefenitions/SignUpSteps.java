package StepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class SignUpSteps {

	WebDriver driver = null;
	
	@Given("I am on page sign up")
	public void i_am_on_page_sign_up() {
		// Initialize
		System.setProperty("webdriver.chrome.driver","C:/Users/Asep Sopian Sauri/eclipse-workspace/AssesmentAntiKode/src/test/resources/drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    // Open Browser
	    driver.navigate().to("https://sepatucompass.com/login");
	    driver.manage().window().maximize();

	    // Wait for page to load
	    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	    // Click the login button
	    driver.findElement(By.id("Register")).click();
	}
				
	@When("I entered valid data")
	public void i_entered_valid_data() {
		
	}

	@And("I click sign up")
	public void i_click_sign_up() {
	
	}

	@Then("I verify element Log Out")
	public void i_verify_element_log_out() {
		
	}

}
