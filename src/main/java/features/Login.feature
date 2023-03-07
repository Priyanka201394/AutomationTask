#Author: Priyanka
Feature: Login functionality of QA Automation Task

  Scenario: Validate the login functionality for invalid email and password
    Given Enter the invalid email
    When Enter the invalid password
    And Click on the login
    Then The login page should display error with fail status

  Scenario: Validate the forgot Password functionality for invalid email 
    Given The user clicks on the Forgot Password link
    When Enter the invalid email in forgotPassword page
    And Enter the invalid confirm email in forgotPassword page
    And The user clicks on the Reset Password link
    Then The forgot page should display error with fail status
  