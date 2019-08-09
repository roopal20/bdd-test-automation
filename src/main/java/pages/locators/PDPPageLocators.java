package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PDPPageLocators {

	@FindBy(how = How.XPATH, using = ".//*[@id='button--add-to-basket' ]")
	public WebElement addToCartButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-header')]//*[@data-test='basket-amount']")
	public WebElement basketCount;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'desktop-header')]//a[@href='/basket']")
	public WebElement goToBasketButton;

}
