package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartPageLocators {

	@FindBy(how = How.XPATH, using = ".//a[text()='Continue to checkout']")
	public WebElement continueCheckOutButton;

}
