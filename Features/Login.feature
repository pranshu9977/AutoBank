Feature: Test Login for Allpitool Bank

  Background:
    Given user open Url "https://demo.applitools.com/"

    Scenario: Validate Login Feature Functionality
      Given User can see the Login Form on Login page
      And User can find Username TextBox
      And User can see Password TestBox
      And User can see SignIn Button
      And User can see the page Title as expected
      When User close the window
      Then user is not longer able to see any tab
      Then user close the browser

