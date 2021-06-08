package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	public static final String URL = "https://www.humanity.com/";
	public static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String POP1_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String POP2_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[2]/button";
	public static final String POP3_XPATH = "//*[@id=\"notification-bar\"]/button";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]";
	public static final String ABOUTHOVER_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]";
	
	public static void goToURL(WebDriver driver) {
		driver.get(URL);		
	}	
	public static void clickAboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();		
	}
	public static void closePopUp(WebDriver driver) {
		driver.findElement(By.xpath(POP1_XPATH)).click();		
	}
	public static void closePopUp2(WebDriver driver) {
		driver.findElement(By.xpath(POP2_XPATH)).click();		
	}
	public static void closePopUp3(WebDriver driver) {
		driver.findElement(By.xpath(POP3_XPATH)).click();		
	}
	public static void logInBtn(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_XPATH)).click();		
	}
	public static void hoverAboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTHOVER_XPATH)).click();;		
	}
}
