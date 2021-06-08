package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	public static final String URL = "https://companyjd.humanity.com/app/dashboard/";
	public static final String LOGO_XPATH = "//*[@id=\"_nav\"]/div[1]/img";
	public static final String ORIGINALDROP_CSS = "#userm > div";
	public static final String DROPPROFILE_CSS = "#userm > div > a:nth-child(3)";
	public static final String STAFF_CSS = "#sn_staff";
	public static final String SETTINGS_CSS = "#sn_admin";
	public static final String DASHBOARD_CSS = "#sn_dashboard";
	public static final String SHIFTS_CSS = "#sn_schedule";
	public static final String TIME_CSS = "#sn_timeclock";
	public static final String LEAVE_CSS = "#sn_requests";
	public static final String TRAINING_CSS = "#sn_training";
	public static final String PAYROLL_CSS = "#sn_payroll";
	public static final String REPORTS_CSS = "#sn_reports";
	public static final String AVAILABILlITY_XPATH = "//*[@id=\"sn_availability\"]";
	public static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]";
	public static final String DROPPROFILE_URL = "https://companyjd.humanity.com/app/staff/detail/6357566/";
	public static final String SETTINGS_URL = "https://companyjd.humanity.com/app/admin/settings/";
	public static final String SHIFTS_URL = "https://companyjd.humanity.com/app/schedule/employee/week/overview/overview/8%2c5%2c2021/";
	public static final String TIME_URL = "https://companyjd.humanity.com/app/timeclock/";
	public static final String LEAVE_URL = "https://companyjd.humanity.com/app/requests/vacation/";
	public static final String TRAINING_URL = "https://companyjd.humanity.com/app/training/";
	public static final String STAFF_URL = "https://companyjd.humanity.com/app/staff/list/load/true/";
	public static final String AVAILABILLITY_URL = "https://companyjd.humanity.com/fe/availability/";
	public static final String PAYROLL_URL = "https://companyjd.humanity.com/app/payroll/scheduled-hours/";
	public static final String REPORTS_URL = "https://companyjd.humanity.com/app/reports/dashboard/";

	public static void clickDashboard(WebDriver driver) {
		driver.findElement(By.id("sn_dashboard")).click();
	}

	public static void clickShiftPlanning(WebDriver driver) {
		driver.findElement(By.id("sn_schedule")).click();
	}

	public static void clickTimeClock(WebDriver driver) {
		driver.findElement(By.id("sn_timeclock")).click();
	}

	public static void clickLeave(WebDriver driver) {
		driver.findElement(By.id("sn_requests")).click();
	}

	public static void clickTraining(WebDriver driver) {
		driver.findElement(By.id("sn_training")).click();
	}

	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.id("sn_staff")).click();
	}

	public static void clickAvailabillity(WebDriver driver) {
		driver.findElement(By.id("sn_availability")).click();
	}

	public static void clickPayroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
	}

	public static void clickReports(WebDriver driver) {
		driver.findElement(By.id("sn_reports")).click();
	}

	public static void clickLogo(WebDriver driver) {
		driver.findElement(By.xpath(LOGO_XPATH)).click();
	}

	public static void clickUserMenu(WebDriver driver) {
		driver.findElement(By.id("wrap_us_menu")).click();
	}

	public static void clickSettings(WebDriver driver) {
		driver.findElement(By.id("sn_admin")).click();
	}

	public static void clickDropProfile(WebDriver driver) {
		driver.findElement(By.cssSelector(DROPPROFILE_CSS)).click();
	}

	public static String settingsText(WebDriver driver) {
		return driver.findElement(By.cssSelector(SETTINGS_CSS)).getText();
	}

	public static String dashboardText(WebDriver driver) {
		return driver.findElement(By.cssSelector(DASHBOARD_CSS)).getText();
	}

	public static String userMenuText(WebDriver driver) {
		return driver.findElement(By.cssSelector(ORIGINALDROP_CSS)).getText();
	}

	public static String staffText(WebDriver driver) {
		return driver.findElement(By.cssSelector(STAFF_CSS)).getText();
	}

	public static String shiftPlanningText(WebDriver driver) {
		return driver.findElement(By.cssSelector(SHIFTS_CSS)).getText();
	}

	public static String timeClockText(WebDriver driver) {
		return driver.findElement(By.cssSelector(TIME_CSS)).getText();
	}

	public static String leaveText(WebDriver driver) {
		return driver.findElement(By.cssSelector(LEAVE_CSS)).getText();
	}

	public static String trainingText(WebDriver driver) {
		return driver.findElement(By.cssSelector(TRAINING_CSS)).getText();
	}

	public static String payrollText(WebDriver driver) {
		return driver.findElement(By.cssSelector(PAYROLL_CSS)).getText();
	}

	public static String reportsText(WebDriver driver) {
		return driver.findElement(By.cssSelector(REPORTS_CSS)).getText();
	}

	public static String availabillityText(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILlITY_XPATH)).getText();
	}
}
