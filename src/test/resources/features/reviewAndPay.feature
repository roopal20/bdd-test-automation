Feature: ReviewAndPay

  @reviewAndPay
  Scenario: Search the product, add to basket, checkout and validate the review and pay page.
    Given user navigates to url
    When user search for product
    Then user verifies the search result
    When user click on the product for product description
    And user adds the product to cart
    And user clicks on checkout button
    And user choose to checkout the item as a guest user
    And user enters the required details on checkout page
    And user choose "Next or named day delivery" option
    And user selects the date after two days
    And user clicks on continue to payment button
    Then user verifies the details on review and pay page
