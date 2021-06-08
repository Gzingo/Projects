package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	public static final String LOGINBTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	public static void inputUsername(WebDriver driver, String username ) {
		driver.findElement(By.id("email")).sendKeys(username);
	}
	public static void inputEmail(WebDriver driver, String email ) {
		driver.findElement(By.id("email")).sendKeys(email);
	}
	public static void inputPassword(WebDriver driver, String password) {		
		driver.findElement(By.id("password")).sendKeys(password);
	}
	public static void clickLogIn(WebDriver driver) { 
		driver.findElement(By.xpath(LOGINBTN_XPATH)).click();
	}

}
