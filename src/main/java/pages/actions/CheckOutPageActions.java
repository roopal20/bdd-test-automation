package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CheckOutPageLocators;
import utils.TestBase;

public class CheckOutPageActions extends TestBase {

	CheckOutPageLocators CheckOutPageLocators = null;

	public CheckOutPageActions() {

		this.CheckOutPageLocators = new CheckOutPageLocators();
		PageFactory.initElements(driver, CheckOutPageLocators);
	}

	public void selectGuestRadioButton() {

		CheckOutPageLocators.guestRadioButton.click();

	}

	public void enterEmailAddress() {

		CheckOutPageLocators.emailTextBox.sendKeys(prop.getProperty("emailAddress"));

	}

	public void enterTitle() {

		CheckOutPageLocators.titleBox.sendKeys(prop.getProperty("title"));

	}

	public void enterFirstName() {

		CheckOutPageLocators.firstNameTextBox.sendKeys(prop.getProperty("firstName"));

	}

	public void enterLastName() {
		CheckOutPageLocators.lastNameTextBox.sendKeys(prop.getProperty("lastName"));

	}

	public void enterPhoneNumber() {
		CheckOutPageLocators.phoneNumberTextBox.sendKeys(prop.getProperty("phoneNumber"));

	}

	public void enterPostalCode() {

		CheckOutPageLocators.postalCodeTextBox.sendKeys(prop.getProperty("postalCode"));

	}

	public void clickonContinueAsGuest() {

		CheckOutPageLocators.continueAsGuestButton.click();

	}

	public void selectDeliveryOrCollectOption() {
		CheckOutPageLocators.deliveryButton.click();
	}

	public void clickonFindAddressButton() {

		CheckOutPageLocators.findAddressButton.click();

	}

	public void clickonUseThisAddressButton() {

		CheckOutPageLocators.useThisAddressButton.click();

	}

	public void selectAddress() {

		Select s = new Select(CheckOutPageLocators.selectAddress);
		s.selectByValue("1");
	}

	public void selectDeliveryOption() {

		CheckOutPageLocators.namedDeliveryRadioButton.click();

	}

	public String selectDate() throws InterruptedException {
		Thread.sleep(2000);
		CheckOutPageLocators.deliveryActiveDate.click();
		String selectedDate = CheckOutPageLocators.deliverySelectedDate.getText();
		return selectedDate;

	}

	public void clickonContinueToPayment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		CheckOutPageLocators.continueToPayment.click();

	}
}
