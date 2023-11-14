package StepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

	public class SignUpPostiveCase {

		WebDriver driver = null;
		
		
		@Given("I am on page sign up")
		public void i_am_on_page_sign_up() {
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
		    WebElement Verify = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/div[1]/div[2]/button"));
		    System.out.println(Verify.getText());
		    
		    
		}
					
		@When("I entered valid data")
		public void i_entered_valid_data() {
			
			//fill field valid data
			driver.findElement(By.xpath("//div[@class='form-wrapper']//input[@id='name']")).sendKeys("Asep Sopian Sauri");
		    driver.findElement(By.xpath("//div[@class='form-wrapper']/div[@id='register']//input[@id='email']")).sendKeys("asopians98@gmail.com");
		    driver.findElement(By.xpath("//div[@class='form-wrapper']//input[@id='dob']']")).sendKeys("02121995");
			driver.findElement(By.id("password']")).sendKeys("Pas5w0rd");
		}

		@And("I click button sign up")
		public void i_click_button_sign_up() {
			driver.findElement(By.xpath("//*[@id=\"register\"]/form/div/div[8]/button")).click();
		}

		@Then("I see element Log Out")
		public void i_see_element_log_out() {
			// Verify Element Log Out
			driver.findElement(By.cssSelector(".ai-profile-compass")).click();
			driver.findElement(By.xpath("//li[@class='account-item text-danger']")).click();
		WebElement Verify = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div/div/div[1]/div[1]/button/span"));
		System.out.println(Verify.getText());
		// Close Browser
		driver.quit();
		}

}
