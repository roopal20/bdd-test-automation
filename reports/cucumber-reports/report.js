$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("reviewAndPay.feature");
formatter.feature({
  "line": 1,
  "name": "ReviewAndPay",
  "description": "",
  "id": "reviewandpay",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3739501254,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search the product, add to basket, checkout and validate the review and pay page.",
  "description": "",
  "id": "reviewandpay;search-the-product,-add-to-basket,-checkout-and-validate-the-review-and-pay-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@reviewAndPay"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user verifies the search result",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on the product for product description",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user adds the product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user choose to checkout the item as a guest user",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters the required details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user choose \"Next or named day delivery\" option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects the date after two days",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on continue to payment button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user verifies the details on review and pay page",
  "keyword": "Then "
});
formatter.match({
  "location": "reviewAndPaySteps.user_navigates_to_url()"
});
formatter.result({
  "duration": 77273068,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_search_for_product()"
});
formatter.result({
  "duration": 4211644054,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_verifies_the_search_result()"
});
formatter.result({
  "duration": 44295984,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_click_on_the_product_for_product_description()"
});
formatter.result({
  "duration": 2749336882,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_adds_the_product_to_cart()"
});
formatter.result({
  "duration": 7338421312,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_clicks_on_checkout_button()"
});
formatter.result({
  "duration": 1613948407,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_choose_to_checkout_the_item_as_a_guest_user()"
});
formatter.result({
  "duration": 130353580,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_enters_the_required_details_on_checkout_page()"
});
formatter.result({
  "duration": 5574308088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Next or named day delivery",
      "offset": 13
    }
  ],
  "location": "reviewAndPaySteps.user_choose_something_option(String)"
});
formatter.result({
  "duration": 1400676263,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_selects_the_date_after_two_days()"
});
formatter.result({
  "duration": 2158733587,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_clicks_on_continue_to_payment_button()"
});
formatter.result({
  "duration": 186570465,
  "status": "passed"
});
formatter.match({
  "location": "reviewAndPaySteps.user_verifies_the_details_on_review_and_pay_page()"
});
formatter.result({
  "duration": 1726427574,
  "status": "passed"
});
formatter.after({
  "duration": 278112487,
  "status": "passed"
});
});