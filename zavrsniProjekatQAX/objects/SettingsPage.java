package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage {

	public static final String URL = "https://companyjd.humanity.com/app/admin/settings/";
	public static final String LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String EMAILCHECKBOX_XPATH = "//*[@id=\"pref_pref_email\"]";
	public static final String SMSCHECKBOX_XPATH = "//*[@id=\"pref_pref_sms\"]";
	public static final String MOBILECHECKBOX_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	public static final String SAVESETTINGS_XPATH = "//*[@id=\"act_primary\"]";
	public static final String PROFILESETTINGS_XPATH = "//*[@id=\"userm\"]/div/a[2]";
	public static final String MYEAMIL_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[10]/td[2]/input[1]";
	public static final String MYPHONE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[10]/td[2]/input[2]";

	public static void languageChoiceBtn(WebDriver driver) {
		driver.findElement(By.xpath(LANGUAGE_XPATH)).click();
	}

	public static void myEmail(WebDriver driver) {
		driver.findElement(By.xpath(MYEAMIL_XPATH)).click();
	}

	public static void myPhone(WebDriver driver) {
		driver.findElement(By.xpath(MYPHONE_XPATH)).click();
	}

	public static void saveProfile(WebDriver driver) {
		driver.findElement(By.id("act_primary")).click();
	}

	public static void profileSettingsBtn(WebDriver driver) {
		driver.findElement(By.xpath(PROFILESETTINGS_XPATH)).click();
	}

	public static void languageChoice(WebDriver driver, String choice) {
		driver.findElement(By.xpath(LANGUAGE_XPATH)).sendKeys(choice);
	}

	public static void saveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVESETTINGS_XPATH)).click();
		;
	}

	public static void unchekEmail(WebDriver driver) {
		driver.findElement(By.xpath(EMAILCHECKBOX_XPATH)).click();
		;
	}

	public static void unchekSms(WebDriver driver) {
		driver.findElement(By.xpath(SMSCHECKBOX_XPATH)).click();
		;
	}

	public static void unchekMobile(WebDriver driver) {
		driver.findElement(By.xpath(MOBILECHECKBOX_XPATH)).click();
		;
	}
}
