package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PDPPageLocators;
import utils.TestBase;

public class PDPPageActions extends TestBase {

	PDPPageLocators PDPPageLocators = null;

	public PDPPageActions() {

		this.PDPPageLocators = new PDPPageLocators();
		PageFactory.initElements(driver, PDPPageLocators);
	}

	public void clickOnAddToCartButton() {

		PDPPageLocators.addToCartButton.click();

	}

	public void clickOnGoToBasketButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)", PDPPageLocators.goToBasketButton);
		Thread.sleep(5000);
		if (PDPPageLocators.basketCount.isDisplayed()) {
			PDPPageLocators.goToBasketButton.click();
		} else {
			Thread.sleep(5000);
			PDPPageLocators.goToBasketButton.click();
		}

	}
}
