package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver = null;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream("src/main/java/testData/test.properties");
			prop.load(fi);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void captureScreenshot() {
		File srcnFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFileToDirectory(srcnFile, new File("reports/screenshots/"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
