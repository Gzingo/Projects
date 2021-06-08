package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffPage {
		
	public static final String URL = "https://companyjd.humanity.com/app/staff/add/";
	public static final String ALLSTAFF_XPATH = "//*[@id=\"StaffSchedules\"]/ul[1]/li[1]/a";
	public static final String CHANGEJOE_URL = "https://companyjd.humanity.com/app/staff/detail/6370399/";
	public static final String EDITDETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String UPLOADPIC_XPATH = "//*[@id=\"in-btn\"]";
	public static final String CHANGENAME_XPATH = "//*[@id=\"first_name\"]";
	
	
	public static void allStaffBtn(WebDriver driver) {
		driver.findElement(By.xpath(ALLSTAFF_XPATH)).click();
	}
	public static void changeName(WebDriver driver) {
		driver.findElement(By.xpath(CHANGENAME_XPATH)).click();
	}
	public static void changeJoe(WebDriver driver) {
		driver.navigate().to(CHANGEJOE_URL);
	}
	public static void editDetailsBtn(WebDriver driver) {
		driver.findElement(By.xpath(EDITDETAILS_XPATH)).click();
	}
	public static void uploadPicBtn(WebDriver driver) {
		driver.findElement(By.xpath(UPLOADPIC_XPATH)).click();
	}
	/*public static void uploadPic(WebDriver driver) {
		WebElement chooseFile = driver.findElement(By.xpath(UPLOADPIC_XPATH));
		chooseFile.sendKeys("C:\\Users\\gniko\\eclipse-workspace\\zavrsniProjekatQAX\\pics\\maleEmployee.png");
		chooseFile.sendKeys(Keys.ENTER);
	}*/
	public static void addEmployeeBtn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"act_primary\"]")).click();
	}
	public static void saveEditBtn(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input")).click();
	}
	public static void saveEmployeeBtn(WebDriver driver) {
		driver.findElement(By.id("_as_save_multiple")).click();
	}
	public static void inputFirstName1(WebDriver driver, String firstName) {
		driver.findElement(By.id("_asf1")).sendKeys(firstName);
	}
	public static void inputLastName1(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl1")).sendKeys(lastName);
	}
	public static void inputFirstName2(WebDriver driver, String firstName) {
		driver.findElement(By.id("_asf2")).sendKeys(firstName);
	}
	public static void inputLastName2(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl2")).sendKeys(lastName);
	}
	public static void inputFirstName3(WebDriver driver, String firstName) {
		driver.findElement(By.id("_asf3")).sendKeys(firstName);
	}
	public static void inputLastName3(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl3")).sendKeys(lastName);
	}
	public static void inputFirstName4(WebDriver driver, String firstName) {
		driver.findElement(By.id("_asf4")).sendKeys(firstName);
	}
	public static void inputLastName4(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl4")).sendKeys(lastName);
	}
	public static void inputFirstName5(WebDriver driver, String firstName) {
		driver.findElement(By.id("_asf5")).sendKeys(firstName);
	}
	public static void inputLastName5(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl5")).sendKeys(lastName);
	}
	public static void inputFirstName6(WebDriver driver, String firstName) {
		driver.findElement(By.id("_asf6")).sendKeys(firstName);
	}
	public static void inputLastName6(WebDriver driver, String lastName) {
		driver.findElement(By.id("_asl6")).sendKeys(lastName);
	}

}
