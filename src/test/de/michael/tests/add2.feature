Feature: Test the calc
 To check the calc Arithmetic

Scenario: AddTwoNumbers

Given I started the program
When I type "3"
And I type "4"
And I press ADD
Then I should see "7"
