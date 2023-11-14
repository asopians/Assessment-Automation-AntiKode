package CallTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginCall {
	
	WebDriver driver;
	
	By txt_username = By.id("email");
	By txt_password = By.id("password");
	By Btn_Login = By.xpath("//*[@id=\"login\"]/form/div/div[4]");
	By Btn_Profile = By.cssSelector(".ai-profile-compass");
	
	public LoginCall(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void ClickLogin() {
		driver.findElement(Btn_Login);
	}
	
	public void ClickProfile() {
		driver.findElement(Btn_Profile);
	}
	
	public void LoginValidCredential(WebDriver driver) {
		
		
	}
}
