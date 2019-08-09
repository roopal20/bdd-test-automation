package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.TestBase;

public class HomePageLocators extends TestBase {

	@FindBy(how = How.XPATH, using = ".//input[@id='desktopSearch' ]")
	public WebElement searchBox;

	@FindBy(how = How.XPATH, using = ".//input[@id='desktopSearch' ]/following-sibling::button")
	public WebElement searchButton;

}
