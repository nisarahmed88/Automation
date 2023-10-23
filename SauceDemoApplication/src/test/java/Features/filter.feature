Feature: The sorting filter functionality

  @filter
  Scenario: Validate the filter functionality by search
    Given Open the Sauce Demo Application
    When User is able to login
    Then Verify user check the logo
    Then User change product sorting dropdown by search
    And Close the browser

  @filter
  Scenario: Validate the selection of filter
    Given Open the Sauce Demo Application
    When User is able to login
    Then Verify user check the logo
    Then User selects the filter from the dropdown
    And Close the browser