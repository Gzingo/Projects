package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.AboutUsPage;
import objects.DashboardPage;
import objects.HomePage;
import objects.LogInPage;

public class TestHomePage {

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
	public void takeScreenshot() {
		try {
			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.closePopUp(driver);
			HomePage.closePopUp2(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			HomePage.closePopUp3(driver);
			HomePage.hoverAboutUs(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			HomePage.clickAboutUs(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			AboutUsPage.takeSnapShot(driver, "C:\\projectScreenshots\\HumanityAboutUs.png");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.println("Test PASSED");
		} catch (Exception e) {
			System.out.println("Test FAILED");
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void testLogInExistingUser() {
		try {
			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			HomePage.logInBtn(driver);
			LogInPage.inputUsername(driver, "joe@doe.com");
			LogInPage.inputPassword(driver, "cjdcjd");
			LogInPage.clickLogIn(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.navigate().refresh();
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = DashboardPage.URL;
			Assert.assertEquals(currentUrl, expectedUrl);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
