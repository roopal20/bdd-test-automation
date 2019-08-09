package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.TestBase;

public class hooks extends TestBase {

	@Before
	public void beforeScenario() {
		System.out.println(prop.getProperty("url"));
		String url = prop.getProperty("url");
		String browserName = prop.getProperty("BrowserName");
		if (driver == null) {
			if (browserName.equals("Chrome")) {

				System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			} else {
				System.out.println("BrowserName is not Chrome");
			}
		}
		driver.get(url);
	}

	@After
	public void afterScenario() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
