package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.AddToCartPageLocators;
import utils.TestBase;

public class AddToCartPageActions extends TestBase {

	AddToCartPageLocators AddToCartPageLocators = null;

	public AddToCartPageActions() {

		this.AddToCartPageLocators = new AddToCartPageLocators();
		PageFactory.initElements(driver, AddToCartPageLocators);

	}

	public void clickOnContinueToCheckoutButton() {

		AddToCartPageLocators.continueCheckOutButton.click();

	}
}
