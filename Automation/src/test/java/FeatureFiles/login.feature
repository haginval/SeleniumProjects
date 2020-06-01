Feature: Application login

Scenario: Display home page for valid user
Given User is at login page
When User provides valid user name and passoword
Then User should land in Home page
And User name is displayed on top


