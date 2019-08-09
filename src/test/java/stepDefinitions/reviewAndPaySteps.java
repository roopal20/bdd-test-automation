package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AddToCartPageActions;
import pages.actions.CheckOutPageActions;
import pages.actions.HomePageActions;
import pages.actions.PDPPageActions;
import pages.actions.ReviewAndPayActions;
import pages.actions.SearchPageActions;
import utils.TestBase;

public class reviewAndPaySteps {
	SearchPageActions searchPage = new SearchPageActions();
	PDPPageActions pDPPage = new PDPPageActions();
	AddToCartPageActions addtoCartPage = new AddToCartPageActions();
	CheckOutPageActions checkOutPage = new CheckOutPageActions();
	HomePageActions homePage = new HomePageActions();
	ReviewAndPayActions reviewAndPay = new ReviewAndPayActions();
	String selectedDate;

	@Given("^user navigates to url$")
	public void user_navigates_to_url() throws Throwable {
		System.out.println("User is navigating to given url");
	}

	@When("^user search for product$")
	public void user_search_for_product() throws Throwable {
		homePage.enterSearchKeyword();
		homePage.clickOnButton();
	}

	@Then("^user verifies the search result$")
	public void user_verifies_the_search_result() throws Throwable {
		searchPage.validateHeading();
	}

	@When("^user click on the product for product description$")
	public void user_click_on_the_product_for_product_description() throws Throwable {
		searchPage.clickOnProduct();
	}

	@And("^user adds the product to cart$")
	public void user_adds_the_product_to_cart() throws Throwable {
		pDPPage.clickOnAddToCartButton();
		pDPPage.clickOnGoToBasketButton();
	}

	@And("^user clicks on checkout button$")
	public void user_clicks_on_checkout_button() throws Throwable {
		addtoCartPage.clickOnContinueToCheckoutButton();
	}

	@And("^user choose to checkout the item as a guest user$")
	public void user_choose_to_checkout_the_item_as_a_guest_user() throws Throwable {
		checkOutPage.selectGuestRadioButton();
	}

	@And("^user enters the required details on checkout page$")
	public void user_enters_the_required_details_on_checkout_page() throws Throwable {
		checkOutPage.enterEmailAddress();
		checkOutPage.clickonContinueAsGuest();
		checkOutPage.selectDeliveryOrCollectOption();
		checkOutPage.enterTitle();
		checkOutPage.enterFirstName();
		checkOutPage.enterLastName();
		checkOutPage.enterPhoneNumber();
		checkOutPage.enterPostalCode();
		checkOutPage.clickonFindAddressButton();
		checkOutPage.selectAddress();
		checkOutPage.clickonUseThisAddressButton();
	}

	@And("^user choose \"([^\"]*)\" option$")
	public void user_choose_something_option(String strArg1) throws Throwable {
		checkOutPage.selectDeliveryOption();
	}

	@And("^user selects the date after two days$")
	public void user_selects_the_date_after_two_days() throws Throwable {
		selectedDate = checkOutPage.selectDate();
	}

	@And("^user clicks on continue to payment button$")
	public void user_clicks_on_continue_to_payment_button() throws Throwable {
		checkOutPage.clickonContinueToPayment();
	}

	@Then("^user verifies the details on review and pay page$")
	public void user_verifies_the_details_on_review_and_pay_page() throws Throwable {
		String dateDisplayed = reviewAndPay.verifyDeliveryDate();
		String timeDisplayed = reviewAndPay.verifyDeliveryTime();
		System.out.println(dateDisplayed);
		System.out.println(timeDisplayed);
		String formattedDate = selectedDate.replace("\n", " ");
		if (dateDisplayed.contains(formattedDate)) {
			System.out.println("Review Page displays the correct selected date");
		} else {
			throw new IllegalStateException("Review Page does not display the correct selected date");
		}
		TestBase.captureScreenshot();
	}
}
