Feature: User can be able to access between tabs

Background: User is on the etsy home page
Given User is on the Etsy home page

@etsyTab
Scenario: Tab access successfully
When User clicks each tab at the Etsy page
Then User navigates to related tab page