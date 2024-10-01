
@tag
Feature: Search and place the order


  @tag1
  Scenario Outline: Search exp for product search in both home and offer page
    Given Open the green kart landing page
    And Navi gate to search box and click
    When User searched the item by typing <name1>
    
    And User clicks on top deals link
    And Lands on top deal page 
    When User searched the item by typing <name1> in search box
   Then User able to see only item starts with tomato
    
    
Examples:
|name1|
|tom|
|Bro|
