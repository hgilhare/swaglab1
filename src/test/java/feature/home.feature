@Reg
Feature: validating home page

Scenario: validating filter with Z to A

And user enter username and password
And user click on login button
Then login validate succesfully
Given user click on filter
Then user select Z to A
And user validating filter
And user close the browser

Scenario: validating filter with price low to high

And user enter username and password
And user click on login button
Then login validate succesfully
Given user click on filter
Then user select select low to high
And user validating filter low to high
And user close the browser

Scenario: validating filter with price high to low

And user enter username and password
And user click on login button
Then login validate succesfully
Given user click on filter
Then user select select high to low
And user validating filter high to low
And user close the browser

Scenario: validating log out button

And user enter username and password
And user click on login button
Then login validate succesfully
Then user click on three horizontal bar
Then user click on logout button
And user validating logout succesful
And user close the browser