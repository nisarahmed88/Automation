Feature: Sauce Demo Login Page

    @l1
  Scenario Outline: Verify that different users try to login in the application
    Given Open the Sauce Demo Application
    When User enters "<username>" in username field
    When User enters "<password>" in password field
    Then Verify user check the logo
    And Close the browser
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |
      | problem_user  | secret_sauce |
