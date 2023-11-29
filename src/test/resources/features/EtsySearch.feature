
Feature: Etsy search feature

  Background: User is on the etsy home page
    Given User is on the Etsy home page

  @etsyAll
  Scenario: Title verification after search term
    Then User should see "Etsy" in the Etsy title


  Scenario Outline: Search functionality title verification
    When User searchs "<searchValue>" in the Etsy page
    Then User clicks to search button
    Then User should see "<expectedTitle>" in the Etsy

    Examples: examples test data for Etsy
      | searchValue | expectedTitle |
      | apple       | Apple         |
      | orange      | Orange        |
      | kiwi        |  Kiwi         |







