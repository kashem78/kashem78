Feature: This frature is to create new Account



@Kakon
Scenario: Verify maduser can Signup successfully
Given Launch <"URL"> mad
Then Click on Signup Link
Then Type madUsername Password click Signup Button
Then  Verify User can Signup 