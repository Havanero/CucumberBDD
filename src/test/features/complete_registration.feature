Feature: new customer of an e-commerce site - Complete Registration

  As a new customer of an e-commerce site
  I want a way to sign up to your service
  So that I am able to complete purchases

  Scenario: Complete Registration

    Given a new customer has completed the registration form
    When we receive it
    Then we send them a confirmation email

