package StepDefenitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPositiveCase {

		WebDriver driver = null;
		
		
		@Given("I am on page login")
		public void i_am_on_page_login() {
			// Initialize
			System.setProperty("webdriver.chrome.driver","C:/Users/Asep Sopian Sauri/eclipse-workspace/AssesmentAntiKode/src/test/resources/drivers/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		   		    
		    // Open Browser
		    driver.navigate().to("https://sepatucompass.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		    
		    // Click Icon Profile
		    driver.findElement(By.xpath(".ai-profile-compass")).click();
		    
		     
		}
			
		@When("I entered valid credential")
		public void I_entered_valid_credential() {
		// fill field credential valid
		driver.findElement(By.id("email")).sendKeys("asopians98@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin1234");
				
		}
			   
		@And("I click login")
		public void I_click_login() {
		driver.findElement(By.xpath("//div[@class='form-wrapper']/div[@id='login']//span[.='Login']")).click();
				
		}
		
		@Then("I verfy element Log Out")
		public void I_verfy_element_Log_Out() throws InterruptedException {
			//Verify Button Logout
			driver.findElement(By.cssSelector(".ai-profile-compass")).click();
			driver.findElement(By.xpath("//li[@class='account-item text-danger']")).click();
			WebElement Verify = driver.findElement(By.xpath("//li[@class='account-item text-danger"));
			System.out.println(Verify.getText());
			
			
			Thread.sleep(1000);
			driver.close();
			driver.quit();	
		}
}

		
		
		
		
		
		
		 