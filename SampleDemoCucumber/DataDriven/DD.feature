Feature: Test Demo Site

  Scenario Outline: Test Login for demosite with valid/Invalid credentials in ChromeBrowser
    Given Open Chrome and start the application url ="http://newtours.demoaut.com/"
    When Enter valid username "<username>" and valid password "password"
    Then user should able to login successfully
    Then application should be closed

    Examples: 
      | username | password |
      | academy  | academy  |
      | Demo     | Demo     |
