Feature: Check login finctionality


Scenario Outline: Login page validation
Given user is in login page
When user enters valid user name as <userName> and valid password as <passWord>
Then user should be able to login and navigate to Home page

Examples:
|userName				|passWord	|
|raghuhk@hotmail.com		|paw123		|