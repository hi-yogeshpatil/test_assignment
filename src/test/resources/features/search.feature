Feature: Sample

  @ui @pageobject
  Scenario: Should be able to search for a product from the input box
    Given John is viewing the Etsy landing page
    When he searches for a product from the input box
    Then the result should be displayed

  @ui @screenplay
  Scenario: Should be able to search for a product from the input box (screenplay)
    Given John is viewing the Etsy landing page (screenplay)
    When he searches for a product from the input box (screenplay)
    Then the result should be displayed (screenplay)

  @ui @dropdown
  Scenario: Should be able to search for a product from the drop-down menu
    Given John is viewing the Etsy landing page
    When he searches for a product from the drop-down menu
    # I would like to have same keyword 'Then the result should be displayed'
    # Due to time constraint used this
    # Options are pass parameters in keyword if supported or have overwritten methods
    Then the drop down search result should be displayed

  @ui @icons
  Scenario: Should be able to search for a product from the icons
    Given John is viewing the Etsy landing page
    When he searches for a product from the icons
    Then the icon based search results should be displayed
