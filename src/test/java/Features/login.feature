@test
Feature: login functionality

 
Scenario: Veryfy successfull login when username and password is currect
When user enter "Test" and "password"
And click on login button
Then Validate success login
