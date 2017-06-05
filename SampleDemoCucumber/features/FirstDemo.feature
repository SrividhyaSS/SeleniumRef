Feature: Test Demo Site

Scenario: Test Login for demosite with valid credentials in ChromeBrowser
Given Open Chrome and start the application url ="http://newtours.demoaut.com/"
When Enter valid username "academy" and password "academy"
Then user should able to login successfully
Then application should be closed


