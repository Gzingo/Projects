package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.DashboardPage;
import objects.HomePage;
import objects.LogInPage;

public class TestDashboardPage {

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
	public void testTopMenuElements() {
		try {
			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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

			DashboardPage.clickStaff(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String actualText1 = DashboardPage.staffText(driver);
			String expectedText1 = driver.findElement(By.cssSelector("#sn_staff")).getText();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = DashboardPage.STAFF_URL;

			DashboardPage.clickUserMenu(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText = DashboardPage.userMenuText(driver);
			String expectedText = driver.findElement(By.cssSelector("#userm > div")).getText();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			DashboardPage.clickDropProfile(driver);
			String actualUrl1 = driver.getCurrentUrl();
			String expectedUrl1 = DashboardPage.DROPPROFILE_URL;
			driver.navigate().back();

			DashboardPage.clickSettings(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText2 = DashboardPage.settingsText(driver);
			String expectedText2 = driver.findElement(By.cssSelector("#sn_admin")).getText();
			String actualUrl2 = driver.getCurrentUrl();
			String expectedUrl2 = DashboardPage.SETTINGS_URL;

			DashboardPage.clickDashboard(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().refresh();
			String actualText3 = DashboardPage.dashboardText(driver);
			String expectedText3 = driver.findElement(By.cssSelector("#sn_dashboard")).getText();
			String actualUrl3 = driver.getCurrentUrl();
			String expectedUrl3 = DashboardPage.URL;

			DashboardPage.clickShiftPlanning(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText4 = DashboardPage.shiftPlanningText(driver);
			String expectedText4 = driver.findElement(By.cssSelector("#sn_schedule")).getText();
			// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String actualUrl4 = driver.getCurrentUrl();
			String expectedUrl4 = DashboardPage.SHIFTS_URL;

			DashboardPage.clickTimeClock(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText5 = DashboardPage.timeClockText(driver);
			String expectedText5 = driver.findElement(By.cssSelector("#sn_timeclock")).getText();
			String actualUrl5 = driver.getCurrentUrl();
			String expectedUrl5 = DashboardPage.TIME_URL;

			DashboardPage.clickLeave(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText6 = DashboardPage.leaveText(driver);
			String expectedText6 = driver.findElement(By.cssSelector("#sn_requests")).getText();
			String actualUrl6 = driver.getCurrentUrl();
			String expectedUrl6 = DashboardPage.LEAVE_URL;

			DashboardPage.clickTraining(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText7 = DashboardPage.trainingText(driver);
			String expectedText7 = driver.findElement(By.cssSelector("#sn_training")).getText();
			String actualUrl7 = driver.getCurrentUrl();
			String expectedUrl7 = DashboardPage.TRAINING_URL;

			DashboardPage.clickPayroll(driver);
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText8 = DashboardPage.payrollText(driver);
			String expectedText8 = driver.findElement(By.cssSelector("#sn_payroll")).getText();
			String actualUrl8 = driver.getCurrentUrl();
			String expectedUrl8 = DashboardPage.PAYROLL_URL;

			DashboardPage.clickReports(driver);
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualText9 = DashboardPage.reportsText(driver);
			String expectedText9 = driver.findElement(By.cssSelector("#sn_reports")).getText();
			String actualUrl9 = driver.getCurrentUrl();
			String expectedUrl9 = DashboardPage.REPORTS_URL;

			DashboardPage.clickAvailabillity(driver);
			String actualUrl10 = driver.getCurrentUrl();
			String expectedUrl10 = DashboardPage.AVAILABILLITY_URL;

			SoftAssert sa = new SoftAssert();

			sa.assertEquals(actualText1, expectedText1);
			sa.assertEquals(actualURL, expectedURL);
			sa.assertEquals(actualText, expectedText);
			sa.assertEquals(actualUrl1, expectedUrl1);
			sa.assertEquals(actualText2, expectedText2);
			sa.assertEquals(actualUrl2, expectedUrl2);
			sa.assertEquals(actualText3, expectedText3);
			sa.assertEquals(actualUrl3, expectedUrl3);
			sa.assertEquals(actualText4, expectedText4);
			sa.assertEquals(actualUrl4, expectedUrl4);
			sa.assertEquals(actualText5, expectedText5);
			sa.assertEquals(actualUrl5, expectedUrl5);
			sa.assertEquals(actualText6, expectedText6);
			sa.assertEquals(actualUrl6, expectedUrl6);
			sa.assertEquals(actualText7, expectedText7);
			sa.assertEquals(actualUrl7, expectedUrl7);
			sa.assertEquals(actualText8, expectedText8);
			sa.assertEquals(actualUrl8, expectedUrl8);
			sa.assertEquals(actualText9, expectedText9);
			sa.assertEquals(actualUrl9, expectedUrl9);
			sa.assertEquals(actualUrl10, expectedUrl10);
			sa.assertAll();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
