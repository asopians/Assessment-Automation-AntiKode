package StepDefenitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingUpNegativeCase {

	WebDriver driver = null;
	
	
	@Given("I am goto page sign up")
	public void i_am_goto_page_sign_up() {
		// Initialize
		System.setProperty("webdriver.chrome.driver","C:/Users/Asep Sopian Sauri/eclipse-workspace/AssesmentAntiKode/src/test/resources/drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   		    
	    // Open Browser
	    driver.navigate().to("https://sepatucompass.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    // Click Icon Profile
	    driver.findElement(By.xpath(".ai-profile-compass")).click();
	    
	    // Click the signup page
	    driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div[1]/div[2]/button")).click();
	    WebElement Verify = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div/div/div[1]/div[1]/button/span"));
	    System.out.println(Verify.getText());
	}
	
	@When("I left blank name")
	public void i_left_blank_name() {
		//fill field 
		driver.findElement(By.xpath("//div[@class='form-wrapper']//input[@id='name']")).sendKeys("");
	    driver.findElement(By.xpath("//div[@class='form-wrapper']/div[@id='register']//input[@id='email']")).sendKeys("asopians98@gmail.com");
	    driver.findElement(By.xpath("//div[@class='form-wrapper']//input[@id='dob']']")).sendKeys("02121995");
		driver.findElement(By.id("password']")).sendKeys("Pas5w0rd");
		
	}
	
	@And("I click sign up")
	public void i_click_sign_up() {
		driver.findElement(By.xpath("//*[@id=\"register\"]/form/div/div[8]/button")).click();
	}
	
	@Then("I see an error message")
	public void i_see_an_error_message() {
		// Verify error Message
	   WebElement Notif = driver.findElement(By.cssSelector(".invalid-feedback"));
	   System.out.println(Notif.getText());
	// Close Browser
	 driver.quit();  
	}
}