package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.DashboardPage;
import objects.HomePage;
import objects.LogInPage;
import objects.SettingsPage;

public class SettingAndProfile {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

	@Test(priority = 1)
	public void languageAndNotifications() {
	   try {
		HomePage.goToURL(driver);
		driver.manage().window().maximize();
		HomePage.closePopUp(driver);
		HomePage.closePopUp2(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HomePage.closePopUp3(driver);
		HomePage.logInBtn(driver);
		LogInPage.inputUsername(driver, "joe@doe.com");
		LogInPage.inputPassword(driver, "cjdcjd");
		LogInPage.clickLogIn(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		DashboardPage.clickSettings(driver);
		driver.navigate().refresh();
		SettingsPage.languageChoiceBtn(driver);
		SettingsPage.languageChoice(driver, "Serbian (machine)");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		SettingsPage.unchekEmail(driver);
		SettingsPage.unchekSms(driver);
		SettingsPage.unchekMobile(driver);
		SettingsPage.saveSettings(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Test PASSED");
		   
	}catch (Exception e) {
		   System.out.println("Test FAILED");
		   e.printStackTrace();
	   }
}

	@Test(priority = 2)
	public void profileSettings() {
	   try {
		HomePage.goToURL(driver);
		driver.manage().window().maximize();
		HomePage.closePopUp(driver);
		HomePage.closePopUp2(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HomePage.closePopUp3(driver);
		HomePage.logInBtn(driver);
		LogInPage.inputUsername(driver, "joe@doe.com");
		LogInPage.inputPassword(driver, "cjdcjd");
		LogInPage.clickLogIn(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().refresh();
		DashboardPage.clickDropProfile(driver);
		SettingsPage.profileSettingsBtn(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("fileuplaod"))
				.sendKeys("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\pics\\maleEmployee.png");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		SettingsPage.myEmail(driver);
		SettingsPage.myPhone(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		SettingsPage.saveProfile(driver);
		System.out.println("Test PASSED");

	} catch (Exception e) {
		   System.out.println("Test FAILED");
		   e.printStackTrace();
	   }
}
