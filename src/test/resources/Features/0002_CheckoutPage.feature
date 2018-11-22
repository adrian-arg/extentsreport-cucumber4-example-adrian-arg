#Author: Adrian-Arg
@CheckoutPage
Feature: Checkout Page 2

  @Scenario1 @OK
  Scenario: Display Checkout Page 2 - OK
    Given an authenticated user
     When selects a product
     Then the checkout page is displayed

#  @Scenario2 @BUG
#  Scenario Outline: Checkout Page 2 for Other Users - Bugged Scenario
#    Given an authenticated user using "<email>"
#     When selects a product
#     Then the checkout page is displayed

#    Examples: 
#      | email              |
#      | another@user.com   |
#      | someother@user.com |

  @Scenario3 @OK
  Scenario Outline: Checkout Page 2 for Other Users - OK
     When selects a product
     Then the checkout page is displayed
     Given an authenticated user using "<email>"

    Examples: 
      | email              |
      | another@user.com   |
      | someother@user.com |