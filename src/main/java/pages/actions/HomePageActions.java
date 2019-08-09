package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import utils.TestBase;

public class HomePageActions extends TestBase {

	HomePageLocators HomePageLocators = null;

	public HomePageActions() {

		this.HomePageLocators = new HomePageLocators();
		PageFactory.initElements(driver, HomePageLocators);

	}

	public void enterSearchKeyword() {

		HomePageLocators.searchBox.sendKeys(prop.getProperty("productName"));

	}

	public void clickOnButton() {

		HomePageLocators.searchButton.click();

	}

}
