Feature: validating checkout functionality
@Reg
Scenario Outline: validating checkout fanctonality with valid credential

And user enter username and password
And user click on login button
Then login validate succesfully
And user click on add to cart button
Then validating add to cart icon
And user click on cart icon
And user click on checkout button
And user enter info "<firstname>" "<lastname>" "<pincode>"
And user click on continue button
And user validate checkout overview 
And user click on finish button
And user validate thank you message
And user close the browser

Examples:
|firstname|lastname|pincode|
|himanshu|gilhare|492009|
|gourav|gilhare|492001|
|gauri|gilhare|492003|
|sakshi|bajaj|492001|


@Reg
Scenario: validating checkout fanctonality with empty credential

And user enter username and password
And user click on login button
Then login validate succesfully
And user click on add to cart button
Then validating add to cart icon
And user click on cart icon
And user click on checkout button
And user enter info "" "" ""
And user click on continue button
And validate error message
And user close the browser

@Reg
Scenario: validating remove button from cart

And user enter username and password
And user click on login button
Then login validate succesfully
And user click on add to cart button
Then validating add to cart icon
And user click on cart icon
And user click on remove button
And user validating succesful removal of product
And user close the browser


