@myStore
Feature: loginToMyStore
  I want to register as new user to MyStore and search for summer dress

  @loginToMyStore
  Scenario Outline: Verify login to MyStore
    Given I load myStore website <url>
    When I click on SignIn
    Then I should be able to register with valid email <emailid>
    And I reload myStore homepage <url>
    When I search for summerdress
    Then I should be able to add dress to cart

    Examples: 
      | url                                     | emailid          |
      | http://automationpractice.com/index.php | xyz123@gmail.com |
