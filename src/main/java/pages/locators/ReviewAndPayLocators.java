package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.TestBase;

public class ReviewAndPayLocators extends TestBase {

	@FindBy(how = How.XPATH, using = "//*[@data-test='delivery-details-title']")
	public WebElement deliveryMethod;

	@FindBy(how = How.XPATH, using = "(//p[@data-test='delivery-details-message']/strong)[1]")
	public WebElement deliveryDate;

	@FindBy(how = How.XPATH, using = "(//p[@data-test='delivery-details-message']/strong)[2]")
	public WebElement deliveryTime;

}
