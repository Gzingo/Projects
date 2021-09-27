package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import objects.StaffPage;

public class TestStaffPage {

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
	public void addEmployee() {

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
			DashboardPage.clickStaff(driver);
			StaffPage.addEmployeeBtn(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			StaffPage.inputFirstName1(driver, "Joe");
			StaffPage.inputLastName1(driver, "Paterson");
			SoftAssert sa = new SoftAssert();
			sa.assertTrue(driver.getPageSource().contains("Joe"));
			sa.assertTrue(driver.getPageSource().contains("Paterson"));
			sa.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void editEmployee() {
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().refresh();
		DashboardPage.clickStaff(driver);
		StaffPage.allStaffBtn(driver);
		StaffPage.changeJoe(driver);
		StaffPage.editDetailsBtn(driver);
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("John");
		String changeName = driver.findElement(By.id("first_name")).getAttribute("value");
		if (changeName.equalsIgnoreCase("John")) {
			System.out.println("Name of employee successfully changed.");
			System.out.println("Test PASSED");
		} else { 
			System.out.println("Test FAILED");
		}
			StaffPage.saveEditBtn(driver);
			driver.navigate().refresh();
}

	@Test(priority = 3)
	public void testAddStaff1() {
		File f = new File("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\excel\\staffData.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			// int rowCount = sheet.getLastRowNum();
			// for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(0);
			Cell f0 = row.getCell(0);
			Cell l0 = row.getCell(1);

			String firstName = f0.toString();
			String lastName = l0.toString();

			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.logInBtn(driver);
			LogInPage.inputUsername(driver, "joe@doe.com");
			LogInPage.inputPassword(driver, "cjdcjd");
			LogInPage.clickLogIn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().refresh();
			DashboardPage.clickStaff(driver);
			StaffPage.addEmployeeBtn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			StaffPage.inputFirstName2(driver, firstName);
			StaffPage.inputLastName2(driver, lastName);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			sa.assertTrue(driver.getPageSource().contains(firstName));
			sa.assertTrue(driver.getPageSource().contains(lastName));
			sa.assertAll();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void testAddStaff2() {
		File f = new File("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\excel\\staffData.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			// int rowCount = sheet.getLastRowNum();
			// for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(1);
			Cell f0 = row.getCell(0);
			Cell l0 = row.getCell(1);

			String firstName = f0.toString();
			String lastName = l0.toString();

			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.logInBtn(driver);
			LogInPage.inputUsername(driver, "joe@doe.com");
			LogInPage.inputPassword(driver, "cjdcjd");
			LogInPage.clickLogIn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().refresh();
			DashboardPage.clickStaff(driver);
			StaffPage.addEmployeeBtn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			StaffPage.inputFirstName3(driver, firstName);
			StaffPage.inputLastName3(driver, lastName);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			sa.assertTrue(driver.getPageSource().contains(firstName));
			sa.assertTrue(driver.getPageSource().contains(lastName));
			sa.assertAll();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 5)
	public void testAddStaff3() {
		File f = new File("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\excel\\staffData.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			// int rowCount = sheet.getLastRowNum();
			// for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(2);
			Cell f0 = row.getCell(0);
			Cell l0 = row.getCell(1);

			String firstName = f0.toString();
			String lastName = l0.toString();

			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.closePopUp3(driver);
			HomePage.logInBtn(driver);
			LogInPage.inputUsername(driver, "joe@doe.com");
			LogInPage.inputPassword(driver, "cjdcjd");
			LogInPage.clickLogIn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().refresh();
			DashboardPage.clickStaff(driver);
			StaffPage.addEmployeeBtn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			StaffPage.inputFirstName4(driver, firstName);
			StaffPage.inputLastName4(driver, lastName);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			sa.assertTrue(driver.getPageSource().contains(firstName));
			sa.assertTrue(driver.getPageSource().contains(lastName));
			sa.assertAll();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 6)
	public void testAddStaff4() {
		File f = new File("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\excel\\staffData.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			// int rowCount = sheet.getLastRowNum();
			// for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(3);
			Cell f0 = row.getCell(0);
			Cell l0 = row.getCell(1);

			String firstName = f0.toString();
			String lastName = l0.toString();

			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.logInBtn(driver);
			LogInPage.inputUsername(driver, "joe@doe.com");
			LogInPage.inputPassword(driver, "cjdcjd");
			LogInPage.clickLogIn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().refresh();
			DashboardPage.clickStaff(driver);
			StaffPage.addEmployeeBtn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			StaffPage.inputFirstName5(driver, firstName);
			StaffPage.inputLastName5(driver, lastName);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			sa.assertTrue(driver.getPageSource().contains(firstName));
			sa.assertTrue(driver.getPageSource().contains(lastName));
			sa.assertAll();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 7)
	public void testAddStaff5() {
		File f = new File("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\excel\\staffData.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			// int rowCount = sheet.getLastRowNum();
			// for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(4);
			Cell f0 = row.getCell(0);
			Cell l0 = row.getCell(1);

			String firstName = f0.toString();
			String lastName = l0.toString();

			HomePage.goToURL(driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HomePage.logInBtn(driver);
			LogInPage.inputUsername(driver, "joe@doe.com");
			LogInPage.inputPassword(driver, "cjdcjd");
			LogInPage.clickLogIn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.navigate().refresh();
			DashboardPage.clickStaff(driver);
			StaffPage.addEmployeeBtn(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			StaffPage.inputFirstName6(driver, firstName);
			StaffPage.inputLastName6(driver, lastName);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			StaffPage.saveEmployeeBtn(driver);
			sa.assertTrue(driver.getPageSource().contains(firstName));
			sa.assertTrue(driver.getPageSource().contains(lastName));
			sa.assertAll();
			wb.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
