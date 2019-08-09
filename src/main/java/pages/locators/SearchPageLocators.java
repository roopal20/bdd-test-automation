package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPageLocators {

	@FindBy(how = How.XPATH, using = ".//h1[@class='product-list-heading' ]")
	public WebElement searchPageHeading;

	@FindBy(how = How.XPATH, using = ".//h2[@class='product-card__info-section product-card__title' ]")
	public WebElement searchPageproduct;

}
