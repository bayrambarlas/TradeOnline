@Gainers
Feature: Load WU a country home page and find a local agent

  @Country
  Scenario: Change the country on WU main page
    Given user at WU main page and accept the cookies
    When user expands Burger menu select Settings page
    And change WU.com page to United States as selected country
    Then the selected country page must be loaded


  @ZipCode
  Scenario Outline: Search for open agent locations near my Zip code

    Given user at WU main page and accept the cookies
    When user click the FIND LOCATION option from the top menu
    When enter a "<ZipCode>" to find the open agent
    And click the CONTINUE button to search
    Then user must see the address details of the first location



    Examples:

      | ZipCode |
      | 08247   |
      #| 08248   |
      #| 08249   |
      #| 08250   |
      #| 08251   |