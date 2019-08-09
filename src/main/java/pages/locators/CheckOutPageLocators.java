package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.TestBase;

public class CheckOutPageLocators extends TestBase {

	@FindBy(how = How.XPATH, using = ".//input[@id='guest:true']/following-sibling::label")
	public WebElement guestRadioButton;

	@FindBy(how = How.XPATH, using = ".//input[@id='email']")
	public WebElement emailTextBox;

	@FindBy(how = How.XPATH, using = ".//button[@data-test='loginForm-submit']")
	public WebElement continueAsGuestButton;

	@FindBy(how = How.XPATH, using = ".//*[@data-id='delivery']")
	public WebElement deliveryButton;

	@FindBy(how = How.XPATH, using = ".//input[@id='title']")
	public WebElement titleBox;

	@FindBy(how = How.XPATH, using = ".//input[@id='firstName']")
	public WebElement firstNameTextBox;

	@FindBy(how = How.XPATH, using = "//input[@id='lastName']")
	public WebElement lastNameTextBox;

	@FindBy(how = How.XPATH, using = ".//input[@id='phoneNumber-number']")
	public WebElement phoneNumberTextBox;

	@FindBy(how = How.XPATH, using = ".//input[@id='searchPostcode']")
	public WebElement postalCodeTextBox;

	@FindBy(how = How.XPATH, using = ".//span[text()='Find address']")
	public WebElement findAddressButton;

	@FindBy(how = How.XPATH, using = "//*[@id='addressSearchSelect']")
	public WebElement selectAddress;

	@FindBy(how = How.XPATH, using = ".//span[text()='Use this address']")
	public WebElement useThisAddressButton;

	@FindBy(how = How.XPATH, using = ".//input/following-sibling::label[@for='deliveryMethod-5:5']")
	public WebElement namedDeliveryRadioButton;

	@FindBy(how = How.XPATH, using = ".//*[@data-test='next-day-delivery']")
	public WebElement deliveryDayText;

	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'activeDate')])[3]")
	public WebElement deliveryActiveDate;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'selectedDate')]/span")
	public WebElement deliverySelectedDate;

	@FindBy(how = How.XPATH, using = "//button/span[text()='Continue to payment']")
	public WebElement continueToPayment;

}
