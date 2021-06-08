package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AboutUsPage {
	
	public static final String URL = "https://www.humanity.com/about";
	
	public static void takeSnapShot(WebDriver driver, String fileWithPath) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\HumanityAboutUs.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
	}

}
