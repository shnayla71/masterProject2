Feature: User can be able to add to card

  Background: User is on the etsy home page
    Given User is on the Etsy home page



@etsyCard
Scenario: Add to card feature
When User searchs "shirt" in the Etsy pages
Given User clicks to the item
And User clicks to add to card button