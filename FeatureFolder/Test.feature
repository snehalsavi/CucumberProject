@Test
Feature: We want to automate Oranage HRM site

Background:
   Given I ve the site running

@donot
@sanity
  Scenario: With positive credentials 
    When I provide correct credentails like Admin and admin123 
    Then I should get loggedin
   
@do
  Scenario: Title of your scenario
    Given I ve the site running 
    Then I want to check the title of the page