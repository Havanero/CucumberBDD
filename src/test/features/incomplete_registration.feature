Feature: new customer of an e-commerce site - Incomplete Registration

  As a new customer of an e-commerce site
  I want a way to sign up to your service
  So that I am able to complete purchases

  @run
  Scenario: Incomplete Registration
    Given a new customer fills the registration form incorrectly
    When they submit it
    Then they are told what went wrong and how to fix it

