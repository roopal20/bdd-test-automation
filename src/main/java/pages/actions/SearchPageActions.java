package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchPageLocators;
import utils.TestBase;

public class SearchPageActions extends TestBase {

	SearchPageLocators SearchPageLocators = null;

	public SearchPageActions() {
		this.SearchPageLocators = new SearchPageLocators();
		PageFactory.initElements(driver, SearchPageLocators);
	}

	public void validateHeading() {
		String heading = SearchPageLocators.searchPageHeading.getText();
		if (heading.contains(prop.getProperty("productName"))) {
			System.out.println("products are listed based on correct search results");
		} else {
			throw new IllegalStateException("Element not found");
		}

	}

	public void clickOnProduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		SearchPageLocators.searchPageproduct.click();

	}

}
