Feature: Facebook home page feature


Scenario: TC1-Verifying facebook home page
Given I navigate to facebook home page
Then I see home page title is displaying "Facebook – log in or sign up"

Scenario: TC2-Verifying log in web elements validation 
Given I navigate to facebook home page
Then I see email text box is displaying
Then I see password text box is displaying
Then I see Log in button is displaying

Scenario: TC3-Entering wrong credentials as log in to facebook account
Given I navigate to facebook home page
When I enter email id as "xyz@gmail.com"
And I enter password as "usgfusgfu"
And I click on log in button
Then I see log in is not successful