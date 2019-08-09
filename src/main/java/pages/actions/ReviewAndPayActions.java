package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ReviewAndPayLocators;
import utils.TestBase;

public class ReviewAndPayActions extends TestBase {

	ReviewAndPayLocators ReviewAndPayLocators = null;

	public ReviewAndPayActions() {

		this.ReviewAndPayLocators = new ReviewAndPayLocators();
		PageFactory.initElements(driver, ReviewAndPayLocators);

	}

	public String verifyDeliveryDate() {

		String deliveryDate = ReviewAndPayLocators.deliveryDate.getText();
		return deliveryDate;

	}

	public String verifyDeliveryTime() {

		String deliveryTime = ReviewAndPayLocators.deliveryTime.getText();
		return deliveryTime;

	}

}
