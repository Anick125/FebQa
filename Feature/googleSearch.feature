Feature: Google search

Scenario Outline: simple search

Given I am one the google homepage
When  I enter search "<term>" 
And I click on google search
Then I recieve related search result

Examples:
|term							|
|quality assuarnce|
|software testing	|