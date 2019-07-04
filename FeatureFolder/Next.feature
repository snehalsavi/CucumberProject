Feature: We want to automate Oranage HRM site in a new feature file

@Regression
  Scenario Outline: Negative Scenario
    Given I ve the site running
    When I provide incorrect credentails like <username> and <password>
    Then I should not get loggedin

    Examples: 
      | username | password |
      | Admin    | saurab   |
      | saurab   | admin123 |
      | saurab   | saurab   |
